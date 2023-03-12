package chain;

public class Helper {
	public static <T> void printChain(Node<T> chain) {
		Node<T> temp = chain;

		System.out.print(temp.getInfo());
		temp = temp.getNext();
		while (temp != null) {
			System.out.print("-->");
			System.out.print(temp.getInfo());
			temp = temp.getNext();
		}

	}

}
