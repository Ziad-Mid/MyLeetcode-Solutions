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
    public ListNode rotateRight(ListNode head, int k) {
        
        //K%NUMBER OF NODES
        int v = 0;
        
        List<Object> l = getLength(head);
        ListNode last = (ListNode) l.get(0);
        int length = (int) l.get(1);
        
        if(length == 0 || k%length == 0 )
            return head;
        else{
            ListNode curr = head.next;
            ListNode prev = head;
            int count = 0;
            
            while (count != (length - k%length - 1)) {
                curr = curr.next;
                prev = prev.next;
                count++;
            }
            
            
            last.next = head ;
            head = curr;
            prev.next = null;      
        }
        


        return head;
    }
    
    public List<Object> getLength(ListNode head)
    {
        ListNode temp = head;
        ListNode last = head;
        int count = 0;
        while (temp != null) {
            count++;
            if(temp.next == null)
                last = temp;
            temp = temp.next;
        }
        return Arrays.asList(last, count);
    }
    
   
}