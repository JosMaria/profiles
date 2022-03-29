package org.genesiscode.profiles;

import org.genesiscode.profiles.beans.Animal;
import org.genesiscode.profiles.beans.Cat;
import org.genesiscode.profiles.beans.Monkey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class ProfilesApplication implements CommandLineRunner {

    private final Animal animal;

    @Autowired
    public ProfilesApplication(Animal animal) {
        this.animal = animal;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProfilesApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(animal.getClass().getSimpleName());
        animal.makeSound();
    }

    static class LoadBean {

        @Bean
        @Profile("cat")
        public Cat getCat() {
            return new Cat();
        }

        @Bean
        @Profile("monkey")
        public Monkey getMonkey() {
            return new Monkey();
        }
    }
}
