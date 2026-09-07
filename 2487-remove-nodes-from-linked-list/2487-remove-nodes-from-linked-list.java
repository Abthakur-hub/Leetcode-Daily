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
        ArrayList<Integer> list = new ArrayList<>();
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        Collections.reverse(list);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int a : list){
            curr.next = new ListNode(a);
            curr = curr.next;
        }
        
        return dummy.next;
    }
}