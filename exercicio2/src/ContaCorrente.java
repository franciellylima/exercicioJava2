public class ContaCorrente {

    double saldo =  0;
    Cliente titular;

    public void depositar( double valor ) {
    saldo += valor;
    }
    public void retirar ( double valor ){
        saldo -= valor;
    }
    public double retornarSaldo (){
        return saldo;
    }


}
