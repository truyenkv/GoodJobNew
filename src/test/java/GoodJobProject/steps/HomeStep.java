package GoodJobProject.steps;

import net.thucydides.core.steps.ScenarioSteps;
import GoodJobProject.pages.HomePage;

public class HomeStep extends ScenarioSteps {
	HomePage homePage;

	public void show_Company_Menu() {
		homePage.click_on_company_profile();	
	}

	public void choose_UserProfile_option() {
		homePage.click_on_UserProfile_option();
	}

	public void update_First_Name(String firstName) {
		homePage.update_First_Name(firstName);
	}

	public void click_on_Save_button() {
		homePage.clickSaveButton();		
	}


	public void open_Manage_page() {
		homePage.click_Manage_button();	
	}

	
	
}
