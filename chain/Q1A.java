package chain;

public class Q1A {

	public static void main(String[] args) {
		Node<Integer> n1 = new Node<Integer>(4);
		Node<Integer> n2 = new Node<Integer>(21, n1);
		Node<Integer> n3 = new Node<Integer>(7, n2);

		Node<Integer> tmp = n3;
		System.out.print(tmp.getInfo().toString());
		tmp = tmp.getNext();

		while (tmp != null) {
			System.out.print("-->");
			System.out.print(tmp.getInfo().toString());
			tmp = tmp.getNext();
		}
	}
}
