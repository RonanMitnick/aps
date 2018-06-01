package aps;


public class BeneficiarioBolsaFamilia extends Beneficiario  implements Avaliacao {
    String nome;
    String cpf;
    int nPessoas;
    Double renda;
    public BeneficiarioBolsaFamilia(String nome, String cpf, int nPessoas, Double renda){
        super(nome,cpf,nPessoas,renda);
        
        
    }
    public void Avaliacao(){
        
    }
    
}
