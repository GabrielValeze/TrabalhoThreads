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
public class Corretora {
    
    private double bitcoinCorretora = 100;
    private double dinheiroCorretora;
    double valorEmReal;
    
    Cliente buffer;
    
    public Corretora(){
        bitcoinCorretora=100;
        
    }
    
    public Corretora(Cliente cliente){
        buffer = cliente;
    }
  
    
    public double vender(double bitcoinCorretora){
        double valor = bitcoinCorretora * 0.01;
        this.buffer.setDinheiroCliente(valor/0.1);
        return this.buffer.getDinheiroCliente();
    }
    
    public double comprar(double dinheiroCorretora){
        double valor = bitcoinCorretora * 0.01;
        this.buffer.setBitcoinCliente(valor/0.1);
        return this.buffer.getBitcoinCliente();
        
    }

    /**
     * @return the bitcoinCorretora
     */
    public double getBitcoinCorretora() {
        return bitcoinCorretora;
    }

    /**
     * @param bitcoinCorretora the bitcoinCorretora to set
     */
    public void setBitcoinCorretora(double bitcoinCorretora) {
        this.bitcoinCorretora = bitcoinCorretora;
    }

    /**
     * @return the dinheiroCorretora
     */
    public double getDinheiroCorretora() {
        return dinheiroCorretora;
    }

    /**
     * @param dinheiroCorretora the dinheiroCorretora to set
     */
    public void setDinheiroCorretora(double dinheiroCorretora) {
        this.dinheiroCorretora = dinheiroCorretora;
    }

    
    }
    
    
    
    

