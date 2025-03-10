package Lab04ABC.main.java.customers;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgeIterator implements Iterator<Customer> {

    private List<Customer> localSortedCustomersByAgeAsc;
    private int position;
    public AgeIterator(List<Customer> customers)
    {
        position = 0;
        localSortedCustomersByAgeAsc = new ArrayList<>(customers);
        localSortedCustomersByAgeAsc.sort((a,b)->Integer.compare( a.getAge(),b.getAge()));
    }

    @Override
    public boolean hasNext() {
        return localSortedCustomersByAgeAsc.size() > position;
    }

    @Override
    public Customer next() {


        Customer customer= localSortedCustomersByAgeAsc.get(position);

        position++;
        return customer;
    }
}
