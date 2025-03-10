package Lab04G.main;

import java.util.ArrayList;
import java.util.List;

public class Category extends Component{

    List<Component> components = new ArrayList<>();

    public Category(String name) {
        super(name);
    }

    public void addComponent(Component component) {
        components.add(component);
    }
    public List<Component> getComponents() {
        return components;
    }
    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void print() {
        System.out.println("Category: " +  this.getName() );

        for (Component component : components) {
            component.print();
        }
    }
}
