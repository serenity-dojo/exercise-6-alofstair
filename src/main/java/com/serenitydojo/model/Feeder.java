package com.serenitydojo.model;

public class Feeder {

    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Hamster")) {
            return isPremium ? "Lettuce" : "Cabbage";
        } else if (animal.equals("Dog")) {
            return isPremium ? "DeluxeDogFood" : "Dog Food";
        } else if (animal.equals("Cat")) {
            return isPremium ? "Salmon" : "Tuna";
        }
        return animal;
    }
}
