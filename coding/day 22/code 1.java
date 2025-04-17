/*Given the head of a linked list, determine if the linked list has a cycle in it.

A cycle occurs when a node's next pointer points to a previous node in the list,
 forming a loop. To represent a cycle in the given linked list, we use an integer
 pos which represents the position (0-indexed) in the linked list where the tail 
connects to. If pos is -1, then there is no cycle.

Return true if there is a cycle in the linked list. Otherwise, return false.

Sample Testcase:1
-----------------------------
input=4
3 2 0 -4
1
output=true
*/
  class Solution{
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
if(slow == fast){
                return true;
            }
        }
        return false;
  }
}
