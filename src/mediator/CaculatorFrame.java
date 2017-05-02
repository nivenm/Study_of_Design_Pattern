package mediator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CaculatorFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaculatorFrame frame = new CaculatorFrame();
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
	public CaculatorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 383);
		getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(23, 10, 389, 36);
		getContentPane().add(textField);
		
		Panel panel = new Panel();
		panel.setBounds(23, 52, 389, 273);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 4, 10, 10));
		
		Button button1 = new Button("1");
		panel.add(button1);
		
		Button button2 = new Button("2");
		panel.add(button2);
		
		Button button3 = new Button("3");
		panel.add(button3);
		
		Button button_Div = new Button("/");
		panel.add(button_Div);
		
		Button button4 = new Button("4");
		panel.add(button4);
		
		Button button5 = new Button("5");
		panel.add(button5);
		
		Button button6 = new Button("6");
		panel.add(button6);
		
		Button button_Multi = new Button("*");
		panel.add(button_Multi);
		
		Button button_9 = new Button("7");
		panel.add(button_9);
		
		Button button_10 = new Button("8");
		panel.add(button_10);
		
		Button button_11 = new Button("9");
		panel.add(button_11);
		
		Button button_12 = new Button("-");
		panel.add(button_12);
		
		Button button_13 = new Button("0");
		panel.add(button_13);
		
		Button button_14 = new Button(".");
		panel.add(button_14);
		
		Button button_15 = new Button("=");
		panel.add(button_15);
		
		Button button_16 = new Button("+");
		panel.add(button_16);
		
	
	}
}
