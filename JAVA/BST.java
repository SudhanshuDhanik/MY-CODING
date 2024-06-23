import java.util.*;

class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    //BUILDING A BST
    static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
        root.right=insert(root.right, val);}
         return root;
    }

     static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //SEARCH IN BST , O(H),H is height of bst
    static boolean search (Node root,int key){
        if(root==null)
            return false;
        
        if(root.data>key){
            return search(root.left,key);
        }
        else if(root.data==key){
            return true;
        }
        else 
        return search(root.right,key);
    }

    //DELETE NODE IN BST
    static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{
            //Case 1: if node is leaf node
            if(root.left==null && root.right==null)
            return null;

            //Case 2: if node has one child node
            if(root.left==null)
                return root.right;
            else if(root.right==null)
            return root.left;

            //Case 3:if node has 2 children
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data); 
        }
        return root;        
           }
           static Node inorderSuccessor(Node root){
            while(root.left!=null){
                root=root.left;
            }
            return root;
           }

     //PRINT IN RANGE
     static void printInRange(Node root,int x,int y){
        if(root==null)
        return;
        if(root.data>=x && root.data<=y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }
        else if(root.data>=y){
            printInRange(root.left, x, y);
        }
        else 
        printInRange(root.right, x, y);
     }

     //ROOT TO LEAF PATHS
     static void printRoot2Leaf(Node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
        }
        else {
            //non leaf nodes
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);
    }
        path.remove(path.size()-1);
    }
    static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void main(String arg[]) {
        int values[]={5,1,3,4,2,6,};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        //SEARCHING
        System.out.println();
        if(search(root,9)){
            System.out.println("FOUND");
        }
        else 
        System.out.println("Not found");
        //DELETION
        delete(root, 1);
        inorder(root);

        //print in range
        System.out.println();
        printInRange(root, 1, 5);

        //ROOT2LEAF
        System.out.println();
        printRoot2Leaf(root, new ArrayList<>());
    }
}
