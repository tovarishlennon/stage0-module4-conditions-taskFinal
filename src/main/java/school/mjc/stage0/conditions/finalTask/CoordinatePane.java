package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String result = x > 0 && y > 0 ? "first" : x < 0 && y >= 0 ? "second" : x < 0 && y < 0 ? "third" : x >= 0 && y < 0 ? "fourth" : x == 0 && y == 0 ? "zero" : "none";
        switch (result) {
            case "first":
                System.out.println("first");
                break;
            case "second":
                System.out.println("second");
                break;
            case "third":
                System.out.println("third");
                break;
            case "fourth":
                System.out.println("fourth");
                break;
            default:
                System.out.println("zero");
                break;
        }
    }
}
