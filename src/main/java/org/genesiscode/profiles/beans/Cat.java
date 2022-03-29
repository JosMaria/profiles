package org.genesiscode.profiles.beans;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
