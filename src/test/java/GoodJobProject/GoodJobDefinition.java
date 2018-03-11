package GoodJobProject;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import GoodJobProject.steps.CompanyInformationAuthorStep;
import GoodJobProject.steps.CompanyLocatorAuthorStep;
import GoodJobProject.steps.CompanyUsersAuthorStep;
import GoodJobProject.steps.EmailStep;
import GoodJobProject.steps.HomeStep;
import GoodJobProject.steps.LoginStep;
import GoodJobProject.steps.ManageAdminStep;
import GoodJobProject.steps.ManageCompaniesStep;
import GoodJobProject.steps.ManageCompanyStep;
import GoodJobProject.steps.ManagePartnerProfileStep;
import GoodJobProject.steps.ManagePartnerStep;
import GoodJobProject.steps.ManageStep;
import GoodJobProject.steps.ManageUserProfileStep;
import GoodJobProject.steps.ReportStep;
import GoodJobProject.steps.UpdatePasswordStep;
import GoodJobProject.steps.UploadEmployeeDataStep;
import GoodJobProject.steps.WorkingMetricsStep;
import GoodJobProject.steps.models.ListUserAccount;
import cucumber.api.DataTable;
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
	ManageAdminStep manageAdminStep;

	@Steps
	ManageUserProfileStep manageUserProfileStep;

	@Steps
	EmailStep emailStep;

	@Steps
	WorkingMetricsStep welcomeStep;

	@Steps
	UpdatePasswordStep updatePassStep;

	@Steps
	ReportStep reportStep;

	@Steps
	ManagePartnerStep managepartStep;

	@Steps
	ManagePartnerProfileStep managePartProfileStep;
	
	@Steps
	ManageCompaniesStep manageCompaniesStep;
	
	@Steps
	ManageCompanyStep manageCompanyStep;
	
	@Steps
	CompanyInformationAuthorStep comInforAuthorStep;
	
	@Steps
	CompanyUsersAuthorStep comUserAuthorStep;
	
	@Steps
	CompanyLocatorAuthorStep comLocatorAuthorStep;
	
	@Steps
	UploadEmployeeDataStep uploadEmployeeDataStep;
	
	@Given("^open page with url is \"([^\"]*)\"$")
	public void the_user_is_on_the_GoodJob_login_page(String url)throws Exception {
		loginStep.open_login_page(url);
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
	public void update_First_Name_is_Last_Name_is(String firstName,
			String lastName) throws Exception {
		manageUserProfileStep.input_FistName(firstName);
		manageUserProfileStep.input_LastName(lastName);
	}

	@When("^Click on Manage Administrators menu\\.$")
	public void click_on_Manage_Administrators_menu() throws Exception {
		manageStep.click_on_manage_admin_button();
	}

	@When("^Click on Save button on Manage User Profile screen$")
	public void click_on_Save_button_on_manage_user_profile_screen() throws Exception {
		manageUserProfileStep.click_on_save_button();
	}

	@Given("^The user login \"([^\"]*)\" by \"([^\"]*)\" and \"([^\"]*)\" successfully$")
	public void the_user_login_site_by_and_successfully(String url,
			String email, String password) throws Exception {
		loginStep.open_login_page(url);
		loginStep.input_email(email);
		loginStep.input_password(password);
		loginStep.click_Login_button();
	}

	@When("^Click on Manage menu\\.$")
	public void click_on_Manage_menu() throws Exception {
		homeStep.open_Manage_page();
	}

	@When("^Click on Add User button\\.$")
	public void click_on_Add_User_button() throws Exception {
		manageAdminStep.click_On_Add_Button();
	}

	@When("^Input First Name is \"([^\"]*)\", Last Name is \"([^\"]*)\" and Email is \"([^\"]*)\"$")
	public void input_First_Name_is_Last_Name_is_and_Email_is(String firstName,
			String lastName, String email) throws Exception {
		manageUserProfileStep.input_FistName(firstName);
		manageUserProfileStep.input_LastName(lastName);
		manageUserProfileStep.input_Email(email);
	}

	@Then("^System should navigate to \"([^\"]*)\" screen\\.$")
	public void system_should_navigate_to_screen(String systemAdminTitle)
			throws Exception {
		Assert.assertEquals(manageAdminStep.get_sysAdminTitle(),
				systemAdminTitle);
	}

	@Then("^\"([^\"]*)\" should be shown on screen\\.$")
	public void email_should_be_shown_on_screen(String email) throws Exception {
		Assert.assertEquals(manageAdminStep.get_Email_Is_Shown(email), true);
	}

	@Then("^\"([^\"]*)\" Shows correctly be shown on screen\\.$")
	public void User_name_should_be_shown_on_screen(String username)
			throws Exception {
		Assert.assertEquals(manageAdminStep.get_User_Name_Is_Shown(username),
				true);
	}

	@Then("^Open email to confirm passwordby email \"([^\"]*)\"\\.$")
	public void open_email_to_confirm_password(String emailConfirm)
			throws Exception {
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

	@Given("^open page with url is ([^\"]*)$")
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

	@When("^Click on Manage Partner menu\\.$")
	public void click_on_Manage_Partner_menu() throws Exception {
		manageStep.click_on_Manage_Partners_button();
	}

	@When("^Click on Add Partner button and create Partner is \"([^\"]*)\"$")
	public void click_on_Add_Partner_button_and_create_Partner_is(
			String partnerName) throws Exception {
		managepartStep.click_on_add_partner_button();
		managePartProfileStep.create_partner_name(partnerName);
	}

	// @When("^Let create user has ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*) successfully\\.$")
	// public void let_create_user_has_successfully(String firstName, String
	// lastName, String email, String role) throws Exception, AWTException {
	// managePartProfileStep.click_on_add_a_user_button();
	// managePartProfileStep.input_user_information(firstName, lastName, email,
	// role);
	// }

	List<ListUserAccount> listUserAcs = new ArrayList<ListUserAccount>();

	@When("^Let create user has firstName, lastName, email, role successfully\\.$")
	public void let_create_user_has_First_Name_Last_Name_Email_User_Role_successfully(
			DataTable listUser) throws Exception {
		listUserAcs = listUser.asList(ListUserAccount.class);
		for (ListUserAccount listUserAccount : listUserAcs) {
			managePartProfileStep.click_on_add_a_user_button();
			managePartProfileStep.input_user_information(
					listUserAccount.getFirstName(),
					listUserAccount.getLastName(), listUserAccount.getEmail(),
					listUserAccount.getRole());
		}
	}

	@When("^Click on Save button on Manage Partner Profile screen.$")
	public void click_on_Save_button_on_manage_part_screen() throws Exception {
		managePartProfileStep.click_On_Save_Button();
	}

	@Then("^the user should see ([^\"]*) shows correctly$")
	public void the_user_should_see_User_menu(String welcome) throws Exception {
		Assert.assertEquals(welcome, homeStep.get_welcome_user_menu());
	}
	
	@Then("^Click on Enable button on Confirmation popup$")
	public void click_on_Enable_button_on_Confirmation_popup() throws Exception {
		manageUserProfileStep.click_on_enable_button();
	}
	
	@Then("^The \"([^\"]*)\" was shown on screen\\.$")
	public void the_was_shown_on_screen(String errMessage) throws Exception {
		Assert.assertEquals(errMessage, manageUserProfileStep.get_error_message());
	}

	@Then("^([^\"]*) is shown ([^\"]*)$")
	public void companies_is_shown_on_screen(String role, String item)
			throws Exception {
		switch (role) {
		case "Admin":
			Assert.assertEquals(item, homeStep.get_company_title());
			break;

		case "Company":
			Assert.assertEquals(item, homeStep.get_upload_employee_data_menu());
			break;
//		case "Company Manager":
//			Assert.assertEquals(item,
//					uploadEmployeeDataStep.get_compelente_step_title());
//			break;
		case "Company User":
			Assert.assertEquals(item,
					reportStep.get_social_impact_scorecard_title());
			break;
		case "Partner":
			Assert.assertEquals(item, homeStep.get_dashboard());
			break;
		default:
			break;
		}
	}
	
	@When("^Click on Add Company button on Manage Companies menu\\.$")
	public void click_on_Add_Company_button_Manage_Companies_menu() throws Exception {
		manageCompaniesStep.click_on_Add_Company_button();
	}


	@When("^Input required field are Company Name: \"([^\"]*)\", Company Identifier: \"([^\"]*)\"\\ and select required drop down box.$")
	public void input_Company_Name_is_Company_Identifier_is(String companyName, String companyIdentifier) throws Exception {
	    manageCompanyStep.input_required_fields(companyName, companyIdentifier);
	}

	@When("^Input Street Address is \"([^\"]*)\", City is \"([^\"]*)\", State is \"([^\"]*)\", Zip is \"([^\"]*)\"\\.$")
	public void input_Street_Address_is_Street_Address_is_City_is_State_is_Zip_is(String address, String city, String state, String zip) throws Exception {
		manageCompanyStep.input_locations_value(address, city, state, zip);
	}

	@When("^Click on Save button on Manage Company screen\\.$")
	public void click_on_Save_button_on_Manage_Company_screen() throws Exception {
	    manageCompanyStep.click_on_Save_button();
	}

	@When("^Add user with Fist Name is \"([^\"]*)\", Last Name is \"([^\"]*)\", and Email is \"([^\"]*)\"$")
	public void input_Manager_user_Fist_Name_is_Last_Name_is_and_Email_is(String firstName, String lastName, String email) throws Exception {
		manageCompanyStep.add_user(firstName, lastName, email);
	}
	
	@Then("^System should navigate to Manage Companies screen and \"([^\"]*)\" should shown\\.$")
	public void system_should_navigate_to_Manage_Companies_screen_and_should_shown(String companyTitle) throws Exception {
		Assert.assertEquals(companyTitle, manageCompaniesStep.get_title());
	}

	@Then("^\"([^\"]*)\" Shows correctly be shown on Manage Companies screen\\.$")
	public void shows_correctly_be_shown_on_Manage_Companies_screen(String companyName) throws Exception {
		Assert.assertEquals(true, manageCompaniesStep.check_company_is_shown(companyName));	    
	}
	
	@When("^Join Working Metrics screen via link is \"([^\"]*)\"$")
	public void join_Working_Metrics_screen_via_link_is(String token) throws Exception {
		welcomeStep.open_site(token);
	}


	@When("^Click on Create an account on Working Metrics screen\\.$")
	public void click_on_Create_an_account_on_Working_Metrics_screen() throws Exception {
		welcomeStep.click_on_create_an_account_button();
	}

	@When("^Create password is \"([^\"]*)\"\\.$")
	public void create_password_is(String password) throws Exception {
		updatePassStep.update_password(password);
	}

	@When("^Authorized company, update many drop down list value\\.$")
	public void authorized_company_update_many_drop_down_list_value() throws Exception {
	    comInforAuthorStep.update_information();
	}

	@When("^Add a new User account with First Name is \"([^\"]*)\", Last Name is \"([^\"]*)\", email is \"([^\"]*)\", role is user\\.$")
	public void add_a_new_User_account_with_First_Name_is_Last_Name_is_email_is_role_is_user(String firstName, String lastName, String email) throws Exception {
	    comUserAuthorStep.add_new_user(firstName, lastName, email);
	}

	@When("^Next to Location screens\\.$")
	public void next_to_Location_screens() throws Exception {
	    comUserAuthorStep.click_next_button();
	}

	@When("^Next to Report screen\\.$")
	public void next_to_Report_screen() throws Exception {
	    comLocatorAuthorStep.click_next_button();
	}

	@Then("^The title is \"([^\"]*)\" should show on Upload Employee Data screens\\.$")
	public void the_title_is_should_show_on_Upload_Employee_screens(String title) throws Exception {
		Assert.assertEquals(title, uploadEmployeeDataStep.get_title_on_upload_employee_data());
	}

}
