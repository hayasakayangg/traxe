package main;


import javax.swing.JOptionPane;
import javax.swing.JPanel;

import address.AddressController;
import returnbike.ReturnController;
import station.UserStationPageController;

public class EcoUserController {
	public String address = "";
	private AddressController addressController;
	private ReturnController returnController;
	public EcoUserController() {
		addressController = new AddressController();
	}
	
	public JPanel getAddressPane() {
		return addressController.getAddressPane();
	}
	
	public JPanel getReturnPane() {
		returnController = new ReturnController();
		return returnController.getReturnPane();
	}
	public JPanel getStationPage() {
		if(addressController.getAddress().equals("")) {
			return getNotice();
		}
		else {
			UserStationPageController controller = new  UserStationPageController(address);
			return controller.getStationPane();
		}

	}

	private JPanel getNotice() {
		JPanel frame = new JPanel();
		 JOptionPane.showMessageDialog(frame,
			    "Quay lại nhập địa chỉ đi",
			    "Từ từ",
			    JOptionPane.ERROR_MESSAGE);
		 return frame;
	}

	public String getAddress() {
		return addressController.getAddress();
	}
	
}
