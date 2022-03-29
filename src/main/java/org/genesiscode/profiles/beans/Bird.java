package org.genesiscode.profiles.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("bird")
public class Bird implements Animal {

    @Override
    public void makeSound() {
        System.out.println("pio pio");
    }
}
