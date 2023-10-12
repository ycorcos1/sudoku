import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainScreen extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnHard;
	private JButton btnMedium;
	private JButton btnEasy;
	private JPanel panel;
	private JLabel lblTitle;
	private NewBoard newBoard;
	private Board board;
	
	

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setTitle("Sudoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblTitle = new JLabel("S U D O K U !");
		lblTitle.setFont(new Font("Tamil MN", Font.PLAIN, 48));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		btnEasy = new JButton("Easy");
		btnEasy.setFocusable(false);
		btnEasy.addActionListener(this);
		panel.add(btnEasy);
		
		btnMedium = new JButton("Medium");
		btnMedium.setFocusable(false);
		btnMedium.addActionListener(this);
		panel.add(btnMedium);
		
		btnHard = new JButton("Hard");
		btnHard.setFocusable(false);
		btnHard.addActionListener(this);
		panel.add(btnHard);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEasy) {
			newBoard = new NewBoard(this, 1);
			setVisible(false);
			//board = new Board(this);
		}else if(e.getSource() == btnMedium) {
			newBoard = new NewBoard(this, 2);
			setVisible(false);
			//board = new Board(this);
		}else if(e.getSource() == btnHard) {
			newBoard = new NewBoard(this, 3);
			setVisible(false);
			//board = new Board(this);
		}
		
	}

}
