public class QuickSort {

	public static void main(String[] args) {

		QuickSort quickSort = new QuickSort();

		int arr[] = {5, 3, 8, 4, 9, 1, 6, 2, 7, 10};

		quickSort.quick_sort(arr, 0, arr.length-1);

		for(Integer num : arr) {
			System.out.println(num);
		}


	}

	void quick_sort(int list[], int left, int right) {
		//정렬할 범위가 2개 이상의 데이터면
		if(left < right) {
			int q = partition(list, left, right);

			//피벗을 제외한 2개의 부분 리스트를 대상으로 순환 호출
			quick_sort(list, left, q-1); 	//피벗 바로 앞 리스트
			quick_sort(list, q+1, right);	//피벗 바로 뒤 리스트
		}
	}

	int partition(int list[], int left, int right) {
		int pivot, temp;
		int low, high;

		low = left;
		high = right+1;
		pivot = list[left];

		//low와 high가 교차할 때까지 반복
		do {
			//list[low]가 피벗보다 작으면 계속 low 증가
			do {
				low++;
			} while(low<=right && list[low]<pivot);

			//list[high]가 피벗보다 크면 계속 high 감소
			do {
				high--;
			} while(high>=left && list[high]>pivot);

			//만약 low와 high가 교차하지 않았으면 list[low]를 list[high] 교환
			if(low < high) {
				temp = list[low];
				list[low] = list[high];
				list[high] = temp;
			}

		} while(low < high);

		//low와 high가 교차했으면 반복문을 빠져나와 list[left]와 list[high]를 교환
		temp = list[left];
		list[left] = list[high];
		list[high] = temp;

		//pivot 위치인 high를 반환
		return high;
	}

}
