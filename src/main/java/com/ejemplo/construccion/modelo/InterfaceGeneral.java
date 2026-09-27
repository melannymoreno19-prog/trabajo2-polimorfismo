package com.ejemplo.construccion.modelo;

import java.util.List;

public interface InterfaceGeneral extends Interface1, Interface2, Interface3 {
    String getNombre();
    List<Construccion> getListaConstrucciones();
}
