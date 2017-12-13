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
	
	public void update_Last_Name(String lastName) {
		homePage.update_Last_Name(lastName);
	}

	public void click_on_Save_button() {
		homePage.clickSaveButton();		
	}

	public String get_sysAdminTitle() {
		return homePage.get_Manage_System_admin_title();
	}

	public void open_Manage_page() {
		homePage.click_Manage_button();	
	}

	

	
	
}
