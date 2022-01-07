package industry;

public class Expenses 
{
    int machinaries;
    int rawmaterials;
    int contingencies;
    public Expenses(int m,int r,int c)
    {
        this.machinaries = m;
        this.rawmaterials = r;
        this.contingencies = c;
    }
    public int totalExpenses() 
    {
        int total;
        total = machinaries + rawmaterials + contingencies;
        return total;
    }
}
