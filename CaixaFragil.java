package atvd11Extra;

public class CaixaFragil extends Caixa{
    private double pesoMaxSuportado;

    public CaixaFragil(String identificador, String conteudo, int peso, int altura, double pesoMaxSuportado) {
        super(identificador, conteudo, peso, altura);
        this.pesoMaxSuportado = pesoMaxSuportado;
    }

    public double getPesoMaxSuportado() {
        return pesoMaxSuportado;
    }

    public void setPesoMaxSuportado(double pesoMaxSuportado) {
        if(pesoMaxSuportado > 0){
            this.pesoMaxSuportado = pesoMaxSuportado;
         }else{
             System.out.println("Numero invalido");
         }
    }
    
    public void exibirEtiqueta(){
        super.exibirEtiqueta();
        System.out.println("Peso máximo suportado pela caixa: " + pesoMaxSuportado + " Kg");
    }
    
}
