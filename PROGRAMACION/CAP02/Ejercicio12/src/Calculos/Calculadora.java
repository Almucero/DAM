package Calculos;

public class Calculadora {
    private double operando1;
    private double operando2;
    private char operador;

    //Constructor
    public Calculadora(double operando1) {
        this.operando1 = operando1;
    }

    //Getters y Setters
    public double getOperando1() {
        return operando1;
    }
    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public char getOperador() {
        return operador;
    }
    public void setOperador(char operador) {
        if (operador != '+' && operador != '-' && operador != 'x' && operador != '/' && operador !='q' && operador !='Q') {
            throw new IllegalArgumentException("Error: Operador no válido. Usa solo +, -, x o /");
        }
        this.operador = operador;
    }

    //Calculos
    public void calcular() {
        switch (operador) {
            case '+':
                this.operando1 = this.operando1 + this.operando2;
                break;
            case '-':
                this.operando1 = this.operando1 - this.operando2;
                break;
            case 'x':
                this.operando1 = this.operando1 * this.operando2;
                break;
            case '/':
                if (this.operando2 == 0) {
                    throw new ArithmeticException("Error: División por cero");
                }
                this.operando1 = this.operando1 / this.operando2;
                break;
            default:
        }
    }
}