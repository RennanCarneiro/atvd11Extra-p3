package atvd11Extra;

import java.util.ArrayList;

public class PilhaDeCaixas {
    private double alturaMax;
    private ArrayList<Caixa> pilhaDeCaixas = new ArrayList<Caixa>();

    public PilhaDeCaixas(double alturaMax){
        this.alturaMax = alturaMax;
    }

    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMax) {
        if (alturaMax > 0) {
            this.alturaMax = alturaMax;
        } else {
            System.out.println("A altura deve ser maior que zero");
        }
    }

    public boolean empilhar(Caixa novaCaixa) {
       double somatorioDasAlturas = 0;
       for (Caixa caixa : pilhaDeCaixas) {
            somatorioDasAlturas += caixa.getAltura(); 
       }

       if (somatorioDasAlturas + novaCaixa.getAltura() <= this.alturaMax) {
        this.pilhaDeCaixas.add(0, novaCaixa);
        System.out.println("Nova caixa empilhada com sucesso");
        return true;
       }

       System.out.println("Não foi possivel empilhar a nova caixa. Limite de altura maxima.");
       return false;
    }

    public Caixa desempilhar() {
        if (pilhaDeCaixas.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null; 
        } else {
            Caixa caixaDesempilhada = pilhaDeCaixas.remove(0);
            return caixaDesempilhada;
        } 
    }

    public double getAlturaAtual(){
        double alturaAtual = 0;
        for (Caixa caixa: pilhaDeCaixas){
            alturaAtual += caixa.getAltura();
        }
        return alturaAtual;
    }

    public double getPesoAtual(){
        double pesoAtual = 0;
        for (Caixa caixa: pilhaDeCaixas){
            pesoAtual += caixa.getPeso();
        }
        return pesoAtual;
    }

    public void exibirDados(){
        for (int i = 0; i < pilhaDeCaixas.size(); i++) {
            Caixa caixa = pilhaDeCaixas.get(i);
            System.out.println("caixa" + (i + 1) + ":");
            System.out.println(" Altura: " +caixa.getAltura() + " cm");
            System.out.println(" Peso: " + caixa.getPeso() + " kg");
        }
        System.out.println("Altura total da pilha: " + getAlturaAtual() + " cm.");
        System.out.println("Peso total da pilha: " + getPesoAtual() + " kg.");
    }
}

