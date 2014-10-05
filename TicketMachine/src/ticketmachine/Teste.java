package ticketmachine;

public class Teste {

/**
* Caio Remedio
* Larissa Rayane
* Thalita Silva
* Júlia Vilarindo Fuzetti
* Katarina Andrade
*teste
* 
*  Comentarios:
* Não deveria ser permitido instancia o papelMoeda e definir a quantidade.
* A quantidade de papel moeda deveria ser incrementada quando o cliente depositada uma quantia na máquina
* A classe TicketMachine deveria ser singleton para restringir a chamada de diferentes máquinas
* A classes de exceções não tratam os erros, ou seja, não apresentam uma mensagem que um usuario leigo entenda. Caso aconteça
    * um erro a maquina mostrará um erro previamente definido pela linguagem quando o certo seria mostrar algo como "Moeda Invalida".
*A programação não segue os diagramas UML
*O construtor da classe Troco possui lógica quando ele só deveria servir para ser instaciado, a recomendação é que se crie métodos, isolando o construtor dessa função.
* A logica que esta no construtor da classe troco além de estar no lugar errado, não alterar os resultados da aplicação 
* ainda faz com que a aplicação fique em modo "RUN" por tanto tempo que só apareceu "Construido com sucesso" quando
* apagamos a linha de codigo que faz a instanciação do obejto.
* A lógica para devolver o troco do cliente deveria ser baseado no preço do bilhete
* O metodo inserir da classe TicketMachine deveria receber um PapelMoeda e a classe PapelMoeda deveria ter um unico construtor
* sem a quantidade, somente o valor da moeda.
* O metodo getTroco da classe TicketMachine sempre retorna null

*/
    public static void main(String[] args) {
        // TODO code application logic here
        
      
    }
    
}
