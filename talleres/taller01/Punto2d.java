import java.lang.Math;

class Punto {

private double x, y;
    public Punto(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;

    }

    public double radioPolar() {
      double radio = Math.sqrt((getX())+(getY()));
      System.out.println("Radio: "+radio);
      return radio;
    }

    public double anguloPolar() {
      double angulo = Math.atan(getX()/getY());
      System.out.println("Angulo: "+angulo);
      return angulo;
    }

    public double distanciaEuclidiana(Punto otro) {
        double radio = Math.sqrt(otro.getX()+otro.getY());
      System.out.println("Distancia: "+radio);
      return radio;
    }

}

class Main {

  static Punto obj = new Punto(15, 69);
  static Punto obj2 = new Punto(30, 120);

  public static void main(String[] args) {

    obj.radioPolar();
    obj.anguloPolar();
    obj.distanciaEuclidiana(obj2);
  }
}