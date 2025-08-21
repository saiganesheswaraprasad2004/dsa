package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertLast(100);
        list.insert(200, 3);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(1));
        list.display();

//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);
//
//        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        list.delete(19);
//        list.display();
    }
}
