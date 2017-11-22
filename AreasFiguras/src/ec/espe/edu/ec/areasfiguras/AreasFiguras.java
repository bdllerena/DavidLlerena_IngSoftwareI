/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.ec.areasfiguras;

/**
 *
 * @author David
 */
public class AreasFiguras 
{
    private float base;
    private float altura;
    private float baseMayor;
    private float resultado;

    public AreasFiguras(float base, float altura, float baseMayor, float resultado) {
        this.base = base;
        this.altura = altura;
        this.baseMayor = baseMayor;
        this.resultado = resultado;
    }

    /**
     * @return the base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the baseMayor
     */
    public float getBaseMayor() {
        return baseMayor;
    }

    /**
     * @param baseMayor the baseMayor to set
     */
    public void setBaseMayor(float baseMayor) {
        this.baseMayor = baseMayor;
    }

    /**
     * @return the resultado
     */
    public float getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
   
    public float areaCuadrado(float lado)
    {
       setResultado((float) Math.pow(lado, 2));
       return getResultado();
    }
    public float areaTriangulo(float base,float altura)
    {
       setResultado((base*altura)/2);
       return getResultado();
    }
    public float areaTrapezio(float base,float altura,float basemayor)
    {
       setResultado(((base*altura)/2)*basemayor);
       return getResultado();
    }
    public float areaCirculo(float radio)
    {
       setResultado((float) (Math.pow(radio,2)*Math.PI));
       return getResultado();
    }
    public float areaParalelogramo(float base,float altura)
    {
       setResultado(base*altura);
       return getResultado();
    }
}
