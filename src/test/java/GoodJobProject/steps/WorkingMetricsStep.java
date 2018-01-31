package GoodJobProject.steps;

import GoodJobProject.pages.WorkingMetricsPage;
import net.thucydides.core.steps.ScenarioSteps;

public class WorkingMetricsStep extends ScenarioSteps{

	WorkingMetricsPage welcomePage;
	
	public void open_site(String token) {
		welcomePage.openAt(token);
		welcomePage.getDriver().manage().window().maximize();
	}
	public void click_on_create_an_account_button() {
		welcomePage.click_create_an_account_button();
	}
	

}
