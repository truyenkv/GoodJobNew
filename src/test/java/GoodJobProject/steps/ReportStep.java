package GoodJobProject.steps;

import GoodJobProject.pages.ReportPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ReportStep extends ScenarioSteps{

	ReportPage reportPage;
	
	public String get_social_impact_scorecard_title() {
		return reportPage.get_social_impact_scorecart_title();
	}

}
