package GoodJobProject.steps;

import java.awt.AWTException;
import java.awt.Robot;

import net.thucydides.core.steps.ScenarioSteps;
import GoodJobProject.pages.CompanyInformationAuthorPage;

public class CompanyInformationAuthorStep extends ScenarioSteps{
	CompanyInformationAuthorPage comInforAuthorPage;

	public void update_information() {
			comInforAuthorPage.update_information();
	}
	
}
