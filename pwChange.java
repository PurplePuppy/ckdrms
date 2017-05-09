package test;

import java.awt.*;
import javax.swing.*;

public class pwChange extends JFrame{	// 비밀번호 변경 인터페이스
	private JTextField currentPw;	// 현재 비밀번호
	private JTextField newPw;		// 변경할 비밀번호
	private JTextField newPwCheck;	// 변경할 비밀번호 확인
	private JPanel pwPane;			// 패널
	private JButton btnPwChange;	// 비밀번호 변경 버튼

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub		
		EventQueue.invokeLater(new Runnable()	// 인터페이스 실행
		{
			public void run()
			{
				try
				{
					JFrame.setDefaultLookAndFeelDecorated(true);	// 화면 뷰 변경
					pwChange frame = new pwChange();	// 프레임 생성
					frame.setTitle("비밀번호 변경");			// 프레임 제목설정
					frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public pwChange()	// Settings 인터페이스에서 비밀번호 변경 버튼을 누를 경우 새로운 창이 열려 비밀번호를 변경할 수 있도록 하는 기능
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 230);	// 바운더리 크기 조절
		pwPane = new JPanel();		// 비밀번호 변경 패널 생성
		setContentPane(pwPane);
		pwPane.setLayout(null);
		
		
		JPanel pwPanel = new JPanel();
		pwPanel.setBounds(0, 0, 310, 210);	// 바운더리 크기 조절
		pwPane.add(pwPanel);		// 비밀번호 변경 패널에 추가
		pwPanel.setLayout(null);

		
		currentPw = new JTextField();	// 형재 비밀번호를 입력할 수 있는 텍스트창
		currentPw.setText("현재 비밀번호");	// 텍스트창에 스트링 출력
		currentPw.selectAll();			// tap키를 눌렀을 때 전체가 선택되게 함
		currentPw.setSelectedTextColor(Color.gray);		// 전체가 선택되고 회색으로 보이게 함
		currentPw.setBounds(40, 20, 240, 30);	// 바운더리 크기 조절
		pwPanel.add(currentPw);			// pwPanel에 추가
		
		
		newPw = new JTextField("변경할 비밀번호");	// 변경할 비밀번호를 입력할 수 있는 텍스트창
		newPw.setBounds(40, 60, 240, 30);		// 바운더리 크기 조절
		newPw.selectAll();	// tap키를 눌렀을 때 전체가 선택되게 함
		newPw.setSelectionColor(Color.gray);	// 전체가 선택되고 회색으로 보이게 함
		pwPanel.add(newPw);				// pwPanel에 추가
		
		
		newPwCheck = new JTextField("변경할 비밀번호 확인");	// 변경할 비밀번호 확인하기위해 입력할 수 있는 텍스트창
		newPwCheck.setBounds(40, 100, 240, 30);			// 바운더리 크기 조절
		newPwCheck.selectAll();		// tap키를 눌렀을 때 전체가 선택되게 함
		newPwCheck.setSelectionColor(Color.gray);		// 전체가 선택되고 회색으로 보이게 함
		pwPanel.add(newPwCheck);		// pwPanel에 추가
		
		
		btnPwChange = new JButton("변경하기");		// 입력정보를 입력하였을 경우 비밀번호를 변경할 수 있는 버튼
		newPw.selectAll();		// tap키를 눌렀을 때 전체가 선택되게 함
		btnPwChange.setBounds(190, 140, 90, 40);	// 바운더리 크기 조절
		pwPanel.add(btnPwChange);		// pwPanel에 추가
	}
}

