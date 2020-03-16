import java.util.ArrayList;

public class CodeTest {

	public static void main(String[] args) {
		int arr[] = {40, 24, -23, 19, 1, -1, 3};
		System.out.println(getClosestToZero(arr));

		String str = "13 helloworld tech 6     12";
		System.out.println(getSumOfNumbers(str));
	}

	/*
	 * Array에 들어있는 정수 중에 0가 가장 가까운 수를 리턴하는 Method
	 * -1, 1과 같이 0과의 차이가 동일한 값이 있는 경우 양수를 리턴하세요.
	 * */
	private static int getClosestToZero(int[] a) {
		int value = 0;
		int min = Integer.MAX_VALUE;

		for(int i=0; i< a.length; i++) {
			if(Math.abs(0-a[i]) <min) {
				min = Math.abs(0-a[i]);
				value = a[i];
			} else if(Math.abs(0-a[i]) == min) {
				if(a[i] > value) value = a[i];
			}
		}
		return value;
	}

	/*
	 * 문자열 s 안에 포함된 숫자들의 합을 리턴하는 함수를 구현하세요.
	 * 단 숫자는 하나 이상의 공백문자(' ')로 구분되어 있다.
	 * */
	private static int getSumOfNumbers(String str) {
		ArrayList<String> list = new ArrayList<String>();
		int sum = 0;
		String temp = "";
		str+=" "; //문자열 끝에 공백 넣어주기

		for(int i=0; i<str.length(); i++) {
			//공백이면 리스트에 단어를 add하기
			if(str.charAt(i) == ' ') {
				list.add(temp);
				temp = "";
			} else {
				temp += Character.toString(str.charAt(i));
			}

		}

		for(int i=0; i<list.size(); i++) {
			boolean check = isStringNumber(list.get(i));
			if(check) {
				sum+=Integer.parseInt(list.get(i));

			}

		}
		return sum;
	}

	/*
	 * 단어가 숫자인지 체크
	 * */
	private static boolean isStringNumber(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
