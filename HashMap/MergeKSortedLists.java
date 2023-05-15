package HashMap;

import java.util.PriorityQueue;

import Linklist.reverse_list_2.ListNode;

public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode[] lists = new ListNode[3];
	    lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
	    lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
	    lists[2] = new ListNode(2, new ListNode(6));
	    
	    ListNode mergedList = mergeKLists(lists);
	    
	    while(mergedList != null) {
	        System.out.print(mergedList.data + " ");
	        mergedList = mergedList.next;
	    }

	}
	public static ListNode mergeKLists(ListNode[] lists) {
	    if(lists == null || lists.length == 0) {
	        return null;
	    }
	    
	    ListNode dummy = new ListNode(-1);
	    ListNode curr = dummy;
	    PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);
	    
	    for(ListNode head : lists) {
	        if(head != null) {
	            minHeap.offer(head);
	        }
	    }
	    
	    while(!minHeap.isEmpty()) {
	        ListNode minNode = minHeap.poll();
	        curr.next = minNode;
	        curr = curr.next;
	        
	        if(minNode.next != null) {
	            minHeap.offer(minNode.next);
	        }
	    }
	    
	    return dummy.next;
	}

}
