public class Circle extends Shape{
    private int rad;
    private int x, y;

    public Circle(int rad, int x, int y, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public String draw() {
        System.out.println("Circle created");
        drawingAPI.drawCircle(rad, x, y);
        return "At UML draw method returns String, but in fact its useless";
    }
}
