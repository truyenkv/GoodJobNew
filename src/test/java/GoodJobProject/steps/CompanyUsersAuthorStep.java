package GoodJobProject.steps;

import net.thucydides.core.steps.ScenarioSteps;
import GoodJobProject.pages.CompanyUsersAuthorPage;

public class CompanyUsersAuthorStep extends ScenarioSteps{
	CompanyUsersAuthorPage comUserAuthorPage;

	public void add_new_user(String firstName, String lastName, String email) {
		comUserAuthorPage.add_new_users(firstName, lastName, email);
	}
}
