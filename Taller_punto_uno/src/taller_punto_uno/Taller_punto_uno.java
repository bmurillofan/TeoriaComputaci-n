/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_punto_uno;

/**
 *
 * @author wezarkeVo
 */
public class Taller_punto_uno {
    
    
    public int index = 0;
    public boolean aceptacion = false;
    
    public boolean Evaluar(String Cadena){
        if (Cadena == "") { //Q0
            aceptacion = true;
        }else{   
            
            while (index < Cadena.length()) {                
                
                if (index < Cadena.length() && Cadena.charAt(index) == '0') {
                    index++;
                    while(index < Cadena.length() && Cadena.charAt(index) == '0') {                        
                        index++;
                    }
                    
                    if (index < Cadena.length() && Cadena.charAt(index) == '1') {
                        index++;
                            while(index < Cadena.length() && Cadena.charAt(index) == '0') {                        
                            index++;
                            }
                        if (index < Cadena.length() && Cadena.charAt(index) == '1') {
                            aceptacion = true;
                            index++;
                                while(index < Cadena.length() && Cadena.charAt(index) == '1') {                        
                                   index++;
                                }
                            aceptacion = true;
                               
                            if (index < Cadena.length() && Cadena.charAt(index) == '0') {
                                aceptacion = true;
                                index++;
                            }
                            
                        }else{
                           aceptacion = false;
                           break; 
                        }
                        
                    }else{
                        aceptacion = false;
                        break;
                    }
                    
                }else{
                  aceptacion = false;
                  break;
            
                }
                
            }
        }
        return aceptacion;
    }
    
    public static void main(String[] args) {
        Taller_punto_uno obj = new Taller_punto_uno();
        String Cadena = "00100011110";
        if (obj.Evaluar(Cadena)){ 
            System.out.println("Aceptada");
        }else{
            System.out.println("Rechazada");
        }
        
    }
    
}
