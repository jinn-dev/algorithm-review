package default;

public class SortTest {

	//인접한 두 수를 비교하여 큰 수를 뒤로 보내는 간단한 정렬 알고리즘
	//버블 정렬은 한번의 순회를 마칠 때 마다 비교 대상이 하나씩 줄어들기 때문에 총 n-1번 순회 시 정렬 끝남
	public void bubbleSort(int arr[]) {
		int len = arr.length;
		int i, j;

		for(i=0;i<len-1;i++) {
			for(j=1;j<len-i;j++) {
				if(arr[j-1] > arr[j]) {
					swap(arr[j], arr[j-1]);
				}
			}
		}
		print(arr);
	}
	
	//두번째 자료부터 시작하여 그 앞 자료들과 비교하여 삽입할 위치를 지정 후에 자료를 뒤로 옮기고 지정 자리에 자료를 삽입하여 정렬
	//in-plcae 정렬, 원소의 수가 적을 경우 효율적이지만 원소의 수와 크기가 클경우 비교적 많이 이동해야 하므로 부적합하다.
	public void inertSort(int arr[]) {
		int length = arr.length;

		for(int i=1; i<length; i++) {
			int prev = i-1;
			int tmp = arr[i];

			while((prev>=0) && (arr[prev] > tmp)) {
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1] = tmp;
		}
		print(arr);
	}
	
	/*
	1.주어진 배열 중에서 최솟값을 찾는다.
	2.그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
	3.맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
	4.하나의 원소만 남을 때까지 위의 1~3 과정을 반복한다.
	*/
	public void selectSort(int arr[]) {
		int length = arr.length;
		int minIndex, temp;
		
		for(int i=0; i<length-1; i++) {
			minIndex = i;
			
			//최소값 탐색
			for(int j=i+1; j<length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;	
				}
			}
			
			//최소값이 자기 자신이면 자료이동하지 않음
			if(i != minIndex) {
				temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		print(arr);
	}
	
	public void swap(int a, int b) {
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
	}
	
	//배열 출력
	public void print(int arr[]) {
		for(Integer num : arr) {
			System.out.print(num+" ");
		}
	}
	
	
}
