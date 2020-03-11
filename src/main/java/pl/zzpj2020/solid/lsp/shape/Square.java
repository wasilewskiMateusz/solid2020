package pl.zzpj2020.solid.lsp.shape;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateCircumference(){
        return 4 * side;
    }

    @Override
    public double calculateArea(){
        return side * side;
    }
}