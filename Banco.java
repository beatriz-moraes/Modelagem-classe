package contabanco;

/**
 *
 * @author Beatriz
 */
public class Banco {
    //Atributos
    public int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Método construtor
    public Banco() {
    this.saldo = 0;
    this.status = false;
    }
    
   // Métodos personalizados
// -----------------------------------------------------------------------------

public void abrir_Conta(String tipo){
    this.setTipo(tipo);
    this.setStatus(true);
    if (tipo == "cc"){
        this.setSaldo(50);
    }else if (tipo =="cp"){
            this.setSaldo(150);
    }
}
// -----------------------------------------------------------------------------

public void fechar_conta(float saldo){
    if (saldo < 0){
        System.out.println("Você não pode fechar sua conta pois o seu saldo é negativo, regularize antes de fechar!");
    } else{ 
        if(saldo > 0){
        System.out.println("Você não pode fechar sua conta, pois você possui dinheiro nela!");
        }
        else {
            status = false; 
            System.out.println("Conta fechada com sucesso!");
    }
      }
}
// -----------------------------------------------------------------------------

public void sacar(float saldo){
    if(this.getStatus()){
        if (this.getSaldo() >= saldo) {
            this.setSaldo(this.getSaldo() - saldo);
            System.out.println("Saque realizado na conta de " +this.getDono());
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("Saldo insufuciente para sacar!");
        }
    }else{
        System.out.println("Saldo insuficiente para saque!");
    }
}
//-----------------------------------------------------------------------------
public void depositar (float valor){
    if (this.getStatus()){
        //this.saldo = this.saldo + valor;
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso na conta de: " + this.getDono());
        System.out.println("--------------------------------------------------");
    } else{
    System.out.println("Impossivel depositar em uma conta fechada!");
}
}

//------------------------------------------------------------------------------
public void pagarMensal( ){
    float v=0;
    if (tipo == "cc"){
        v = 12;
    }if (tipo == "cp"){
        v = 20;
    }
    if (status == true){
        if (saldo > v){
            saldo = saldo - v;
            System.out.println("Mensalidade paga com sucesso!");
        } else{
            System.out.println("Impossivel pagar!");
        }
    }
}
// -----------------------------------------------------------------------------
   
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 

    public boolean getStatus() {
        return status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    
    public void mostra(){
        System.out.println("Seja bem vinda, sua conta foi criada!");
        System.out.println("Seu nome é: " + this.getDono()); 
        System.out.println("Tipo: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("----------------------------");
}

}
