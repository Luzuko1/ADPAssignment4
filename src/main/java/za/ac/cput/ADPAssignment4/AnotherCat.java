package za.ac.cput.ADPAssignment4;

public class AnotherCat
{
    Animal cat;
    public AnotherCat() {}

    public AnotherCat(String name, int age)
    {
        cat.setName(name);
        cat.setAge(age);
    }


    public String eats()
    {
         cat = new Cat();
        return cat.eats();
    }
}
