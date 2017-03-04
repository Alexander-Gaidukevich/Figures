package main;

public class Figure {

    private int a;

    public Figure(int a) {
        this.a = this.a;
    }//constructor

    public int getA() {
        return a;
    }//get

    public void setA(int a) {
        this.a = a;
    }//set

    //твой метод любой

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        return a == figure.a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "a=" + a +
                '}';
    }
}
