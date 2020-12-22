package station;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.eco.bean.Station;

@SuppressWarnings("serial")
public class StationListPane extends JScrollPane {
	private LayoutManager layout;
	protected JPanel pane;
	private UserStationPageController controller;
    public StationListPane() {
    	pane = new JPanel();
		layout = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.setLayout(layout);
		
		this.setViewportView(pane);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.getVerticalScrollBar().setUnitIncrement(20);
		this.getHorizontalScrollBar().setUnitIncrement(20);
    }
	public void setController(UserStationPageController userStationPageController) {
		this.controller = userStationPageController;
	}
	public void updateData(List<Station> list) {
		pane.removeAll();
		pane.revalidate();
		pane.repaint();
		
		for (Station t: list) {
		    StationSinglePane singlePane = controller.createSinglePane();
	        
            singlePane.updateData(t);
            pane.add(singlePane);
            pane.add(Box.createRigidArea(new Dimension(0, 40)));
        }
	}

}
