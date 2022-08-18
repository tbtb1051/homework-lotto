package Lotto;

import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요.(1~10)"); // 로또숫자 를 몇 세트 뽑을 것인지 입력

		Scanner scanNum = new Scanner(System.in);

		int inputNum = scanNum.nextInt();
		
		if (inputNum < 0) {
			System.out.println("0이하의 수는 입력하실 수 없습니다. 종료합니다.");
			return;
		}
		
		System.out.println(inputNum + "개의 로또번호 생성.");

		for (int num = 0; num < inputNum; num++) {
			// 배열생성
			int Lotto[] = new int[6];

			System.out.print("로또 번호 : ");
			// 로또 생성
			for (int i = 0; i < Lotto.length; i++) {
				Lotto[i] = (int) (Math.random() * 45) + 1;   //(0~44) +1

				for (int j = 0; j < i; j++) {  // 중복이면 무효라 i-- 후 다시 생성
					if (Lotto[i] == Lotto[j]) {
						i--;
						break;
					}
				}
			}
			for (int k = 0; k < Lotto.length; k++) {
				System.out.print(Lotto[k] + ", ");
			}
			System.out.println(" ");

		}
	}

}
