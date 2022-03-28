package org.genesiscode.profiles.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Monkey implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Uu uu");
    }
}
