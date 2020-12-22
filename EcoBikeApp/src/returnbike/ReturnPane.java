package returnbike;

import javax.swing.JPanel;

import api.StationApi;

import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReturnPane extends JPanel {
	private static final long serialVersionUID = 1L;
	private StationApi stationApi;
	private ReturnController returnController;
	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	Map<String, String> queryParams;
	public ReturnPane() {
		
		stationApi = new StationApi();
		
		JPanel panel = new JPanel();
        JLabel lblNewLabel = new JLabel("TR\u1EA2 XE");
		
		checkBox1 = new JCheckBox(stationApi.getStation(queryParams).get(0).getName() + " - " + stationApi.getStation(queryParams).get(0).getAddress());
		checkBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkBox2.setSelected(false);
				checkBox3.setSelected(false);
			}
		});
		
		checkBox2 = new JCheckBox(stationApi.getStation(queryParams).get(1).getName() + " - " + stationApi.getStation(queryParams).get(1).getAddress());
		checkBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkBox1.setSelected(false);
				checkBox3.setSelected(false);
			}
		});
		checkBox3 = new JCheckBox(stationApi.getStation(queryParams).get(2).getName() + " - " + stationApi.getStation(queryParams).get(2).getAddress());
		checkBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkBox2.setSelected(false);
				checkBox1.setSelected(false);
			}
		});
		JButton btnNewButton = new JButton("Thanh to\u00E1n");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkBox1.isSelected() && stationApi.getStation(queryParams).get(0).getSlot() > 0) {
					removeAll();
					repaint();
					revalidate();
					add( returnController.getPayPage());
				}
				if (checkBox1.isSelected() && stationApi.getStation(queryParams).get(0).getSlot() <= 0) {
					JOptionPane.showMessageDialog(null, "Bãi xe đã hết chỗ. Vui lòng chọn bãi xe khác", "Thông báo", JOptionPane.WARNING_MESSAGE);
				}
				if (checkBox2.isSelected() && stationApi.getStation(queryParams).get(1).getSlot() > 0) {
					removeAll();
					repaint();
					revalidate();
					add( returnController.getPayPage());
				}
				if (checkBox2.isSelected() && stationApi.getStation(queryParams).get(1).getSlot() <= 0) {
					JOptionPane.showMessageDialog(null, "Bãi xe đã hết chỗ. Vui lòng chọn bãi xe khác", "Thông báo", JOptionPane.WARNING_MESSAGE);
				}
				if (checkBox3.isSelected() && stationApi.getStation(queryParams).get(2).getSlot() > 0) {
					removeAll();
					repaint();
					revalidate();
					add( returnController.getPayPage());
				}
				if (checkBox3.isSelected() && stationApi.getStation(queryParams).get(2).getSlot() <= 0) {
					JOptionPane.showMessageDialog(null, "Bãi xe đã hết chỗ. Vui lòng chọn bãi xe khác", "Thông báo", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		panel.setLayout(gl_panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(97)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(checkBox2)
							.addComponent(checkBox1)
							.addComponent(checkBox3)))
					.addContainerGap(240, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(294, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(69))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addComponent(lblNewLabel)
					.addGap(38)
					.addComponent(checkBox1)
					.addGap(18)
					.addComponent(checkBox2)
					.addGap(18)
					.addComponent(checkBox3)
					.addGap(34)
					.addComponent(btnNewButton)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		add(panel);

	}
	public void setController(ReturnController returnController) {
		this.returnController = returnController;
	}
}