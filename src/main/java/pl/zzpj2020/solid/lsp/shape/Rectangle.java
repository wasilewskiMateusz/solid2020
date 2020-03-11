package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape {

    private double firstSide;
    private double secondSide;

    public double getSecondSide() {
        return secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return this.getSecondSide() * this.getFirstSide();
    }

    @Override
    public double calculateCircumference() {
        return 2 * this.getSecondSide() + 2 * this.getFirstSide();
    }
}