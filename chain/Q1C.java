package chain;

import java.util.Scanner;

public class Q1C {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you sentence");
		String sent = s.nextLine();

		String[] words = sent.split(" ");

		Node<String> head = new Node<String>(words[0]);
		Node<String> tmp = head;

		for (int i = 1; i < words.length; i++) {
			tmp.setNext(new Node<String>(words[i]));
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
