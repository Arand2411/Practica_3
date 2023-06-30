
package com.Practica3.service.impl;

import com.Practica3.dao.ArbolDao;
import com.Practica3.domain.Arbol;
import com.Practica3.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArbolServiceImpl implements ArbolService{
    
    
    @Autowired
    private ArbolDao ArbolDao;
    
    @Override
    @Transactional(readOnly=true)
    public List <Arbol> getArboles(boolean activos){
        var lista = ArbolDao.findAll();
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol){
        return ArbolDao.findById(Arbol)
    }
}
