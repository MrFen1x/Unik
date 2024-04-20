import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;

public class mainWin extends JPanel {
	//public int num;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWin window = new mainWin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainWin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1082, 808);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		myPanel panel = new myPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		JButton btnNewButton = new JButton("Oval");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.prom(1);
			}
		});
		btnNewButton.setBounds(264, 11, 107, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rectangle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.prom(2);
			}
		});
		btnNewButton_1.setBounds(381, 11, 113, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.prom(3);
			}
		});
		btnNewButton_2.setBounds(504, 11, 110, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Net");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.prom(4);
			}
		});
		btnNewButton_3.setBounds(624, 11, 107, 23);
		panel.add(btnNewButton_3);
	}
}
