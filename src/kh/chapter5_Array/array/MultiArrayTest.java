package kh.chapter5_Array.array;

public class MultiArrayTest {
	
	
	public void test1() {
		// 다차원 배열 사용하기
		// 다차원 배열 여러 배열을 하나의 더 큰 배열로
		// 묶어서 사용하는 배열이다.
		
		int[] ban1 = { 1, 2, 3, 4, 5};
		int[] ban2 = { 6, 7, 8, 9, 10};
		int[] ban3 = { 11, 12, 13 ,14, 15};
		int[] ban4 = { 16, 17, 18, 19, 20};
		//. . . 50개라면 ...
		
		// 위의 형태로 각각의 배열을 구성하면
		// 변수가 여러 개 인 것처럼 관리하기 불편하기 때문에
		// 위의 배열들을 하나로 묶을 수 있는기술이 필요하다.
		// 그것이 바로 2차원 배열이다!
		
		int[][] ban = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20}
				
		};
		
		// 가변 배열
		// 안의 배열의 크기가
		// 3*3, 5*%로 딱 떨어지는 것이 아니라
		// 각각의 배열의 크기가 서로 다른 배열을 말한다.
		
		int[][] bans = {
				{1, 2},
				{3, 4, 5, 6, 7},
				{8, 9, 10}
		};
		
		int[][] arr = new int[3][];
		
		
		//
	}
	public void test2() {
		// 2차원 배열 사용하기
		// 3*3
		// {1 2 3},
		// {4 5 6},
		// {7 8 9}
		// }
		int[][] arr = new int[3][3];
		
		// 2차원 배열에 값 추가하기
		int num = 1;
		
		for(int i =0; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = num++;
			}
		}
		
		// 2차원 배열 출력하기
		for(int i = 0; i < arr.length ; i ++) {
			for(int j = 0 ; j < arr[i].length ; j ++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		}
		public void test3() {
		// 5 * 5 이차원 배열 만들기
		// 2차원 배열의 선언과 동시 초기화
		int[][] arr1 = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14,15},
				{21, 22, 23, 24,25}
		};
		
		// 반복문을 활용한 2차원 배열 값 저장하기
		int[][] arr2 = new int[5][5];
		int num = 1;
		/// 2차원 배열 입력부
		for(int i = 0; i < arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = num;
				num++;
			}
		}
		/// 2차원 배열 출력부 
		for(int i = 0; i <arr2.length ; i++) {
			for(int j = 0; j < arr2[i].length ; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
		public void test4() {
			// 숫자 5 * 5 값을
			// 담을 수 있는 2차원 배열을
			// 생성하여 값을 순서대로
			// 1 ~ 25까지 담고,
			// 화면에
			// 1  6 11 .
			// 2  7 12 . 
			// 3  8 13 . 
			// 4  9 14 .
			// 5 10 15 . 
			// 형식으로 출력해보기
			
			// 선언부
			int[][] arr = new int[5][5];
			int num = 1;
			
			
			// 입력부
			for(int i = 0; i < arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = num;
					num++;
				}
			}
			// 출력부
			for(int i = 0; i <arr.length ; i++) {
				for(int j = 0; j < arr[i].length ; j++) {
					System.out.print(arr[j][i] + " "); // j=0, i =0 ;?? (1,0)
				}
				System.out.println();
		
			}
		
		
		}
}
