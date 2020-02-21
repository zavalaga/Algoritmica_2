import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculadora extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn1;
	private JButton btn2;
	
	private JButton btnSum;
	private JButton btnIgual;
	
	private int oper1 = 0;
	private int oper2 = 0;
	private String operador;
	
	// Bad Implementation: the Toolbar and the TextPanel are not
	// fully separated
	private JTextArea textArea;
	
	public Calculadora() {
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btnSum = new JButton("+");
		btnIgual = new JButton("=");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btnIgual.addActionListener(this);
		btnSum.addActionListener(this);
		
		textArea = new JTextArea();
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(btn1);
		add(btn2);
		add(btnIgual);
		add(btnSum);
		
		add(textArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnClicked = (JButton)e.getSource();
		
		if (btnClicked == btn1) {
			textArea.append("1");
		} else if (btnClicked == btn2) {
			textArea.append("2");
		}else if(btnClicked == btnSum) {
			String opers1 = textArea.getText();
			oper1 = Integer.parseInt(opers1);
			operador = "Suma";
			
			textArea.setText("");
		}else if(btnClicked == btnIgual) {
			String opers2 = textArea.getText();
			oper2 = Integer.parseInt(opers2);
			
			//switch-case () las operaciones
			
			textArea.setText(""+(oper1+oper2));
		}
		
		
		
	}
}
