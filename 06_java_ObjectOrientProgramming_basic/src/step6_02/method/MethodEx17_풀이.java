package step6_02.method;

import java.util.Scanner;

//# 틱택토

class TicTacToe_연습{
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		// 1[turn1승리] 2[turn2승리]
	
	void setGame() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = " ";
			}
		}
	}
	
	
	// 게임 화면 출력
	void showGame() {
		System.out.println("== 틱택톡 ==");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.printf("[%s]", game[i][j]);
			}
			System.out.println();
		}
		System.out.println("==========");
	}
	
	
	// 인덱스 선택
	void choiceIdx() {
		int yidx = 0;
		int xidx = 0;
		
		if (turn % 2 == 0) {
			System.out.print("[1턴]y인덱스 입력 : ");
			yidx = scan.nextInt();
			System.out.print("[1턴]x인덱스 입력 : ");
			xidx = scan.nextInt();
			
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					if (game[i][j] == " ") {
						game[yidx][xidx] = "O";
						turn++;
					}
					else System.out.println("잘못 입력하셨습니다.");
				}
			}
		}

		else if (turn % 2 == 1) {
			System.out.print("[2턴]y인덱스 입력 : ");
			yidx = scan.nextInt();
			System.out.print("[2턴]x인덱스 입력 : ");
			xidx = scan.nextInt();
			
			for (int i = 0; i < game.length; i++) {
				for (int j = 0; j < game[i].length; j++) {
					if (game[i][j] == " ") {
						game[yidx][xidx] = "X";
						turn++;
					}
					else System.out.println("잘못 입력하셨습니다.");
				}
			}
		}

	}
	
	
	void exitWidth() {
		
	}
	
	
	void exitHeight() {

	}
	

	void exitCross() {

	}
	
	
	void run() {
		

	}
	
}


public class MethodEx17_풀이 {

	public static void main(String[] args) {
		
		TicTacToe_연습 tic = new TicTacToe_연습();
		tic.run();

	}

}
