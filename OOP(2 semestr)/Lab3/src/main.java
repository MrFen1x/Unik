import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
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
		frame.getContentPane().setLayout(null);
		textField = new JTextField();
		textField.setBounds(109, 12, 266, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(109, 49, 266, 184);
		frame.getContentPane().add(textArea);
		textArea.setText("Введите N");
		JButton btnNewButton = new JButton("№1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				 int n = Integer.parseInt(textField.getText());
					int i=1;
					while (i<n+1) {
						int k=i;
						int kk=0;
						while(kk<n) {
							String d=String.valueOf(k);
							textArea.append(d+" ");
							k=k+2;
							kk++;
						}
						textArea.append("\n");
						i++;
					}
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("№2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				 int n = Integer.parseInt(textField.getText());
				 int k=1;
					int kk=0;
					while (kk<n) {
						while (k<=kk+1) {
							String d=String.valueOf(k);
							textArea.append(d);
							k++;
						}
						kk++;
						k=1;
						textArea.append("\n");
					}
			}
		});
		btnNewButton_1.setBounds(10, 45, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("№3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				int n = Integer.parseInt(textField.getText());
				int k=1;
				int kk=n;
				do {
					do {
						String d=String.valueOf(k);
						textArea.append(d);
						k++;
					}while (k<=kk);
					kk--;
					k=1;
					textArea.append("\n");
				}while (kk>=1);
			}
		});
		btnNewButton_2.setBounds(10, 79, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("№4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				int n = Integer.parseInt(textField.getText());
				int k=n;
				int i=n;
				int kk=0;
				do {
					do {
						String d=String.valueOf(i);
						textArea.append(d);
					i--;
					kk++;
					}while(kk<k);
					k--;
					i=n;
					kk=0;
					textArea.append("\n");
				}while(k>=1);
			}
		});
		btnNewButton_3.setBounds(10, 113, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
