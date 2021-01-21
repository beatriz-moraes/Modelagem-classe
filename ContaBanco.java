package contabanco; 

/**
 *
 * @author Beatriz
 */
public class ContaBanco {
    
    public static void main(String[] args) {
        Banco bia = new Banco();
        bia.setNumConta(1234);
        bia.setDono("Beatriz Morais");
        bia.abrir_Conta("cc");
        bia.getSaldo();
        bia.depositar(300);
        
        Banco lu = new Banco();
        lu.setNumConta(4321);
        lu.setDono("Luzia Morais");
        lu.abrir_Conta("cp");
        lu.getSaldo();
        lu.depositar(100);
        
        bia.sacar(50);
        lu.sacar(50);
        bia.mostra();
        lu.mostra();
        
       
    }
    
}
