class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int cnt=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') cnt++;
            else cnt--;
            if(cnt==0){
                res.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return res.toString();
    }
}