public class BridgePatternDemo {
    public  static void main(String[] args) {
        Shape redC = new Circle(0, 0, 5, new RedPen());
        Shape greenC = new Circle(10, 10, 10, new GreenPen());

        redC.draw();
        greenC.draw();
    }
}
