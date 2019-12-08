package com.vp.ds.binarytree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree bt= new BinaryTree();
		bt.insert(10);
		bt.insert(20);
		bt.insert(20);
		bt.insert(15);
		bt.insert(100);
		System.out.println("\nIn order");
		bt.inorder();
		System.out.println("\nPost order");
		bt.postorder();

		System.out.println("\nPre order");
		bt.preorder();

	}

}
