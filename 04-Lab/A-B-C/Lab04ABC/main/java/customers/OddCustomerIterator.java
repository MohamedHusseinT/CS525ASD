package Lab04ABC.main.java.customers;

import java.util.Iterator;

public class OddCustomerIterator implements Iterator<Customer> {

    Iterator<Customer> iterator;
    private int position;

    public OddCustomerIterator(Iterable<Customer> customers) {
        position = 0;
        iterator = customers.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
        //return false;
    }

    @Override
    public Customer next() {
        Customer customer = iterator.next();
        if(iterator.hasNext())
            iterator.next();
        position++;

        return customer;
    }
}
