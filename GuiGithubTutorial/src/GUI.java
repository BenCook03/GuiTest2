import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {

	private JFrame frame;
	private JTextField First_Text_Box;
	private JTextField Second_Text_Box;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
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
		
		First_Text_Box = new JTextField();
		First_Text_Box.setBounds(139, 79, 130, 26);
		frame.getContentPane().add(First_Text_Box);
		First_Text_Box.setColumns(10);
		
		Second_Text_Box = new JTextField();
		Second_Text_Box.setBounds(139, 136, 130, 26);
		frame.getContentPane().add(Second_Text_Box);
		Second_Text_Box.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int first = Integer.parseInt(First_Text_Box.getText());
				int second = Integer.parseInt(Second_Text_Box.getText());
				System.out.println(first / second);
			}
		});
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculate.setBounds(139, 197, 117, 29);
		frame.getContentPane().add(btnCalculate);
	}
}
