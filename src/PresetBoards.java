import java.util.ArrayList;
import java.util.Random;

public class PresetBoards {
	
	private ArrayList<String[][]> easyBoards;
	private ArrayList<String[][]> mediumBoards;
	private ArrayList<String[][]> hardBoards;
	private Random random = new Random();
	
	public PresetBoards() {
		easyBoards = new ArrayList<>();
		mediumBoards = new ArrayList<>();
		hardBoards = new ArrayList<>();
		random = new Random();
		
		addEasyBoards();
		addMediumBoards();
		addHardBoards();
	}
	
	private void addEasyBoards() {
		// BOARD 1
		String[][] board1 = new String[9][9];
		for(int i = 0; i < board1.length; i++) {
			for(int j = 0; j < board1[i].length; j++) {
				if(i == 0) {
					if(j == 0) board1[i][j] = "6";
					else if(j == 3) board1[i][j] = "4";
					else if(j == 4) board1[i][j] = "7";
					else if(j == 6) board1[i][j] = "3";
					else if(j == 8) board1[i][j] = "1";
					else board1[i][j] = "0";
				}
				if(i == 1) {
					if(j == 0) board1[i][j] = "7";
					else if(j == 2) board1[i][j] = "4";
					else if(j == 4) board1[i][j] = "6";
					else if(j == 5) board1[i][j] = "2";
					else if(j == 7) board1[i][j] = "8";
					else if(j == 8) board1[i][j] = "5";
					else board1[i][j] = "0";
				}
				if(i == 2) {
					if(j == 0) board1[i][j] = "2";
					else if(j == 1) board1[i][j] = "1";
					else if(j == 3) board1[i][j] = "5";
					else if(j == 8) board1[i][j] = "7";
					else board1[i][j] = "0";
				}
				if(i == 3) {
					if(j == 1) board1[i][j] = "2";
					else if(j == 2) board1[i][j] = "6";
					else if(j == 3) board1[i][j] = "3";
					else if(j == 4) board1[i][j] = "4";
					else board1[i][j] = "0";
				}
				if(i == 4) {
					if(j == 2) board1[i][j] = "3";
					else if(j == 4) board1[i][j] = "9";
					else if(j == 5) board1[i][j] = "1";
					else if(j == 6) board1[i][j] = "5";
					else if(j == 8) board1[i][j] = "2";
					else board1[i][j] = "0";
				}
				if(i == 5) {
					if(j == 0) board1[i][j] = "8";
					else if(j == 2) board1[i][j] = "1";
					else if(j == 6) board1[i][j] = "4";
					else board1[i][j] = "0";
				}
				if(i == 6) {
					if(j == 0) board1[i][j] = "5";
					else if(j == 2) board1[i][j] = "8";
					else if(j == 4) board1[i][j] = "1";
					else board1[i][j] = "0";
				}
				if(i == 7) {
					if(j == 1) board1[i][j] = "4";
					else if(j == 3) board1[i][j] = "6";
					else if(j == 8) board1[i][j] = "9";
					else board1[i][j] = "0";
				}
				if(i == 8) {
					if(j == 0) board1[i][j] = "1";
					else if(j == 1) board1[i][j] = "9";
					else if(j == 3) board1[i][j] = "2";
					else if(j == 6) board1[i][j] = "8";
					else if(j == 7) board1[i][j] = "3";
					else board1[i][j] = "0";
				}
					
			}
		}
		
		// BOARD 2
		String[][] board2 = new String[9][9];
		for(int i = 0; i < board1.length; i++) {
			for(int j = 0; j < board1[i].length; j++) {
				if(i == 0) {
					if(j == 0) board2[i][j] = "5";
					else if(j == 1) board2[i][j] = "6";
					else if(j == 2) board2[i][j] = "8";
					else if(j == 4) board2[i][j] = "4";
					else if(j == 8) board2[i][j] = "3";
					else board2[i][j] = "0";
				}
				if(i == 1) {
					if(j == 2)board2[i][j] = "2";
					else if(j == 4) board2[i][j] = "9";
					else if(j == 8) board2[i][j] = "7";
					else board2[i][j] = "0";
				}
				if(i == 2) {
					if(j == 1) board2[i][j] = "9";
					else if(j == 2) board2[i][j] = "7";
					else if(j == 3) board2[i][j] = "8";
					else if(j == 4) board2[i][j] = "6";
					else board2[i][j] = "0";
				}
				if(i == 3) {
					if(j == 0) board2[i][j] = "6";
					else if(j == 3) board2[i][j] = "3";
					else if(j == 4) board2[i][j] = "1";
					else if(j == 6) board2[i][j] = "4";
					else if(j == 8) board2[i][j] = "9";
					else board2[i][j] = "0";
				}
				if(i == 4) {
					if(j == 1) board2[i][j] = "3";
					else if(j == 4) board2[i][j] = "5";
					else if(j == 7) board2[i][j] = "6";
					else if(j == 8) board2[i][j] = "2";
					else board2[i][j] = "0";
				}
				if(i == 5) {
					if(j == 1) board2[i][j] = "1";
					else if(j == 2) board2[i][j] = "9";
					else if(j == 3) board2[i][j] = "6";
					else if(j == 6) board2[i][j] = "5";
					else if(j == 8) board2[i][j] = "8";
					else board2[i][j] = "0";
				}
				if(i == 6) {
					if(j == 2) board2[i][j] = "3";
					else if(j == 5) board2[i][j] = "6";
					else if(j == 6) board2[i][j] = "8";
					else if(j == 8) board2[i][j] = "1";
					else board2[i][j] = "0";
				}
				if(i == 7) {
					if(j == 1) board2[i][j] = "5";
					else if(j == 2) board2[i][j] = "1";
					else if(j == 7) board2[i][j] = "2";
					else board2[i][j] = "0";
				}
				if(i == 8) {
					if(j == 1) board2[i][j] = "9";
					else if(j == 3) board2[i][j] = "7";
					else if(j == 6) board2[i][j] = "3";
					else if(j == 7) board2[i][j] = "4";
					else if(j == 8) board2[i][j] = "5";
					else board2[i][j] = "0";
				}
			}
		}
		
		// BOARD 3
		String[][] board3 = new String[9][9];
		for(int i = 0; i < board1.length; i++) {
			for(int j = 0; j < board1[i].length; j++) {
				if(i == 0) {
					if(j == 0) board3[i][j] = "4";
					else if(j == 2) board3[i][j] = "3";
					else if(j == 3) board3[i][j] = "6";
					else if(j == 4) board3[i][j] = "2";
					else if(j == 5) board3[i][j] = "9";
					else if(j == 6) board3[i][j] = "7";
					else if(j == 7) board3[i][j] = "1";
					else board3[i][j] = "0";
				}
				if(i == 1) {
					if(j == 0) board3[i][j] = "9";
					else if(j == 2) board3[i][j] = "1";
					else if(j == 8) board3[i][j] = "6";
					else board3[i][j] = "0";
				}
				if(i == 2) {
					if(j == 0) board3[i][j] = "2";
					else if(j == 2) board3[i][j] = "8";
					else if(j == 3) board3[i][j] = "3";
					else if(j == 4) board3[i][j] = "7";
					else if(j == 6) board3[i][j] = "4";
					else if(j == 7) board3[i][j] = "5";
					else if(j == 8) board3[i][j] = "9";
					else board3[i][j] = "0";
				}
				if(i == 3) {
					if(j == 0) board3[i][j] = "3";
					else if(j == 6) board3[i][j] = "8";
					else if(j == 7) board3[i][j] = "7";
					else board3[i][j] = "0";
				}
				if(i == 4) {
					if(j == 4) board3[i][j] = "6";
					else if(j == 5) board3[i][j] = "7";
					else if(j == 6) board3[i][j] = "5";
					else if(j == 8) board3[i][j] = "3";
					else board3[i][j] = "0";
				}
				if(i == 5) {
					if(j == 1) board3[i][j] = "9";
					else if(j == 3) board3[i][j] = "8";
					else board3[i][j] = "0";
				}
				if(i == 6) {
					if(j == 0) board3[i][j] = "7";
					else if(j == 8) board3[i][j] = "5";
					else board3[i][j] = "0";
				}
				if(i == 7) {
					if(j == 1) board3[i][j] = "3";
					else if(j == 4) board3[i][j] = "9";
					else if(j == 5) board3[i][j] = "8";
					else if(j == 7) board3[i][j] = "4";
					else board3[i][j] = "0";
				}
				if(i == 8) {
					if(j == 0) board3[i][j] = "6";
					else if(j == 1) board3[i][j] = "4";
					else if(j == 3) board3[i][j] = "7";
					else if(j == 4) board3[i][j] = "1";
					else board3[i][j] = "0";
				}
			}
		}
		
		easyBoards.add(board1);
		easyBoards.add(board2);
		easyBoards.add(board3);
	}

	private void addMediumBoards() {
		// BOARD 1
		String[][] board1 = new String[9][9];
		for(int i = 0; i < board1.length; i++) {
			for(int j = 0; j < board1[i].length; j++) {
				if(i == 0) {
					if(j == 1) board1[i][j] = "4";
					else if(j == 2) board1[i][j] = "5";
					else if(j == 5) board1[i][j] = "9";
					else if(j == 7) board1[i][j] = "7";
					else board1[i][j] = "0";
				}
				if(i == 1) {
					if(j == 1) board1[i][j] = "6";
					else if(j == 8) board1[i][j] = "9";
					else board1[i][j] = "0";
				}
				if(i == 2) {
					if(j == 0) board1[i][j] = "2";
					else if(j == 2) board1[i][j] = "9";
					else if(j == 3) board1[i][j] = "1";
					else if(j == 4) board1[i][j] = "4";
					else if(j == 8) board1[i][j] = "3";
					else board1[i][j] = "0";
				}
				if(i == 3) {
					if(j == 3) board1[i][j] = "9";
					else board1[i][j] = "0";
				}
				if(i == 4) {
					if(j == 0) board1[i][j] = "7";
					else if(j == 1) board1[i][j] = "9";
					else if(j == 2) board1[i][j] = "3";
					else if(j == 3) board1[i][j] = "4";
					else if(j == 4) board1[i][j] = "8";
					else if(j == 5) board1[i][j] = "5";
					else board1[i][j] = "0";
				}
				if(i == 5) {
					if(j == 3) board1[i][j] = "7";
					else if(j == 6) board1[i][j] = "3";
					else if(j == 7) board1[i][j] = "9";
				}
				if(i == 6) {
					if(j == 0) board1[i][j] = "4";
					else if(j == 1) board1[i][j] = "8";
					else if(j == 7) board1[i][j] = "5";
					else if(j == 8) board1[i][j] = "1";
					else board1[i][j] = "0";
				}
				if(i == 7) {
					if(j == 4) board1[i][j] = "1";
					else if(j == 5) board1[i][j] = "7";
					else if(j == 8) board1[i][j] = "4";
					else board1[i][j] = "0";
				}
				if(i == 8) {
					if(j == 1) board1[i][j] = "1";
					else if(j == 2) board1[i][j] = "6";
					else if(j == 3) board1[i][j] = "8";
					else if(j == 5) board1[i][j] = "4";
					else board1[i][j] = "0";
				}
			}
		}
		
		String[][] board2 = new String[9][9];
		for(int i = 0; i < board2.length; i++) {
			for(int j = 0; j < board2[i].length; j++) {
				if(i == 0) {
					if(j == 4) board2[i][j] = "7";
					else if(j == 7) board2[i][j] = "4";
					else if(j == 8) board2[i][j] = "6";
					else board2[i][j] = "0";
				}
				if(i == 1) {
					if(j == 1) board2[i][j] = "9";
					else if(j == 2) board2[i][j] = "6";
					else if(j == 6) board2[i][j] = "2";
					else if(j == 7) board2[i][j] = "7";
					else board2[i][j] = "0";
				}
				if(i == 2) {
					if(j == 0) board2[i][j] = "7";
					else if(j == 2) board2[i][j] = "2";
					else if(j == 4) board2[i][j] = "6";
					else if(j == 5) board2[i][j] = "3";
					else board2[i][j] = "0";
				}
				if(i == 3) {
					if(j == 1) board2[i][j] = "4";
					else if(j == 2) board2[i][j] = "8";
					else if(j == 3) board2[i][j] = "5";
					else if(j == 6) board2[i][j] = "7";
					else if(j == 7) board2[i][j] = "3";
					else if(j == 8) board2[i][j] = "2";
					else board2[i][j] = "0";
				}
				if(i == 4) {
					if(j == 6) board2[i][j] = "5";
					else board2[i][j] = "0";
				}
				if(i == 5) {
					if(j == 3) board2[i][j] = "8";
					else if(j == 5) board2[i][j] = "5";
					else if(j == 6) board2[i][j] = "4";
					else board2[i][j] = "0";
				}
				if(i == 6) {
					if(j == 2) board2[i][j] = "9";
					else if(j == 4) board2[i][j] = "5";
					else board2[i][j] = "0";
				}
				if(i == 7) {
					if(j == 0) board2[i][j] = "1";
					else if(j == 1) board2[i][j] = "5";
					else if(j == 4) board2[i][j] = "8";
					else if(j == 6) board2[i][j] = "6";
					else if(j == 8) board2[i][j] = "7";
					else board2[i][j] = "0";
				}
				if(i == 8) {
					if(j == 1) board2[i][j] = "3";
					else if(j == 2) board2[i][j] = "7";
					else if(j == 5) board2[i][j] = "4";
					else if(j == 7) board2[i][j] = "5";
					else board2[i][j] = "0";
				}
			}
		}
		
		// BOARD 3
		String[][] board3 = new String[9][9];
		for(int i = 0; i < board3.length; i++) {
			for(int j = 0; j < board3[i].length; j++) {
				if(i == 0) {
					if(j == 3) board3[i][j] = "5";
					else if(j == 4) board3[i][j] = "2";
					else if(j == 6) board3[i][j] = "8";
					else if(j == 8) board3[i][j] = "6";
					else board3[i][j] = "0";
				}
				if(i == 1) {
					if(j == 1) board3[i][j] = "5";
					else if(j == 2) board3[i][j] = "7";
					else if(j == 3) board3[i][j] = "8";
					else if(j == 5) board3[i][j] = "6";
					else board3[i][j] = "0";
				}
				if(i == 2) {
					if(j == 1) board3[i][j] = "6";
					else if(j == 7) board3[i][j] = "5";
					else if(j == 8) board3[i][j] = "4";
					else board3[i][j] = "0";
				}
				if(i == 3) {
					if(j == 6) board3[i][j] = "1";
					else board3[i][j] = "0";
				}
				if(i == 4) {
					if(j == 0) board3[i][j] = "3";
					else if(j == 2) board3[i][j] = "1";
					else if(j == 6) board3[i][j] = "4";
					else board3[i][j] = "0";
				}
				if(i == 5) {
					if(j == 3) board3[i][j] = "1";
					else if(j == 4) board3[i][j] = "3";
					else if(j == 5) board3[i][j] = "4";
					else if(j == 6) board3[i][j] = "6";
					else if(j == 7) board3[i][j] = "8";
					else if(j == 8) board3[i][j] = "7";
					else board3[i][j] = "0";
				}
				if(i == 6) {
					if(j == 2) board3[i][j] = "4";
					else if(j == 3) board3[i][j] = "6";
					else if(j == 4) board3[i][j] = "7";
					else if(j == 8) board3[i][j] = "1";
					else board3[i][j] = "0";
				}
				if(i == 7) {
					if(j == 1) board3[i][j] = "3";
					else if(j == 4) board3[i][j] = "1";
					else if(j == 5) board3[i][j] = "9";
					else if(j == 6) board3[i][j] = "5";
					else if(j == 7) board3[i][j] = "6";
					else board3[i][j] = "0";
				}
				if(i == 8) {
					if(j == 1) board3[i][j] = "1";
					else if(j == 3) board3[i][j] = "2";
					else board3[i][j] = "0";
				}
			}
		}
		
		mediumBoards.add(board1);
		mediumBoards.add(board2);
		mediumBoards.add(board3);
	}
	
	private void addHardBoards() {
		// BOARD 1
		String[][] board1 = new String[9][9];
		for(int i = 0; i < board1.length; i++) {
			for(int j = 0; j < board1.length; j++) {
				if(i == 0) board1[i][j] = "0";
				if(i == 1) {
					if(j == 1) board1[i][j] = "2";
					else if(j == 4) board1[i][j] = "9";
					else if(j == 8) board1[i][j] = "1";
					else board1[i][j] = "0";
				}
				if(i == 2) {
					if(j == 2) board1[i][j] = "6";
					else if(j == 5) board1[i][j] = "7";
					else if(j == 8) board1[i][j] = "8";
					else board1[i][j] = "0";
				}
				if(i == 3) {
					if(j == 6) board1[i][j] = "3";
					else if(j == 7) board1[i][j] = "5";
					else board1[i][j] = "0";
				}
				if(i == 4) {
					if(j == 1) board1[i][j] = "4";
					else if(j == 5) board1[i][j] = "8";
					else if(j == 8) board1[i][j] = "9";
					else board1[i][j] = "0";
				}
				if(i == 5) {
					if(j == 1) board1[i][j] = "6";
					else if(j == 3) board1[i][j] = "3";
					else if(j == 7) board1[i][j] = "8";
					else board1[i][j] = "0";
				}
				if(i == 6) {
					if(j == 2) board1[i][j] = "7";
					else if(j == 3) board1[i][j] = "9";
					else if(j == 6) board1[i][j] = "1";
					else if(j == 8) board1[i][j] = "5";
					else board1[i][j] = "0";
				}
				if(i == 7) {
					if(j == 2) board1[i][j] = "1";
					else if(j == 5) board1[i][j] = "2";
					else if(j == 8) board1[i][j] = "6";
					else board1[i][j] = "0";
				}
				if(i == 8) {
					if(j == 2) board1[i][j] = "5";
					else if(j == 4) board1[i][j] = "3";
					else board1[i][j] = "0";
				}
			}
		}
		
		hardBoards.add(board1);
	}
	
	public String[][] getHardBoard(){
		return hardBoards.get(random.nextInt(hardBoards.size()));
	}
	
	public String[][] getMediumBoard(){
		return mediumBoards.get(random.nextInt(mediumBoards.size()));
	}
	
	public String[][] getEasyBoard(){
		return this.easyBoards.get(random.nextInt(easyBoards.size()));
	}
}
