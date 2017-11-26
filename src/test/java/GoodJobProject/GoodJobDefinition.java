package GoodJobProject;

import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import GoodJobProject.steps.HomeStep;
import GoodJobProject.steps.LoginStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoodJobDefinition {
	
	@Steps
	LoginStep loginStep;
	
	@Steps
	HomeStep homeStep;
	
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


	@When("^User show Company menu$")
	public void user_show_Company_menu() throws Exception {
	    homeStep.show_Company_Menu();	    
	}

	@When("^Open User Profile$")
	public void open_User_Profile() throws Exception {
	    homeStep.choose_UserProfile_option();
	}

	@When("^Update First Name is \"([^\"]*)\" and click Save button\\.$")
	public void update_First_Name_is_and_click_Save_button(String firstName) throws Exception {
	    homeStep.update_First_Name(firstName);
	    homeStep.click_on_Save_button();
	}

	@Then("^System should navigate to \"([^\"]*)\" screen\\.$")
	public void system_should_navigate_to_screen(String systemAdminTitle) throws Exception {
		Assert.assertEquals(homeStep.get_sysAdminTitle(), systemAdminTitle);
	}

}
