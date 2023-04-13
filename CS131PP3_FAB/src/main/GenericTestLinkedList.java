/**

This class tests the functionality of the GenericLinkedList class.
Three separate lists are created: one that holds Integer objects, one
that holds Double objects, and one that holds String objects. Nodes
of each respective type are added to their respective lists and then
printed out to the console.
@author Firstene Badua
*/
package main;

import linkedlist.GenericLinkedList;
import linkedlist.GenericNode;

public class GenericTestLinkedList {
	public static void main(String[] args) {

		// create a GenericLinkedList that can hold Integer objects
		GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();

		// add some Integer nodes to the list
		GenericNode<Integer> intNode = new GenericNode<Integer>();
		intNode.setData(1);
		intList.addNode(intNode);

		intNode = new GenericNode<Integer>();
		intNode.setData(2);
		intList.addNode(intNode);

		intNode = new GenericNode<Integer>();
		intNode.setData(3);
		intList.addNode(intNode);

		// print the Integer list
		System.out.println("Integer List:");
		GenericNode<Integer> intTempNode = intList.getList();
		do {
			System.out.println(intTempNode.getData());
			intTempNode = intTempNode.getNextNode();
		} while (intTempNode != null);

		// create a GenericLinkedList that can hold Double objects
		GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();

		// add some Double nodes to the list
		GenericNode<Double> doubleNode = new GenericNode<Double>();
		doubleNode.setData(1.1);
		doubleList.addNode(doubleNode);

		doubleNode = new GenericNode<Double>();
		doubleNode.setData(2.2);
		doubleList.addNode(doubleNode);

		doubleNode = new GenericNode<Double>();
		doubleNode.setData(3.3);
		doubleList.addNode(doubleNode);

		// print the Double list
		System.out.println("Double List:");
		GenericNode<Double> doubleTempNode = doubleList.getList();
		do {
			System.out.println(doubleTempNode.getData());
			doubleTempNode = doubleTempNode.getNextNode();
		} while (doubleTempNode != null);

		// create a GenericLinkedList that can hold String objects
		GenericLinkedList<String> stringList = new GenericLinkedList<String>();

		// add some String nodes to the list
		GenericNode<String> stringNode = new GenericNode<String>();
		stringNode.setData("Hello");
		stringList.addNode(stringNode);

		stringNode = new GenericNode<String>();
		stringNode.setData("World");
		stringList.addNode(stringNode);

		stringNode = new GenericNode<String>();
		stringNode.setData("!");
		stringList.addNode(stringNode);

		// print the String list
		System.out.println("String List:");
		GenericNode<String> stringTempNode = stringList.getList();
		do {
			System.out.println(stringTempNode.getData());
			stringTempNode = stringTempNode.getNextNode();
		} while (stringTempNode != null);

	}// end main
}// end class