class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1;
        int last = -1;
        int min = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = head.next;
        int pos = 1;

        while (curr.next != null) {
            ListNode next = curr.next;

            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

                if (first == -1) {
                    first = pos;
                } else {
                    min = Math.min(min, pos - last);
                }

                last = pos;
            }

            prev = curr;
            curr = next;
            pos++;
        }

        if (first == -1 || first == last) {
            return new int[]{-1, -1};
        }

        int max = last - first;

        return new int[]{min, max};
    }
}