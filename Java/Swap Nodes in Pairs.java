class Solution {
  public ListNode swapPairs(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    while (curr != null && curr.next != null) {
      ListNode nextNode = curr.next;
      if (curr == head) {
        head = nextNode;
      }
      curr.next = nextNode.next;
      nextNode.next = curr;
      if (prev != null) {
        prev.next = nextNode;
      }
      prev = curr;
      curr = curr.next;
    }
    return head;
  }
}