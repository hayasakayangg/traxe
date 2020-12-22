package pay;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import javax.swing.JPanel;

import com.eco.bean.Bike;

import api.StationApi;

public class PayPageController {
	StationApi stationApi;
	Map<String, String> queryParams;
	private PayPage payPage;
	public PayPageController() {
		payPage = new PayPage();
		payPage.setController(this);
		setInformation();
	}
	private void setInformation() {
		payPage.setInformation();
	}
	public JPanel getPayPage() {
		return payPage;
	}
	public int random() {
		Random random = new Random();
		int n = random.nextInt(3);
		return n;
	}
	public Bike randomBike() {
		Random rdRandom = new Random();
		int n = rdRandom.nextInt(4);
		stationApi = new StationApi();
		ArrayList<Bike> bikes = stationApi.getStation(queryParams).get(random()).getBikes();
		return bikes.get(n);
	}
	public int randomTime() {
		Random random = new Random();
		int n = random.nextInt(300);
		return n * 15;
	}
	public int calculateMoney(int type, int time) {
		if (time <= 10)
			return 0;
		int money = (time >= 30)? 10000 + (time - 30) / 15 * 3000 : 10000;
		if (type == 1) {
			return money;
		}
		return money * 3 / 2 ;
	}
	public String calculateMn(Bike bike, int time) {
		int tien = calculateMoney(bike.getTypeBike(), time);
		int coc = bike.getCostBike();
		return (coc > tien) ? " \n Số tiền hoàn trả: " + (coc - tien) + "đ": " \n Số tiền cần trả thêm: " + (tien - coc) + "đ"; 
	}
}
