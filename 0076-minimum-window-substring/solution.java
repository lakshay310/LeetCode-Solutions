class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = map.size();
        int i = 0;
        int j = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }
            }
            if (count > 0) {
                j++;
            }
            else if (count == 0) {
                while (count == 0) {
                    if (j - i + 1 < minLength) {
                        minLength = j - i + 1;
                        start = i;
                    }
                    char leftChar = s.charAt(i);
                    if (map.containsKey(leftChar)) {
                        map.put(leftChar, map.get(leftChar) + 1);
                        if (map.get(leftChar) > 0) {
                            count++;
                        }
                    }
                    i++;
                }
                j++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);

    }
}
