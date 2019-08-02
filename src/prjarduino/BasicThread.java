/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjarduino;
import com.prjArduino.interfaces.TelaInicial.*;
import static com.prjArduino.interfaces.TelaInicial.inicio;

/**
 *
 * @author RainMan
 */
public class BasicThread implements Runnable{

    @Override
    public void run() {
        inicio.enviaDados(8);
                inicio.enviaDados(10);
                inicio.enviaDados(12);
                
                    
                    while(true){  
                        try {

                                piscinaazul=true;
                                inicio.enviaDados(7);
                                Thread.sleep(1000);
                                piscinaazul=false;
                                inicio.enviaDados(8);
                                piscinaverde=true;
                                inicio.enviaDados(11);
                                Thread.sleep(1000);
                                piscinaverde=false;
                                inicio.enviaDados(12);
                                piscinavermelha=true;
                                inicio.enviaDados(9);
                                Thread.sleep(1000);
                                piscinavermelha=false;
                                inicio.enviaDados(10);

                            } 
                            catch (InterruptedException e) {

                            }
    }
    
    
}
