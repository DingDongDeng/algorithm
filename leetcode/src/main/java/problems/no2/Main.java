package problems.no2;

public class Main {


    // 입력: l1 = [2,4,3], l2 = [5,6,4]
    // 출력: [7,0,8]
    // 설명: 342 + 465 = 807.

//     Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//      Output: [8,9,9,9,0,0,0,1]

//[2,4,3]
// [5,6,4]
    public static void main(String[] args) {

        // ListNode a = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null)))))));
        // ListNode b = new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,null))));

        ListNode a = new ListNode(2, new ListNode(4, new ListNode(3,null)));
        ListNode b = new ListNode(5, new ListNode(6, new ListNode(4,null)));

        ListNode c = new Solution().addTwoNumbers(a, b);

        while(c != null){
            System.out.println(c.val);
            c = c.next;
        }
        

    }

}
