public class Figures {

    private static final Figures[] arrayOfFigures = new Figures[6];

    static {
        arrayOfFigures[0] = new Trapezium(1, 2, 3, 4);
        arrayOfFigures[1] = new Rectangle(5, 6, 7, 8);
        arrayOfFigures[2] = new Star(9, 10 ,11, 12);
        arrayOfFigures[3] = new Pentagon(13, 14, 15, 16);
        arrayOfFigures[4] = new Triangle(17, 18, 19, 20);
        arrayOfFigures[5] = new Circle(21, 22, 23, 24);
    }

    protected double x1;
    protected double x2;
    protected double y1;
    protected double y2;
    protected String nameOfFigure;

    public Figures(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.nameOfFigure = getClass().getName();
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public String getNameOfFigure() {
        return nameOfFigure;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setNameOfFigure(String nameOfFigure) {
        this.nameOfFigure = nameOfFigure;
    }

    public void output(){
        System.out.print(this.nameOfFigure + "(" + this.x1 + ", " + this.y1 + ", " + this.x2 + ", " + this.y2 + ") ");
    };

    public static void main(String[] args) {
        for (Figures temporaryFigure: arrayOfFigures) {
            temporaryFigure.output();
        }
    }
}
