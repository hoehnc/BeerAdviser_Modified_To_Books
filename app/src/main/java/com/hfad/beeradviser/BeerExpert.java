package com.hfad.beeradviser;
import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("fiction"))
        {
            brands.add("The Last Wish");
            brands.add("Eragon");
            brands.add("Jurassic Park");
        }
        else if(color.equals("non-fiction"))
        {
            brands.add("Head First Android Development");
            brands.add("Pax Romana: War, Peace and Conquest in the Roman World");
        }
        else if(color.equals("horror"))
        {
            brands.add("The Dark Tower");
            brands.add("The Shining");
            brands.add("The Shadow Over Innsmouth");
        }
        else // drama
        {
            brands.add("The Godfather");
            brands.add("The Last Don");
        }
        return brands;
    }
}

