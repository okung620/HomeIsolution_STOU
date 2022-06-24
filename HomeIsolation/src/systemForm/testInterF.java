package systemForm;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.sql.Connection;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

import main.MyConnect;

public class testInterF extends JInternalFrame implements InternalFrameListener{
	
	Connection conn = MyConnect.getConnection();
	private Object listenedToWindow;
	
	public testInterF() {
//		super("Test",
//		          true, //resizable
//		          true, //closable
//		          true, //maximizable
//		          true);//iconifiable
		
		Font fn = new Font("Tahoma", Font.PLAIN, 13);
		Font fn2 = new Font("Tahoma", Font.BOLD, 28);
		UIManager.put("OptionPane.messageFont", fn);
		UIManager.put("TitledBorder.font", fn);
		UIManager.put("Label.font", fn);
		UIManager.put("Button.font", fn);
		UIManager.put("Table.font", fn);
		UIManager.put("TableHeader.font", fn);
		UIManager.put("TextField.font", fn);
		UIManager.put("InternalFrame.TitleFont", fn);
		UIManager.put("Panel.font", fn);
		UIManager.put("OptionPane.font", fn);
		UIManager.put("ToolBar.font", fn);
		if(conn != null) {
			System.out.println("Connection Success");
		} else {
			System.out.println("Not Connection");
		}
		JLabel L1 = new JLabel("รายงาน",SwingConstants.CENTER);
		L1.setFont(fn2);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(L1,BorderLayout.NORTH);
		setSize(700, 500);
		
	}
	
	public void internalFrameClosed(InternalFrameEvent e) {
//	        displayMessage("Internal frame closed", e);
	        listenedToWindow = null;
	    }
	@Override
	public void internalFrameOpened(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void internalFrameClosing(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void internalFrameIconified(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void internalFrameDeiconified(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void internalFrameActivated(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void internalFrameDeactivated(InternalFrameEvent e) {
		// TODO Auto-generated method stub
		
	}
}

