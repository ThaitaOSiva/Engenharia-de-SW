/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketmachine; 

import java.util.logging.Level;
import java.util.logging.Logger;

public class PapelMoeda {

    protected int valor;
    //protected int quantidade;
   // protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public PapelMoeda(int valor) throws PapelMoedaInvalidaException {
        //this.valor = valor;
        if ((valor == 2) || (valor == 5) || (valor == 10) || (valor==20) || (valor == 100)){
        this.valor = valor;
    }
        else
          throw new PapelMoedaInvalidaException();
    }


    public int getValor() {
        return valor;
    }

  
}