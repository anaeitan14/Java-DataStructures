package chain;

public class IntNode {
	private int data;
	private IntNode next;

	public IntNode(int data) {
		this.data = data;
		this.next = null;
	}

	public IntNode(int data, IntNode next) {
		this.data = data;
		this.next = next;
	}

	public IntNode(IntNode other) {
		this.data = other.data;
		this.next = other.next;
	}

	public int getInfo() {
		return data;
	}

	public IntNode getNext() {
		return next;
	}

	public String toString() {
		return "" + data;
	}
}
