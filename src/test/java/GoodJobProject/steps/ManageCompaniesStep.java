package GoodJobProject.steps;

import GoodJobProject.pages.ManageCompaniesPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ManageCompaniesStep extends ScenarioSteps{
	ManageCompaniesPage manageCompaniesPage;

	
	public void click_on_Add_Company_button() {
		manageCompaniesPage.click_Add_Company_button();
	}


	public String get_title() {
		return manageCompaniesPage.get_company_list_title();
	}
	
}
