package GoodJobProject.steps;

import java.awt.AWTException;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import GoodJobProject.pages.ManagePartnerProfilePage;


public class ManagePartnerProfileStep extends ScenarioSteps{
	ManagePartnerProfilePage managePartProfilePage;
	
	
	public void create_partner_name(String partnerName) {
		managePartProfilePage.input_partner_name(partnerName);
		managePartProfilePage.click_on_save_button();
	}


	public void click_on_add_a_user_button() {
		managePartProfilePage.click_add_user_button();
	}


	public void input_user_information(String firstName, String lastName, String email, String role) throws AWTException  {
		managePartProfilePage.input_user_infor(firstName, lastName, email, role);
	}


	public void click_On_Save_Button() {
		managePartProfilePage.click_on_save_button();
	}
	
}
