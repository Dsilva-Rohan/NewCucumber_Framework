package productImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product
{
    private String laptopname;
    private String phonename;
    private int laptopprice;
    private int phoneprice;
    
    
    public Product(String laptopname, String phonename) 
	{
		this.laptopname=laptopname;
		this.phonename=phonename;
	}
	
    public Product(int laptopprice, int phoneprice) 
	{
		this.laptopprice=laptopprice;
		this.phoneprice=phoneprice;
	}

	
	public String getLaptopname()
	{
		return laptopname;
	}

	public void setLaptopname(String laptopname)
	{
		this.laptopname = laptopname;
	}

	public String getPhonename()
	{
		return phonename;
	}

	public void setPhonename(String phonename)
	{
		this.phonename = phonename;
	}

	public int getLaptopprice()
	{
		return laptopprice;
	}

	public void setLaptopprice(int laptopprice) 
	{
		this.laptopprice = laptopprice;
	}

	public int getPhoneprice() 
	{
		return phoneprice;
	}

	public void setPhoneprice(int phoneprice)
	{
		this.phoneprice = phoneprice;
	}

	public List<String> Product_List()
	{
		ArrayList<String> listitem=new ArrayList<String>();
		
		listitem.add("Apple Pro");
		listitem.add("IPhone");
		listitem.add("Apple Air");
		
		return listitem;
	}
	
	public List<Integer> ProductPrice_List()
	{
		ArrayList<Integer> listitem=new ArrayList<Integer>();
		
		listitem.add(150000);
		listitem.add(70000);
		listitem.add(20000);
		
		return listitem;
	}
	
	
	
}
