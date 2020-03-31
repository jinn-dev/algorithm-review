import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
크로아티아 알파벳
*/

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


		for(int i=0; i<croa.length; i++) {
			input = input.replace(croa[i], "a");	//크로아티아 문자를 a로 대체
		}

		System.out.println(input.length());


		/*
		char[] ch = input.toCharArray();
		int cnt = 0;
		int i = 0;

		while (i < input.length()) {
			if (ch[i] == 'c' && (ch[i + 1] == '=' || ch[i + 1] == '-')) {
				i++;
			} else if (ch[i] == 'd') {
				if (ch[i + 1] == 'z' && ch[i + 2] == '=') {
					i += 2;
				}
				if (ch[i + 1] == '-') {
					i++;
				}
			} else if (ch[i] == 'l' && ch[i + 1] == 'j') {
				i++;
			} else if (ch[i] == 'n' && ch[i + 1] == 'j') {
				i++;
			} else if (ch[i] == 's' && ch[i + 1] == '=') {
				i++;
			} else if (ch[i] == 'z' && ch[i + 1] == '=') {
				i++;
			}
			cnt++;
			i++;
		}
		System.out.println(cnt);
		*/
	}

}
