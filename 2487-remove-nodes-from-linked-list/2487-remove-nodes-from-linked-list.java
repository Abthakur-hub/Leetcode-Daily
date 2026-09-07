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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            if(st.isEmpty()) st.add(temp.val);
            else{
                int a = temp.val;
                while(!st.isEmpty() && st.peek()<a){
                    st.pop();
                }
                st.push(a);
            }
            temp=temp.next;
        }
        while(st.size()!=0){
            ListNode top = new ListNode(st.pop());
            top.next = temp;
            temp = top;
        }
        return temp;
    }
}