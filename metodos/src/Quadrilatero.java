public class Quadrilatero{
double ladoQuad, areaQuad;
double lado1, lado2;
double baseMaior, baseMenor, altura;

public double areaQuadrado(double ladoQuad){
    return Math.pow(ladoQuad, 2);
}

public double areaRetangulo(double lado1, double lado2){
    return lado1 * lado2;
}

public double areaTrapezio(double baseMaior, double baseMenor, double altura){
    return ((baseMaior + baseMenor) * altura) / 2;
}
}