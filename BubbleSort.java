package default;

public class BubbleSort {

  	//인접한 두 수를 비교하여 큰 수를 뒤로 보내는 간단한 정렬 알고리즘
	//버블 정렬은 한번의 순회를 마칠 때 마다 비교 대상이 하나씩 줄어들기 때문에 총 n-1번 순회 시 정렬 끝남
	public void bubbleSort(int arr[]) {
		int len = arr.length;
		int i, j, temp = 0;
		
		for(i=0;i<len-1;i++) {
			for(j=1;j<len-i;j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		for(Integer num : arr) {
			System.out.print(num+" ");
		}	
	}
}
