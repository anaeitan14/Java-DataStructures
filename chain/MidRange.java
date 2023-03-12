package chain;

public class MidRange {

	public static void main(String[] args) {
		IntNode n1 = new IntNode(3);
		IntNode n2 = new IntNode(5, n1);
		IntNode n3 = new IntNode(34, n2);
		IntNode n4 = new IntNode(12, n3);

		System.out.println(midRange(n4));
	}

	public static double midRange(IntNode chain) {
		int min = chain.getInfo();
		int max = chain.getInfo();

		chain = chain.getNext();

		while (chain != null) {
			if (chain.getInfo() > max) {
				max = chain.getInfo();
			} else if (chain.getInfo() < min) {
				min = chain.getInfo();
			}
			chain = chain.getNext();
		}

		return (min + max) / 2.0;
	}
}
