package industry;

public class AvailAmount 
{
   int assets;
   int liablities; 
   int sales;
   public AvailAmount(int a,int l,int s)
   {
      this.assets = a;
      this.liablities = l;
      this.sales = s;
   }
   public int totalAvailAmount() 
   {
      int total;
      total = assets + liablities + sales;
      return total;
   }
}