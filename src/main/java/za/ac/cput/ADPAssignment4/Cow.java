package za.ac.cput.ADPAssignment4;

public class Cow extends Animal
{
    public Cow()
    {
        super();
    }

    public Cow(String name, int age)
    {
        super(name, age);
    }

    @Override
    public String eats()
    {
        return "Grass";
    }
}
