package com.nttdata.bootcamp.dbReciever.IMongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.bootcamp.dbReciever.model.Mensaje;

@Repository
public interface IMongo extends ReactiveMongoRepository<Mensaje, String> {

}
