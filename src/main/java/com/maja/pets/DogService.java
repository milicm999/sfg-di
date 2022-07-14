package com.maja.pets;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog","default"})
@Service("animal")
public class DogService implements PetService{
    @Override
    public String getPet() {
        return "Dogs are the best";
    }
}
