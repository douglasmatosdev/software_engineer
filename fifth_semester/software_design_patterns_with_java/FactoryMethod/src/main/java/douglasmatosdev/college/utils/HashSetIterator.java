package douglasmatosdev.college.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashSetIterator<T> implements Iterable<T>, Iterator<T>  {
    Iterator<T> iteratorValues;
    HashSet<T> values;

    int current = 0;

    public HashSetIterator() {

    }

    public HashSetIterator(HashSet<T> values) {
        this.iteratorValues =  values.iterator();
        this.values =  values;
    }

    @Override
    public Iterator<T> iterator() {
        return new HashSetIterator();
    }

    @Override
    public boolean hasNext() {
        return iteratorValues.hasNext();
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        current++;
        return iteratorValues.next();
    }

    public int length() {
        return values.size();
    }
    public void remove() {
        values.remove(current-1);
        iteratorValues.remove();
    }
}
