class Item
{
   double price;
   int imported;  //0 for not imported , 1 for imported
   int category;  // 0 for exemption of tax, 1 if applicable for tax
   public Item(double price,int imported,int category)
   {
    this.price = price;
    this.imported = imported;
    this.category = category;
   }
   
   public static double customRound(double num) {
    return Math.round(num * 20) / 20.0;
   }
   public double tax()
   {
      double tax=0;
      if(imported==1 && category ==1)
      {
        tax = 15;
      }
      else if(imported==0 && category==1)
      {
        tax = 10;
      }
      else if(imported==1 && category==0)
      {
         tax= 5;
      }
      
      tax = (tax*this.price)/100;
      return customRound(tax);
   }
}
