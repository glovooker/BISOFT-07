package cr.ac.ucenfotec.bl;

import java.util.ArrayList;

public class CL {
    private ArrayList<Propiedad> listaDePropiedades = new ArrayList<>();

    public String registrarPropiedad(int codigo, String nombre, int cuartos, String provincia, double montoAlquiler){
        if(existePropiedad(nombre) == null) {
            Propiedad propiedad = new Propiedad(codigo, nombre, cuartos, provincia, montoAlquiler);
            listaDePropiedades.add(propiedad);
            return "Property successfully registered!";
        }else
            return "This property name already exists!";
    }

    private Propiedad existePropiedad(String nombre){
        for (Propiedad propiedad:listaDePropiedades) {
            if(propiedad.getNombre().equalsIgnoreCase(nombre)){
                return propiedad;
            }
        }
        return null;
    }

    public String[] listarPropiedades(){
        String[] datosPropiedades = new String[listaDePropiedades.size()];
        for (int i = 0; i < listaDePropiedades.size(); i++) {
            Propiedad propiedad = listaDePropiedades.get(i);
            datosPropiedades[i] = propiedad.toString();
        }
        return datosPropiedades;
    }

    public String buscarPropiedad(String nombre){
        Propiedad encontrado = existePropiedad(nombre);
        if(encontrado != null)
            return "Properties Found: " + encontrado;
        else
            return "There are no properties with that name.";
    }
}
