/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.No;

/**
 *
 * @author Davi
 */
public class controlaListaSimples {
    
    No primeiro,ultimo;

    public controlaListaSimples() {
        primeiro = ultimo = null;
    }
    
    public void inserirNoFinalDaLista(No novoNo){
        
        //lista vazia
        if(primeiro == null){  
            
            primeiro = novoNo;
            ultimo = novoNo;
            
        }else{
            
            ultimo.prox = novoNo;
            ultimo = novoNo;
            
        }
        
    }    
    
    public void alterarNoFinalDaLista(No noAtualizado){
        
        ultimo.nome = noAtualizado.nome;
        ultimo.cpf = noAtualizado.cpf;
        
    }
    
    public void visualizarNos() {

        if (primeiro == null) {
            System.out.println("Lista vazia!");
        } else {

            No aux = primeiro;
            int pos = 1;

            while (aux != null) {

                System.out.println("Pos: " + pos + "\n\tNome: " + aux.nome + "\n\tCPF: " + aux.cpf);
                aux = aux.prox;
                pos++;

            }

        }

    }    
    
    public No visualizarUltimoNoLista(){
        
        return ultimo;
        
    }
    
    
    
}
