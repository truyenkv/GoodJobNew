package GoodJobProject;

import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import GoodJobProject.steps.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefinition {
	
	@Steps
	LoginStep loginStep;
	
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

}
