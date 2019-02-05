package org.fasttrackit;

import javax.print.Doc;
import java.sql.SQLOutput;


public class App
{
    public static void main( String[] args )
    {

        Game game = new Game();
        game.start();

        Animal dog = new Dog();
        dog.setName("Misha");
        dog.setAge(1);
        dog.setHealth(7);
        dog.setHunger(2);
        dog.setHappy(9);
        dog.setFavfood("Salmon");
        dog.setFavactivity("Walk");
        dog.setColor("White");
        dog.setPawscount(4);
        dog.setGender("Female");
        ((Dog) dog).setCollar(true);
        ((Dog) dog).setCollarcolor("blue");

        Animal cat = new Cat();
        cat.setName("Rita");
        cat.setAge(3);
        cat.setHealth(8);
        cat.setHunger(5);
        cat.setHappy(9);
        cat.setFavfood("Fish");
        cat.setFavactivity("The run to the mice");
        cat.setColor("Black");
        cat.setPawscount(4);
        cat.setGender("Female");
        ((Cat) cat).setSandbox(false);
        ((Cat) cat).setSandboxcolor("red");


        Owner owner = new Owner(cat);
        owner.setGender("Male");
        owner.setHaircolor("white");
        owner.setCoins(512);
        owner.setName("Denis");
        owner.setSkincolor("Black");
        owner.setEyecolor("Gray");

        Doctor doctor = new Doctor(dog);
        doctor.setName("Andrei");
        doctor.setHaircolor("Brown");
        doctor.setPills(true);
        doctor.setVitamins(true);
        doctor.setSpecialization("Vet");
        doctor.setEyecolor("Brown");

        Activity activity = new Activity("The run to the mice");

        PetFood petFood = new PetFood("Salmon");
        petFood.setName("Salmon");
        petFood.setPrice(320);
        petFood.setQuantity(250);
        petFood.setAvailable(true);

        PetFood petFood2 = new PetFood("Fish");
        petFood2.setName("Fish");
        petFood2.setPrice(200);
        petFood2.setQuantity(250);
        petFood2.setAvailable(true);


        owner.feed(owner,dog,petFood);
        owner.play(owner,cat,activity);

        dog.happiness();
        cat.happiness();

    }

}
