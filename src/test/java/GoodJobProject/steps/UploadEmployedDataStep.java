package GoodJobProject.steps;

import GoodJobProject.pages.UploadEmployedDataPage;
import net.thucydides.core.steps.ScenarioSteps;

public class UploadEmployedDataStep extends ScenarioSteps{

	UploadEmployedDataPage uploadEmployeeDataPage;
	public String get_compelente_step_title() {
		return uploadEmployeeDataPage.get_complete_steps_to_provide_title();
	}

}
