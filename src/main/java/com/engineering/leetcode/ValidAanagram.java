public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
	//using hashmap
	Map<Character, Integer> map = new HashMap<>();

	//length check
	if (s.length() != t.length()) return false;

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

	//length check
	if (s.length() != t.length()) return false;

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

	public boolean isAnagram(String s, String t) {
	//using array sorting

	//length check
	if (s.length() != t.length()) return false;

	char[] one = s.toCharArray();
        char[] two = t.toCharArray(); 
        
        Arrays.sort(one);
        Arrays.sort(two);

        return Arrays.equals(one, two);
	}

	public boolean isAnagram(String s, String t) {
	//using two loops : maintain a counter
	int[] f = new int[26];
	int count = 0;
	
	//length check
	if (s.length() != t.length()) return false;
		
	for (char c: s.toCharArray()) {
		f[c-'a']++;
		count++;
	}		
	
	for (char c: t.toCharArray()) {
		if (f[c-'a'] > 0) {
			f[c-'a']--;
			count--;
		}
	}	
	
	return count == 0;
	}
}