package listnode;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int positive = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val )+ ( l2 == null ? 0 : l2.val) +positive;
            temp.next = new ListNode(sum % 10);
            positive = sum / 10;
            temp = temp.next;

            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        temp.next = positive == 1 ? new ListNode(1) : null;
        return result.next;
    }
}

// The key of this answer is to simulate the loop of list node and care of about edge case;


