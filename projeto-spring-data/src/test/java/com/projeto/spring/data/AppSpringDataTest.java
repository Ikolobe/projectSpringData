package com.projeto.spring.data;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.projeto.spring.data.dao.InterfaceSpringDataUser;
import com.projeto.spring.data.dao.InterfaceTelefone;
import com.projeto.spring.data.model.Telefone;
import com.projeto.spring.data.model.UsuarioSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppSpringDataTest {

	@Autowired
	private InterfaceSpringDataUser interfaceSpringDataUser;
	
	@Autowired
	private InterfaceTelefone interfaceTelefone;
	
	
	@Test
	public void testeInsert() {
		
		UsuarioSpringData usuarioSpringData = new UsuarioSpringData();
		usuarioSpringData.setEmail("widiney@gmail.com");
		usuarioSpringData.setIdade("26");
		usuarioSpringData.setNome("Gentil");
		usuarioSpringData.setLogin("admin1");
		usuarioSpringData.setSenha("admin1");
		
		interfaceSpringDataUser.save(usuarioSpringData);
	}
	@Test
	public void testeConsulta() {
		System.out.println(interfaceSpringDataUser.findAll());
	}
	
	@Test
	public void testeUpdate() {
		
		Optional<UsuarioSpringData> usuarioSpringData = interfaceSpringDataUser.findById(1L);
		
		UsuarioSpringData data = usuarioSpringData.get();
		
		data.setNome("Gentil");
	interfaceSpringDataUser.save(data);
	}
	
	@Test
	public void testeDelete() {
		
		interfaceSpringDataUser.deleteById(3L);
		
		
	}
	
	@Test
	public void testeBuscaLista() {
		
		List<UsuarioSpringData> list = interfaceSpringDataUser.buscarNome("Widiney");
		
		for (UsuarioSpringData usuarioSpringData : list) {
			System.out.println(usuarioSpringData.getNome());
			System.out.println(usuarioSpringData.getEmail());
			System.out.println(usuarioSpringData.getLogin());
			System.out.println(usuarioSpringData.getSenha());
			System.out.println(usuarioSpringData.getIdade());
			
			for (Telefone telefone : usuarioSpringData.getTelefones()) {
				System.out.println(telefone.getTipo());
				System.out.println(telefone.getNumero());
			}
		}
	}
	
	@Test
	public void testeBuscaNomeParam() {
		
		UsuarioSpringData usuarioSpringData = interfaceSpringDataUser.buscarPorNomeParam("Gentil");
		System.out.println(usuarioSpringData.getNome());
		System.out.println(usuarioSpringData.getEmail());
		System.out.println(usuarioSpringData.getLogin());
		System.out.println(usuarioSpringData.getSenha());
		System.out.println(usuarioSpringData.getIdade());
	}
	
	@Test
	public void testeDeletePorNome() {
		interfaceSpringDataUser.deletePorNome("Gentil");
	}
	
	@Test
	public void testeAtualizarEmailPorNome() {
		interfaceSpringDataUser.atualizarEmailPorNome("gentil.marie@gmail.com", "Gentil");
		
	}
	
	@Test
	public void testeInsertTelefone() {
		
		Telefone telefone = new Telefone();
		Optional<UsuarioSpringData> usuarioSpringData = interfaceSpringDataUser.findById(2L);
		UsuarioSpringData user = usuarioSpringData.get();
		
		telefone.setNumero("985429771");
		telefone.setTipo("Celular");
		telefone.setUsuarioSpringData(user);
		interfaceTelefone.save(telefone);
	
	}
}
