import java.io.IOException;
import java.util.Scanner;

public class Climbingstairs {

	private static int amount;
	private static int[] stairs;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		// 계단 수 지정
		System.out.print("계단의 개수를 지정해 주세요 : ");
		getAmountOfStairs();

		// 계단에 값 할당하기
		System.out.println("각 계단의 점수를 지정해 주세요");
		stairs = getNumberOfStairs(amount);

		// 계단 건너기
		climbingStairs(stairs);
	}

	private static void getAmountOfStairs() {
		amount = scanner.nextInt();
	}

	private static int[] getNumberOfStairs(int amount) {
		int[] arr = new int[amount];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	private static int climbingStairs(int[] stairs) {
		for (int i = 0; i < stairs.length; i++) {
			// 이번 계단 > 다음 계단
			if (stairs[i] > (stairs[i] + 1)) {
				if (stairs[i + 1] > (stairs[i + 2])) {
					// 연속 두 개
					moveTwoTimesInARow(stairs,i);
				} else {
					// 한개 건너서
					moveOneTimeInARow(stairs,i);
				}
			}
			// 이번 계단보다 다음 계단이 클 때
			if (stairs[i] < (stairs[i] + 1)) {
				if (stairs[i + 2] > stairs[i + 3]) {
					// 연속 두 개
					moveTwoTimesInARow(stairs,i);
				} else {
					// 한개 건너서
					moveOneTimeInARow(stairs,i);
				}
			}
		}
		return 0;
	}

	private static void moveTwoTimesInARow(int[] stairs,int i) {
		
	}

	private static void moveOneTimeInARow(int[] stairs,int i) {

	}

}
