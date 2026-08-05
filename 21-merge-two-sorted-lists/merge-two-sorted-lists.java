class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Fixed: Corrected casing to ListNode and added ()
        ListNode list = new ListNode(); 
        ListNode current = list;
        
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                list.next = list1;
                list1 = list1.next;
            }else{
                list.next = list2;
                list2 = list2.next;
            }
            list = list.next;
        }
        
        if(list1 == null){
            list.next = list2;
        }else{
            list.next = list1;
        }

        return current.next;
    }
}