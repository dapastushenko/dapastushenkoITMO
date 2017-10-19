package Lesson4;

public class IntList {
    Item head;
    Item nextitem;

    public void add(int i) {

        if (head == null) {
           head = new Item();
        } else {
            Item nextitem = new Item(i);
            head.next = nextitem;
           // nextitem.value = i;
        }

    }
}
