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
public class Dados {
    
    public int rolarDados(Scanner scanner){
    
    System.out.println("Pressione Enter para rolar o dado.");
    scanner.nextLine();
    int resultado = (int) (Math.random()*6) + 1;
    System.out.println("Você rolou " + resultado);
    return resultado;
    
    }
}
