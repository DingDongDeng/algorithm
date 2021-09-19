package problems.no2;
import java.util.Stack;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> up = new Stack<>();
        Stack<Integer> lst = new Stack<>();
        int sum;

        ListNode ret = new ListNode();
        ListNode first = new ListNode();
         do{

            if(l1!=null && l2!= null)
                sum = l1.val + l2.val;
            else if(l1==null && l2!=null)
                sum = l2.val;
            else
                sum = l1.val;

            if(!up.isEmpty())
                sum += up.pop(); 

            lst.push(sum%10);

            if(sum>9)
                up.push(sum/10);
            
            if (l1!=null)
                l1 = l1.next;
            if (l2!=null)
                l2 = l2.next;
            
            if(l1==null && l2 == null && !up.isEmpty())
                lst.push(up.pop());                

            System.out.println(lst);

        }while ( ! (l1  == null && l2  == null) );

        Object[] arr = lst.toArray(); 
        
        for(int i = 0; i< arr.length ; i++){
            System.out.println("arr : "+ arr[i]);
            if(i == 0){
                ret.val = (int)arr[i];
                ret.next = null;
                first = ret;
            }
            else{
                ret.next = new ListNode((int)arr[i],null);
                ret = ret.next;
            }
        }
        ret = first;

        return ret;

    }
}


