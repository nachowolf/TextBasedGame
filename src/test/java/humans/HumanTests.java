package humans;

import enums.Gender;
import enums.Misc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HumanTests {

    @Test
    public void SetHumanName(){
        Human human = new Human();
        human.setName("Jack");
        assertEquals("Jack", human.getName());
    }

    @Test
    public void SetHumanHealth(){
        Human human = new Human();
        human.setHealth(12);
        assertEquals(12, human.getHealth());
    }

    @Test
    public void SetHumanLevel(){
        Human human = new Human();
        human.setLevel(1);
        assertEquals(1, human.getLevel());
    }

    @Test
    public void SetHumanGender(){
        Human human = new Human();
        human.setGender(Gender.male);
        assertEquals("male", human.getGender());
    }



}
