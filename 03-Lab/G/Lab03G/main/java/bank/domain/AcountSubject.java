package Lab03G.main.java.bank.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Lab03G.main.java.bank.Observers.*;
import Lab03GSol.main.java.integration.IObserver;


public class AcountSubject {

    private Collection<AccountObserver>  observerlist = new ArrayList();

    public void addObserver( AccountObserver observer)
    {
        observerlist.add(observer);
    }

    public void removeObserver(AccountObserver observer)
    {
        observerlist.remove(observer);
    }

    public void notify( Account account)
    {
        Iterator<AccountObserver> iterator = observerlist.iterator();
        while(iterator.hasNext()){
            AccountObserver observer = iterator.next();
            observer.update(account);
        }
    }

}
