package Day_5;

public class HashMapNode <K, V> {
    private K key;
    private V val;
    private HashMapNode<K, V> next;

    public HashMapNode(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }

    public HashMapNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashMapNode<K, V> next) {
        this.next = next;
    }




}
