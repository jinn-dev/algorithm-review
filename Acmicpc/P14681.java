import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
  사분면 고르기
  
  입력
  첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)

  출력
  점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.

  예제 입력 1
  12
  5
  예제 출력 1
  1
  예제 입력 2
  9
  -13
  예제 출력 2
  4
*/
public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		int n = 0;

		if(x > 0 && y > 0) {
			n = 1;
		}
		else if(x < 0 && y > 0) {
			n = 2;
		}
		else if(x < 0 && y < 0) {
			n = 3;
		}
		else if(x > 0 && y < 0) {
			n = 4;
		}

		System.out.println(n);
	}
}
