package Lab03C.main.java.counter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public  class FrameSubject {

    private Collection<IFrameObserver> observerlist = new ArrayList<IFrameObserver>();

    public void addObserver(IFrameObserver observer){
        observerlist.add(observer);
    }

    public void remveObserver(IFrameObserver observer){
        observerlist.remove(observer);
    }

    public void notify(int count){
        Iterator<IFrameObserver> iterator = observerlist.iterator();
        while(iterator.hasNext()){
            IFrameObserver observer = iterator.next();
            observer.update(count);
        }
    }

}
