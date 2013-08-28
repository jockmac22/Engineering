package engineering.binaryTree;

public class BinaryTreeTest {
    public static void main(String args[]) {
        BinaryTree bt = new BinaryTree();
        
        bt.insert(1);
        bt.insert(9);
        bt.insert(2);
        bt.insert(8);
        bt.insert(3);
        bt.insert(7);
        bt.insert(4);
        bt.insert(6);
        bt.insert(5);
        
        int[] dataList = bt.toArray();
        
        for (int i=0;i<dataList.length;i++)
            System.out.println(dataList[i]);
    }
}
