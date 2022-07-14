package com.maja.pets;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("animal")
public class CatService implements PetService{

    @Override
    public String getPet() {
        return "Cats are the Best";
    }
}
