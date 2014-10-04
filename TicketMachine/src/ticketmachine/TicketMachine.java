/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketmachine;

import java.util.Iterator;


public class TicketMachine {

    protected int valorBilhete;
    protected int saldo;
    
    

     TicketMachine(int valor) {
        this.valorBilhete = valor;
        this.saldo = 0;
    }
/*Erro abaixo*/
    public void inserir( PapelMoeda papelMoeda) throws PapelMoedaInvalidaException {
        int aux=0;
        aux = papelMoeda.getValor();
        saldo= saldo+ aux;
        }

    public int getSaldo() {
        return saldo;
    }
/*Erro: Esse método retorna sempre NULL, não há logica de retorno*/
    public void getTroco() {
       
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valorBilhete) {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
    
    
}