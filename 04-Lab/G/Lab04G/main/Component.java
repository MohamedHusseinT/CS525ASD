package Lab04G.main;

public class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void print()
    {
        System.out.println(" " + this.name);

    }

}
