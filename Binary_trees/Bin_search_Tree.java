package Binary_trees;

public class Bin_search_Tree {
    private class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public Bin_search_Tree(int[] arr){
       this.root= construct(arr,0,arr.length-1);
    }
    private Node construct(int[] arr ,int lo,int high){
        if(lo>high){
            return null;
        }
//        mid index
        int mid =(lo + high)/2;
//        creating a new node
        Node nn = new Node();
        nn.data=arr[mid];


        nn.left=construct(arr, lo, mid-1);
        nn.left=construct(arr, mid+1, high);
        return nn;
    }
    public void display() {
    display(this.root);
    }

    private void display(Node node){

        if(node==null){
            return;
        }
//        self work
        String str = "";
        if (node.left==null){
            str+=".";
        }
        else{
            str+=node.left.data;
        }
        str+=  " -> " + node.data+" <- ";

        if (node.right==null){
            str+=".";
        }
        else{
            str+=node.right.data;
        }

        System.out.println(str);
        display(node.left);
        display(node.right);
    }
}
