import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class P2751 {
  //Q. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
  //Q. 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
  //P. Collections 내장 sort 메소드 사용
	public static void main(String[] args) {
		Main main = new Main();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			ArrayList<Integer> list = new ArrayList<Integer>();

			int n = Integer.parseInt(br.readLine());

			int i, j;

			for(i=0; i<n; i++) {
				list.add(Integer.parseInt(br.readLine()));
			}

			Collections.sort(list);

			for(Integer num : list) {
				System.out.println(num);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
