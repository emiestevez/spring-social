package com.taller.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taller.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	Usuario buscarPorUsername(String username);
}
