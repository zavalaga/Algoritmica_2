import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class App {

	public static void main(String[] args) {
		
		// this is to run the gui in a separate thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				JFrame frame = new JFrame("Hello FISI 2020-0 !");
				frame.setSize(1200, 1000);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		
	}

}