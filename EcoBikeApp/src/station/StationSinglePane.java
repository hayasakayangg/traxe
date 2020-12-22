package station;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.eco.bean.Station;

@SuppressWarnings("serial")
public class StationSinglePane extends JPanel{
	@SuppressWarnings("unused")
	private UserStationPageController controller;
	private JLabel nameLabel;
	private JLabel addressLabel;
    public StationSinglePane() {
    	super();
    }
	public StationSinglePane(UserStationPageController controller) {
		super();
		this.controller = controller;
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    	JPanel pane1 = new JPanel();
    	pane1.setLayout(new BoxLayout(pane1,BoxLayout.X_AXIS));
    	nameLabel = new JLabel();
    	nameLabel.setMinimumSize(new Dimension(100,30));
    	pane1.add(nameLabel);
    	pane1.add(Box.createRigidArea(new Dimension(20,0)));
    	addressLabel = new JLabel();
    	addressLabel.setMinimumSize(new Dimension(100,30));
    	pane1.add(addressLabel);
    	pane1.add(Box.createRigidArea(new Dimension(0,15)));
    	
    	JPanel pane2 = new JPanel();
    	pane1.setLayout(new BoxLayout(pane1,BoxLayout.X_AXIS));
    	JButton button1 = new JButton("Xem");
    	pane2.add(button1);
    	pane2.add(Box.createRigidArea(new Dimension(20,0)));
    	JButton button2 = new JButton("Trả xe");
    	pane2.add(button2);
    	pane2.add(Box.createRigidArea(new Dimension(20,0)));
    	
    	add(pane1);
    	add(pane2);
	}
	public void updateData(Station t) {
		nameLabel.setText(t.getName());
		addressLabel.setText(t.getAddress());
	}

}
