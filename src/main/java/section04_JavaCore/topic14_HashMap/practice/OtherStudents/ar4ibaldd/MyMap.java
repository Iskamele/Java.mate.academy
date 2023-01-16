package section04_JavaCore.topic14_HashMap.practice.OtherStudents.ar4ibaldd;

public interface MyMap<K, V> {
    void put(K key, V value);

    V getValue(K key);

    int getSize();
}
