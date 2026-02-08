package budgetbuddy;

public class Expense
{
    private String name;
    private int costInCent;
    private int id;

    public Expense(String name, int costInCent)
    {
        this.name = name;
        this.costInCent = costInCent;
        id ++;
    }
    public String getString(String n)
    {
        name = n;
    }
}
