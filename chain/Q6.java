package chain;

public class Q6 {

	public static void main(String[] args) {
		Node<Integer> chain = new Node<Integer>(5);
		chain.setNext(new Node<Integer>(-8));
		chain.setNext(new Node<Integer>(8));
		chain.setNext(new Node<Integer>(-8));
		chain.setNext(new Node<Integer>(-8));
		System.out.println(secret(chain));
	}

	public static boolean secret(Node<Integer> chain) {
		if (chain.getNext() == null) {
			return true;
		}

		int x = chain.getInfo();
		int y = chain.getNext().getInfo();

		if (x * y > 0) {
			return false;
		}

		return secret(chain.getNext());
	}

}
