package main;

import java.sql.Connection;
import java.awt.*;
import javax.swing.*;

public class mainForm extends JFrame{
	
		Connection conn = MyConnect.getConnection();
		
	public mainForm() {
		Font fn = new Font("Tahoma", Font.PLAIN, 14);
		UIManager.put("Menu.font", fn);
		UIManager.put("MenuItem.font", fn);
		
		if(conn != null) {
			System.out.println("Connection Success");
		} else {
			System.out.println("Not Connection");
		}
		setSize(1200,600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 362, 249);
		setTitle("Home Isolation System");
		getContentPane().setLayout(null);
		
		// Menu Bar
        JMenuBar menuBar=new JMenuBar();
        
        // Menu 1
        JMenu menu1 = new JMenu("ระบบการจอง");
        JMenuItem menu1_1 = new JMenuItem("ระบบการจอง");
        menu1.add(menu1_1);
        menuBar.add(menu1);
        
        
        
        // Menu 2
        JMenu menu2 = new JMenu("ระบบจัดการข้อมูลพื้นฐาน");
        JMenuItem menu2_1 = new JMenuItem("จัดการข้อมูลผู้ป่วย");
        JMenuItem menu2_2 = new JMenuItem("จัดการข้อมูลสถานที่");
        menu2.add(menu2_1);
        menu2.add(menu2_2);
        menuBar.add(menu2);

        // Menu 3
        JMenu menu3 = new JMenu("รายงาน");
        JMenuItem menu3_1 = new JMenuItem("รายงานข้อมูลสถานที่");
        JMenuItem menu3_2 = new JMenuItem("Sub Menu 2-2");
        menu3.add(menu3_1);
        menu3.add(menu3_2);
        menuBar.add(menu3);

        setJMenuBar(menuBar);
	}
	
	public static void main(String[] agrs) {
		new mainForm();
		
	}
}