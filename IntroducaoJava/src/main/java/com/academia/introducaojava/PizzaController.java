package com.academia.introducaojava;

import java.util.ArrayList;

public class PizzaController {
        public ArrayList<Ingrediente> ingredientes;
       
        public PizzaController(){
                ingredientes = new ArrayList<>();
        }
        
        public void adicionarIngrediente(Ingrediente ingrediente){
                ingredientes.add(ingrediente);
        }
        public void excluirIngrediente (Ingrediente ingrediente){
                ingredientes.remove(ingrediente);
        }
        public Ingrediente pesquisarIngrediente(int posicao){
                return ingredientes.get(posicao);
        }
        public int listaIgredientes(){
                return ingredientes.size();
        }
}
