package org.example.module9.generic;

public class MapContainer <K, V> {

    private static final int DEFAULT_SIZE = 8;
    private Entry<K, V> [] entries = new Entry[DEFAULT_SIZE];
    private int size;

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        Entry<K, V> entry = new Entry<>(key, value);
        if (entries[index] == null) {
            entries[index] = entry;
        } else {
            // go through linked list
            // add to the end
        }
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        //check first elem on null
        if (entries[index].key.equals(key)) {
            return entries[index].value;
        } else {
            // go through linked list
            // if key equals return value
            //if it's end return null
        }
        return null;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % entries.length);
    }


    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
