package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;


    public Page<SaleDTO> findAll(Pageable pageable){
        Page<Sale> result = repository.findAll(pageable);
        return result.map(SaleDTO::new);
    }




}
