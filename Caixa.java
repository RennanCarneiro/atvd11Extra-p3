package atvd11Extra;

public class Caixa {
    private String identificador;
    private String conteudo;
    private int peso;
    private int altura;
    public Caixa(String identificador, String conteudo, int peso, int altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        if(peso > 0){
           this.peso = peso;
        }else{
            System.out.println("Numero invalido");
        }
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        if(altura > 0)
        this.altura = altura;
        else{
            System.out.println("Numero invalido");
        }
    }
    public String exibirEtiqueta(){
        return("Identificador: " +  this.identificador + "\n" + 
        "Conteúdo: " + this.conteudo + "\n" + 
        "Peso em kg: " + this.peso + "\n" + 
        "Altura em Cm:" + this.altura + "\n");
     }
    
}
