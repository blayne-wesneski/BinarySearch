public class BinarySearchTree<K, V> {

    private class Node<K, V> {
        public K key;
        public V value;
        public Node<K, V> left, right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }

    }

    private Node<K, V> root;

    BinarySearchTree() {
        root = null;
    }

    public void add(K key, V value) {
        root = add(root, key, value);
    }

    private Node<K, V> add(Node<K, V> curr, K key, V value) {
        if (curr == null) {
            return new Node<K, V>(key, value);
        }

        if (((Comparable) key).compareTo(curr.key) < 0) {
            curr.left = add(curr.left, key, value);
        } else if (((Comparable) key).compareTo(curr.key) > 0) {
            curr.right = add(curr.right, key, value);
        }

        return curr;

    }

    public boolean contains(K key) {
        Node<K, V> tmp = searchTree(root, key);

        return tmp != null;
    }

    public V get(K key){
        Node<K, V> tmp = searchTree(root, key);

        if(tmp == null){
            return null;
        }else{
            return tmp.value;
        }
    }

    private Node<K, V> searchTree(Node<K, V> curr, K key) {
        if (curr == null) {
            return null;
        }

        // FOUND
        if (((Comparable) key).compareTo(curr.key) == 0) {
            return curr;
        }

        // LEFT
        if (((Comparable) key).compareTo(curr.key) < 0) {
            return searchTree(curr.left, key);

        }

        // RIGHT
        return searchTree(curr.right, key);

    }

    public void printInOrder() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node<K, V> curr) {
        if (curr != null) {

            // LEFT
            inOrderTraversal(curr.left);
            // ROOT
            System.out.print(curr.value + " ");
            // RIGHT
            inOrderTraversal(curr.right);
        }

    }
}
