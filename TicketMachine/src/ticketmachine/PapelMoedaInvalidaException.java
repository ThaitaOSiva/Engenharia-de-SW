/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticketmachine;

 
public class PapelMoedaInvalidaException extends Exception {
    private String mensagem;
    
   public  PapelMoedaInvalidaException() {
    mensagem = "Moeda Inválida";
    }
    
    @Override
   public String getMessage() {
       return mensagem;
   }
}
