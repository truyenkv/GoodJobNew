package GoodJobProject.steps;

import GoodJobProject.pages.UploadEmployeeDataPage;
import net.thucydides.core.steps.ScenarioSteps;

public class UploadEmployeeDataStep extends ScenarioSteps{
	UploadEmployeeDataPage uploadEmployeeDataPage;

	public String get_title_on_upload_employee_data() {
		return uploadEmployeeDataPage.get_title_on_screen();
	}

	public void click_on_Next_button() {
		uploadEmployeeDataPage.click_on_Next_button();
	}

	public void select_file_upload() {
		uploadEmployeeDataPage.select_file_upload();
	}

	public void upload_file(String filePath) {
		uploadEmployeeDataPage.upload_file(filePath);
	}

	public void click_upload_button() {
		uploadEmployeeDataPage.click_on_upload_button();
		
	}

	public String get_title_after_uploadfile() {
		return uploadEmployeeDataPage.get_title_after_uploadfile();
	}

	public void click_on_uploadEmployeeData_menu() {
		uploadEmployeeDataPage.click_uploadEmployeeData_menu();
		
	}

	public String get_warning_message() {
		return uploadEmployeeDataPage.get_warning_message();
		
	}

	public boolean determined_the_year(String year) {
		return uploadEmployeeDataPage.determined_the_year(year);
	}

	public Object determined_the_period(String period) {
		return uploadEmployeeDataPage.determined_the_period(period);
	}

	public void click_upload_icon() {
		uploadEmployeeDataPage.click_upload_icon();
		
	}

}
