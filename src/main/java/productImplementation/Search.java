package productImplementation;

public class Search
{
  public String DisplayLaptop_Product(Product name)
  {
	 if(name.Product_List().contains(name.getLaptopname()))
	 
		 return name.getLaptopname();
	     else
		 
	    return null;
	 
		 
  }
  
  public String DisplayIphone_Product(Product name)
  {
	 if(name.Product_List().contains(name.getPhonename()))
	 
		 return name.getPhonename();
	     else
		 
	    return null;
	 
		 
  }
  
  public int DisplayLaptop_price(Product price)
  {
	 if(price.ProductPrice_List().contains(price.getLaptopprice()))
	 
		 return price.getLaptopprice();
	     else
		 return 0;
	 
  }
  
  public int Displayphone_price(Product price)
  {
	 if(price.ProductPrice_List().contains(price.getPhoneprice()))
	 
		 return price.getPhoneprice();
	     else
		 return 0;
	 
  }
}
