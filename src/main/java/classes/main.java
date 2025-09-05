/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;

/**
 *
 * @author pedro
 */
public class main {

    public static void main(String[] args) {
        //Pokemon(Numero, Nome, Tipo1, Tipo2?, vida, peso, altura, evolui)
        Pokemon novoPoke = new Pokemon(1, "Pikachu","Eletrico", 35, 6,40,true);
        System.out.println(novoPoke.getNome());
    }
}
