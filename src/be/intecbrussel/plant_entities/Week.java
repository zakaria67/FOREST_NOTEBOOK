package be.intecbrussel.the_notebook;

public class Week extends Plant{

    private double area;

    public Week(String name) {
        super(name);
    }

    public Week(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Week{" +
                "area=" + area +
                '}';
    }
}
