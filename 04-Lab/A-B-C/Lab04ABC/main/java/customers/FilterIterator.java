package Lab04ABC.main.java.customers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class FilterIterator implements Iterator<Customer> {

    private List<Customer> localFilteredCustomers;
    private int position;
    Predicate<Customer> localPredicate;


    public FilterIterator(List<Customer> customers, Predicate<Customer> predicate) {
        position = 0;
        localPredicate = predicate;
        localFilteredCustomers = new ArrayList<>(customers);
        //OR
        //this.localFilteredCustomers = customers;//new ArrayList<>();

    }

    @Override
    public boolean hasNext() {

        Customer customer = updatePosition(false);
        return customer != null;
    }

    @Override
    public Customer next() {
        return updatePosition(true);
    }


    private Customer updatePosition(boolean updatePosition)
    {
        int tempPosition = position;
        while (tempPosition < localFilteredCustomers.size()) {
            Customer customer = localFilteredCustomers.get(tempPosition);
            if (localPredicate.test(customer)) {
                if(updatePosition)
                    position = tempPosition +1;

                return customer;
            }
            else
                tempPosition++;

        }
        return null;
    }
}
