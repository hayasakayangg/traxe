package main;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class EcoUser extends JFrame {

	public static final int WINDOW_WIDTH = 380;
	public static final int WINDOW_HEIGHT = 350;
	
	public EcoUser(EcoUserController controller) {
		JPanel panel = new JPanel();
		JLabel jLabel1 = new JLabel();
		JButton jButton1 = new JButton();
		JButton jButton2 = new JButton();
		JButton jButton3 = new JButton();
		JButton jButton4 = new JButton();
		
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/image/images.png"))); // NOI18N

        jButton1.setText("Xe đang thuê");
	    jButton2.setText("Thuê xe");
        jButton3.setText("Tìm kiếm bãi xe");
        jButton4.setText("Trả xe");
        
        this.add(panel);
        
        panel.setLayout( new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        JPanel bottom = controller.getAddressPane();
        
        bottom.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(bottom);
        
        JPanel center = new JPanel();
        center.setLayout( new BoxLayout(center,BoxLayout.Y_AXIS));
        center.setAlignmentX(Component.CENTER_ALIGNMENT);
        center.add(jLabel1);
        
        panel.add(center);
        center.add(Box.createRigidArea(new Dimension(0,10)));
        
        JPanel up = new JPanel();
        up.setLayout( new BoxLayout(up,BoxLayout.X_AXIS));
        up.add(Box.createRigidArea(new Dimension(15, 0)));
        up.add(jButton4);
        up.add(Box.createRigidArea(new Dimension(15, 0)));
        up.add(jButton3);
        up.add(Box.createRigidArea(new Dimension(15, 0)));
        up.add(jButton2);
        up.add(Box.createRigidArea(new Dimension(15, 0)));
        up.add(jButton1);

        panel.add(up);
        
      
        jButton3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel panel2 = controller.getStationPage();
				if(!controller.getAddress().equals("")) {
					System.out.println("zô zô");
					panel.removeAll();
					panel.repaint();
					panel.revalidate();
					panel.add(panel2);
				}
			}
		});
        
        jButton4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel panel2 = controller.getReturnPane();
				
					panel.removeAll();
					panel.repaint();
					panel.revalidate();
					panel.add(panel2);
			}
		});
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("EcoBike");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EcoUser(new EcoUserController());
			}
		});
	}
}