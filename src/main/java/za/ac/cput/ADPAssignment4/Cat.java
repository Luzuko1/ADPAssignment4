package za.ac.cput.ADPAssignment4;

public class Cat extends Animal
{
    public Cat()
    {
        super();
    }

    public Cat(String name, int age)
    {
        super(name, age);
    }

    @Override
    public String eats()
    {
        return "Fish";
    }
}
