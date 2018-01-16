package GoodJobProject.steps;

import GoodJobProject.pages.WelcomPage;
import net.thucydides.core.steps.ScenarioSteps;

public class WelcomeStep extends ScenarioSteps{

	WelcomPage welcomePage;
	
	public void open_site(String token) {
		welcomePage.openAt(token);	
	}
	public void click_on_Create_An_Account_button() {
		welcomePage.click_Create_An_Account_button();
	}
	

}
