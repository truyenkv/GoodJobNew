package GoodJobProject.steps;

import GoodJobProject.pages.Common;
import net.thucydides.core.steps.ScenarioSteps;

public class baseStep extends ScenarioSteps{
	Common basePage;
	
	public void open_browser_with_url(String url)
	{
		basePage.openAt(url);
		basePage.getDriver().manage().window().maximize();
	}
	
	
}
