public class Emprestimo {
    public static double getTaxaDuasParcelas() {

        return 1.5;
    }

    public static double getTaxaTresParcelas() {

        return 3;
    }

    public static double getTaxaQuatroParcelas() {

        return 6;
    }

    public static double getTaxaCincoParcelas() {

        return 12;
    }

    public static void valorDoEmprestimo(int parcelas, double valorEmprestado){
	if(parcelas == 2){
        double resultado = valorEmprestado + (valorEmprestado*getTaxaDuasParcelas());
        System.out.println( "O valor total a pagar do empréstimo é:" + resultado);
    }   else if(parcelas == 3){
        double resultado= valorEmprestado + (valorEmprestado*getTaxaTresParcelas());
        System.out.println( "O valor total a pagar do empréstimo é:" + resultado);
    }  else if(parcelas == 4)    {
        double resultado =  valorEmprestado + (valorEmprestado*getTaxaQuatroParcelas());
        System.out.println( "O valor total a pagar do empréstimo é:" + resultado);
    }else if(parcelas == 5)    {
        double resultado =  valorEmprestado + (valorEmprestado*getTaxaCincoParcelas());
        System.out.println( "O valor total a pagar do empréstimo é:" + resultado);
    } else {
        System.out.println("Quantidade de parcelas não aceita.");
    }}
}

//bootcamp "Québec Java Digital", curso "Entendendo Métodos Java", exercício "Emprestimo"