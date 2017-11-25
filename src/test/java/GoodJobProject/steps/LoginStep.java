package GoodJobProject.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import GoodJobProject.pages.LoginPage;

public class LoginStep extends ScenarioSteps{
	LoginPage loginPage;
	
	@Step
	public void open_login_page() {
		loginPage.open();
	}

	@Step
	public void input_email(String email) {
		loginPage.input_email(email);		
	}

	@Step
	public void input_password(String password) {
		loginPage.input_password(password);		
	}

	@Step
	public void click_Login_button() {
		loginPage.click_Login_button();
	}
	
	@Step
	public String getCompanyListTit()
	{
		return loginPage.get_title_Com();
	}
	
}
