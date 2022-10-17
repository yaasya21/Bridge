public class RedPen implements DrawingAPI{
    @Override
    public void drawCircle(int rad, int x, int y) {
        System.out.println("Its colour is red, radius = " + rad + ", x = " + x + ", y = " + y);
    }
}
