/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.operacionesbasicas;

/**
 *
 * @author David
 */
public class Operacion {
    private int operador1;
    private int operador2;
    private int resultado;

    public Operacion(int operador1, int operador2, int resultado) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.resultado = resultado;
    }
   
    /**
     * @return the operador1
     */
    public int getOperador1() {
        return operador1;
    }

    /**
     * @param operador1 the operador1 to set
     */
    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    /**
     * @return the operador2
     */
    public int getOperador2() {
        return operador2;
    }

    /**
     * @param operador2 the operador2 to set
     */
    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
     public int addition(int operador1, int operador2)
    {
        resultado = operador1+operador2;
        return resultado;
    }
    public int subtract(int operador1, int operador2)
    {
        resultado = operador1-operador2;
        return resultado;
    }
}
