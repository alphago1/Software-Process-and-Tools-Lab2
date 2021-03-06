package App;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import tree.BinaryTree;
import tree.Node;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class BTree {

	private JFrame frame;
	private BinaryTree T = new BinaryTree();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BTree window = new BTree();
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
	public BTree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Dialog", Font.BOLD, 20));
		frame.setTitle("\u4E8C\u53C9\u6811\u904D\u5386");
		frame.setBounds(155, 155, 1000, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		MyPanel panel = new MyPanel(T);
		panel.setBackground(Color.YELLOW);
		panel.setBounds(450, 28, 500, 420);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(21, 28, 200, 420);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(230, 28, 200, 420);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		String text = null;
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u4E2D\u5E8F\u904D\u5386");
		rdbtnNewRadioButton.setFont(new Font("????", Font.BOLD, 20));
		rdbtnNewRadioButton.setBackground(Color.ORANGE);
		rdbtnNewRadioButton.setBounds(65, 270, 127, 60);
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u524D\u5E8F\u904D\u5386");
		rdbtnNewRadioButton_1.setFont(new Font("????", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBackground(Color.ORANGE);
		rdbtnNewRadioButton_1.setBounds(65, 200, 127, 60);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u540E\u5E8F\u904D\u5386");
		rdbtnNewRadioButton_2.setFont(new Font("????", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBackground(Color.ORANGE);
		rdbtnNewRadioButton_2.setBounds(65, 340, 127, 60);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("\u904D\u5386");
		btnNewButton.setFont(new Font("????", Font.BOLD, 20));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setBounds(35, 300, 127, 41);
		panel_2.add(btnNewButton);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(35, 120, 117, 32);
		panel_1.add(comboBox_1);
		
		JComboBox<Integer> comboBox = new JComboBox<Integer>();
		for(Integer i : T.getSequence()) {
			comboBox.addItem(i);
		}
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
                    int k = Integer.valueOf(comboBox.getSelectedItem().toString());
                    comboBox_1.removeAllItems();
                    if(T.GetByNumber(k).getLNode() == null) {
                    	comboBox_1.addItem("Left");
                    	
                    }
                    if(T.GetByNumber(k).getRNode() == null) {
                    	comboBox_1.addItem("Right");
                    }
                }
			}
		});
		comboBox.setBounds(35, 56, 117, 32);
		comboBox_1.addItem("Left");
		comboBox_1.addItem("Right");
		panel_1.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("\u786E\u8BA4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int k = Integer.valueOf(comboBox.getSelectedItem().toString());
					String loc = comboBox_1.getSelectedItem().toString();
					int a;
					if(loc=="Left")
					{
						a=0;
					}
					else
					{
						a=1;
					}
					T.AddNode(T.GetByNumber(k), a);
					
					comboBox.removeAllItems();
					for(Integer i : T.getSequence()) {
						comboBox.addItem(i);
					}
					panel.repaint();
//					new Thread(new Runnable() {
//						
//						@Override
//						public void run() {
//							// TODO Auto-generated method stub
//							panel.repaint();
//							try {
//								Thread.sleep(10000);
//								T.getHead().setColor(Color.blue);
//								panel.repaint();
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//						}
//					}).start();		
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame, "please select correct option!");
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("????", Font.BOLD, 20));
		btnNewButton_1.setBounds(35, 50, 127, 41);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u6DFB\u52A0\u8282\u70B9\uFF1A");
		lblNewLabel.setFont(new Font("????", Font.BOLD, 20));
		lblNewLabel.setBounds(51, 10, 122, 36);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("\u91CD\u7F6E");
		btnNewButton_2.setFont(new Font("????", Font.BOLD, 20));
		btnNewButton_2.setBounds(35, 350, 127, 41);
		panel_2.add(btnNewButton_2);

	}
}
@SuppressWarnings("serial")
class MyPanel extends Panel{
	private BinaryTree T;
	
	public MyPanel(BinaryTree t) {
		super();
		T = t;
	}

	public void paint(Graphics g) {
		super.paint(g);	
		List<Node> list = T.getNodes();
		for(Node node : list) {
			g.setColor(node.getColor());
			g.fillOval(node.getX(), node.getY(), 30, 30);
			Node Lnode = node.getLNode();
			Node Rnode = node.getRNode();
			if(Lnode != null) {
				g.drawLine(node.getX()+15, node.getY()+15, Lnode.getX()+15, Lnode.getY()+15);
				//System.out.println("dkk");
			}
			if(Rnode != null) {
				g.drawLine(node.getX()+15, node.getY()+15, Rnode.getX()+15, Rnode.getY()+15);
			}
			g.setColor(Color.black);
			g.drawString(String.valueOf(node.getNumber()), node.getX()+10, node.getY()+20);
		}
	}
	
	
}
