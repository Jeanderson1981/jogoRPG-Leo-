/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalha;

/**
 *
 * @author Lenovo
 */

class Guerreiro extends Personagem {
            
           public Guerreiro(String nome, int vida, int ataque) {
               
           super(nome,vida,ataque);
           }
           
           public void lançarPedra(Personagem oponente) {
               
               oponente.vida -= this.ataque *2;
               System.out.println(this.nome + " Pedra Lançada " + oponente.nome + " causado " + (this.ataque *2) + "de dano");
               
               
               
    


}
    
    
}




