package returnbike;

import javax.swing.JPanel;

import pay.PayPageController;

public class ReturnController {
	private ReturnPane returnPane;
	private PayPageController payPageController;
	public ReturnController() {
		returnPane = new ReturnPane();
		returnPane.setController(this);
	}
	public JPanel getReturnPane() {
		return returnPane;
	}
	public JPanel getPayPage() {
		payPageController = new PayPageController();
		
		return payPageController.getPayPage();
	}
}