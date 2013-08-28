package engineering.binaryTree;

class Node {
    /* Declare some properties */
    private int data;           // Payload of the current node
    private Node right = null;  // Reference to the right side node
    private Node left = null;   // Reference to the left side node

    /**
     * Simple no frills node constructor
     */
    public Node( ) { }

    /**
     * Node constructor
     * @param data int The data value for this node
     */
    public Node(int data) {
        setData(data);
    }

    /**
     * Node constructor
     * @param data int The data value for this node
     * @param left Node The left side node to reference from this node
     * @param right Node The right side node to reference from this node
     */
    public Node(int data, Node left, Node right) {
        setData(data);
        setLeft(left);
        setRight(right);
    }

    /**
     * Get the data value for this node.
     * @return int The data value for this node.
     */
    public int getData() {
        return data;
    }

    /**
     * Set the data value for this node.
     * @param newData int The new data value for this node
     */
    public void setData(int newData) {
        data = newData;
    }

    /**
     * Get the right side node referenced by this node
     * @return Node The right side node, or NULL if no node exists
     */
    public Node getRight() {
        return right;
    }

    /**
     * Set the right side node referenced by this node
     * @param newRight Node The new right side node reference.
     */
    public void setRight(Node newRight) {
        right = newRight;
    }

    /**
     * Get the left side node referenced by this node
     * @return Node The left sid node, or NULL if nod node exists.
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Set the left side node referenced by this node
     * @param newLeft Node The new left sid node reference.
     */
    public void setLeft(Node newLeft) {
        left = newLeft;
    }
}