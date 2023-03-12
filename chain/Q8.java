package chain;

public class Q8 {

	public static void main(String[] args) {
		Node<Character> chain = new Node<Character>('z');
		Node<Character> chain1 = new Node<Character>('e', chain);
		Node<Character> chain2 = new Node<Character>('e', chain1);
		Node<Character> chain3 = new Node<Character>('z', chain2);
		Node<Character> chain4 = new Node<Character>('k', chain3);
		Node<Character> chain5 = new Node<Character>('b', chain4);
		Node<Character> chain6 = new Node<Character>('b', chain5);
		Node<Character> chain7 = new Node<Character>('k', chain6);
		Node<Character> chain8 = new Node<Character>('k', chain7);
		Node<Character> chain9 = new Node<Character>('k', chain8);
		compressSequences(chain9);
	}

	public static void compressSequences(Node<Character> chain) {
		Node<Character> temp = chain;
		Node<Character> travel = chain;

		while (temp.getNext() != null) {
			while (travel.getInfo() == travel.getNext().getInfo()) {
				travel = travel.getNext();
			}
			temp.setNext(travel.getNext());
			temp = temp.getNext();
			travel = temp;
		}
		Helper.printChain(chain);
	}
}
