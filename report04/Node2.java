package report04;

public class Node2 <E> {
	
	private E item;
	private Node<E> next;
	
	public Node2(E newItem, Node<E> node) {
		item = newItem;
		next = node;
	}
	
	public E getItem() {return item;}
	public Node<E> getNext(){return next;}
	public void setItem(E newItem) {item = newItem;}
	public void setNext(Node<E> newNext) {next = newNext;}

}
