package pay;

import javax.swing.JPanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.eco.bean.Bike;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PayPage extends JPanel {
 
	private JTextPane textPane ;
	private JLabel lblNewLabel ;
	private PayPageController payPageController;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PayPage() {
		
		lblNewLabel =  new JLabel("Thanh to\u00E1n");
		textPane = new JTextPane();
		JButton btnNewButton = new JButton("X\u00E1c nh\u1EADn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Thanh toán thành công", "Thông báo", JOptionPane.YES_OPTION);
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186)
							.addComponent(lblNewLabel)))
					.addContainerGap(83, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(307, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(54))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(22))
		);
		setLayout(groupLayout);
	}
	public void setInformation() {
		int time = payPageController.randomTime();
		Bike bike = payPageController.randomBike();
		textPane.setText(" \n Mã xe: " + bike.getIdBike() + 
				"\n Loại xe:  ");
		if (bike.getTypeBike() == 1)
			textPane.setText(textPane.getText().trim() + " Xe đạp đơn thường");
		if (bike.getTypeBike() == 2)
			textPane.setText(textPane.getText().trim() + " Xe đạp đơn điện");
		if (bike.getTypeBike() == 3)
			textPane.setText(textPane.getText().trim() + " Xe đạp đôi thường");
		textPane.setText(textPane.getText().trim() + " \n Thời gian sử dụng: " + time + 
				" phút \n Tiền cọc đã đặt: " + bike.getCostBike() + 
				"đ \n Tiền thuê xe: " + payPageController.calculateMoney(bike.getTypeBike(), time) + "đ" + 
				payPageController.calculateMn(bike, time));
		
	}
	public void setController (PayPageController payPageController ) {
		this.payPageController = payPageController;
	}
}
