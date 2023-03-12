package chain;

public class Q5 {

	public static void main(String[] args) {

		Node<Integer> b1 = new Node<Integer>(5);
		Node<Integer> b2 = new Node<Integer>(123);
		Node<Integer> b3 = new Node<Integer>(6);
		b1.setNext(b2);
		b2.setNext(b3);

		Node<Integer> b4 = new Node<Integer>(423);
		Node<Integer> b5 = new Node<Integer>(2);
		Node<Integer> b6 = new Node<Integer>(4325);
		b4.setNext(b5);
		b5.setNext(b6);

		change(b1, b4);
	}

	public static void change(Node<Integer> chain1, Node<Integer> chain2) {
		Node<Integer> tmp = chain1;

		while (chain1.getNext() != null) {
			chain1 = chain1.getNext();
		}
		chain1.setNext(chain2);

		
		System.out.print(tmp.getInfo().toString());
		tmp = tmp.getNext();
		while (tmp != null) {
			System.out.print("--->");
			System.out.print(tmp.getInfo().toString());
			tmp = tmp.getNext();
		}
	}
}
