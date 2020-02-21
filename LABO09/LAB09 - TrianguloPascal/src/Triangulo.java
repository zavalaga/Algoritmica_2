import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Scanner;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Triangulo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Scanner read = new Scanner(System.in);
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTable table_2;
	 	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setTitle("Triangulo Pascal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Ingrese el numero de filas del Triangulo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(25, 9, 225, 31);
		contentPane.add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(258, 14, 46, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		

		JButton btnNewButton = new JButton("OK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			
			
			public void mouseClicked(MouseEvent arg0) {
				
				String ns = textField.getText();
				int n = Integer.parseInt(ns)*2-1;
							
				
				DefaultTableModel table = new DefaultTableModel();
		        final JTable cable = new JTable(table);

				for (int c=1; c<=n; c++) {
					Object[] columnaNueva1 = {0};
					table.addColumn("T"+c, columnaNueva1);	
				}
				for(int d=1; d<n; d++) {
					Object[] newRow = {0};
					table.addRow(newRow);
				}
				for (int e=0; e<n; e++) {
					for (int f=0; f<n; f++) {
						table.setValueAt(0, e, f);
					}
				}
				
				JScrollPane scrollPane = new JScrollPane(cable);
		        scrollPane.setBounds(10, 43, 510, 156);
				

				contentPane.add(scrollPane);
				
				for (int i = 0; i < (n+1)/2; i++) {
					table.setValueAt(1, i, (n-1)/2-i);
					table.setValueAt(1, i, (n-1)/2+i);
				
			    }
				for (int k = 1; k < (n+1)/2; k++) {
					for (int j = 1; j < n-1; j++) {
						table.setValueAt((int)table.getValueAt(k-1, j-1)+(int)table.getValueAt(k-1, j+1), k, j);
					}
				}
				for(int a = 0; a < n; a++) {
					for (int b = 0; b < n; b++) {
						if ((int)table.getValueAt(a, b)==0) {
							table.setValueAt(null, a, b);
						}
					}
				}
				
			
			}
			
		});
		btnNewButton.setBounds(336, 13, 58, 23);
		contentPane.add(btnNewButton);
		
		}
}
