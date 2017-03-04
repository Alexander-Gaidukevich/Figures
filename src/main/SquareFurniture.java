package main;

import main.interfaces.Perimeter;

public class SquareFurniture extends Figure implements Perimeter {

    private int b;

    public SquareFurniture(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getPerimeter() {
        return (getA() + b) * 2;
    }

    //тустринг
}
