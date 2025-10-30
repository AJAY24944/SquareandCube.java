public class SquareandCube {
    static int num = 5;
    public static int square() {
        return num*num;
    }
    public static int cube() {
        int a = square();
        int b = a*num;
        System.out.println("Cube of the number : "+b);
        return b;
    }
    public static void main(String[] args) {
        cube();
    }

}
