public class SegmentTree {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 6, 7, -2, -8, 4, 9 };
        SegmentTree tree = new SegmentTree(arr);

        // Display the tree
        tree.display(tree.root);

        // Query the sum from index 1 to 4
        System.out.println("Query(1,4): " + tree.query(1, 4));

        // Update index 2 to 10
        tree.update(2, 10);
        System.out.println("After update:");
        tree.display(tree.root);
    }

    private static class Node {
        int data;
        int start;
        int end;
        Node left;
        Node right;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display(Node node) {
        if (node == null) return;

        String str = "";
        if (node.left != null) {
            str += "Interval=[" + node.left.start + "-" + node.left.end + "] " + node.left.data + " ";
        } else {
            str += "NULL ";
        }

        str += "<-- Interval[" + node.start + "-" + node.end + "] " + node.data + " --> ";

        if (node.right != null) {
            str += "Interval=[" + node.right.start + "-" + node.right.end + "] " + node.right.data;
        } else {
            str += "NULL";
        }

        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public int query(int left, int right) {
        return this.query(this.root, left, right);
    }

    private int query(Node node, int left, int right) {
        // Complete overlap
        if (node.start >= left && node.end <= right) {
            return node.data;
        }
        // No overlap
        if (node.end < left || node.start > right) {
            return 0;
        }
        // Partial overlap
        return query(node.left, left, right) + query(node.right, left, right);
    }

    public void update(int index, int value) {
        update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (node.start == node.end) { // Leaf node case
            node.data = value;
            return node.data;
        }

        int mid = (node.start + node.end) / 2;
        if (index <= mid) {
            node.data = update(node.left, index, value) + node.right.data;
        } else {
            node.data = node.left.data + update(node.right, index, value);
        }

        return node.data;
    }
}
