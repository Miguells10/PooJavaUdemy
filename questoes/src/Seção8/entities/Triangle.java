package Seção8.entities;

public class Triangle {

        public double a;
        public double b;
        public double c;

    public double Area() {
        // Verificar se os lados formam um triângulo válido
        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("These sides do not form a valid triangle.");
            return -1; // Retorna um valor inválido para indicar erro
        }

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    }



