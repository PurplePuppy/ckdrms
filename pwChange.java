package test;

import java.awt.*;
import javax.swing.*;

public class pwChange extends JFrame{	// ��й�ȣ ���� �������̽�
	private JTextField currentPw;	// ���� ��й�ȣ
	private JTextField newPw;		// ������ ��й�ȣ
	private JTextField newPwCheck;	// ������ ��й�ȣ Ȯ��
	private JPanel pwPane;			// �г�
	private JButton btnPwChange;	// ��й�ȣ ���� ��ư

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub		
		EventQueue.invokeLater(new Runnable()	// �������̽� ����
		{
			public void run()
			{
				try
				{
					JFrame.setDefaultLookAndFeelDecorated(true);	// ȭ�� �� ����
					pwChange frame = new pwChange();	// ������ ����
					frame.setTitle("��й�ȣ ����");			// ������ ������
					frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public pwChange()	// Settings �������̽����� ��й�ȣ ���� ��ư�� ���� ��� ���ο� â�� ���� ��й�ȣ�� ������ �� �ֵ��� �ϴ� ���
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 230);	// �ٿ���� ũ�� ����
		pwPane = new JPanel();		// ��й�ȣ ���� �г� ����
		setContentPane(pwPane);
		pwPane.setLayout(null);
		
		
		JPanel pwPanel = new JPanel();
		pwPanel.setBounds(0, 0, 310, 210);	// �ٿ���� ũ�� ����
		pwPane.add(pwPanel);		// ��й�ȣ ���� �гο� �߰�
		pwPanel.setLayout(null);

		
		currentPw = new JTextField();	// ���� ��й�ȣ�� �Է��� �� �ִ� �ؽ�Ʈâ
		currentPw.setText("���� ��й�ȣ");	// �ؽ�Ʈâ�� ��Ʈ�� ���
		currentPw.selectAll();			// tapŰ�� ������ �� ��ü�� ���õǰ� ��
		currentPw.setSelectedTextColor(Color.gray);		// ��ü�� ���õǰ� ȸ������ ���̰� ��
		currentPw.setBounds(40, 20, 240, 30);	// �ٿ���� ũ�� ����
		pwPanel.add(currentPw);			// pwPanel�� �߰�
		
		
		newPw = new JTextField("������ ��й�ȣ");	// ������ ��й�ȣ�� �Է��� �� �ִ� �ؽ�Ʈâ
		newPw.setBounds(40, 60, 240, 30);		// �ٿ���� ũ�� ����
		newPw.selectAll();	// tapŰ�� ������ �� ��ü�� ���õǰ� ��
		newPw.setSelectionColor(Color.gray);	// ��ü�� ���õǰ� ȸ������ ���̰� ��
		pwPanel.add(newPw);				// pwPanel�� �߰�
		
		
		newPwCheck = new JTextField("������ ��й�ȣ Ȯ��");	// ������ ��й�ȣ Ȯ���ϱ����� �Է��� �� �ִ� �ؽ�Ʈâ
		newPwCheck.setBounds(40, 100, 240, 30);			// �ٿ���� ũ�� ����
		newPwCheck.selectAll();		// tapŰ�� ������ �� ��ü�� ���õǰ� ��
		newPwCheck.setSelectionColor(Color.gray);		// ��ü�� ���õǰ� ȸ������ ���̰� ��
		pwPanel.add(newPwCheck);		// pwPanel�� �߰�
		
		
		btnPwChange = new JButton("�����ϱ�");		// �Է������� �Է��Ͽ��� ��� ��й�ȣ�� ������ �� �ִ� ��ư
		newPw.selectAll();		// tapŰ�� ������ �� ��ü�� ���õǰ� ��
		btnPwChange.setBounds(190, 140, 90, 40);	// �ٿ���� ũ�� ����
		pwPanel.add(btnPwChange);		// pwPanel�� �߰�
	}
}

