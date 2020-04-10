import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public static LinkedList<Integer>[] filterToOddNEven(OneWayListNode<Integer> head) {
        Deque<Integer> oddItems = new LinkedList();
        Deque<Integer> evenItems = new LinkedList();

        OneWayListNode<Integer> item = head;
        while (item != null) {
            Integer value = item.get();
            if (value % 2 == 0) {
                evenItems.addFirst(value);
            } else {
                oddItems.addFirst(value);
            }

            item = item.next();
        }

        return new LinkedList[] { (LinkedList) oddItems, (LinkedList) evenItems };
    }
}
