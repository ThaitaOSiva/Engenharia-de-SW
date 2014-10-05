/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketmachine;

import java.util.Iterator;


public final class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};
    protected Troco troco;
    private TicketMachine instance = null; //Singleton
    
    private TicketMachine(int valor){
        this.valor = valor;
        this.saldo = 0;
    }
    public TicketMachine getInstance(int valor){  
        if(instance == null)  //Singleton: cria TicketMachine 
            return instance = new TicketMachine(valor);
        return instance;
    }
    public void inserir(int quantia) throws PapelMoedaInvalidaException{
        boolean achou = false;
        for(int i = 0; i < papelMoeda.length && !achou; i++){
            if(papelMoeda[i] == quantia)             //O correto deveria ser papelMoeda[i], 
                achou = true;                        // pois ele não está procurando se a nota aceita, 
        }                                            //nesse caso apenas a nota de 5 é aceita pela máquina.
        if (!achou)
            throw new PapelMoedaInvalidaException();
        this.saldo += quantia;
    }
    public int getSaldo() {
        return saldo;
    }
    /*Erro: Esse método retorna sempre NULL, não há logica de retorno*/
    // public Iterator<Integer> getTroco() {
    //    return null; 
    // }
    public int getTroco() { // minha proposta de solução (Katarina)
        int t = 0;
        for(int i = 0; i < papelMoeda.length; i++){
            if((valor > papelMoeda[i]) || (valor > papelMoeda[i]))
                t = valor - papelMoeda[i];
        }
        return t;
    }   

    public String imprimir() throws SaldoInsuficienteException {
        if(saldo < valor)
            throw new SaldoInsuficienteException();
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n"; 
        return result;
    }
}