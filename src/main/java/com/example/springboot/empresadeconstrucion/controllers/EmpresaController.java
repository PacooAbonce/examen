package com.example.springboot.empresadeconstrucion.controllers;

import java.util.ArrayList;

import com.example.springboot.empresadeconstrucion.models.Empresa;
import com.example.springboot.empresadeconstrucion.services.EmpresaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Materiales")
public class EmpresaController {
  @Autowired
  EmpresaService empresaService;
  
  @GetMapping()
  public ArrayList<Empresa> obterneMateriales(){
      return empresaService.todoslosMateriales();
  }

  @PostMapping()
  public String guardar(@RequestBody Empresa materiales){
      return empresaService.guardar(materiales);
  }
}
