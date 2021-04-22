package ejer_github;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Formatos {
    
    public static void main(String[] args){
        String cabecera="\n\tPronostico de clima:\n";
        cabecera+="\n\tDía\t\tMañana\tNoche\t\tCondiciones\n";
        cabecera+="\t---\t\t-----\t------\t\t------\n";
        String pronostico="\tDoming\t25C\t\t33C\t\tSoleado\n";
        pronostico+="\tLunes\t18C\t\t19C\t\tNublado\n";
        pronostico+="\tMartes\t40C\t\t29C\t\tCaluroso\n";
             
        System.out.print(cabecera+pronostico);
    }
    
}
