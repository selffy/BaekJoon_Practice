package b01_조건;

import java.util.Scanner;

public class AlarmClock_2884 {
	
	/* 첫째 줄에 두 정수 H와 M이 주어진다. 
	 * (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 알람 시간 H시 M분을 의미한다.
	 * 입력 시간은 24시간 표현을 사용한다.
	 * 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 
	 * 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
	 * 
	 * "45분 일찍 알람 설정하기"
	 * 
	 *  M>45, H
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

			int H = scanner.nextInt();
			int M = scanner.nextInt();
			scanner.close();
			
			if (M < 45) {
				H--;
				M = M + 15;
				if(H < 0) {
					H = 23;
				}
				System.out.println(H + " "+ M);
			} else {
				System.out.println(H + " " + (M-45));
			}
	} 
	
}
