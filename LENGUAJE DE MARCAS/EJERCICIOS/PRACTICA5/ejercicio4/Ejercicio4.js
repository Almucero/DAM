function calcular() {
    const operando1 = parseFloat(document.getElementById("operando1").value);
    const operando2 = parseFloat(document.getElementById("operando2").value);
    const operador = document.getElementById("operador").value;
    let resultado;

    switch (operador) {
        case "+":
            resultado = operando1 + operando2;
            break;
        case "-":
            resultado = operando1 - operando2;
            break;
        case "*":
            resultado = operando1 * operando2;
            break;
        case "/":
            if (operando2==0) {
                resultado = "No se puede dividir entre 0"
            }
            else {
                resultado = operando1 / operando2;
            }
            break;
        default:
            resultado = "Operador no válido";
    }

    document.getElementById("resultado").value = resultado;
}