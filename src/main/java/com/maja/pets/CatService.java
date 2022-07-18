package com.maja.pets;

public class CatService implements PetService{

    @Override
    public String getPet() {
        return "Cats are the Best";
    }
}
