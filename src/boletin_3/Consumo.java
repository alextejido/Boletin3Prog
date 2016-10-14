package boletin_3;


public class Consumo {
    private float km,litros, vMed, pGas;
    
    public Consumo(){
        km =0;
        litros=0;
        vMed=0;
        pGas=0;
        }
    public Consumo(float kilometros, float l, float media, float gasolina){
        km = kilometros;
        litros = l;
        vMed = media;
        pGas = gasolina;
        }
    public float getTiempo(){
        float tiempo = km/vMed;
        return tiempo;
    }
    public float consumoMedio(){
        float consumo = litros / pGas;
        return consumo;
}
    
    public  float consumoEuro(){
        float consumoE = (consumoMedio()*100)/km;
        return consumoE;
}
    public  void setkm(float kilometros){
    km  = kilometros;
    
}
    public  void setLitros(float l){
    litros = l;
    
}
    public  void setvMed(float media){
    vMed = media;
    
}
    public  void setPGas(float gasto){
       pGas = gasto;
    
}
    public float getVMedia(){
                
        return vMed;
    }
    
}