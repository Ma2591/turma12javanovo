package org.generation.blogPessoal.controller;

import java.util.List;
import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/postagem")
@CrossOrigin("*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;

	//----------------------------------localhost:8080/postagem/getAll--------
	@GetMapping
	public Object GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	//----------------------------------Gets by select where id-------------------------------
	//----------------------------------localhost:8080/pagina/getById1/1----------------------

	@GetMapping("/getById1/{id}")
	public Optional<Postagem> encontrarUm(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
	
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	//----------------------------------localhost:8080/postagem-------------------------------
	//-----------------------Para Post não passamos o ID, ele entenderá que é uma informação nova que irá receber--------
	 @PostMapping 
	 public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
		 return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	 }
	 
	//----------------------------------Updates---------------------------------------------------------------------------
	//-----------------------Para Put passamos o Id do recurso que quremos alterar----------------------------------------
	 @PutMapping 
	 public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
		 return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	 }
	 
	//----------------------------------------------------Delete-----------------------------------------------------------
     @DeleteMapping("/{id}")
     public void delete(@PathVariable long id) {
    	 repository.deleteById(id);
     }
}
