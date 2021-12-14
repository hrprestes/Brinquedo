/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAMSUNG
 */
public class controleRemoto {
    
    private Brinquedo brinquedo;
    
    public controleRemoto(Brinquedo b){
     brinquedo = b;
    }
    public void mover(){
        brinquedo.mover();
    }
}
