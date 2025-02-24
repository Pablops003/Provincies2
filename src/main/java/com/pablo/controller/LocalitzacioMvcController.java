/*

package com.pablo.controller;


import com.pablo.model.PAIS;
import com.pablo.repositoris.CiudadRepository;
import com.pablo.repositoris.FranquiciaRepository;
import com.pablo.repositoris.PaisRepository;
import com.pablo.repositoris.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/localitzacions")
public class LocalitzacioMvcController {

    @Autowired
    CiudadRepository ciutatRepository;

    @Autowired
    PaisRepository paisRepository;

    @Autowired
    ProvinciaRepository provinciaRepository;

    @Autowired
    FranquiciaRepository franquiciaRepository;

    @GetMapping("/ciudad")
    public String getCiudades( Model model){
        model.addAttribute("ciudad",ciutatRepository.findAll());
        return "ciudadesInfo";
    }

    @GetMapping("/paisos")
    public String veurePaisos(Model model) {
        List<PAIS> paisos = paisRepository.findAll();
        model.addAttribute("paisos", paisos);
        return "paisos";
    }

    @GetMapping("/provincies")
    public String veureProvincies( Model model) {
        model.addAttribute("provincies", provinciaRepository.findAll());
        return "provincies";
    }

    @GetMapping("/franquicies")
    public String veureFranquicies( Model model) {
        model.addAttribute("franquicia", franquiciaRepository.findAll());
        return "franquicia";
    }

}

 */
