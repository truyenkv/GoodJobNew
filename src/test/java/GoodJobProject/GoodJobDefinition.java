package GoodJobProject;

import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import GoodJobProject.steps.HomeStep;
import GoodJobProject.steps.LoginStep;
import GoodJobProject.steps.ManageStep;
import GoodJobProject.steps.ManageUserProfileStep;
import GoodJobProject.steps.UserManageStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoodJobDefinition {
	
	@Steps
	LoginStep loginStep;
	
	@Steps
	HomeStep homeStep;
	
	@Steps
	ManageStep manageStep;
	
	@Steps
	UserManageStep userManageStep;
	
	@Steps
	ManageUserProfileStep manageUserProfileStep;
	
	//------------------------------------------- login scenario -----------------------------------------------------------------------
	@Given("^the user is on the GoodJob login page\\.$")
	public void the_user_is_on_the_GoodJob_login_page() throws Exception {
	    loginStep.open_login_page();
	}


	@When("^the user input email is \"([^\"]*)\"$")
	public void the_user_input_email_is(String email) throws Exception {
	    loginStep.input_email(email);
	}

	@When("^the user input password is \"([^\"]*)\"$")
	public void the_user_input_password_is(String password) throws Exception {
	    loginStep.input_password(password);
	}

	@When("^the user click on Login button$")
	public void the_user_click_on_Login_button() throws Exception {
		loginStep.click_Login_button();
	}

	@Then("^the user should see company list title \"([^\"]*)\"$")
	public void the_user_should_see_company_list_title(String expectTitle) throws Exception {
		Assert.assertEquals(loginStep.getCompanyListTit(), expectTitle);
	}

	//------------------------------------------------ update profile -------------------------------------------------------------------------------
	@Given("^The user login site by \"([^\"]*)\" and \"([^\"]*)\" successfully$")
	public void the_user_login_site_by_and_successfully(String email, String password) throws Exception {
		loginStep.open_login_page();
		loginStep.input_email(email);
		loginStep.input_password(password);
		loginStep.click_Login_button();
	}


	@When("^Click on User Profile in user's action menu$")
	public void user_show_Company_menu() throws Exception {
	    homeStep.show_Company_Menu();	    
	}

	@When("^Choose User Profile action$")
	public void open_User_Profile() throws Exception {
	    homeStep.choose_UserProfile_option();
	}

	@When("^Update First Name is \"([^\"]*)\", Last Name is \"([^\"]*)\" and click Save button\\.$")
	public void update_First_Name_is_and_click_Save_button(String firstName, String lastName) throws Exception {
	    homeStep.update_First_Name(firstName);
	    homeStep.update_Last_Name(lastName);
	    homeStep.click_on_Save_button();
	}

	@Then("^System should navigate to \"([^\"]*)\" screen\\.$")
	public void system_should_navigate_to_screen(String systemAdminTitle) throws Exception {
		Assert.assertEquals(homeStep.get_sysAdminTitle(), systemAdminTitle);
	}
	
	//----------------------------Update user by Scenario OutLine ---------------------
	@When("^User go to Manage page$")
	public void user_go_to_Manage_page() throws Exception {
		homeStep.open_Manage_page();
	}
	
	@When("^User open manage system administrator screen\\.$")
	public void user_open_manage_system_administrator_screen() throws Exception {
		manageStep.open_User_Manage_page();
	}
		
	@When("^User open Manage User Profile screen$")
	public void user_open_Manage_User_Profile_screen() throws Exception {
		userManageStep.click_On_Add_Button();
	}
	
	@When("^Creating new account with '(.*)', '(.*)' and '(.*)'$")
	public void creating_new_account(String firstName, String lastName, String email) throws Exception {
	    manageUserProfileStep.input_FistName(firstName);
	    manageUserProfileStep.input_LastName(lastName);
	    manageUserProfileStep.input_Email(email);
	    manageUserProfileStep.click_On_Save_Button();
	}
	

}
