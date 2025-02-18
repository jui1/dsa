public class BinarySreacttree {
    public static void main(String[] args) {

    }

    public class node {
        private int value;
        private int height;
        private node left;
        private node right;

        private node(int value) {
            this.value = value;
        }

        public int getvalue() {
            return value;
        }
    }

    private node root;

    public BinarySreacttree() {

    }

    public int height(node node) {
        if (node == null)
            return -1;
        return node.height;

    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display(){
      display(root, "root node");
    }

    private void display(node node,String details ){
        if(node == null) return ;

        System.out.println(details + node.getvalue());

        display(node.left , "left chilc of " + node.getvalue());
    }

}
