public class GreenPen implements DrawingAPI{
    @Override
    public void drawCircle(int rad, int x, int y) {
        System.out.println("Its colour is green, radius = " + rad + ", x = " + x + ", y = " + y);
    }
}
