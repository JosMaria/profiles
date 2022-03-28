package org.genesiscode.profiles.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("monkey")
public class Monkey implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Uu uu");
    }
}
