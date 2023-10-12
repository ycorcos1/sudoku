import java.awt.Color;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Board extends JFrame implements KeyListener, ActionListener {

	private JPanel contentPane;
	private JButton [][] boxes;
	private boolean flag;
	private JPanel titlePanel;
	private JTextField textField;
	private JButton resetButton;
	private JPanel btnPanel;
	private JButton btnBack;
	private MainScreen mainScreen;

	/**
	 * Create the frame.
	 */
	public Board(MainScreen mainScreen) {
		this.mainScreen = mainScreen;
		setTitle("Sudoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		boxes = new JButton[9][9];
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				boxes[i][j] = new JButton();
				boxes[i][j].setForeground(Color.BLACK);
				boxes[i][j].addActionListener(this);
				boxes[i][j].addKeyListener(this);
			}
		}
		
		
		setContentPane(contentPane);
		setButtons();

		if(boxes[0][0].getText() == "") {
			flag = true;
		}else {
			flag = false;
		}
		contentPane.setLayout(new BorderLayout(0, 0));
		
		titlePanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) titlePanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(titlePanel, BorderLayout.NORTH);
		
		textField = new JTextField();
		titlePanel.add(textField);
		textField.setColumns(21);
		textField.setFocusable(false);
		textField.setEditable(false);
		
		resetButton = new JButton("Reset");
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		titlePanel.add(resetButton);
		
		btnBack = new JButton("Back");
		btnBack.setFocusable(false);
		btnBack.addActionListener(this);
		titlePanel.add(btnBack);
		
		btnPanel = new JPanel();
		contentPane.add(btnPanel, BorderLayout.CENTER);
		btnPanel.setLayout(new GridLayout(9, 9, 0, 0));
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				btnPanel.add(boxes[i][j]);
			}
		}
		
		setVisible(true);
	}

	private void setButtons() {
		//ROW 1
		boxes[0][0].setText("5");
		boxes[0][1].setText("3");
		boxes[0][4].setText("7");
		
		//ROW 2
		boxes[1][0].setText("6");
		boxes[1][3].setText("1");
		boxes[1][4].setText("9");
		boxes[1][5].setText("5");
		
		//ROW 3
		boxes[2][1].setText("9");
		boxes[2][2].setText("8");
		boxes[2][7].setText("6");
		
		//ROW 4
		boxes[3][0].setText("8");
		boxes[3][4].setText("6");
		boxes[3][8].setText("3");
		
		//ROW 5
		boxes[4][0].setText("4");
		boxes[4][3].setText("8");
		boxes[4][5].setText("3");
		boxes[4][8].setText("1");
		
		//ROW 6
		boxes[5][0].setText("7");
		boxes[5][4].setText("2");
		boxes[5][8].setText("6");
		
		//ROW 7
		boxes[6][1].setText("6");
		boxes[6][6].setText("2");
		boxes[6][7].setText("8");
		
		//ROW 8
		boxes[7][3].setText("4");
		boxes[7][4].setText("1");
		boxes[7][5].setText("9");
		boxes[7][8].setText("5");
		
		//ROW 9
		boxes[8][4].setText("8");
		boxes[8][7].setText("7");
		boxes[8][8].setText("9");
		
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				if(boxes[i][j].getText() != "") {
					boxes[i][j].setForeground(Color.GRAY);
				}
			}
		}
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				if(e.getSource() == boxes[i][j]) {
					if(flag) {
						if(e.getKeyCode() >= 48 && e.getKeyCode() <= 57) {
							if(check(i, j, String.valueOf(e.getKeyChar()))) {
								boxes[i][j].setForeground(Color.GREEN);
							}else {
								boxes[i][j].setForeground(Color.RED);
							}
						}
					}
				}
			}
		}
	}
	
	private boolean check(int i, int j, String num) {
		for(int col = 0; col < boxes[i].length; col++) {
			if(col != j) {
				if(boxes[i][col].getText() != "") {
					if(Integer.parseInt(num) == Integer.parseInt(boxes[i][col].getText())) {
						return false;
					}
				}
			}
		}
		for(int row = 0; row < boxes.length; row++) {
			if(row != i) {
				if(boxes[row][j].getText() != "") {
					if(Integer.parseInt(num) == Integer.parseInt(boxes[row][j].getText())) {
						return false;
					}
				}
			}
		}
		if(checkBox(i, j, num)) {
			return false;
		}
		return true;
	}
	
	private boolean checkBox(int i, int j, String num) {
		if(i >= 0 && i <=2) {
			if(j >= 0 && j <= 2) {
				for(int r = 0; r <= 2; r++) {
					for(int c = 0; c <= 2; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}else if(j >= 3 && j <= 5) {
				for(int r = 0; r <= 2; r++) {
					for(int c = 3; c <= 5; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}else if(j >= 6 && i <= 8) {
				for(int r = 0; r <= 2; r++) {
					for(int c = 6; c <= 8; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}
		}else if(i >= 3 && i <= 5) {
			if(j >= 0 && j <= 2) {
				for(int r = 3; r <= 5; r++) {
					for(int c = 0; c <= 2; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}else if(j >= 3 && j <= 5) {
				for(int r = 3; r <= 5; r++) {
					for(int c = 3; c <= 5; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}else if(j >= 6 && i <= 8) {
				for(int r = 3; r <= 5; r++) {
					for(int c = 6; c <= 8; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}
		}else if(i >= 6 && i <= 8) {
			if(j >= 0 && j <= 2) {
				for(int r = 6; r <= 8; r++) {
					for(int c = 0; c <= 2; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}else if(j >= 3 && j <= 5) {
				for(int r = 6; r <= 8; r++) {
					for(int c = 3; c <= 5; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}else if(j >= 6 && i <= 8) {
				for(int r = 6; r <= 8; r++) {
					for(int c = 6; c <= 8; c++) {
						if(r == i && c == j) {
							return false;
						}else {
							if(boxes[r][c].getText().equals(num)) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				if(e.getSource() == boxes[i][j]) {
					if(flag) {
						if(e.getKeyCode() >= 48 && e.getKeyCode() <= 57) {
							boxes[i][j].setText(String.valueOf(e.getKeyChar()));
							if(checkIfWon()) {
								winner();
							}
							if(boxes[i][j].getForeground() == Color.RED) {
								textField.setText("INCORRECT");
							}else if(boxes[i][j].getForeground() == Color.GREEN) {
								textField.setText("");
							}
						}else if(e.getKeyCode() == 8 || e.getKeyCode() == 127){
							boxes[i][j].setText("");
							textField.setText("");
						}
					}
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == resetButton) {
			new Board(mainScreen);
		}
		if(e.getSource() == btnBack) {
			setVisible(false);
			mainScreen.setVisible(true);
		}
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				if(e.getSource() == boxes[i][j]) {
					if(boxes[i][j].getForeground() == Color.GRAY) {
						flag = false;
					}else {
						flag = true;
					}
				}
			}
		}
	}
	
	private void winner() {
		textField.setText("YOU WON!");
	}
	
	private boolean checkIfWon() {
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				if(boxes[i][j].getForeground() == Color.BLACK || boxes[i][j].getForeground() == Color.RED) {
					return false;
				}
			}
		}
		
		return true;
	}
}
