package com.nttdata.bootcamp.dbReciever.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.dbReciever.IMongo.IMongo;
import com.nttdata.bootcamp.dbReciever.model.Mensaje;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("")
public class AppController {

	@Autowired
	IMongo repo;

	@GetMapping(value = "/get", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Mensaje> recogerTodo() {

		Flux<Mensaje> mensajes = repo.findAll();

		return mensajes;
	}

	@GetMapping(value = "/get/{index}", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Mono<Mensaje> recoger(@PathVariable("index") String index) {

		Mono<Mensaje> mensaje = repo.findById(index);

		return mensaje;
	}

	@GetMapping("/")
	public String va() {
		return "va";
	}

}
