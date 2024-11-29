/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalha;

/**
 *
 * @author Lenovo
 */
 class Arqueiro extends Personagem {
            
           public Arqueiro(String nome) {
               
           super(nome, 90, 20);
           }
           
           public void lançarFlecha(Personagem oponente) {
               
               oponente.vida -= this.ataque *2;
               System.out.println(this.nome + " Flecha Lançada " + oponente.nome + " causado " + (this.ataque *2) + "de dano");
               
           }

    
 }