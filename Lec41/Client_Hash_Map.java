package Lec41;

public class Client_Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("hey", 10);
		map.put("bey", 20);
		map.put("hello", 60);
		map.put("hii", 1);
		System.out.println(map);
		//System.out.println(map.remove("hii"));
		System.out.println(map);
		map.put("mohan", 100);
		System.out.println(map);

	}

}
