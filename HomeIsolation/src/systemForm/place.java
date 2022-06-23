package systemForm;

import java.awt.Font;
import java.sql.Connection;
import java.text.AttributedString;
import java.awt.event.*;
import java.awt.font.TextAttribute;

import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

import main.MyConnect;

public class place extends JInternalFrame implements InternalFrameListener{
	
	Connection conn = MyConnect.getConnection();
	private Object listenedToWindow;
	
	
	public place() {
		super("Place System Management",
		          true, //resizable
		          true, //closable
		          true, //maximizable
		          true);//iconifiable
		
		Font fn = new Font("Tahoma", Font.PLAIN, 13);
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
		
		setSize(400, 300);
		
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
