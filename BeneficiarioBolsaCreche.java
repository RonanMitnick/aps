package aps;

/**
 *
 * @author Matheus
 */
public class BeneficiarioBolsaCreche extends Beneficiario implements Avaliacao{
    private int nFilhos;
    private String nomeFilho;
    private int idadeFilho;
   
            
   public BeneficiarioBolsaCreche(String nome, String cpf,int nPessoas, int nFilhos,  Double renda){
       super(nome,cpf,nPessoas,renda);
       this.nFilhos = nFilhos;
   
         
        
    }

    
    public void Avaliacao(){

   
}
}
