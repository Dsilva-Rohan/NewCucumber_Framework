package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import productImplementation.Product;
import productImplementation.Search;


public class LoginandSearchProduct
{
    Product name;
    Product price;
    Search search;
	@Given("Enter the value for Login Username")
	public void loginname()
	{
		System.out.println("Step1: Login Username\n");
	}
	
	@When("Enter the value for password")
	public void password()
	{
		System.out.println(" Step2: Login Password \n");	
	}
	
	@Then("Click on the Login button")
	public void CLickLoginButton()
	{
		System.out.println("Step3: Click on login button \n");
	}

	@Given("Search a product with {string} and {string}")
	public void searchproduct(String Laptopname, String Phonename)
	{
		name = new Product(Laptopname, Phonename);
		System.out.println("Product Name"+Laptopname +"  "+Phonename);
	}
	
	@When("Price of the laptop is {int} and {int}")
	public void price(int laptopprice, int Phoneprice) 
	{
		price = new Product(laptopprice, Phoneprice);
		System.out.println("Product price"+Phoneprice +"  "+Phoneprice);
	}
	
	@Then("Display the searched product {string} and {string} with price {int} and {int}.")
	public void display_the_searched_product_and_with_price_and(String string, String string2, int int1, int int2)
	{
		search =new Search();
		String lapname=search.DisplayLaptop_Product(name);
		String phone=search.DisplayIphone_Product(name);
		int lapprice=search.DisplayLaptop_price(price);
		int iphonerate=search.Displayphone_price(price);
		
		Assert.assertEquals(lapname, string);
		Assert.assertEquals(phone, string2);
		Assert.assertEquals(lapprice, int1);
		Assert.assertEquals(iphonerate, int2);
		
		
		
		
		
		
		System.out.println("Product Display");
	}
	
}
