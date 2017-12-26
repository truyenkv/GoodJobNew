package GoodJobProject;

import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import GoodJobProject.steps.HomeStep;
import GoodJobProject.steps.LoginStep;
import GoodJobProject.steps.ManageStep;
import GoodJobProject.steps.ManageUserProfileStep;
import GoodJobProject.steps.ManageAdminStep;
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
	ManageAdminStep userManageStep;
	
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

	
	//----------------------------Create new User ---------------------
	@Given("^The user login site by \"([^\"]*)\" and \"([^\"]*)\" successfully$")
	public void the_user_login_site_by_and_successfully(String email, String password) throws Exception {
		loginStep.open_login_page();
		loginStep.input_email(email);
		loginStep.input_password(password);
		loginStep.click_Login_button();
		
	}
	
	@When("^Click on Manage menu\\.$")
	public void click_on_Manage_menu() throws Exception {
		homeStep.open_Manage_page();
	}


	@When("^Click on Manage Administrators menu\\.$")
	public void click_on_Manage_Administrators_menu() throws Exception {
		manageStep.open_User_Manage_page();
	}

	@When("^Click on Add User button\\.$")
	public void click_on_Add_User_button() throws Exception {
		userManageStep.click_On_Add_Button();
	}

	@When("^Input First Name is \"([^\"]*)\", Last Name is \"([^\"]*)\" and Email is \"([^\"]*)\"\\.$")
	public void input_First_Name_is_Last_Name_is_and_Email_is(String firstName, String lastName, String email) throws Exception {
		manageUserProfileStep.input_FistName(firstName);
	    manageUserProfileStep.input_LastName(lastName);
	    manageUserProfileStep.input_Email(email);
	}

	@When("^Click on Save button$")
	public void click_on_Save_button() throws Exception {
		manageUserProfileStep.click_On_Save_Button();
	}

	@Then("^System should navigate to \"([^\"]*)\" screen\\.$")
	public void system_should_navigate_to_screen(String systemAdminTitle) throws Exception {
		Assert.assertEquals(userManageStep.get_sysAdminTitle(), systemAdminTitle);
	}

	@Then("^\"([^\"]*)\" should be shown on screen\\.$")
	public void should_be_shown_on_screen(String email) throws Exception {
		Assert.assertEquals(userManageStep.get_Email(), email);
	}


	

}
