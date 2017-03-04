import main.CircleFurniture;
import main.SquareFurniture;

/*1.Создать абстрактный класс Figure с полем a - сторона. (для класса CircleFurniture это значение подразумевается - радиус).
2.Создать конструктор с параметром.(get, set, equals, hashcode, toString).
3.Cоздать классы SquareFurniture, CircleFurniture, которые наследуются от Figure.Добавить в SquareFurniture поле – b – вторая сторона.
4.Создать абстрактный метод в Figure для подсчета площади getSquareFigure(), соответственно переопределить в потомках.
5.Создать интерфейс с методом getPerimeter(), возвращающий периметр фигуры.Реализовать интерфейс у классов потомков.
6.Создать по 1 объекту классов потомков. Вывести всю информацию (объект, площадь, периметр).
*/
public class Run {

    public static void main(String[] args) {

        SquareFurniture squareFurniture = new SquareFurniture(2,2);
        System.out.println("object: " + squareFurniture);

        int perimeter = squareFurniture.getPerimeter();

       // squareFurniture.

        System.out.println("perimeter: " + squareFurniture.getPerimeter());
        System.out.println("perimeter: " + perimeter);


//        System.out.println("area: " + squareFurniture());
//        System.out.println("perimeter: " + squareFurniture());
//
//        CircleFurniture circleFurniture = new CircleFurniture("");
//        System.out.println("object: " + circleFurniture());
//        System.out.println("area: " + circleFurniture());
//        System.out.println("perimeter: " + circleFurniture());

    }
}
