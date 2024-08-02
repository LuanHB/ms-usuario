package com.ms.usuario.service;

import com.ms.usuario.entity.Usuario;
import com.ms.usuario.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;


    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Transactional(rollbackOn = Exception.class)
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }
}
