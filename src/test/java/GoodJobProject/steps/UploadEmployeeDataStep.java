package GoodJobProject.steps;

import GoodJobProject.pages.UploadEmployeeDataPage;
import net.thucydides.core.steps.ScenarioSteps;

public class UploadEmployeeDataStep extends ScenarioSteps{
	UploadEmployeeDataPage uploadEmployeeDataPage;

	public String get_title_on_upload_employee_data() {
		return uploadEmployeeDataPage.get_title_on_screen();
	}

}
