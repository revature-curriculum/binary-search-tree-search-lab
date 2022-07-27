// The purpose of this code segment is to provide test code for the search() method in BinarySearchTreeAddNode.

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeAddNodeTest {

// Test to search for an existing item from the tree.

@Test
public void SearchExistingItem() {
   BinarySearchTreeSearchNode bst = new BinarySearchTreeSearchNode();
   boolean found = false;
   bst.root.key = 45;
   bst.root.left.key = 10;
   bst.root.right.key = 90;
   found = bst.search(90);
   if (!found)
     fail("Should have found 90 but didn't.");

}

// Test to search for a non-existing item from the tree.

@Test
public void SearchNonExistingItem() {
   BinarySearchTreeSearchNode bst = new BinarySearchTreeSearchNode();
   boolean found = true;
   bst.root.key = 45;
   bst.root.left.key = 10;
   found = bst.search(80);
   if (found)
     fail("Found 80 but it doesn't exist.");

}

}

