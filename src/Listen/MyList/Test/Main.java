package Listen.MyList.Test;

import Listen.MyList.SimpleLinkedlist.LinkedListMy;
import Listen.MyList.Entities.Table;

public class Main {
    public static void main(String[] args) {
        LinkedListMy<Integer> linkedList = new LinkedListMy();
        LinkedListMy <Table> linkedList2 = new LinkedListMy();

        linkedList2.add(new Table("Marke Test1"));
        linkedList2.add(new Table("Tisch top"));
        linkedList2.add(new Table("طاولة top"));

        // head = null
        linkedList.add(0, 10);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        System.out.print("Before: ");
        linkedList.printInfo();

        System.out.println();
        linkedList.set(-1, 20);
        linkedList.set(0, 10);
        linkedList.set(2, 30);
        linkedList.set(4, 50);
        linkedList.set(100, 60);
        System.out.print("After: ");
        linkedList.printInfo();

        System.out.println();
        linkedList.remove(4);
        //TODO

        // Liste mit END erweitern mit der Betrachtung in allen Methoden,
        // dass die END eingesetzt werden muss


        // linkedList.add(-1, 20);
        //linkedList.add(0, 10);
        //linkedList.add(2, 30);
        //linkedList.add(4, 50);
        // linkedList.add(100, 60);
        // System.out.print("After Add with indexes: ");
        //linkedList.printInfo();

        // linkedList.search(1);
        // linkedList.get(2);

        // linkedList.remove(2 as index);
        // linkedList.remove(10 as value);

        // linkedList.printListUmgekehrt()
        // linkedList.findSummeOfList()

        // Merge Liste:
        // LinkedListMy list1 = new LinkedListMy();
        // list1.add(1);
        // list1.add(2);

        // LinkedListMy list2 = new LinkedListMy();
        // list2.add(3);
        // list2.add(4);

        // LinkedListMy merged = linkedList.merge(list2) --> 1 -> 2 -> 3 -> 4

    }
}
