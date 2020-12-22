package address;

import javax.swing.JPanel;

import com.eco.bean.Address;

public class AddressController {
	private AddressDialog addressDialog;
	private AddressPane addressPane;
	private Address address;
    private String addr = "";
    public AddressController() {
    	addressPane = new AddressPane();
    	addressPane.setController(this);
    	address = new Address();
    	
    }
	private void updateAddress() {
		addr = address.getAddress();
		addressPane.updateStatus(addr);
	}
	public JPanel getAddressPane() {
		return addressPane;
	}
	public void showAddressDialog() {
		addressDialog = new AddressDialog();
		addressDialog.setController(this);
	    addressDialog.setVisible(true);
	}
	public void closeAddressDialog() {
		addressDialog.setVisible(false);
		
	}
	public void setAddress(String text) {
		address.setAddress(text);
		updateAddress();
	}
	public String getAddress() {
		return addr;
	}

}
