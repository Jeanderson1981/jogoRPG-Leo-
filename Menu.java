/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalha;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Menu {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Dados meusDados = new Dados();
        
        
        meusDados.rolarDados(sc);
        
        
    }
}




/*
Atributos por Rolagem de Dados:

Os valores dos atributos devem ser determinados pela rolagem de dados, com cada classe ganhando um número diferente de dados para cada atributo.
O jogador deverá escolher a opção "Rolar Dados" sempre que for necessário definir ou verificar atributos.
*/