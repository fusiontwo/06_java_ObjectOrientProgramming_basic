package step6_01.classObject;

//2023-09-04 17:08 ~ 17:25
/*
 * # 영화관 좌석예매 : 클래스 + 변수
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

import java.util.Scanner;

class Ex07_연습 {

	int[] seat = new int[7];
	int seatIdx = 0;
	int money = 0;
	int bookCnt = 0;
	
}


public class ClassEx07_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex07_연습 e = new Ex07_연습();
		
		while (true) {
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.print("좌석 선택 : ");
				e.seatIdx = scan.nextInt();
				System.out.println();
				if (e.seat[e.seatIdx] == 1) System.out.println("이미 예매가 완료된 자리입니다.");
				else if (e.seat[e.seatIdx] == 0) {
					e.bookCnt++;
					e.seat[e.seatIdx] = 1;
				}
				System.out.print("seat = ");
				for(int i = 0; i < e.seat.length; i++) {
					System.out.print(e.seat[i] + " ");
				}
				System.out.println();
			}
			else if (sel == 2) {
				e.money = 12000 * e.bookCnt;
				System.out.println("-----------------------");
				System.out.println("매출액 : " + e.money + "원");
				break;
			}
		}

	}

}
