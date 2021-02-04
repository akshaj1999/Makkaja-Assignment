import java.util.*;
import java.io.*;
class Main
{

  public static void main(String[] args)throws Exception
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number of items");
    int n = Integer.parseInt(br.readLine());
     ArrayList<Item> arr = new ArrayList<Item>();
     StringBuffer ans = new StringBuffer();
     double sales_tax = 0;
     double total = 0;
     ans.append("\n");
    while(n-->0)
    {
        String str = br.readLine();
        String strs[] = str.trim().split("\\s+");
        double price = Double.parseDouble(strs[strs.length-1]);
        int imported=0;
        int category=1;
        for(int i=0;i<strs.length;i++)
        {
          if(strs[i].equals("book") || strs[i].equals("chocolates") || strs[i].equals("chocolate") ||strs[i].equals("pills"))
          {
            category = 0;
          }
          if(strs[i].equals("imported"))
          {
            imported=1;
          }
        } 

       for(int i=0;i<strs.length-1;i++)
       {
          if(strs[i].equals("at"))
            ans.append(": ");
          else
            ans.append(strs[i]+" ");
       }
       double temp_tax = new Item(price,imported,category).tax();
       total += price+temp_tax;
       sales_tax+= temp_tax;
       ans.append(String.format("%.2f",(price+temp_tax))+"\n");
    }
    ans.append("Sales Taxes : "+String.format("%.2f",sales_tax)+"\n");
    ans.append("Total : "+String.format("%.2f",total));

System.out.print(ans);

  }

}
