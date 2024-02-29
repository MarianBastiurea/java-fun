package org.example.c08.Abstraction;

public class MainNode {
        public static void main(String[] args) {
            Node node1 = new Node("First");
            Node node2 = new Node("Second");
            Node node3 = new Node("Third");
            Node node4 = new Node("Fourth");

            MyLinkedList linkedList = new MyLinkedList(node2);
            linkedList.addItem(node1);
            linkedList.addItem(node3);
            linkedList.addItem(node4);

            System.out.println("Linked List:");
            linkedList.traverse(linkedList.getRoot());

            System.out.println("\nRemoving 'Third' from Linked List:");
            linkedList.removeItem(node3);
            linkedList.traverse(linkedList.getRoot());

            SearchTree tree = new SearchTree(node2);
            tree.addItem(node1);
            tree.addItem(node3);
            tree.addItem(node4);

            System.out.println("\nBinary Search Tree:");
            tree.traverse(tree.getRoot());

            System.out.println("\nRemoving 'Second' from Binary Search Tree:");
            tree.removeItem(node2);
            tree.traverse(tree.getRoot());
        }
}
