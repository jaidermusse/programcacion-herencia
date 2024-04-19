
package herenciaaa;

public class Humano {
    
    private String nombre;
    
    public void comer (String nombre) {
        System.out.println(nombre+" esta durmiendo en la Clase Humano");
        
    }
    
    public void domir (){
       System.out.println(nombre+"Esta durmiendo desde la clase  humano");
       
       
    }
    
    public String getNombre () {
        return nombre;
    
    }
    
    public void setNombre (String nombre) {
        this.nombre=nombre;
      
        
       
    }
    
}
