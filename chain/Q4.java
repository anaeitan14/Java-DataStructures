package chain;

public class Q4 {

	public static void main(String[] args) {

		Node<Integer> head = createRandomChain(5);

		System.out.print(head.getInfo().toString());
		head = head.getNext();
		
		while (head != null) {
			System.out.print("--->");
			System.out.print(head.getInfo().toString());
			head = head.getNext();
		}
	}

	public static Node<Integer> createRandomChain(int numNodes) {
		int randomNum = (int) ((Math.random() * 101));
		Node<Integer> head = new Node<Integer>(randomNum);
		Node<Integer> tmp = head;

		for (int i = 0; i < numNodes-1; i++) {
			int randomNum2 = (int) ((Math.random() * 101));
			tmp.setNext(new Node<Integer>(randomNum2));
			tmp = tmp.getNext();
		}

		return head;

	}

}
