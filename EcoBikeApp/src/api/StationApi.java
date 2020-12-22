package api;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.eco.bean.Bike;
import com.eco.bean.Station;

public  class StationApi {
	
	public  List<Station> getStation(Map<String, String> queryParams) {
		ArrayList<Bike> bikes1 = new ArrayList<Bike>();
		bikes1.add(new Bike("11", 1, 400000));
		bikes1.add(new Bike("12", 1, 400000));
		bikes1.add(new Bike("13", 2, 700000));
		bikes1.add(new Bike("14", 3, 550000));
		ArrayList<Bike> bikes2 = new ArrayList<Bike>();
		bikes2.add(new Bike("21", 1, 400000));
		bikes2.add(new Bike("22", 2, 700000));
		bikes2.add(new Bike("23", 2, 700000));
		bikes2.add(new Bike("24", 3, 550000));
		ArrayList<Bike> bikes3 = new ArrayList<Bike>();
		bikes3.add(new Bike("11", 1, 400000));
		bikes3.add(new Bike("12", 1, 400000));
		bikes3.add(new Bike("13", 2, 700000));
		bikes3.add(new Bike("14", 3, 550000));
		ArrayList<Station> list = new ArrayList<>();
		list.add(new Station("D9","HUST", 0, bikes1));
		list.add(new Station("95C","Hoàng Ngân", 6, bikes2));
		list.add(new Station("TC","Lê Thanh Nghị", 6, bikes3));
		return list;
	}
}
