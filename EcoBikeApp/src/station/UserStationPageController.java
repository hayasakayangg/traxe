package station;

import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

import com.eco.bean.Station;

import api.StationApi;

public class UserStationPageController {
	
	private String address;
    private StationPagePane pagePane;
    private StationListPane listPane;
    private StationSearchPane searchPane;
    
	public UserStationPageController() {
		super();
    }
	public UserStationPageController(String address) {
		super();
		this.address = address;
		listPane = new StationListPane();
		searchPane = new StationSearchPane();
		
		listPane.setController(this);
		searchPane.setController(this);
		
		searchPane.addressSearch(address);
		
		pagePane = new StationPagePane(listPane,searchPane);
		pagePane.setController(this);
	}
	public JPanel getStationPane() {
		return pagePane;
	}
	
	public void search(Map<String, String> queryParams) {
		List<Station> list = new StationApi().getStation(queryParams);
		listPane.updateData(list);
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public StationSinglePane createSinglePane() {
		return new StationSinglePane(this);
	}

}
