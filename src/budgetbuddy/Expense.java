package budgetbuddy;

public class Expense
{
    private static int nextId = 1;

    private String name;
    private int costInCent;
    private int id;

    public Expense(String name, int costInCent)
    {
        this.name = name;
        this.costInCent = costInCent;
        this.id = nextId;
        nextId ++;
    }

    public String getName()
    {
        return name;
    }

    public int getCostInCent()
    {
        return costInCent;
    }

    public int getId()
    {
        return id;
    }
}
