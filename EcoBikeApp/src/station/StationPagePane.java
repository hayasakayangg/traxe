package station;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class StationPagePane extends JPanel{
	@SuppressWarnings("unused")
	private UserStationPageController controller;
    public StationPagePane(StationListPane listPane, StationSearchPane searchPane) {
    	SpringLayout layout = new SpringLayout();
		this.setLayout(layout);
		
		
		this.add(searchPane);
		this.add(listPane);
		
		
		layout.putConstraint(SpringLayout.WEST, searchPane, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, searchPane, 5, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, searchPane, -5, SpringLayout.EAST, this);
		
		
		layout.putConstraint(SpringLayout.WEST, listPane, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, listPane, 5, SpringLayout.SOUTH, searchPane);
		layout.putConstraint(SpringLayout.EAST, listPane, -5, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.SOUTH, listPane, -5, SpringLayout.SOUTH, this);
    }
	public void setController(UserStationPageController controller) {
		this.controller = controller;
	}
}
