
package com.Practica3.Controller;   

import com.Practica3.domain.Arbol;
import com.Practica3.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/arbol")
public class arbolController {
    
    @Autowired
    private ArbolService arbolService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var arboles = arbolService.getArboles(false);
        model.addAttribute("arboles", arboles);
        model.addAttribute("totalArboles",arboles.size());
        
        return "/arbol/listado";
    }
    
    @GetMapping("/nuevo")
    public String arbolNuevo(Arbol arbol){
        return "/arbol/modifica";
    }
    
    //Falta lo de firebase***********************************************
}
