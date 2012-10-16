package com.taller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taller.data.repository.UsuarioRepository;
import com.taller.domain.Usuario;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public @ResponseBody
	Usuario getUsuario(@PathVariable String username) {
		return usuarioRepository.buscarPorUsername(username);
	}
}
