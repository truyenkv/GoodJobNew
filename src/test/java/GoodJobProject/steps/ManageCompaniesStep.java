package GoodJobProject.steps;

import GoodJobProject.pages.ManageCompaniesPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageCompaniesStep extends ScenarioSteps{
	ManageCompaniesPage manageCompanyPage;

	
	public void click_on_Add_Company_button() {
		manageCompanyPage.click_Add_Company_button();
	}
	
}
