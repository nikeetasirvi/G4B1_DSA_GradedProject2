package gl.g4b1.question2.tree;

import gl.g4b1.question2.node.Node;

public class TransactionOfData {

	public Node root;
	public Node newRoot = null;
	Node previousNode = null;

	public void convertBSTToRightSkew(Node root) {
		if (root == null) {
			return;
		}
		convertBSTToRightSkew(root.left);
		if (newRoot == null) {
			newRoot = root;
			root.left = null;
			previousNode = root;
		} else {
			previousNode.right = root;
			root.left = null;
			previousNode = root;
		}
		convertBSTToRightSkew(root.right);
	}

	public void printRightSkew(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			printRightSkew(root.right);
		}
	}

}