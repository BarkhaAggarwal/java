package BinaryTree;

public class Btree {
class Node{
	int data;
	Node left;
	Node right;
}
Node root;
public void print() {
	print_Preorder(root);
}
private void print_Preorder(Node nn) {
	// TODO Auto-generated method stub
	if(nn==null) {
		return;
	}
	System.out.println(nn.data);
	print_Preorder(nn.left);
	print_Preorder(nn.right);
}
private void print_Inorder(Node nn) {
	// TODO Auto-generated method stub
	if(nn==null) {
		return;
	}
	
	print_Inorder(nn.left);
	System.out.println(nn.data);
	print_Inorder(nn.right);
}

private void print_Postorder(Node nn) {
	// TODO Auto-generated method stub
	if(nn==null) {
		return;
	}
	
	print_Postorder(nn.left);
	
	print_Postorder(nn.right);
	System.out.println(nn.data);
}

}
