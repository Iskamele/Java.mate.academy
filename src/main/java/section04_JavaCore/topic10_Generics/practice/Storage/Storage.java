package section04_JavaCore.topic10_Generics.practice.Storage;

public interface Storage<K, V> {
    void put(K key, V value);

    V get(K key);

    int size();
}
