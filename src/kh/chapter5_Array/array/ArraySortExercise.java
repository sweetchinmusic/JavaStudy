package kh.chapter5_Array.array;

import java.util.Scanner;

public class ArraySortExercise {
	// 배열 정렬하기 실습
	Scanner sc = new Scanner(System.in);
	
	public void sortTest() {
		// 사용자로부터 숫자 5개를 입력받아
		// 해당 배열을 정렬하여 출력하기
		
		int num[] = new int[5];
		
		System.out.println("숫자 5개를 작성해주세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int[] arr= { a, b, c, d, e};
		int tmp = 0; // 교환을 위한 임시 변수
		
		for(int i = arr.length - 1; i > -1 ; i--) {
			for(int j = 0; j < i ; j++ ) {
				
				if(arr[j] > arr[j + 1]) {
					// 앞의 순번의 값이 더 크기 때문에
					// 자리를 교환한다.
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				
				// 내부에서 일어나는 정렬 확인하기
				for(int k = 0 ; k < arr.length; k++) {
					if(k<arr.length - 1) {
						System.out.print(arr[k] + ", ");
					} else {
						System.out.println(arr[k]);
					}
				}
			}
		}
		
		// 정렬 결과 확인
		System.out.println("정렬 결과 확인: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
