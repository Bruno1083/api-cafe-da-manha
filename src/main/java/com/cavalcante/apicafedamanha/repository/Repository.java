package com.cavalcante.apicafedamanha.repository;

import com.cavalcante.apicafedamanha.model.ParticipanteModel;
<<<<<<< HEAD
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<ParticipanteModel, Long> {

    //@Query("select p from Participante p where p.cpf like ?1")
    //Optional<ParticipanteModel> findClientByCpf(String cpf);

    //@Query("select p from Participante c where p.email like ?1")
    //Optional<ParticipanteModel> findClientByEmail(String email);
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Repository extends CrudRepository<ParticipanteModel, Long> {

   // @Query("select p from Participante p where p.cpf like ?1")
    //Optional<ParticipanteModel> findClientByCpf(String cpf);

   // @Query("select p from Participante c where p.email like ?1")
   // Optional<ParticipanteModel> findClientByEmail(String email);
>>>>>>> 9893bd27e3ca1e4a705db9ab83d01a67caf6521c
}
