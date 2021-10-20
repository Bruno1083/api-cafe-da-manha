package com.cavalcante.apicafedamanha.repository;

import com.cavalcante.apicafedamanha.model.ParticipanteModel;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<ParticipanteModel, Long> {

   // @Query("select p from Participante p where p.cpf like ?1")
    //Optional<ParticipanteModel> findClientByCpf(String cpf);

   // @Query("select p from Participante c where p.email like ?1")
   // Optional<ParticipanteModel> findClientByEmail(String email);
}
