package address;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AddressPane extends JPanel{
    private AddressController controller;
    private JLabel statusLabel;
    public AddressPane() {
    	this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    	
    	JPanel panel1 = new JPanel();
    	panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        
    	statusLabel = new JLabel();
        JButton change = new JButton("Thay đổi");
        change.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.showAddressDialog();
			}
		});

        panel1.add(change);
        panel1.add(Box.createRigidArea(new Dimension(10, 0)));
        panel1.add(statusLabel);
        
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(panel1);
        add(Box.createRigidArea(new Dimension(0, 10)));
    	
    	
    }
	public void setController(AddressController controller) {
		this.controller = controller;
	}
	public void updateStatus(String address) {
		
		statusLabel.setText("Địa chỉ:"+ address);
	}

}
