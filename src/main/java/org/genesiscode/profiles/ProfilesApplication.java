package org.genesiscode.profiles;

import org.genesiscode.profiles.beans.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
}
