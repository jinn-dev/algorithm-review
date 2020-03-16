import java.util.Scanner;

public class Main {
  /*
  문제
  알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

  입력
  첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

  출력
  첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
  */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.next();

		int[] arr = new int[26]; //알파벳 갯수를 저장하는 배열

		for(int i = 0; i < input.length(); i++) {
      //소문자로 바꾸고 char 타입으로 변경 후 'a'를 빼주면 0-25 사이의 숫자가 된다.
      int idx = Character.toLowerCase(input.charAt(i)) - 'a';
			arr[idx]++; //알파벳 갯수 카운트
		}

		int max = -1;
		char res = '?';

		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				res = (char) (i+65);  //소문자에서 대문자로 변경
			} else if(arr[i] == max) {
				res = '?';            //가장 많이 사용되는 문자 여러개일 경우 물음표 출력
			}
		}
		System.out.println(res);

	}
}
