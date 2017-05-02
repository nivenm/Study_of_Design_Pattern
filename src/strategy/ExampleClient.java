package strategy;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 策略模式客户端
 * @author wangth89
 *
 */
public class ExampleClient  implements KeyListener,ItemListener {

	private JFrame frame;
	private JTextField txt_unitPrice;
	private JTextField txt_quantum;
	private JComboBox<?> comboBox;
	JLabel lbl_normalAmount , lbl_realAmount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExampleClient window = new ExampleClient();
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
	public ExampleClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u7B56\u7565\u6A21\u5F0F\u5BA2\u6237\u7AEF");
		frame.setBounds(100, 100, 730, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u5355\u4EF7\uFF1A");
		label.setBounds(86, 50, 54, 15);
		frame.getContentPane().add(label);
		
		txt_unitPrice = new JTextField();
		txt_unitPrice.setBounds(182, 47, 153, 18);
		frame.getContentPane().add(txt_unitPrice);
		txt_unitPrice.setColumns(10);
		txt_unitPrice.addKeyListener(this);
		
		JLabel label_1 = new JLabel("\u6570\u91CF");
		label_1.setBounds(377, 50, 54, 15);
		frame.getContentPane().add(label_1);
		
		txt_quantum = new JTextField();
		txt_quantum.setBounds(462, 47, 134, 18);
		frame.getContentPane().add(txt_quantum);
		txt_quantum.setColumns(10);
		txt_quantum.addKeyListener(this);
		
		JLabel label_2 = new JLabel("\u6298\u6263\u65B9\u5F0F");
		label_2.setBounds(86, 151, 54, 15);
		frame.getContentPane().add(label_2);
		
	    comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u6B63\u5E38\u6536\u8D39", "\u6BCF\u6EE1300\u51CF100", "\u62538\u6298"}));
		comboBox.setBounds(182, 148, 122, 21);
		comboBox.addItemListener(this);
		frame.getContentPane().add(comboBox);
		
		JLabel label_3 = new JLabel("\u539F\u4EF7");
		label_3.setBounds(86, 233, 54, 15);
		frame.getContentPane().add(label_3);
		
		lbl_normalAmount= new JLabel("0");
		lbl_normalAmount.setFont(new Font("Microsoft JhengHei", Font.BOLD, 17));
		lbl_normalAmount.setForeground(Color.CYAN);
		lbl_normalAmount.setBounds(182, 233, 122, 15);
		frame.getContentPane().add(lbl_normalAmount);
		
		JLabel label12 = new JLabel("\u5B9E\u6536\u91D1\u989D");
		label12.setBounds(377, 233, 54, 15);
		frame.getContentPane().add(label12);
		
		lbl_realAmount = new JLabel("");
		lbl_realAmount.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 17));
		lbl_realAmount.setForeground(Color.RED);
		lbl_realAmount.setBounds(462, 233, 112, 15);
		frame.getContentPane().add(lbl_realAmount);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		this.calculateAmount();
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	private void calculateAmount(){
		Double unitPrice= "".equals(txt_unitPrice.getText())?0:Double.parseDouble(txt_unitPrice.getText());
		Double quantum = "".equals(txt_quantum.getText())?0:Double.parseDouble(txt_quantum.getText());
		Double amount = unitPrice*quantum;
		this.lbl_normalAmount.setText(""+amount);
		//如果是纯策略模式，
		//这样客户依赖了所有的具体的策略实现类，
		//端耦合度相当高
		/*ChargeContext context;
		ICharge charge 
		switch(comboBox.getSelectedItem().toString()){
		case "正常收费":
			charge =  new NormalCharge();
			break;
		case "每满300减100":
			charge =new ChargeRetun(300,100);
			break;
		case "打8折":
			charge= new ChargeRebate(0.8);
			break;
		}
		context = new ChargeContext(charge);
		*/
		//如果策略模式和工厂模式结合  客户端只依赖 context类 耦合度进一步降低
		ChargeContextFactory context = new ChargeContextFactory(comboBox.getSelectedItem().toString());
		Double realAmount = context.getFianalFee(amount);
		this.lbl_realAmount.setText(""+realAmount);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		calculateAmount();
	}
}
