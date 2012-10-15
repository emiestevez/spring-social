package com.taller.data.repository;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taller.domain.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:taller-config.xml"})
public class UsuarioRepositoryTest {

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Test
    public void findAll_conUsuarioEnLaBd_retornaListaDeUsuarios(){
    	Collection<Usuario> resultado = (Collection<Usuario>) usuarioRepository.findAll();
    	
    	Assert.assertTrue(resultado.size()>0);
    }
    
    @Test
    public void buscarPorUsername_conUsuarioEnLaBd_retornaUsuario(){
    	Usuario resultado = usuarioRepository.buscarPorUsername("sapo.pepe");
    	
    	Assert.assertNotNull(resultado);
    	Assert.assertEquals("sapo", resultado.getNombre());
    }
    
    @Test
    public void buscarPorUsername_conUsuarioInexistenteLaBd_retornaUsuario(){
    	Usuario resultado = usuarioRepository.buscarPorUsername("sapo.pepelalala");
    	
    	Assert.assertNull(resultado);
    }
    
    @Test
    public void save_conUsuarioNuevo_retornaUsuarioCreado(){
    	Usuario usuario = new Usuario();
    	usuario.setNombre("scott");
    	usuario.setUsername("scott.pilgram");
    	Usuario resultado = usuarioRepository.save(usuario);
    	
    	Assert.assertNotNull(resultado);
    	Assert.assertEquals(usuario.getNombre(), resultado.getNombre());
    	Assert.assertEquals(usuario.getUsername(), resultado.getUsername());
    	
    }

}
