package station;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class StationSearchPane extends JPanel{
    
	private UserStationPageController controller;
	private JTextField nameField;
	private JTextField addrField;
	
    public StationSearchPane() {
    	BoxLayout layout = new BoxLayout(this,BoxLayout.Y_AXIS);
		this.setLayout(layout);
		
		JLabel nameLabel = new JLabel("Tên bãi xe");
		nameField = new JTextField();
		add(nameLabel);
		add(nameField);
	
		JLabel addrLabel = new JLabel("Địa chỉ");
		addrField = new JTextField();
		add(addrLabel);
		add(addrField);
		
		JButton searchButton = new JButton("Search");
		add(searchButton);
		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.search(getQueryParams());
			}
		});
    }
	public void setController(UserStationPageController userStationPageController) {
		this.controller = userStationPageController;
	}
	
	public Map<String, String> getQueryParams() {
		Map<String, String> res = new HashMap<String, String>();
		
		if (!nameField.getText().trim().equals("")) {
			res.put("name", nameField.getText().trim());
		}
		if (!addrField.getText().trim().equals("")) {
			res.put("address", addrField.getText().trim());
		}
		
		return res;
	}
	public void addressSearch(String address) {
		Map<String,String> res = getQueryParams();
		res.put("address", address.trim());
		controller.search(res);
	}
}
