package systemForm;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.text.AttributedString;
import java.awt.event.*;
import java.awt.font.TextAttribute;

import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;

import main.MyConnect;

public class place extends JInternalFrame {
	
	Connection conn = MyConnect.getConnection();
	JTable placeTable;
	DefaultTableModel placeModel;
	
	public place() {
//		super("Place Management",
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
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
//		setSize(700, 500);
		
		JPanel pTable = new JPanel();
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setPreferredSize(new Dimension(300, 390));
		placeTable = new JTable();
		Object data[][] = {
				{null,null,null,null},
				{null,null,null,null},
				{null,null,null,null},
				{null,null,null,null},
				{null,null,null,null}
		};
		String header[] = {"ID","สถานที่","ที่อยู่","เบอร์โทรศัพท์"};
		placeModel = new DefaultTableModel(data,header) {
			public boolean isCellEditable(int row,int column) {
				return false;
			}
		};
		placeTable.setModel(placeModel);
//		tableCust.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//		tableCust.getColumnModel().getColumn(0).setPreferredWidth(70);
//		tableCust.getColumnModel().getColumn(1).setPreferredWidth(140);
//		tableCust.getColumnModel().getColumn(2).setPreferredWidth(90);
//		tableCust.getColumnModel().getColumn(3).setPreferredWidth(120);
//		tableCust.getColumnModel().getColumn(4).setPreferredWidth(155);
//		for (int i = 1; i <= tableCust.getColumnCount()-1; i++) {
//			tableCust.getColumnModel().getColumn(i).setPreferredWidth(126);
//        } 
		scrollTable.setViewportView(placeTable);
		pTable.add(scrollTable);
//		placeTable.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
////				int index = placeTable.getSelectedRow();
////				bSaveCust.setEnabled(false);
////				txtCustNum.setEditable(false);
////				txtCustNum.setText(tableCust.getValueAt(index, 0).toString());
////				txtCustName.setText(tableCust.getValueAt(index, 1).toString());
////				txtCustAddr.setText(tableCust.getValueAt(index, 2).toString());
////				txtCustPhone.setText(tableCust.getValueAt(index, 3).toString());
////				txtCustMail.setText(tableCust.getValueAt(index, 4).toString());
//			}
//		});
		c.add(pTable,BorderLayout.NORTH);
	}
	
}
