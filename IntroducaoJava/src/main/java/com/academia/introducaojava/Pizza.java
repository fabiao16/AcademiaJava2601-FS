package com.academia.introducaojava;

import java.util.ArrayList;


public class Pizza {
        String nome;
        char tamanho;//'S','M,'L','XL';
        double preco;
        
        public PizzaController ingredientes;
        
        public Pizza(String nome){
                this.nome=nome;
                ingredientes = new PizzaController();
                
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public char getTamanho() {
                return tamanho;
        }

        public String setTamanho(int medida) {
                switch(medida) {
        case 1:
        tamanho = 'S'; 
        break;
        case 2:
        tamanho = 'M';
        break;
        case 3:
        tamanho = 'L';
        break;
        default:
        }
        return "tamanho nao exitente";
        }
        
        public double getPreco() {
                return preco;
        }

        public double setPreco(double preco,int quantidade) {
                double total = preco*quantidade;
                return total;
        }
        
        
        
        
}
