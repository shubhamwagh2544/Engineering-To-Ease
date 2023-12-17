public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
	//using hashmap
	Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (char c : t.toCharArray()) {
            if (map.get(c) == null) return false;
            
            map.put(c, map.get(c)-1);
        }

        for (Integer i : map.values()) {
            if (i != 0) return false;
        }

        return true;
	}

	public boolean isAnagram(String s, String t) {
	//using frequency array
	int[] f = new int[26];

        for (char c : s.toCharArray()) {
            f[c-'a']++;
        }

        for (char c : t.toCharArray()) {
            f[c-'a']--;
        }

        for (int i = 0; i < f.length; i++) {
            if (f[i] != 0) return false;
        }       

        return true;
	
	}
}