package Tree;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// root, level, path, depth, edge, leaf, node , every node has one parent,
		// complete tree all leaf to the left, incomplete tree, full tree all node have tow nodes 
		// except the leaf node, full tree is
		// complete tree,no repeated node,if so then either put the left or to the
		// right side of the node, or  use counter 
		// binary search tree has left and right child, left child is less then the root
		// and the right child is more than the root value.
		// Insertion order is mater in binary search tree
		// pre-order is root-left and right, in order left root and right, post order
		// left right and root
		// binary search tree has 0, 1 or two children's
		Tree intTree = new Tree();
	    intTree.insert(25);
	    intTree.insert(20);
	    intTree.insert(15);
	    intTree.insert(27);
	    intTree.insert(30);
	    intTree.insert(29);
	    intTree.insert(26);
	    intTree.insert(22);
	    intTree.insert(32);
	    intTree.insert(17);

//        intTree.traverseInOrder();
//        System.out.println();
//
//        System.out.println(intTree.get(27));
       System.out.println(intTree.get(17));
//        System.out.println(intTree.get(8888));

        System.out.println(intTree.min());
        System.out.println(intTree.max());


	}

}
