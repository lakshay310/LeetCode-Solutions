class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       int n=students.length;
       Queue<Integer> stuq=new LinkedList<>();
       Stack<Integer> st=new Stack<>();
       //fill queue and stack
       for(int i=0;i<n;i++){
        stuq.add(students[i]);
        st.push(sandwiches[n-i-1]);
       }
       int lastserv=0;
       while(stuq.size()>0&&lastserv<stuq.size()){
        if(st.peek()==stuq.peek()){
            st.pop();
            stuq.poll();
            lastserv=0;
        }else{
            stuq.offer(stuq.poll());
            lastserv++;
        }
       }
       return stuq.size();
    }
}