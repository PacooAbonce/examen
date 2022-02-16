package com.example.springboot.empresadeconstrucion.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.springboot.empresadeconstrucion.models.Empresa;

@Repository
public class EmpresaRepository extends CrudRepository<Empresa,Long> {
    
}
