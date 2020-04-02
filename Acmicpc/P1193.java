import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 분수 찾기
public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int x = 1;
		int y = 1;
		int cnt = 1;
		int sum = 1;

		//cnt가 홀수일때 x-- y++
		//cnt가 짝수일때 x++ y--
		//sum이 n번째가 될경우 break (이걸 몰라서 헤맴)
		//[1] 1/1
		//[2] 1/2, 2/1
		//[3] 3/1, 2/2, 1/3
		//[4] 1/4, 2/3, 3/2, 4/1
		//[5] 5/1, 4/2, 3/3, 2/4, 1/5

		for(int i=0; i< n; i++) {
			if(sum==n) break;
			if(cnt%2==0) {
				x++;
				if(y>1) {
					y--;
				} else {
					cnt++;
				}
			} else {
				if(x>1) {
					x--;
				} else {
					cnt++;
				}
				y++;
			}
			sum++;
		}
		System.out.println(x+"/"+y);
	}
}
