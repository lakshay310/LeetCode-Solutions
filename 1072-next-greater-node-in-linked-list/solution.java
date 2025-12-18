/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int[] ans= new int [n];
        Stack<int[]> st=new Stack<>();
        int index=0;
        while(head!=null){
            while(!st.isEmpty()&& head.val> st.peek()[0]){
                int[] top=st.pop();
                ans[top[1]]=head.val;
            }
            st.push(new int[]{head.val,index});
            index++;
            head=head.next;
        }
        return ans;
        
    }
}
