package address;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AddressDialog extends JDialog {
    private AddressController controller;
    private JTextField addressTextField;
    private JLabel noticeLabel;
    public AddressDialog() {
    	this.setTitle("Nhập địa chỉ");
    	this.setMinimumSize(new Dimension(400,150));
    	JPanel panel = new JPanel();
    	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
    	
    	
    	addressTextField= new JTextField();
    	panel.add(Box.createRigidArea(new Dimension(0,10)));
    	panel.add(addressTextField);
    	noticeLabel = new JLabel();
    	panel.add(noticeLabel);
    	
    	JButton accept = new JButton("Xác nhận");
    	panel.add(Box.createRigidArea(new Dimension(0,10)));
    	panel.add(accept);
    	panel.add(Box.createRigidArea(new Dimension(0,10)));
    	add(panel);
    	accept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(addressTextField.getText().trim().equals("")) {
					noticeLabel.setText("not null !!!!");
				}
				else {
					controller.setAddress(addressTextField.getText());
					revalidate();
					repaint();
					pack();
					controller.closeAddressDialog();
				}
				
			}
		});
		this.revalidate();
		this.repaint();
		this.pack();
		this.setResizable(false);
     }
	public void setController(AddressController controller) {
		this.controller = controller;
	}
}