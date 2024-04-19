
package herenciaaa;

public class Herenciaaa {
        //Crear Objeto Clase Padre
    public static void main(String[] args) {
        Humano adulto = new Humano ();
        adulto.setNombre("fredy");
        adulto.comer(adulto.getNombre());
        adulto.domir();
       System.out.println();
        //Crear Objeto Clase Hija -> Hombre
        Hombre padre=new Hombre ();
        padre.setNombre ("nicolas");
        padre.comer(padre.getNombre());
        padre.domir();
        padre.afeitarse();
        System.out.println();
        //Crear Objeto Clase Hija -> Mujer
        Mujer madre = new Mujer();
        madre.setNombre("Gloria");
        madre.comer(madre.getNombre());
        madre.domir();
        madre.maquillarse(madre.getNombre());
        
    }
    
}
