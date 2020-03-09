package Day_5;

public class CustomHashMap<K, V> {
    // this class creates the 'map' (an array of HashMapNodes)  and 'controls' the functionality of HashMapNodes
    HashMapNode[] map;

    public CustomHashMap() {
        map = new HashMapNode[5];
    }

    public int hash(K key) {
        int hash = key.hashCode(); // hash returns the hashCode for any object we pass to it
        int index = hash % map.length;
        return index;
    }

    public void put(K key, V val) {
        // find the index for our new object
        int i = hash(key);

        // check if map is empty at that index (if it is, insert Node at that index)
        if(null == map[i]) {
            map[i] = new HashMapNode(key, val);
            return;
        }
        // else (there is at least one Node), create an iterator to find an empty spot
        HashMapNode<K, V> iterator = map[i];
        // but first check the first node to see if the key is a duplicate (we would simply overwrite)
        if(iterator.getKey() == key) {
            iterator.setVal(val);
            return; //overwrite
        }
        while(null != iterator.getNext()) { // while next is not empty, check whether key is a duplicate
            if(iterator.getKey() == key) {
                iterator.setVal(val);
                return; //overwrite
            } // as long as we do not find an empty spot for the Node (and for every non-empty spot, we have checked
             // whether our new key is a duplicate - to replace any old Node with a duplicate key this new Node), iterate
            iterator = iterator.getNext();
        }
        // if we come out of the while, it means we are at the last Node >> add the new node at Next
        iterator.setNext(new HashMapNode(key, val));
    }

    public V get(K key) {
        int i = hash(key);

        // check if map is empty at that index and return null if it is
        if (null == map[i])
            return null;

        // else (if not empty) create an iterator and start checking
        HashMapNode<K, V> iterator = map[i];
        while (null != iterator && iterator.getKey() != key) {
            // while the current Node is not empty && does not contain the key we need
            iterator = iterator.getNext(); //keep iterating
        } // when we come out of while, either the Node is empty (end of list) and we haven't found the key
        // or the Node contains the data

        //so we check: is the Node empty?
        if (iterator == null)
            return null; // the key has not been found
        return iterator.getVal(); // the current Node contains the key
    }

    public void remove(K key) {
        int i = hash(key);

        // check if map is empty at that index
        if (null == map[i]) {
            System.out.println("Key not found");
            return;
        }
        // else (if not empty) create an iterator
        HashMapNode<K, V> iterator = map[i];
        // then check if the first Node has the key we are looking for; if it does, 'cut the head off'
        if (iterator.getKey() == key) { //if the head has the data
            if (iterator.getNext() == null) {// and it's the only Node (i.e. there is no Next)
                map[i] = null;
                return;
            } else {
                map[i] = iterator.getNext(); // else (there are more Nodes), set the Next node as the head (index at i)
                return;
            }
        }
        // else (if the iterator does not have the key we are looking for), while the next one is not empty
        // AND does not have the key, iterate
        while (null != iterator.getNext() && iterator.getKey() != key) {
            iterator = iterator.getNext();
        }
        // when we come out of the while loop, we are either at the last Node (and the key is not found) or we have
        // found the key to remove in the next Node
        if (iterator.getNext() == null) {
            System.out.println("Key not found");
            return;
        } else {
            iterator.setNext(iterator.getNext().getNext()); // leapfrog the Node to be removed
            return;
        }
    }

    public boolean contains (K key) {
        int i = hash(key);

        // check if map is empty at that index and return false if it is
        if (null == map[i])
            return false;

        // else (if not empty) create an iterator and start checking
        HashMapNode<K, V> iterator = map[i];
        while (null != iterator && iterator.getKey() != key) {
            // while the current Node is not empty && does not contain the key we need
            iterator = iterator.getNext(); //keep iterating
        } // when we come out of while, either the Node is empty (end of list) and we haven't found the key
        // or the Node contains the data

        //so we check: is the Node empty?
        if (iterator == null)
            return false; // the list does not contain the said key
        return true; // we have found the key in the current Node
    }
}
