package linkedList.generic;

import linkedList.nonGeneric.MyLinkedList;

public class MainLinkList {
    public static void main(String[] args) {
        MyLinkList<String> myLL=new MyLinkList<>();
        myLL.add(56+" added");
        myLL.add(6+" added");
        myLL.add(12+" added");
        myLL.print();
    }
}
