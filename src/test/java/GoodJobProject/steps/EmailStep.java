package GoodJobProject.steps;

import GoodJobProject.pages.EmailPage;
import net.thucydides.core.steps.ScenarioSteps;

public class EmailStep extends ScenarioSteps{
	EmailPage emailPage;
	

	public void open_email_webapp() {
		emailPage.openAt("http://www.yopmail.com/en/");
	}

	public void input_email_value(String emailConfirm) {
		emailPage.input_email(emailConfirm);
	}

	public void click_on_get_start_buton() {
		emailPage.click_getstart_btn();
		
	}
	

}
