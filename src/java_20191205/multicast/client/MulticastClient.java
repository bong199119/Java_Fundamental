package java_20191205.multicast.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MulticastClient implements ActionListener {
	private JFrame jframe;
	private JTextArea jta;
	private JButton jbtn;
	private JTextField jtf;
	private String id;
	private String ip;
	private int port;
	private BufferedReader br;
	private BufferedWriter bw;

	public MulticastClient(String id, String ip, int port) {

		jframe = new JFrame("버디버디");

		this.id = id;
		this.ip = ip;
		this.port = port;

		/******************* 북쪽시작 ******************************/
		JPanel j1 = new JPanel();
		JLabel jl1 = new JLabel("User ID : [" + id + "]");
		JLabel j12 = new JLabel("Surver IP : " + ip);
		j1.setLayout(new BorderLayout());
		j1.add(jl1, BorderLayout.CENTER);
		j1.add(j12, BorderLayout.EAST);

		/********************* 북쪽끝 ******************************/

		/******************* 중앙시작 ******************************/
		jta = new JTextArea("", 40, 35);
		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);// 오른쪽 2개 수직하고 수평
															// 스크롤 정해줄수있음
		jta.setBackground(new Color(250, 243, 180));
		jta.setEditable(false);
		/********************* 중앙끝 ******************************/
		/********************* 남쪽시작 ******************************/

		JPanel j2 = new JPanel();
		jtf = new JTextField(30);
		jbtn = new JButton("SEND");
		j2.setLayout(new BorderLayout());
		j2.add(jtf, BorderLayout.CENTER);
		j2.add(jbtn, BorderLayout.EAST);

		/*********************** 남쪽끝 ******************************/

		jframe.add(j2, BorderLayout.SOUTH);
		jframe.add(j1, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);

		jframe.pack();
		jframe.setResizable(false); // 크기변경가능
		jframe.setVisible(true); // 창을 보이게해줌

		jbtn.addActionListener(this);
		jtf.addActionListener(this);

		jframe.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				try {
					bw.write(" 버거킹님이 채팅방을 나갔습니다.");
					bw.newLine();
					bw.flush();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			public void windowOpened(WindowEvent e) {
				jtf.requestFocus();
			}
		}); // 프로그램의 x버튼 누르면 콘솔까지 종료해주는 기능!

	}

	public void connect() {
		try {
			Socket socket = new Socket(ip, port);

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			MultiClientThread mct = new MultiClientThread(br, jta);
			// MultiClientThread mct = new MultiClientThread(this); 자기자신객체에 있는것을
			// 다가지고 올 수 있다. 예로 위에 프라이빗 변수,메서드
			Thread t = new Thread(mct);
			t.start();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new MulticastClient("버거킹", "192.168.0.203", 3000).connect();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		Object obj = e.getSource();
		String message = jtf.getText();
		if (obj == jbtn) {

			try {
				bw.write(id + ":" + message);
				bw.newLine();
				bw.flush();

				jtf.setText("");

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (obj == jtf) {
			try {
				bw.write(id + ":" + message);
				bw.newLine();
				bw.flush();

				jtf.setText("");

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
