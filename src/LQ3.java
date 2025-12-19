import java.util.Scanner;

class Box {

    double length, width, height;

    void volume() {
        double vol = length * width * height;
        System.out.println("Volume = " + vol);
    }
}

class LQ3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box b = new Box();

        b.length = sc.nextDouble();
        b.width = sc.nextDouble();
        b.height = sc.nextDouble();

        b.volume();
    }
}
