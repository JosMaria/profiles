package org.genesiscode.profiles.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("cat")
public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
