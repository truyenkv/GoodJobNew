package GoodJobProject.steps;

import net.thucydides.core.steps.ScenarioSteps;
import GoodJobProject.pages.HomePage;

public class HomeStep extends ScenarioSteps {
	HomePage homePage;

	public void update_First_Name(String firstName) {
		homePage.update_First_Name(firstName);
	}
	
	public void update_Last_Name(String lastName) {
		homePage.update_Last_Name(lastName);
	}

	public void click_on_Save_button() {
		homePage.click_SaveButton();		
	}


	public void open_Manage_page() {
		homePage.click_Manage_button();	
	}

	public void click_on_user_menu() {
		homePage.click_user_menu();
		
	}

	public void click_on_user_profile_link() {
		homePage.click_profile_link();
		
	}


	
}
