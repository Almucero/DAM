package Calculos;

public class Calculos {

    private double operando1;
    private double operando2;
    private String operador;
    private double memoria;

    public double getOperando1() {
        return operando1;
    }
    public void setOperando1(int operando1) {
        this.operando1 = operando1; 
    }
    public double getOperando2() {
        return operando2;
    }
    public String getOperador() {
        return operador;
    }
    public void setOperando2(int operando2) {
        this.operando2 = operando2; 
    }
    public void setOperador(String operador) {
        this.operador = operador; 
    }
    public double getMemoria() {
        if (this.operando1==null)
            this.operando1 = this.memoria;
        else if(this.operando2==null)
            this.operando2 = this.memoria;
    }
    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double getresultado() throws OperadorInvalido {
        if(this.operando1==null) {
            return 0;
        }
        else if (this.operador==null) {
            return this.operando1;
        }
        else if (this.operando2==null) {
            this.operando2=this.operando1;
        }
        switch(operador){
            case "+":
                this.resultado = this.resultado
            break;
            case "-":
            break;
            case "*":
            break;
            case "/":
            break;
            default:
                throw new OperadorInvalido();
        }
        return this.operando1;
    }



}
//set operando1 set operando2 set operador get resultado //switch con valor del operador(+, -, *, /, ...)
//operador -> (+ = 1, - = 2, * = 3, / = 4, ^ = 5)