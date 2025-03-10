package Lab04G.main;

public class Product extends Component{

    int price;
    public Product(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
