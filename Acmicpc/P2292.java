import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		int range = 1;

		while(true) {
			if(range >= n) {
				break;
			}
			range+=(6*cnt++);  //등차수열
		}
		System.out.println(cnt);
	}
}
