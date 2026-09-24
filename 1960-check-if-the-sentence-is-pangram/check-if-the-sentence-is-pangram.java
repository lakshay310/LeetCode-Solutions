class Solution {
    public boolean checkIfPangram(String sentence) {
        TreeSet<Character> set=new TreeSet<>();
        for( char ch: sentence.toCharArray()){
            set.add(ch);
        }
        return set.size()==26;
    }
}