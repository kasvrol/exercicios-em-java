public class Calculadora {
    public static void calculadora(double parameter1, double parameter2, String operation){
	if(operation == "soma"){
        double resultado = parameter1 + parameter2
        System.out.println( "A soma dos números é" + resultado);
    }   else if(operation == "subtração" && parameter2!=0){
    double resultado = parameter1 - parameter2
    System.out.println( "A subtração dos números é" + resultado);
    }   else if(operation == "divisão"){
    double resultado = parameter1 * parameter2
    System.out.println( "A divisão dos números é" + resultado);
    }   else    {
    System.out.println( "Essa operação não existe");
    }}
}

//bootcamp "Québec Java Digital", curso "Entendendo Métodos Java", exercício "Calculadora"