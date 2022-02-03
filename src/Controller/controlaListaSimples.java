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
    
    public void excluirNoFinalDaLista(){
        
        if(primeiro == null){
            System.out.println("Lista vazia!!");
        }else{
            
            if(contarNos()==1){
                
                primeiro = ultimo = null;
                System.out.println("Nó foi excluído! Lista vazia!");
                
            }else{
                
                No aux=primeiro;
                
                while(aux.prox!=ultimo){
                    aux = aux.prox;                    
                }
                
                ultimo = aux;
                ultimo.prox = null;
                System.out.println("Nó foi excluído!");
            }
            
        }
        
    }
    
    public int contarNos(){
        
        No aux=primeiro;
        int cont=0;
        
        while(aux != null){
            aux = aux.prox;
            cont++;
        }
        
        return cont;
        
    }    
    
    
    
}
