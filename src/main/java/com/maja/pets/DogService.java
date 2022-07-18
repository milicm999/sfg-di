package com.maja.pets;

public class DogService implements PetService{
    @Override
    public String getPet() {
        return "Dogs are the best";
    }
}
