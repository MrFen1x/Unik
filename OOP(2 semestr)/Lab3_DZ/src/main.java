import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		frame.getContentPane().add(textArea, BorderLayout.CENTER);
		
		textArea.setText("Введите N");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("№2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				int n = Integer.parseInt(textField.getText());
				int i =1;
				int k=n;
				while(k>0) {
					i=k;
					while (i<n+1) {
						String d= String.valueOf(i);
						textArea.append(d);
						i++;
					}
					k--;
					textArea.append("\n");
				}
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		

	}

}
