package secao8.aulasetenta.exercicios.um;

public class Retangulo {
    
    public double height;
    public double width;

    public double area(){
        return width * height;
    }
    
    public double perimeter(){
        return 2*width + 2*height;
    }
    
    public double diagonal(){
        return Math.sqrt(width*width + height*height);
    }

}