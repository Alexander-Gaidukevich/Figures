package main;

import main.interfaces.Perimeter;

public class CircleFurniture extends Figure implements Perimeter{

    public CircleFurniture(int a) {
        super(a);
    }

    @Override
    public int getPerimeter() {
        return 0;
    }
}