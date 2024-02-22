package test;

import base.ProjectSpecificationMethod;
import pages.HomePage;

public class TC003_AddItemtoCart extends ProjectSpecificationMethod{

	
	public void addItem() {
		
		HomePage obj = new HomePage(driver);
		//obj.loginButtion().email("leema#@gmail.com").password("leema").
		//submit().search().chooseItem().addItemtocart(); //
	}
}
