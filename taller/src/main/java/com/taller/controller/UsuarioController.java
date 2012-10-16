package com.taller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.taller.data.repository.UsuarioRepository;
import com.taller.domain.Usuario;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	Usuario getDatosUsuario(WebRequest webRequest) {
		Connection<Twitter> connection = (Connection<Twitter>) ProviderSignInUtils.getConnection(webRequest);
		UserProfile userProfile = connection.fetchUserProfile();
		System.out.println("userProfile.getName():" + userProfile.getUsername());
		return usuarioRepository.buscarPorUsername(userProfile.getUsername());
	}
}
