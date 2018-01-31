package GoodJobProject;

import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import GoodJobProject.steps.EmailStep;
import GoodJobProject.steps.HomeStep;
import GoodJobProject.steps.LoginStep;
import GoodJobProject.steps.ManageAdminStep;
import GoodJobProject.steps.ManageStep;
import GoodJobProject.steps.ManageUserProfileStep;
import GoodJobProject.steps.ReportStep;
import GoodJobProject.steps.UpdatePasswordStep;
import GoodJobProject.steps.UploadEmployedDataStep;
import GoodJobProject.steps.WorkingMetricsStep;
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
	
	@Steps
	EmailStep emailStep;
	
	@Steps
	WorkingMetricsStep welcomeStep;
	
	@Steps
	UpdatePasswordStep updatePassStep;
	
	@Steps
	UploadEmployedDataStep uploadEmployeeDataStep;
	
	@Steps
	ReportStep reportStep;
	
	@Given("^the user is in Login page$")
	public void the_user_is_on_the_GoodJob_login_page() throws Exception {
	    loginStep.open_login_page();
	}


	@When("^the user input email is ([^\"]*)$")
	public void the_user_input_email_is(String email) throws Exception {
	    loginStep.input_email(email);
	}

	@When("^the user input password is ([^\"]*)$")
	public void the_user_input_password_is(String password) throws Exception {
	    loginStep.input_password(password);
	}

	@When("^the user click on Login button$")
	public void the_user_click_on_Login_button() throws Exception {
		loginStep.click_Login_button();
	}
	
	

	@When("^Click User menu$")
	public void click_User_menu() throws Exception {
	    homeStep.click_on_user_menu();
	}


	@When("^Click User profile link$")
	public void click_User_profile_link() throws Exception {
	    homeStep.click_on_user_profile_link();
	}

	@When("^Update First Name is \"([^\"]*)\", Last Name is \"([^\"]*)\"$")
	public void update_First_Name_is_Last_Name_is(String firstName, String lastName) throws Exception {
		manageUserProfileStep.input_FistName(firstName);
		manageUserProfileStep.input_LastName(lastName);
	}
	
	
	
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
	public void email_should_be_shown_on_screen(String email) throws Exception {
		Assert.assertEquals(userManageStep.get_Email_Is_Shown(email), true);
	}
	@Then("^\"([^\"]*)\" Shows correctly be shown on screen\\.$")
	public void User_name_should_be_shown_on_screen(String username) throws Exception {
		Assert.assertEquals(userManageStep.get_User_Name_Is_Shown(username), true);
	}
	
	@Then("^Open email to confirm passwordby email \"([^\"]*)\"\\.$")
	public void open_email_to_confirm_password(String emailConfirm) throws Exception {
		emailStep.open_email_webapp();
	    emailStep.input_email_value(emailConfirm);
	}
	
	@Then("^Click on Get Start button.$")
	public void click_on_getstart_button() throws Exception {
		emailStep.click_on_get_start_buton();
	}

	@Then("^Create an account$")
	public void create_an_account() throws Exception {
	    welcomeStep.click_on_create_an_account_button();
	}

	@Then("^Update new Password is \"([^\"]*)\"$")
	public void update_new_Password_is(String password) throws Exception {
	    updatePassStep.update_password(password);
	}
	
	
//------------------------------------ login in first time -------------------------------------------
	@Given("^Open browser with ([^\"]*)$")
	public void open_browser_with(String token) throws Exception {
	    welcomeStep.open_site(token);
	}


	@When("^User clicks on Create an account button$")
	public void user_clicks_on_Create_an_account_button() throws Exception {
		welcomeStep.click_on_create_an_account_button();
	}

	@When("^User creates password is ([^\"]*)$")
	public void user_creates_password_is(String password) throws Exception {
		updatePassStep.update_password(password);
	}

	@Then("^the user should see ([^\"]*) shows correctly$")
	public void the_user_should_see_User_menu(String welcome) throws Exception {
		Assert.assertEquals(welcome, homeStep.get_welcome_user_menu());
	}
	
	@Then("^([^\"]*) is shown ([^\"]*)$")
	public void companies_is_shown_on_screen(String role,String item) throws Exception {
		switch(role)
		{
		case "Admin":
			Assert.assertEquals(item, homeStep.get_company_title());
			break;
		
		case "Company":
			Assert.assertEquals(item, homeStep.get_upload_employee_data_menu());
			break;
		case "Company Manager":
			Assert.assertEquals(item, uploadEmployeeDataStep.get_compelente_step_title());
			break;	
		case "Company User":
			Assert.assertEquals(item, reportStep.get_social_impact_scorecard_title());
			break;	
		case "Partner":
			Assert.assertEquals(item, homeStep.get_dashboard());
			break;
		default:
			break;
		}
	}
	
	
	

}
