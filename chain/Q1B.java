package chain;

public class Q1B {

	public static void main(String[] args) {
		int random = (int) ((Math.random() * 99) + 2);

		Node<Integer> head = new Node<Integer>(1);
		Node<Integer> tmp = head;

		for (int i = 2; i < random; i++) {
			tmp.setNext(new Node<Integer>(i));
			tmp = tmp.getNext();
		}

		System.out.print(head.getInfo().toString());
		head = head.getNext();

		while (head != null) {
			System.out.print("-->");
			System.out.print(head.getInfo().toString());
			head = head.getNext();
		}

	}

}
