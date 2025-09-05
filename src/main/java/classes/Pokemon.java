/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;



/**
 *
 * @author pedro
 */
public class Pokemon {

    public Pokemon() {
    }
    private int numero;
    private String nome;
    private String tipo1;
    private String tipo2;
    private int vida;
    private float peso;
    private int altura; //altura em centimetros
    private boolean evolui;
    
    public Pokemon(int numero, String nome,
            String tipo1, String tipo2, 
            int vida, float peso, 
            int altura, boolean evolui){
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.vida = vida;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
        
    }
    public Pokemon(int numero, String nome,
            String tipo1,
            int vida, float peso, 
            int altura, boolean evolui){
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = null;
        this.vida = vida;
        this.peso = peso;
        this.altura = altura;
        this.evolui = evolui;
  
        
    }
    
    public String getNome(){
        return this.nome;
    }
}



