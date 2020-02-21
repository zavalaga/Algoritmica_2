import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Ventana01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	private String ops1="", ops2="";
	private int op=0, n1=-1, n2=-1, r;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana01 frame = new Ventana01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana01() {
		setBackground(Color.ORANGE);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 411);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel, BorderLayout.CENTER);
		textField = new JTextField();
		textField.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		textField.setBounds(10, 11, 194, 64);
		panel.add(textField);
		textField.setColumns(10);
		JButton button = new JButton("1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "1";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "1";
					textField.setText(ops2);
				}
				table.setValueAt(1, 0, 0);
				
			}
		});
		button.setBounds(10, 168, 45, 30);
		panel.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBounds(60, 168, 45, 30);
		panel.add(button_1);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "2";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "2";
					textField.setText(ops2);
				}
			}
		});
		
		JButton button_2 = new JButton("3");
		button_2.setBounds(110, 168, 45, 30);
		panel.add(button_2);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "3";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "3";
					textField.setText(ops2);
				}
			}
		});
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(10, 127, 45, 30);
		panel.add(button_3);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "4";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "4";
					textField.setText(ops2);
				}
			}
		});
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(60, 127, 45, 30);
		panel.add(button_4);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "5";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "5";
					textField.setText(ops2);
				}
			}
		});
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(110, 127, 45, 30);
		panel.add(button_5);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "6";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "6";
					textField.setText(ops2);
				}
			}
		});
		JButton button_6 = new JButton("7");
		button_6.setBounds(10, 86, 45, 30);
		panel.add(button_6);
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "7";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "7";
					textField.setText(ops2);
				}
			}
		});
		JButton button_7 = new JButton("9");
		button_7.setBounds(110, 86, 45, 30);
		panel.add(button_7);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "9";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "9";
					textField.setText(ops2);
				}
			}
		});
		JButton button_8 = new JButton("0");
		button_8.setBounds(10, 209, 45, 30);
		panel.add(button_8);
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "0";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "0";
					textField.setText(ops2);
				}
			}
		});
		JButton button_9 = new JButton(".");
		button_9.setBounds(60, 209, 45, 30);
		panel.add(button_9);
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ops1 = ops1 + " .";
				textField.setText(ops1);
			}
		});
		JButton button_10 = new JButton("=");
		button_10.setBounds(110, 209, 45, 30);
		panel.add(button_10);
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				n2 = Integer.parseInt(ops2);
				try {
					switch(op){
					case 1: r=n1+n2; break;
					case 2: r=n1-n2; break;
					case 3: r=n1*n2; break;
					case 4: r=n1/n2; break;
					}
					n1 = r;
					textField.setText(""+r);
				} catch (ArithmeticException e) {
					textField.setText("Syntax ERROR");
				}
				
			}
			
		});
		
		
		
		JButton button_7_1 = new JButton("8");
		button_7_1.setBounds(60, 86, 45, 30);
		panel.add(button_7_1);
		button_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(op==0) {
					ops1 = ops1 + "8";
					textField.setText(ops1);
					n1 = Integer.parseInt(ops1);
				}
				else {
					ops2 = ops2 + "8";
					textField.setText(ops2);
				}
			}
		});
		
		JButton button_10_1 = new JButton("+");
		button_10_1.setBounds(160, 86, 45, 30);
		panel.add(button_10_1);
		button_10_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("");
				op=1;
				ops2 = "";
			}
		});
		JButton button_10_2 = new JButton("-");
		button_10_2.setBounds(160, 127, 45, 30);
		panel.add(button_10_2);
		button_10_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("");
				op=2;
				ops2 = "";
			}
		});
		JButton button_10_3 = new JButton("×");
		button_10_3.setBounds(160, 168, 45, 30);
		panel.add(button_10_3);
		button_10_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("");
				op=3;
				ops2 = "";
			}
		});
		JButton button_10_4 = new JButton("÷");
		button_10_4.setBounds(160, 209, 45, 30);
		panel.add(button_10_4);
	
		button_10_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("");
				op=4;
				ops2 = "";
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 250, 532, 97);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.YELLOW);
		table.setBounds(183, 204, 134, 49);
		table.setModel(new DefaultTableModel(
		        new Object [][] {
		        	{null, null, null, null},
		        	{null, null, null, null},
		        	{null, null, null, null},
		        	{null, null, null, null}
		        },
		        new String[] {
		        		"Title 1", "Title 2", "Title 3", "Title 4"
		        }
				));
		scrollPane.setViewportView(table);
	}
}
