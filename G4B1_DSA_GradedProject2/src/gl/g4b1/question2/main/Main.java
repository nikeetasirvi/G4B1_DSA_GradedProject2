package gl.g4b1.question2.main;

import gl.g4b1.question2.tree.TransactionOfData;
import gl.g4b1.question2.node.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TransactionOfData transaction = new TransactionOfData();
		transaction.root = new Node(50);
		transaction.root.left = new Node(30);
		transaction.root.right = new Node(60);
		transaction.root.left.left = new Node(10);
		transaction.root.right.left = new Node(55);
		transaction.root.left.right = new Node(35);

		transaction.convertBSTToRightSkew(transaction.root);
		transaction.printRightSkew(transaction.newRoot);
	}

}
