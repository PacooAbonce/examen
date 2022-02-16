package com.example.springboot.empresadeconstrucion.services;

import com.example.springboot.empresadeconstrucion.models.Empresa;
import com.example.springboot.empresadeconstrucion.repositories.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository EmpresaRepo;

    public ArrayList<Empresa> todoslosMateriales(){
        return (ArrayList<Empresa>) EmpresaRepo.findAll();
    }

    public String guardar (Empresa empresa){
        EmpresaRepo.save(empresa);
        return "Se guardo correctamente";
    }
    
}
