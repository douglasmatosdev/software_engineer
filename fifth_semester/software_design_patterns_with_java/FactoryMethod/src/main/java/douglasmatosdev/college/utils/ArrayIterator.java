package douglasmatosdev.college.utils;

import java.util.*;

public class ArrayIterator<T> implements Iterable<T>, Iterator<T> {
    ArrayList<T> values;
    int current = 0;

    public ArrayIterator() {
    }

    public ArrayIterator(ArrayList<T> values) {
        this.values =  values;
    }

    public void remove() {
        values.remove(current-1);
    }

    public boolean hasNext() {
        if (current < values.size()) {
            return true;
        } else {
            return false;
        }
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return values.get(current++);
    }

    public T get(int index) {
        return values.get(index);
    }

    public void set(int index, T value) {
        values.set(index, value);
    }

    public int length() {
        return values.size();
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }
}
