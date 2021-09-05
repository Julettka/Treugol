public class Triangle {
    public static void pl(int a, int b, int c) {
        double pp = ((double) (a + b + c) / 2);
        double x = (pp * (pp - a) * (pp - b) * (pp - c));
        if (x>0 && a > 0 && b > 0 && c > 0) {
            double s = Math.sqrt(x);
            System.out.println("The area of the triangle is " + s);
        } else {
            System.out.println("Triangle does not exist");
        }
    }
}
