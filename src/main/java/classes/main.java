/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classes;
import database.database;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pedro
 */
public class main {

    public static void main(String[] args) {
       database bd = new database();
       List<Pokemon> pokemons;      
       Pokemon achado = bd.buscaPokemon(155);
       System.out.println(achado.toString());
        
    }
    
}
