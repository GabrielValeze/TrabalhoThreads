/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitcoin;

/**
 *
 * @author soja
 */
public class Cliente extends Thread{
    
    private double dinheiroCliente=1000000;
    private double bitcoinCliente;

    Corretora buffer;
    
    public Cliente(Corretora corretora){
        buffer = corretora;
    }
    
    public double comprar(double dinheiroCliente){
        double valor = getBitcoinCliente() * 0.01;
        dinheiroCliente = dinheiroCliente - valor; 
        this.buffer.setBitcoinCorretora(valor/0.01);
        
        
        return this.buffer.getBitcoinCorretora();
    }
    
    public double vender(double bitcoinCliente){
        double valor = bitcoinCliente * 0.01;
        valor = getDinheiroCliente();
        bitcoinCliente = bitcoinCliente-(valor*0.01);
        this.buffer.setBitcoinCorretora(valor*0.1);
        return this.buffer.getDinheiroCorretora();
    }

    /**
     * @return the dinheiroCliente
     */
    public double getDinheiroCliente() {
        return dinheiroCliente;
    }

    /**
     * @param dinheiroCliente the dinheiroCliente to set
     */
    public void setDinheiroCliente(double dinheiroCliente) {
        this.dinheiroCliente = dinheiroCliente;
    }

    /**
     * @return the bitcoinCliente
     */
    public double getBitcoinCliente() {
        return bitcoinCliente;
    }

    /**
     * @param bitcoinCliente the bitcoinCliente to set
     */
    public void setBitcoinCliente(double bitcoinCliente) {
        this.bitcoinCliente = bitcoinCliente;
    }

}
