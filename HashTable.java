import java.util.LinkedList;

public class HashTable {

	LinkedList<Node>[] data;

	//HashTable generator
	public HashTable(int size) {
		this.data = new LinkedList[size];
	}

	int getHashCode(String key) {
		int hashCode = 0;

		for(char c : key.toCharArray()) {	//문자열을 char형 배열로 바꿔준다.
			hashCode += c;
		}

		return hashCode;
	}

	int convertToIndex(int hashCode) {
		int index = hashCode % data.length;
		return index;
	}

	//LinkdedList에서 key로 Node 찾기
	Node searchKey(LinkedList<Node> list, String key) {
		if(list == null) return null;

		for(Node node : list) {
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null;
	}

	//HashTable에 데이터 추가하기
	void put(String key, String value) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		System.out.println(key + ", hashCode: "+hashCode+", index: "+index);
		LinkedList<Node> list = data[index];
		if(list == null) {
			list = new LinkedList<Node>();
			data[index] = list;	//배열방에 LinkedList 생성해서 넣어준다.
		}
		Node node = searchKey(list, key);
		if(node == null) {
			list.addLast(new Node(key, value));
		} else {
			node.setValue(value);
		}
	}

	//HashTable에서  데이터 가져오기
	String get(String key) {
		int hashCode = getHashCode(key);
		int index = convertToIndex(hashCode);
		LinkedList<Node> list = data[index];
		Node node = searchKey(list, key);

		return (node == null)? "Not Found" : node.getValue();

	}

	/**************************************/
	class Node {
		String key;
		String value;

		Node(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}
	/**************************************/

	public static void main(String[] args) {
		HashTable table = new HashTable(3);

		table.put("sung", "She is pretty");
		table.put("jin", "She is a model");
		table.put("hee", "She is an angel");
		table.put("min", "She is cute");
		table.put("sung","She is beautiful");

		System.out.println(table.get("sung"));
		System.out.println(table.get("jin"));
		System.out.println(table.get("hee"));
		System.out.println(table.get("min"));
	}
}
