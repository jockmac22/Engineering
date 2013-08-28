package engineering.binaryTree;

import org.apache.commons.lang3.ArrayUtils;

class BinaryTree {
    
    /* Some property declarations */
    private Node root = null;       // The root node reference.

    /**
     * Simple no frills constructor
     */
    public void BinaryTree() { }
    
    /**
     * Determine if a target value exists in the tree.
     * @param node Node the node to inspect for the existence of the value.
     * @param target int The value to be looked up
     * @return boolean TRUE if the value exists, FALSE otherwise
     */
    public boolean lookup(Node node, int target) {
        // If the tree is empty, we haven't found the target, so return FALSE
        if (node == null) 
            return false;
        // Otherwise check the current node for a match, or move on down the 
        // line
        else {
            int data = node.getData();
            // If the current node's data matches the target, return true
            if (target == data)
                return true;
            
            // Otherwise determine which side to follow
            else {
                if (target < data)
                    return lookup(node.getLeft(), target);
                else
                    return lookup(node.getRight(), target);
            }
        }
    }
    
    /**
     * Inserts a data value into the tree in the appropriate location.
     * @param data Int The data value to be inserted.
     */
    public void insert(int data) {
        // If the value doesn't already exist in the tree, then insert it.
        if (!lookup(root, data))
            root = insert(root, data);
    }
    
    /**
     * Iterates through the tree and inserts the data value where it belongs.
     * @param node Node The current node to test data against.
     * @param data int The data to be inserted.
     * @return Node The new/existing node the results from the testing.
     */
    private Node insert(Node node, int data) {
        if (node == null)
            return new Node(data);
        else {
            int nodeData = node.getData();
            if (data < nodeData) 
                node.setLeft(insert(node.getLeft(), data));
            else
                node.setLeft(insert(node.getRight(), data));
            
            return node;
        }
    }
    
    public int[] toArray() {
        return toArray(root);
    }
    
    private int[] toArray(Node node) {
        if (node == null) 
            return null;
        else
            return ArrayUtils.addAll(toArray(node.getLeft()), toArray(node.getRight()));
    }
}