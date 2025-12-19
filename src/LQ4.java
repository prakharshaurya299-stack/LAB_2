
import java.util.Scanner;

class Rectangle {

    int length, breadth;
    int area, perimeter;

    void read() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}

class CODES4 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.read();
        r.calculate();
        r.display();
    }
}