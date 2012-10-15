/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.taller.social;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;

import ch.qos.logback.classic.Logger;

import com.taller.data.repository.UsuarioRepository;
import com.taller.domain.Usuario;

/**
 * Simple little {@link ConnectionSignUp} command that allocates new userIds in
 * memory. Doesn't bother storing a user record in any local database, since
 * this quickstart just stores the user id in a cookie.
 * 
 * @author Keith Donald
 */
public final class SimpleConnectionSignUp implements ConnectionSignUp {
	@Autowired
	private UsuarioRepository usuarioRepository;

	private Logger logger = (Logger) LoggerFactory.getLogger(SimpleConnectionSignUp.class);

	public String execute(Connection<?> connection) {
		UserProfile userProfile = connection.fetchUserProfile();

		logger.debug("El username es {}", userProfile.getUsername());

		Usuario usuario = usuarioRepository.buscarPorUsername(userProfile.getUsername());

		if (usuario == null) {
			usuario = new Usuario();
			usuario.setNombre(userProfile.getFirstName());
			usuario.setUsername(userProfile.getUsername());
			usuarioRepository.save(usuario);
			return null;
		}

		return usuario.getUsername();
	}
}
