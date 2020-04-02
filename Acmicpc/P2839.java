import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
설탕 배달

문제
상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)

출력
상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.

예제 입력 1
18
예제 출력 1
4
예제 입력 2
4
예제 출력 2
-1
예제 입력 3
6
예제 출력 3
2
예제 입력 4
9
예제 출력 4
3
예제 입력 5
11
예제 출력 5
3
*/
public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int N = Integer.parseInt(br.readLine());
		int x = 0;
		int y = 0;

		//5로 나눠질때까지 3을 빼줌
		//0보다 같거나 작아지면 종료
		while(N%5!=0&&N>=0) {
			N-=3;
			y++;
		}

		if(N<0) {
			System.out.println(-1);
		}
		else {
			x = N/5;
			System.out.println(x+y);
		}
	}
}
