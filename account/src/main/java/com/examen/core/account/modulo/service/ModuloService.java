package com.examen.core.account.modulo.service;

import com.examen.core.account.modulo.model.SegModulo;
import com.examen.core.account.modulo.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloService {
    @Autowired
    private ModuloRepository moduloRepository;

    public SegModulo createModulo(SegModulo modulo) {
        return moduloRepository.save(modulo);
    }

    public Optional<SegModulo> getModuloById(String codModulo) {
        return moduloRepository.findById(codModulo);
    }

    public List<SegModulo> getAllModulos() {
        return moduloRepository.findAll();
    }

    public SegModulo updateModulo(String codModulo, SegModulo moduloDetails) {
        SegModulo existingModulo = moduloRepository.findById(codModulo)
                .orElseThrow();

        existingModulo.setNombre(moduloDetails.getNombre());
        existingModulo.setEstado(moduloDetails.getEstado());
        existingModulo.setVersion(moduloDetails.getVersion());

        return moduloRepository.save(existingModulo);
    }

    public void deleteModulo(String codModulo) {
        SegModulo modulo = moduloRepository.findById(codModulo)
                .orElseThrow();
        moduloRepository.delete(modulo);
    }
}