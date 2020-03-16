import java.util.HashMap;

public class UniqueTest {

	//아스키코드: 128개의 배열 이용
	private boolean isUniqueAscii(String str) {
		boolean chr_check[] = new boolean[128];
		if(str.length() > 128) return false;
		for(int i=0; i<str.length(); i++) {
			int val = str.charAt(i);

    	if(chr_check[val]) {
				return false;
			}

    	chr_check[val] = true;
		}
		return false;
	}


	//유니코드: HashMap 사용
	private boolean isUnique(String str) {
		HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();

		for(int i=0; i<str.length();i++) {
			int val = str.charAt(i);

    	if(hashMap.containsKey(val)) {
				return false;
			}

			hashMap.put(val, true);
		}
		return true;
	}
}
