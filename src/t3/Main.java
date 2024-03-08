package t3;

public class Main {
    // Clase abstracta Figura
    public abstract static class Figura {
        protected int numeroDeLados;

        public Figura(int numeroDeLados) {
            this.numeroDeLados = numeroDeLados;
        }

        public abstract double calcularArea();
    }

    // Subclases de Figura
    public static class Cuadrado extends Figura {
        private double lado;

        public Cuadrado(double lado) {
            super(4);
            this.lado = lado;
        }

        @Override
        public double calcularArea() {
            return lado * lado;
        }
    }

    public static class Circulo extends Figura {
        private double radio;

        public Circulo(double radio) {
            super(0);
            this.radio = radio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    public static class Triangulo extends Figura {
        private double base;
        private double altura;

        public Triangulo(double base, double altura) {
            super(3);
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }
    }

    // Uso de las clases
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Cuadrado(5);
        figuras[1] = new Circulo(3);
        figuras[2] = new Triangulo(4, 6);

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getClass().getSimpleName() + ", Área: " + figura.calcularArea());
        }
    }
}
