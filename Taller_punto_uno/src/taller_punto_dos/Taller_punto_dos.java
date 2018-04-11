/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_punto_dos;

/**
 *
 * @author wezarkeVo
 */
public class Taller_punto_dos {
    
    public int index = 0;
    public boolean aceptacion = false;
    
    
     public boolean Evaluar(String Cadena){
        
           
            while (index < Cadena.length()) {                
                
                if (index < Cadena.length() && Cadena.charAt(index) == 'a') {
                    index++; 
                    if (index < Cadena.length() && Cadena.charAt(index) == 'b') {
                        index++;
                        aceptacion = true;
                            index++;   
                    }else{
                        aceptacion = false;
                        break;
                    }
                }else{
                    //Hello
                }
                
            }
            return aceptacion;
     }
    
    
    public static void main(String[] args) {
        Taller_punto_dos obj = new Taller_punto_dos();
        String Cadena = "abcbab";
        if (obj.Evaluar(Cadena)){ 
            System.out.println("Aceptada");
        }else{
            System.out.println("Rechazada");
        }
        
    }
}
