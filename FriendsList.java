import java.awt.*;
import javax.swing.*;

public class FriendsList extends JFrame {		//����������
	private JPanel contentPane;	
	private JTextField friend0, friend1, friend2, friend3;			//ģ�� �̸��� ���̵� ���� field
	private JButton btnForTalk0, btnForTalk1, btnForTalk2, btnForTalk3;		//ģ������ ��ȭ�Ŵ� ��ư
	private JTextField friendNum0, friendNum1, friendNum2, friendNum3;		//ģ�� �̸� �տ� �� ���ִ��� ��Ÿ���� ��
	private JButton addFriend;
	
	 // ģ����� ȭ�� ���� �޼ҵ�
	public static void main(String[] args)
	{	//main �޼ҵ�
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try 
				{
					JFrame.setDefaultLookAndFeelDecorated(true);	// ȭ�� �� ����
					FriendsList frame = new FriendsList();
					frame.setTitle("ģ�� ���");
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	//������ �����
	public FriendsList()
	{		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//X��ư ������ �� ���μ��� �������ִ� EXIT_ON_CLOSE
		setBounds(100, 100, 311, 518);				//	ó�� ���� ������ ��ġ�� ũ�� 300* 500
		contentPane = new JPanel();		//�����ӵ��� ���� â
		contentPane.setBackground(SystemColor.control);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();		//���������� 
		panel.setBackground(SystemColor.control);
		panel.setBounds(0, 0, 293, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();		//scroll bar
		scrollBar.setBounds(260, 59, 21, 365);
		panel.add(scrollBar);
		
/////////�� ģ���̸����� ��ȭ�Ŵ� ��ư
		btnForTalk0 = new JButton("\uB300\uD654\uC2E0\uCCAD");
		btnForTalk0.setFont(new Font("HY�߰��", Font.PLAIN, 10));
		btnForTalk0.setBounds(179, 69, 75, 25);
		panel.add(btnForTalk0);
		
		btnForTalk1 = new JButton("\uB300\uD654\uC2E0\uCCAD");	
		btnForTalk1.setFont(new Font("HY�߰��", Font.PLAIN, 10));
		btnForTalk1.setBounds(179, 109, 75, 25);
		panel.add(btnForTalk1);
		
		btnForTalk2 = new JButton("\uB300\uD654\uC2E0\uCCAD");	
		btnForTalk2.setFont(new Font("HY�߰��", Font.PLAIN, 10));
		btnForTalk2.setBounds(179, 146, 75, 25);
		panel.add(btnForTalk2);
		
		btnForTalk3 = new JButton("\uB300\uD654\uC2E0\uCCAD");
		btnForTalk3.setFont(new Font("HY�߰��", Font.PLAIN, 10));
		btnForTalk3.setBounds(179, 186, 75, 25);
		panel.add(btnForTalk3);
		
/////////ģ�� �̸� + id Ȯ���� �� �ִ� textField
		friend0 = new JTextField();
		friend0.setFont(new Font("HY�׷���", Font.PLAIN, 15));
		friend0.setText("\uBC15\uC9C0\uC6A9(pjy0121)");
		friend0.setEditable(false);
		friend0.setBackground(new Color(255, 255, 0));
		friend0.setBounds(45, 65, 215, 33);
		panel.add(friend0);
		
		friend1 = new JTextField();
		friend1.setFont(new Font("HY�׷���", Font.PLAIN, 15));
		friend1.setBackground(new Color(255, 255, 0));
		friend1.setText("\uD5C8\uBB38\uC6A9(gjansdyd)");
		friend1.setEditable(false);
		friend1.setBounds(44, 104, 215, 32);
		panel.add(friend1);
		
		friend2 = new JTextField();
		friend2.setText("\uC774\uD574\uC900(HaeJoon)");
		friend2.setEditable(false);
		friend2.setFont(new Font("HY�׷���", Font.PLAIN, 15));
		friend2.setBackground(Color.YELLOW);
		friend2.setBounds(45, 143, 215, 32);
		panel.add(friend2);
		
		friend3 = new JTextField();
		friend3.setText("\uC724\uCC3D\uADFC(Yoon.CG)");
		friend3.setEditable(false);
		friend3.setFont(new Font("HY�׷���", Font.PLAIN, 15));
		friend3.setBackground(Color.YELLOW);
		friend3.setBounds(45, 183, 215, 32);
		panel.add(friend3);
		
/////////��ϵ� ģ�� �ο� �� Ȯ���ϴ� ĭ
		friendNum0 = new JTextField();
		friendNum0.setHorizontalAlignment(SwingConstants.CENTER);
		friendNum0.setBackground(new Color(255, 255, 0));
		friendNum0.setText("1");
		friendNum0.setEditable(false);
		friendNum0.setBounds(17, 68, 25, 25);
		panel.add(friendNum0);
		
		friendNum1 = new JTextField();
		friendNum1.setText("2");
		friendNum1.setEditable(false);
		friendNum1.setHorizontalAlignment(SwingConstants.CENTER);
		friendNum1.setBackground(Color.YELLOW);
		friendNum1.setBounds(17, 108, 25, 25);
		panel.add(friendNum1);
		
		friendNum2 = new JTextField();
		friendNum2.setText("3");
		friendNum2.setEditable(false);
		friendNum2.setHorizontalAlignment(SwingConstants.CENTER);
		friendNum2.setColumns(10);
		friendNum2.setBackground(Color.YELLOW);
		friendNum2.setBounds(17, 146, 25, 25);
		panel.add(friendNum2);
		
		friendNum3 = new JTextField();
		friendNum3.setText("4");
		friendNum3.setEditable(false);
		friendNum3.setHorizontalAlignment(SwingConstants.CENTER);
		friendNum3.setColumns(10);
		friendNum3.setBackground(Color.YELLOW);
		friendNum3.setBounds(17, 186, 25, 25);
		panel.add(friendNum3);

/////////���� ģ�� ����� ��� �ִ� â
		JTextArea listOnMember = new JTextArea();		//���� List
		listOnMember.setEnabled(false);
		JScrollPane scroll = new JScrollPane(listOnMember);
		scroll.setBounds(15, 60, 265, 365);		//ģ�� ��� â
		panel.add(scroll);
		

////////////ģ�� �߰� ��ư
		addFriend = new JButton("\uCE5C\uAD6C\uCD94\uAC00");
		addFriend.setFont(new Font("����", Font.BOLD, 12));
		addFriend.setBounds(179, 22, 100, 27);
		panel.add(addFriend);
	}
}

