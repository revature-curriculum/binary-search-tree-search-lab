/******************************************************************************

A binary tree is composed of (at most) three components: A root node, a left node, and a right node:
     root
    /    \
  left   right

A binary search tree (BST) consists of multple binary trees linked together. A numerical example is below:

             45 
           /    \ 
          10      90 
         /  \    /   
        7   12  50 

Here, 45 is the root of the BST. The values in the subtree to the left of the root
are all less than 45. The values in the subtree to the right of the root are greater
than 45.

IMPORTANT NOTE: A BST can NOT have duplicate values!

BST Methods/Operations with descriptions:
	
   Insert: Add an element to the BST by not violating the BST properties.
   Delete: Remove a given node from the BST. The node can be the root node, non-leaf, or leaf node.
   Search: Search the location of the given element in the BST. This operation checks if the tree contains the specified key.
   InOrder: Outputs the tree as follows-
      Items to the left of root
      Root
      Items to the right of root
**********************************************************************************/

/*********************************************************************************
 * 
 * Below is the empty BinarySearchTree class. The implementation is as follows:
 * 
 * Within the BinarySearchTree class is a subclass Node defined as:
 * 
 * class Node {
 * int key;
 * Node left, right;
 * }
 * 
 * An object instantiated from the BinarySearchTree class consists (publicly) as
 * follows:
 * Member:
 * Node root
 * Methods:
 * void insertKey(int)
 * void deleteKey(int)
 * boolean search(int)
 * 
 * INSTRUCTIONS: Implement the method for searching for a value in the Binary
 * Search Tree.
 * The implementation is recursive; place the recursive code in searchRecursive.
 * 
 * Alternately, you may choose to implement deleteKey iteratively by deleting
 * the searchRecursive method and placing iterative code in the search
 * method.
 * 
 * Also, an inorder method has been provided to print out the tree "in-order" as
 * described above, for debugging/testing purposes.
 * 
 * Test cases are provided.
 * 
 ******************************************************************************/

class BinarySearchTreeSearchNode {

  // node class that defines Binary Tree node
  class Node {
    int key;
    Node left, right;

    public Node(int data) {
      key = data;
      left = right = null;
    }
  }

  // BinarySearchTree root node
  Node root;

  // Constructor for BinarySearchTreeAddNode =>initial empty tree
  BinarySearchTreeSearchNode() {
    root = null;
  }

  boolean search(int key) {
    root = search_Recursive(root, key);
    if (root != null)
      return true;
    else
      return false;
  }

  // recursive insert function
  Node search_Recursive(Node rt, int key) {
    // place recursive search code here
    return rt;
  }

  // method for inorder traversal of BinarySearchTree
  void inorder() {
    inorder_Recursive(root);
  }

  // recursively traverse the BinarySearchTree

  void inorder_Recursive(Node root) {
    if (root != null) {
      inorder_Recursive(root.left);
      System.out.print(root.key + " ");
      inorder_Recursive(root.right);
    }
  }

  public static void main(String[] args) {
    System.out.println("Hola Mundo!");
  }
}