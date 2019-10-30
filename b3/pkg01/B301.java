
package b3.pkg01;


public class B301 {


    public static void main(String[] args) {
        // TODO code application logic here
         consumo consume = new consumo();
       consume.setLitros(50);
       consume.setPGas(1.57f);
       consumo consumo = new consumo(300f,50f,80f,1.36f);
       System.out.println("Consumo medio: "+consumo.consumoMedio()+" litros cada 100km");
       consumo.setLitros(30f);
       System.out.println("La velocidad media es de "+consumo.getVMed()+"km/h" );
System.out.println("El consumo medio despues de el cambio de litros es "+consumo.consumoMedio());
    }
    
}
