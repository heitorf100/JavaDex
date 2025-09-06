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
        
        Pokemon novoPokemon = new Pokemon(155, "Cyndaquil", "Fogo", 60, 7.9f, 50, true);
        System.out.println(novoPokemon.getNumero() + "\n" + novoPokemon.getNome() + "\n" +novoPokemon.getTipo1() + "\n" +novoPokemon.getVida()
        +"\n" + novoPokemon.getPeso() + "\n" +novoPokemon.getAltura());
        
    }
}
