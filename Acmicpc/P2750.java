import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  //Q. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

  //Input. 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
	public static void P2750(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		int n = sc.nextInt();
		int i, j;

		for(i=0; i<n; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		
		//Bubble Sort
		for(i=0; i<n-1; i++) {
			for(j=0; j<n-1;j++) {
				if(list.get(j)>list.get(j+1)) {
					int temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}

		for(Integer num : list) {
			System.out.println(num);
		}
	}
}
