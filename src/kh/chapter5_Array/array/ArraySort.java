package kh.chapter5_Array.array;

public class ArraySort {
	// 배열 안의 값들을 특정 형식(오름차순, 내림차순)으로
	// 정렬하는 방법들
	// static 정적이고 프로그램이 시작될 때 들어가야하는 특징.
	public static void testSwapLogic() {
		// 두 변수 간 값 교환하기
		// 배열의 값들을 정렬하기 위해서는
		// 각각의 값을 교환하는 로직(방법)을 알아야 한다.
		
		int num1 = 20;
		int num2 = 40;
		int temp = 0; // 두 값의 교환을 위한 임시 변수
		
		// 컴퓨터 식 스왑 공식
		temp = num2; 
		num2 = num1; 
		num1 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 배열의 두 공간의 값 교환하기
		int[] arr = { 2, 1, 3 };
		
		int temp2 = 0; // 배열 교환용 임시 변수
		
		temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = temp2;
		
		// 반복문을 통해 결과 출력하기
		for(int i = 0; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		// for문을 통해 각 자리의 값을 교환하기
		for(int i = 0; i < arr.length -1 ; i++) {
			
			temp2 = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp2;
			
		}
		
	}
	
	public static void testArraySort1() {
		// 선택 정렬 ...가장 최솟값을 찾아서 이미 최솟값인 친구들은 fixed..
		// 기존의 배열을 전부 탐색하여
		// 가장 작은 값(최솟값)을 찾고,
		// 그 값을 왼쪽부터 채워 나가는 방식
		//
		// ** 정렬 알고리즘
		// 정렬하고자 하는 데이터 양에 비해 
		// 소요되는 시간적 성능적 요소를 판단하는 규칙
		// 선택 정렬은 데이터의 양이 적을 때는
		// 좋은 성능을 가지지만(시간적 복잡도)
		// 배열의 길이가 클 때 (데이터의 양이 많을 때)
		// 성능이 급격하게 저하된다.
		
		int[] arr = { 2, 4, 1, 3, 5, 6};
		
		int min; // 최솟값을 가진 배열의 순번을 저장하는 변수
		int tmp; // 값 교환용 임시 변수 
		
		for(int i = 0 ; i < arr.length -1; i++) {
			// 배열을 처음부터 끝까지 반복할 때
			// 가장 작은 값을 가진 순번을 찾아
			// 내부에서 반복문 통해 왼쪽부터 하나씩 비교 및 교환한다.
			
			min = i;
			
			for(int j = i+1; j < arr.length ; j++) {
				// 현재 순번의 다음값부터 최소값을 찾아
				// 비교하기 위해 i +1로 시작한다.
				//System.out.printf("현재 순번 위치 : %d,%d \n" ,i, j);
				
				// 최솟값 찾기
				if(arr[min] > arr[j]) {
					min = j;
				}
			
			}
			
			System.out.println("---- 교환 시작! ----");
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
			
		}
		
		System.out.println(" 정렬 후 : ");
		for(int k = 0; k< arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
	
	public static void testArraySort2() {
		// 버블 정렬 ... 양 쪽씩만 비교해서 가장 크거나 작은 쪽으로 옮겨준다.
		// 거품 정렬(Bubble Sort)
		// 인접한 두 개의 값을 비교하여
		// 더 큰 값을 우측으로 보내는 알고리즘
		// 이미 정렬이 어느정도 되어 있는 데이터에 대한
		// 수행 속도가 매우 빠르며 구현이 쉽다.
		// 단, 역순으로 정렬이 되어 있는 경우
		// 시간 복잡도 제곱수 배로 증가하여
		// 효율이 급격하게 떨어진다. 0(n^2)
		
		int[] arr= { 2, 4, 1, 3, 5, 6};
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
