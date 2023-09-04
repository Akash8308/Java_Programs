package Problems;

import java.util.*;


public class FindOccuranceOfChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> map1 = new HashMap<Character, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		
		map1 = findCharacterOccurance(str);
		map2= findWordOccurance(str);
		
		System.out.println("Character count: " +map1);
		
		for( Map.Entry<Character,Integer> obj : map1.entrySet()) {
			System.out.println("Key --->" + obj.getKey() + " Value --->" + obj.getValue());
		}
		
		System.out.println("Word Count:" +map2);
		
		
		
	}

	private static HashMap<String, Integer> findWordOccurance(String str) {
		String str1 = str.toLowerCase();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String[] str2 = str1.split(" ");
		
		for(String word: str2) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else
				map.put(word,1);
		}
		
		return map;
	}

	private static HashMap<Character, Integer> findCharacterOccurance(String str) {
		String str1 = str.toLowerCase();
		char[] strArray = str1.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(char c:strArray) {
			if(c != ' ') {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				
				else
					map.put(c, 1);
		}
		}
		
		return map;
	}


}
