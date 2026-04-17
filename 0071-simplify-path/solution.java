class Solution {
    public String simplifyPath(String path) {
        List<String> ls=new ArrayList<>();
        String[] arr=path.split("/");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("")||arr[i].equals(".")){
                continue;
            }
            else if(arr[i].equals("..")){
                if(ls.size()>0){
                    ls.remove(ls.size()-1);
                }
            }
            else{
                ls.add(arr[i]);
            }
        }
        String ans="";
        for(int i=0;i<ls.size();i++){
            ans=ans+"/"+ls.get(i);
        }
        return ans.length()==0?"/":ans;
    }
}
