
package ejerciciotriangulo;

public class triangulo {
    
    public abstract class Figura2D {
    private int numeroLados;

    public Figura2D(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public abstract double area();
}

    public class Triangulo extends Figura2D {
    private Punto2D p1, p2, p3;

    public Triangulo(Punto2D p1, Punto2D p2, Punto2D p3) {
        super(3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double area() {
        double a = Punto2D.distancia(p1, p2);
        double b = Punto2D.distancia(p2, p3);
        double c = Punto2D.distancia(p3, p1);
        double s = (a + b + c) / 2;
        return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}

    public class Punto2D {
    private double x, y;

    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distancia(Punto2D p1, Punto2D p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
    public double perimetro() {
        double a = Punto2D.distancia(p1, p2);
        double b = Punto2D.distancia(p2, p3);
        double c = Punto2D.distancia(p3, p1);
        return a + b + c;
    }
    public boolean esTriangulo() {
        double a = Punto2D.distancia(p1, p2);
        double b = Punto2D.distancia(p2, p3);
        double c = Punto2D.distancia(p3, p1);
        return a + b > c && a + c > b && b + c > a;
    }
    public String tipoTriangulo() {
        double a = Punto2D.distancia(p1, p2);
        double b = Punto2D.distancia(p2, p3);
        double c = Punto2D.distancia(p3, p1);

        if (!esTriangulo()) {
            return "NO_TRIANGULO";
        } else if (a == b && b == c) {
            return "EQUILATERO";
        } else if (a == b || b == c || c == a) {
            return "ISOSCELES";
        } else {
            return "ESCALENO";
        }
    }
    
    
    
    
    
    
    
    



 
    
    





    
}
