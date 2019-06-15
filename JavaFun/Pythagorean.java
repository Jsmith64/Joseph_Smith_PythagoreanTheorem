public class Pythagorean {

    public double calculateHypotenuse(int legA, int legB) {
        double a = legA;
        double b = legB;
        double c = (a * a) + (b * b);
        return Math.sqrt(c);

    }

    public static void main(String[] args) {
    }
}