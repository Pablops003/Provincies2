package com.pablo.controller;

import com.pablo.model.Ciudad;
import com.pablo.model.PAIS;
import com.pablo.model.PROVINCIA;
import com.pablo.repositoris.CiudadRepository;
import com.pablo.repositoris.FranquiciaRepository;
import com.pablo.repositoris.PaisRepository;
import com.pablo.repositoris.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ControllerVue {

    @Autowired
    CiudadRepository ciudadRepository;

    @Autowired
    FranquiciaRepository franquiciaRepository;

    @Autowired
    ProvinciaRepository provinciaRepository;

    @Autowired
    PaisRepository paisRepository;


    @GetMapping("/ciudades")
    public List<Ciudad> listaciudades(){
        return ciudadRepository.findAll();
    }

    @GetMapping("/provincias")
    public List<PROVINCIA> listaprovincias(){
        return provinciaRepository.findAll();
    }

    @GetMapping("/pais")
    public List<PAIS> listapais(){
        return paisRepository.findAll();
    }









}
