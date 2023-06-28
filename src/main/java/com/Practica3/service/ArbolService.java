
package com.Practica3.service;

import com.Practica3.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    public List<Arbol> getArboles(boolean activos);
    
    public Arbol getArbol(Arbol tipoFlor);
    
    public void save(Arbol tipoFlor);
    
    public void delete(Arbol tipoFlor);
}
