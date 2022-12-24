package Decorator.Iterator;

import java.util.List;

public class ListCollection implements IterableCollection{
    private List list;

    private ListCollection(List list){
        this.list = list;
    }
    @Override
    public Iterator createIterator() {
        return null;
    }

    public List getList() {
        return list;
    }
}
