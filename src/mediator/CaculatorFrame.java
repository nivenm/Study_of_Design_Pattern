package mediator;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
		CaculatorMediator caculatorMediator =  new CaculatorMediator();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 383);
		getContentPane().setLayout(null);
		Label labelField = new Label();
		labelField.setBounds(23, 10, 389, 36);
		labelField.setBackground(Color.WHITE);
		labelField.setAlignment(Label.RIGHT);
		labelField.setFont(new Font(null, Font.BOLD, 20));
		caculatorMediator.setLabelField(labelField);
		getContentPane().add(labelField);
		Panel panel = new Panel();
		panel.setBounds(23, 52, 389, 273);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 4, 10, 10));
		
		Button button1 = new NumericButton("1", caculatorMediator);
		panel.add(button1);
		
		Button button2 = new NumericButton("2", caculatorMediator);
		panel.add(button2);
		
		Button button3 = new NumericButton("3", caculatorMediator);
		panel.add(button3);
		
		Button button_Div = new OperationButton("/", caculatorMediator);
		panel.add(button_Div);
		
		Button button4 = new NumericButton("4", caculatorMediator);
		panel.add(button4);
		
		Button button5 = new NumericButton("5", caculatorMediator);
		panel.add(button5);
		
		Button button6 = new NumericButton("6", caculatorMediator);
		panel.add(button6);
		
		Button button_Multi = new OperationButton("*", caculatorMediator);
		panel.add(button_Multi);
		
		Button button7 = new NumericButton("7", caculatorMediator);
		panel.add(button7);
		
		Button button8 = new NumericButton("8", caculatorMediator);
		panel.add(button8);
		
		Button button9 = new NumericButton("9", caculatorMediator);
		panel.add(button9);
		
		Button buttonMinus = new OperationButton("-", caculatorMediator);
		panel.add(buttonMinus);
		
		Button button0 = new NumericButton("0", caculatorMediator);
		panel.add(button0);
		
		Button buttonDot = new NumericButton(".", caculatorMediator);
		panel.add(buttonDot);
		
		Button buttonEqual = new OperationButton("=", caculatorMediator);
		panel.add(buttonEqual);
		
		Button buttonPlus = new OperationButton("+", caculatorMediator);
		panel.add(buttonPlus);
		
	
	}
}
