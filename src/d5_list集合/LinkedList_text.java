package d5_list集合;

import java.util.LinkedList;

public class LinkedList_text {
    public static void main(String[] args) {
         //用LinkedList演示栈

        //push
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("1"); //push入栈
        ll.addFirst("2");
        ll.addFirst("3");
        ll.addFirst("4");
        ll.addFirst("5");
        ll.push("jj");

        System.out.println(ll);

        //pop
        ll.pop();
        ll.pop();
        ll.pop();
        ll.pop();

        System.out.println(ll);
    }
}
