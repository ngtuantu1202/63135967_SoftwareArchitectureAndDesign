package behavioral.Iterator.Interger;

public class ArrayIterator63 implements Iterator63{
    ArrayCollection63 collection;
    int index = -1;
    protected ArrayIterator63(ArrayCollection63 collection) {
        this.collection = collection;

    }

    @Override
    public Object first() {
        if(!isDone())
        {
            index = 0;
            return collection.getItem(index);
        }
        return null;
    }

    @Override
    public Object next() {
//        if(!isDone())
            return collection.getItem(index++);
//        return null;
    }

    @Override
    public Object current() {
        if(index>=0)
            return collection.getItem(index++);
        return null;
    }

    @Override
    public boolean isDone() {
        return index == collection.count()-1;
    }
}
