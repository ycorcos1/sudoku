import java.awt.Color;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class NewBoard extends JFrame implements KeyListener, ActionListener {

	private JPanel contentPane;
	private JButton [][] boxes;
	private boolean flag;
	private JPanel titlePanel;
	private JTextField textField;
	private JButton resetButton;
	private JPanel btnPanel;
	private JButton btnBack;
	private MainScreen mainScreen;
	private int mode;
	private PresetBoards presetBoards;

	/**
	 * Create the frame.
	 */
	public NewBoard(MainScreen mainScreen, int mode) {
		this.mainScreen = mainScreen;
		this.mode = mode;
		presetBoards = new PresetBoards();
		setTitle("Sudoku");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
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
		
		//BUTTONS
		btnPanel = new JPanel();
		contentPane.add(btnPanel, BorderLayout.CENTER);
		btnPanel.setLayout(new GridLayout(9, 9, 0, 0));
		initializeButtons();
		setButtons();
		if(boxes[0][0].getText() == "") {
			flag = true;
		}else {
			flag = false;
			highlightNum(boxes[0][0].getText());
		}
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				btnPanel.add(boxes[i][j]);
			}
		}
		
		setVisible(true);
	}
	
	private void initializeButtons() {
		boxes = new JButton[9][9];
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				boxes[i][j] = new JButton();
				boxes[i][j].setForeground(Color.BLACK);
				boxes[i][j].setFocusPainted(false);
				boxes[i][j].setOpaque(true);
				boxes[i][j].addActionListener(this);
				boxes[i][j].addKeyListener(this);
			}
		}
	}
	
	private void setButtons() {
		if(mode == 1) {
			getBoard(presetBoards.getEasyBoard());
		}else if(mode == 2) {
			getBoard(presetBoards.getMediumBoard());
		}else if(mode == 3) {
			getBoard(presetBoards.getHardBoard());
		}
	}
	
	private void getBoard(String[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] == "0") {
					boxes[i][j].setText("");
				}else {
					boxes[i][j].setText(board[i][j]);
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
			new NewBoard(mainScreen, mode);
		}
		if(e.getSource() == btnBack) {
			setVisible(false);
			mainScreen.setVisible(true);
		}else {
			for(int i = 0; i < boxes.length; i++) {
				for(int j = 0; j < boxes[i].length; j++) {
					if(e.getSource() == boxes[i][j]) {
						if(boxes[i][j].getForeground() == Color.GRAY) {
							flag = false;
						}else {
							flag = true;
						}
						highlightNum(boxes[i][j].getText());
					}
				}
			}
		}
	}
	
	private void highlightNum(String num) {
		for(int i = 0; i < boxes.length; i++) {
			for(int j = 0; j < boxes[i].length; j++) {
				if(num == "") {
					boxes[i][j].setBackground(null);
				}else if(num == boxes[i][j].getText()) {
					boxes[i][j].setBackground(Color.YELLOW);
				}else boxes[i][j].setBackground(null);
			}
		}
	}
}
