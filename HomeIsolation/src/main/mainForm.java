package main;

import java.sql.Connection;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyVetoException;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import systemForm.*;

public class mainForm extends JFrame{
	
		Connection conn = MyConnect.getConnection();
		JDesktopPane desktop;
	public mainForm() {
		Font fn = new Font("Tahoma", Font.PLAIN, 14);
		
		UIManager.put("Menu.font", fn);
		UIManager.put("MenuItem.font", fn);
		UIManager.put("Button.font", fn);
		UIManager.put("Label.font", fn);
		desktop = new JDesktopPane();
		setContentPane(desktop);
//		if(conn != null) {
//			System.out.println("Connection Success");
//		} else {
//			System.out.println("Not Connection");
//		}
		
		
		
		// Menu Bar
        JMenuBar menuBar=new JMenuBar();
        
        // Menu 1
        JMenu menu1 = new JMenu("ระบบการจอง");
//        JMenuItem menu1_1 = new JMenuItem("จอง");
//        menu1.add(menu1_1);
        JButton bt1 = new JButton("จอง");
        setbuttonMenu(bt1);
//        bt1.setBorder(BorderFactory.createEmptyBorder());
//        bt1.setContentAreaFilled(false);
//        bt1.setBorderPainted(false);
//        menuBar.add(menu1);
        menuBar.add(bt1);
        
        bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktop.removeAll();
				desktop.repaint();
				place framePlace = new place();
				framePlace.setBackground(Color.red);
				setJIF(framePlace);
			}
		});
        
        
        // Menu 2
        JMenu menu2 = new JMenu("ระบบจัดการข้อมูลพื้นฐาน");
        JMenuItem menu2_1 = new JMenuItem("จัดการข้อมูลผู้ป่วย");
        JMenuItem menu2_2 = new JMenuItem("จัดการข้อมูลสถานที่");
        menu2.add(menu2_1);
        menu2.add(menu2_2);
        menuBar.add(menu2);
        
        menu2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktop.removeAll();
				desktop.repaint();
				place framePlace = new place();
				framePlace.setBackground(Color.blue);
				setJIF(framePlace);
				
			}
		});

        // Menu 3
        JMenu menu3 = new JMenu("รายงาน");
        JMenuItem menu3_1 = new JMenuItem("รายงานข้อมูลสถานที่");
        JMenuItem menu3_2 = new JMenuItem("ect");
        menu3.add(menu3_1);
        menu3.add(menu3_2);
        menuBar.add(menu3);
        
        menu3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktop.removeAll();
				desktop.repaint();
				testInterF frameTest = new testInterF();
				setJIF(frameTest);
			}
		});
        
        setJMenuBar(menuBar);
        
        setSize(1000,600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 362, 249);
		setTitle("Home Isolation System");
		getContentPane().setLayout(null);
	}
	
	public void setJIF(JInternalFrame jif) {
		try {
		BasicInternalFrameUI bi = (BasicInternalFrameUI)jif.getUI();
		bi.setNorthPane(null);
//	    Dimension desktopSize = this.getSize();
//	    Dimension jInternalFrameSize = jif.getSize();
//	    int width = (desktopSize.width - jInternalFrameSize.width) / 2;
//	    int height = (desktopSize.height - jInternalFrameSize.height) / 2;
//	    int height = 0;
//	    jif.setLocation(width, height);
		jif.setBorder(null);
	    jif.setVisible(true);
	    jif.setMaximum(true);
	    desktop.add(jif);
		} catch (PropertyVetoException e1) {
			e1.printStackTrace();
		}
	}

	public void setbuttonMenu (JButton bt) {
		 bt.setBackground(Color.WHITE);
	     bt.setBorderPainted(false);
	     bt.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseEntered(java.awt.event.MouseEvent evt) {
	            	bt.setBackground(Color.LIGHT_GRAY);
	            }

	            public void mouseExited(java.awt.event.MouseEvent evt) {
	            	bt.setBackground(Color.WHITE);
	            }
	        });
	}
	
	public static void main(String[] agrs) {
		new mainForm();
		
	}
}
