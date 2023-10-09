package atvd11Extra;

public class Teste {
    public static void main(String[] args) {
        PilhaDeCaixas pilha = new PilhaDeCaixas(100.00);

        Caixa caixa1 = new Caixa("1312783", "uva", 30, 60);
        Caixa caixa2 = new Caixa("3425313223", "manga", 50, 40);
        
        System.out.println(caixa1.exibirEtiqueta());
        System.out.println(caixa2.exibirEtiqueta());
       
        pilha.empilhar(caixa1);
        pilha.empilhar(caixa2);
        
        System.out.println("");

        pilha.exibirDados();

        Caixa caixaDesempilhada = pilha.desempilhar();
        System.out.println("Caixa desempilhada");
        System.out.println("Altura: " + caixaDesempilhada.getAltura());
        System.out.println("Peso:" + caixaDesempilhada.getPeso());

        double alturaAtual = pilha.getAlturaAtual();
        double pesoAtual = pilha.getPesoAtual();
        System.out.println("Altura atual: " + alturaAtual + " Cm");
        System.out.println("Peso atual: " + pesoAtual + " Kg");

    }
    }

