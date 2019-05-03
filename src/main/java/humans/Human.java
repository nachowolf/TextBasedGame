package humans;

import enums.*;
import interfaces.Actor;

public class Human implements Actor {

//  Actor Stats
    private String Name;
    private int Level;
    private int Health;
    private Gender Gender;



//  Actor Stats Methods

    @Override
    public void setName(String name) {
       this.Name = name;
    }

    @Override
    public void setLevel(int level) {
        this.Level = level;

    }

    @Override
    public void setHealth(int health) {
        this.Health = health;
    }


    @Override
    public void setGender(Gender gender) {
        this.Gender = gender;

    }


    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public int getLevel() {
        return this.Level;
    }

    @Override
    public int getHealth() {
        return this.Health;
    }

    @Override
    public String getGender() {
        return this.Gender.toString();
    }

}
