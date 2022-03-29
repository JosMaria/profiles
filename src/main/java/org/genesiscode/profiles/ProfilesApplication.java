package org.genesiscode.profiles;

import org.genesiscode.profiles.beans.Animal;
import org.genesiscode.profiles.beans.Cat;
import org.genesiscode.profiles.beans.DataSource;
import org.genesiscode.profiles.beans.Monkey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class ProfilesApplication implements CommandLineRunner {

    private final Animal animal;
    private final DataSource dataSource;

    @Value("${company.name}")
    private String nameCompany;

    @Autowired
    public ProfilesApplication(Animal animal, DataSource dataSource) {
        this.animal = animal;
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProfilesApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.print(animal.getClass().getSimpleName() + "\t");
        animal.makeSound();
        System.out.println(dataSource.toString());
        System.out.println(nameCompany);
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
