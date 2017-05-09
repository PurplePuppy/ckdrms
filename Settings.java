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
					JFrame.setDefaultLookAndFeelDecorated(true);	// 화면 뷰 변경
					Settings frame = new Settings();	// 프레임 생성
					frame.setTitle("설정");				// 프레임 제목설정
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
		setBounds(100, 100, 420, 220);	// 바운더리 크기 조절
		contentPane = new JPanel();		// 설정 패널 생성
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 410, 200);	// 바운더리 크기 조절
		contentPane.add(panel);				// 설정 패널에 추가
		panel.setLayout(null);
		
		nickname = new JLabel();		// 닉네임 레이블
		nickname.setText("닉네임");		// 레이블에 스트링 출력
		nickname.setBounds(30, 20, 70, 30);	// 바운더리 크기 조절
		panel.add(nickname);			// panel에 추가
		
		userNickname = new JTextField();	// 사용자 닉네임을 보여주는 텍스트창
		userNickname.setText("까치");			// 사용자 닉네임 출력
		userNickname.setSelectedTextColor(Color.black);	// 전체가 선택되고 검은색으로 보이게 함
		userNickname.setDisabledTextColor(Color.black);	// 선택되지 않았을 경우 검은색으로 보이게 함
		userNickname.setEnabled(false);			// 활성화 기능 off
		userNickname.setBounds(110, 20, 116, 30);	// 바운더리 크기 조절
		panel.add(userNickname);		// panel에 추가
		
		
		nicknameChange = new JButton("닉네임 재부여");	// 사용자에게 닉네임을 재부여 해주는 버튼
		nicknameChange.setBounds(240, 20, 140, 30);	// 바운더리 크기 조절
		panel.add(nicknameChange);		// panel에 추가
		
		letterSize = new JLabel();		// 글자크기 레이블
		letterSize.setText("글자크기");	// 레이블에 스트링 출력
		letterSize.setBounds(30, 60, 70, 30);	// 바운더리 크기 조절
		panel.add(letterSize);			// panel에 추가
			
		letterSizeChange =  new Choice();	// 글자크기를 선택할 수 있는 창
		letterSizeChange.add("5");		// 크기 종류 추가
		letterSizeChange.add("10");
		letterSizeChange.add("15");
		letterSizeChange.add("20");
		letterSizeChange.add("20");
		letterSizeChange.add("30");
		letterSizeChange.setBounds(110, 60, 50, 30);	// 바운더리 크기 조절
		panel.add(letterSizeChange);	// panel에 추가
		
		backgroundColor = new JLabel();		// 배경색 레이블
		backgroundColor.setText("배경색");		// 레이블에 스트링 출력
		backgroundColor.setBounds(30, 100, 70, 30);	// 바운더리 크기 조절
		panel.add(backgroundColor);		// panel에 추가
		
		redColor =  new JButton("Red");		// 배경색을 빨강으로 변경하는 버튼
		redColor.setBackground(Color.red);
		redColor.setBounds(110, 100, 80, 30);	// 바운더리 크기 조절
		panel.add(redColor);			// panel에 추가
		
		greenColor =  new JButton("Green");	// 배경색을 초록색으로 변경하는 버튼
		greenColor.setBackground(Color.green);
		greenColor.setBounds(205, 100, 80, 30);	// 바운더리 크기 조절
		panel.add(greenColor);			// panel에 추가
		
		blueColor =  new JButton("Blue");	// 배경색을 파란색으로 변경하는 버튼
		blueColor.setBackground(Color.blue);
		blueColor.setBounds(300, 100, 80, 30);	// 바운더리 크기 조절
		panel.add(blueColor);			// panel에 추가
		
		passwordChange =  new JButton("비밀번호 변경");	// 비밀번호 변경 버튼
		passwordChange.setBounds(30, 140, 165, 30);	// 바운더리 크기 조절
		panel.add(passwordChange);		// panel에 추가
		
		memberLeave =  new JButton("회원탈퇴");		// 회원탈퇴 버튼
		memberLeave.setBounds(215, 140, 165, 30);	// 바운더리 크기 조절
		panel.add(memberLeave);			// panel에 추가
	}
}
