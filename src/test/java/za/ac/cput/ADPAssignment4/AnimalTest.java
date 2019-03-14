package za.ac.cput.ADPAssignment4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest
{
    Animal cow;
    Animal cat;
    @Before
    public void setup()
    {
        cow = new Cow();
        cat = new Cat();
    }

    @Test
    public void testEncapsulation()
    {
      String nm = "Bob" ;
      int age = 15;

        cow = new Cow(nm,age);
        Assert.assertEquals(nm, cow.getName());
        Assert.assertEquals(age, cow.getAge());

        cat = new Cat(nm,age);
        Assert.assertEquals(nm, cat.getName());
        Assert.assertEquals(age, cat.getAge());
    }

    @Test
    public void testPolymorphism()
    {
        String catEats = "Fish";
        String cowEats = "Grass";

        Assert.assertEquals(catEats, cat.eats());
        Assert.assertEquals(cowEats, cow.eats());
    }

    @Test
    public void testDelegation()
    {
        AnotherCat cat = new AnotherCat();
        String expected = "Fish";
        Assert.assertEquals(expected,cat.eats());
    }
}

