package Lab04G.main;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {

    // categories
    // products

    List<Component> components = new ArrayList<>();
    public ProductCatalog() {

    }

    public void addComponent(Component component) {
        components.add(component);
    }

}
