package Decorator.Iterator;

public class ListIterator implements Iterator{

    private IterableCollection collection;

    public ListIterator(IterableCollection iterableCollection){
        collection =iterableCollection;
    }
    @Override
    public boolean hasMore() {
        return false;
    }
}
