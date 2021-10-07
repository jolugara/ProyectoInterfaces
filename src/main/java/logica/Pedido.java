/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.List;
import logica.excepciones.Stock_excepcion;

/**
 *
 * @author alumno
 */
public class Pedido {

    private List<List<Producto>> pedido= new ArrayList<List<Producto>>();
    private static int codigo_pedido;
    private double peso_pedido;
    private double precio_pedido;
    private String transporte;

    public Pedido() {
        pedido= new ArrayList<List<Producto>>();
        calculoTransporte();
        calcularprecio();
        calcularpeso();

        
    }

    //terminar el constructor...
    public Pedido(List<Producto> pedido) {
        //this.pedido=pedido;
        codigo_pedido++;
        calculoTransporte();
        calcularprecio();
        calcularpeso();
        
    }
    public List<List<Producto>> getPedido() {
        return pedido;
    }

    public void setPedido(List<Producto> p) {
        this.pedido.add(p);
    }
//    PARA HACER: INGRESAR SOLO UN PRODUCTO...
//    public void setPedido(Producto p) {
//        this.pedido.add(p);
//    }
    
    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public double getPeso_pedido() {
        return peso_pedido;
    }

    public void setPeso_pedido(double peso_pedido) {
        this.peso_pedido = peso_pedido;
    }

    public double getPrecio_pedido() {
        return precio_pedido;
    }

    public void setPrecio_pedido(double precio_pedido) {
        this.precio_pedido = precio_pedido;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    public void calcularpeso(){
        for(List<Producto> p:pedido ){
            
            peso_pedido+=p.size()*p.get(0).getPeso();
            
        }
    }
    public void calcularprecio(){
        for(List<Producto> p:pedido ){
            precio_pedido+=p.size()*p.get(0).getPeso();
        }
    }
    public String calculoTransporte(){
        
        //        
        if(peso_pedido<10){
            transporte="Andando";
        }else if(peso_pedido<20){
            transporte="Bici";
        }else{
            transporte="Coche";
        }
        return transporte;
    }
    
    //comprueba
    public void cumpruebaStock(int cod,int cant) throws Stock_excepcion{
        for(List<Producto>p:pedido){
            if((p.get(0).getCodigo()==cod)&&(p.get(0).getStock()<cant)){
                throw new Stock_excepcion();
            }
        }
    }
}
