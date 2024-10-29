public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer, String> bst = new BinarySearchTree<>();
        
        bst.add(12, "twelve");
        bst.add(14, "fourteen");
        bst.add(18, "eighteen");
        bst.add(1, "one");

        bst.printInOrder();
        System.out.println();

        boolean r = bst.contains(14);
        System.out.println("True? " + r);

        r = bst.contains(100);
        System.out.println("True? " + r);

        String s = bst.get(18);
        System.out.println("K=18: " + s);
    }
}
