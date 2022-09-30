public class BSTRetrival {

  static class Node{
      public int data;
      public Node left, right;
      
      public Node(int x) {
          data = x;
          // left = null;
          // right = null;
      }
  }

  static void inorder(Node temp)
  {
      if (temp == null)
          return;

      inorder(temp.left);
      System.out.print(temp.data + " ");
      inorder(temp.right);
  }
/////////////////////////////////////////////////////////////////////////////////
  // static Node SearchBT(Node root, int key){

  //     Node temp = root;
      
  //         while(true){
  //             // if(temp == null){
  //             //     System.out.println("Node "+key+" doesn't exist"); 
  //             //     return null;
  //             // }
  //             if(temp.data == key){
  //                 System.out.println(temp.data);
  //                 return temp;
  //             }
  //             if(temp.data < key){
  //                 temp = temp.right;
  //             }else{
  //                 temp = temp.left;
  //             }
  //         }
  // }
  ///////////////////////////////////////////////////////////////////////////////////
  static Node SearchBT(Node root, int key){
                  if(root == null){ 
                      System.out.println("Node "+key+" does not exist");
                      return null;
                  }
                  if(root.data == key) {
                      System.out.println(root.data);
                      return root;
                  }
                  if(root.data < key)return SearchBT(root.right, key);
                  else return SearchBT(root.left, key);
  }   
  public static void main(String[] args) {

      Node root;

      root = new Node(50);
      //left side
      root.left = new Node(25);
      root.left.left = new Node(20);
      root.left.right = new Node(30);
      //right side 
      root.right = new Node(75);
      root.right.left = new Node(70);
      root.right.right = new Node(80);

      System.out.println(
          "Inorder traversal before insertion: ");
      inorder(root);
System.out.println();
      int key = 30;
   SearchBT(root, key);
  }
}
