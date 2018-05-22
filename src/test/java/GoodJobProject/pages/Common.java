package GoodJobProject.pages;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.awt.Toolkit;
import java.util.List;

public class Common extends PageObject{
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public static WebElementFacade saveBtn;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	public static WebElementFacade nextBtn;
	
	
	@FindBy(xpath="//*[@class='glyphicon glyphicon-ok']")
	public static WebElementFacade okIcon;

	@FindBy(xpath="//button[contains(text(),'browse')]")
	public static WebElementFacade browseLnk;
	
	public static void upload_file(String pathFile) {
		uploadFile(pathFile);
	}

	@FindBy(xpath="//button[contains(text(),'Upload')]")
	public static WebElementFacade uploadBtn;
	/**
	 * This method will set any parameter string to the system's clipboard.
	 */
	private static void setClipboardData(String string) {
		// StringSelection is a class that can be used for copy and paste
		// operations.
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	private static void uploadFile(String fileLocation) {
		try {
			// Setting clip board with file location
			setClipboardData(fileLocation);
			// native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}
	
}
