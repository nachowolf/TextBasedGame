package interfaces;

import enums.Gender;
import enums.Misc;

import java.util.HashMap;

public interface Actor {

//    SET METHODS

    //set Actor Name
    void setName(String name);

    //set Actor level
    void setLevel(int level);

    //set Actor health
    void setHealth(int health);

    //set Actor Gender
    void setGender(Gender gender);


    //  GET METHODS

    //get Actor name
    String getName();

    //get Actor level
    int getLevel();

    //get Actor health
    int getHealth();

    //get Actor gender
    String getGender();



}
