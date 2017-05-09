package test;

import java.awt.*;
import javax.swing.*;

public class Settings extends JFrame{
	private JPanel contentPane;
	private JLabel nickname;
	private JTextField userNickname;
	private JButton nicknameChange;
	private JLabel letterSize;
	private Choice letterSizeChange;
	private JLabel backgroundColor;
	private JButton redColor;
	private JButton greenColor;
	private JButton blueColor;
	private JButton passwordChange;
	private JButton memberLeave;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					JFrame.setDefaultLookAndFeelDecorated(true);	// ȭ�� �� ����
					Settings frame = new Settings();	// ������ ����
					frame.setTitle("����");				// ������ ������
					frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		
	}
	
	public Settings()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 220);	// �ٿ���� ũ�� ����
		contentPane = new JPanel();		// ���� �г� ����
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 410, 200);	// �ٿ���� ũ�� ����
		contentPane.add(panel);				// ���� �гο� �߰�
		panel.setLayout(null);
		
		nickname = new JLabel();		// �г��� ���̺�
		nickname.setText("�г���");		// ���̺� ��Ʈ�� ���
		nickname.setBounds(30, 20, 70, 30);	// �ٿ���� ũ�� ����
		panel.add(nickname);			// panel�� �߰�
		
		userNickname = new JTextField();	// ����� �г����� �����ִ� �ؽ�Ʈâ
		userNickname.setText("��ġ");			// ����� �г��� ���
		userNickname.setSelectedTextColor(Color.black);	// ��ü�� ���õǰ� ���������� ���̰� ��
		userNickname.setDisabledTextColor(Color.black);	// ���õ��� �ʾ��� ��� ���������� ���̰� ��
		userNickname.setEnabled(false);			// Ȱ��ȭ ��� off
		userNickname.setBounds(110, 20, 116, 30);	// �ٿ���� ũ�� ����
		panel.add(userNickname);		// panel�� �߰�
		
		
		nicknameChange = new JButton("�г��� ��ο�");	// ����ڿ��� �г����� ��ο� ���ִ� ��ư
		nicknameChange.setBounds(240, 20, 140, 30);	// �ٿ���� ũ�� ����
		panel.add(nicknameChange);		// panel�� �߰�
		
		letterSize = new JLabel();		// ����ũ�� ���̺�
		letterSize.setText("����ũ��");	// ���̺� ��Ʈ�� ���
		letterSize.setBounds(30, 60, 70, 30);	// �ٿ���� ũ�� ����
		panel.add(letterSize);			// panel�� �߰�
			
		letterSizeChange =  new Choice();	// ����ũ�⸦ ������ �� �ִ� â
		letterSizeChange.add("5");		// ũ�� ���� �߰�
		letterSizeChange.add("10");
		letterSizeChange.add("15");
		letterSizeChange.add("20");
		letterSizeChange.add("20");
		letterSizeChange.add("30");
		letterSizeChange.setBounds(110, 60, 50, 30);	// �ٿ���� ũ�� ����
		panel.add(letterSizeChange);	// panel�� �߰�
		
		backgroundColor = new JLabel();		// ���� ���̺�
		backgroundColor.setText("����");		// ���̺� ��Ʈ�� ���
		backgroundColor.setBounds(30, 100, 70, 30);	// �ٿ���� ũ�� ����
		panel.add(backgroundColor);		// panel�� �߰�
		
		redColor =  new JButton("Red");		// ������ �������� �����ϴ� ��ư
		redColor.setBackground(Color.red);
		redColor.setBounds(110, 100, 80, 30);	// �ٿ���� ũ�� ����
		panel.add(redColor);			// panel�� �߰�
		
		greenColor =  new JButton("Green");	// ������ �ʷϻ����� �����ϴ� ��ư
		greenColor.setBackground(Color.green);
		greenColor.setBounds(205, 100, 80, 30);	// �ٿ���� ũ�� ����
		panel.add(greenColor);			// panel�� �߰�
		
		blueColor =  new JButton("Blue");	// ������ �Ķ������� �����ϴ� ��ư
		blueColor.setBackground(Color.blue);
		blueColor.setBounds(300, 100, 80, 30);	// �ٿ���� ũ�� ����
		panel.add(blueColor);			// panel�� �߰�
		
		passwordChange =  new JButton("��й�ȣ ����");	// ��й�ȣ ���� ��ư
		passwordChange.setBounds(30, 140, 165, 30);	// �ٿ���� ũ�� ����
		panel.add(passwordChange);		// panel�� �߰�
		
		memberLeave =  new JButton("ȸ��Ż��");		// ȸ��Ż�� ��ư
		memberLeave.setBounds(215, 140, 165, 30);	// �ٿ���� ũ�� ����
		panel.add(memberLeave);			// panel�� �߰�
	}
}
