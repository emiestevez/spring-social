package com.taller.social.controller;

import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.server.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:taller-config.xml" })
public class SocialControllerTest {
	@Autowired
	private SocialController socialController;
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp(){
		mockMvc = MockMvcBuilders.standaloneSetup(socialController).build();
	}

	@Test
	public void buscarTweets_conConfiguracionCorrecta_retornaListaDeTweets() throws Exception {
		mockMvc.perform(get("/social/twitter/tweet")).andExpect(status().isOk());
	}
	
	@Test
	public void buscarPerfil_existe_Usuario_retornaPerfilDelUsuario() throws Exception {
		mockMvc.perform(get("/social/twitter/perfil")).andExpect(status().isOk());
	}

	@Ignore
	@Test
	public void crearTweet_conConfiguracionCorrecta_retornaTweet() throws Exception {
		mockMvc.perform(post("/social/twitter/tweet")).andExpect(status().isCreated());
	}
	
}
