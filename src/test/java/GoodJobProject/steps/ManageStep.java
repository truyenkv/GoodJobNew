package GoodJobProject.steps;

import GoodJobProject.pages.ManagePage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageStep extends ScenarioSteps{

	ManagePage managePage;

	public void click_on_Manage_Partners_button() {
		managePage.click_open_Manage_Partners();
	}



}
