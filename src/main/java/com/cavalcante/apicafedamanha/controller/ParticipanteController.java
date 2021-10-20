package com.cavalcante.apicafedamanha.controller;

import com.cavalcante.apicafedamanha.model.ParticipanteModel;
import com.cavalcante.apicafedamanha.repository.ParticipanteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping({"/participante"})
public class ParticipanteController {
    private ParticipanteRepository repository;
    ParticipanteController(ParticipanteRepository participanteRepository){
    this.repository = participanteRepository;
    }
@GetMapping
public List findAll(){
    return (List) repository.findAll();
}
@GetMapping(path = "/{id}")
public ResponseEntity findbyid(@PathVariable("id") Long id){
        return repository.findById(id)
                .map(record ->ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
}
@PostMapping
public ParticipanteModel create(@RequestBody ParticipanteModel participanteModel){
        return repository.save(participanteModel);
}
@PutMapping(value = "/{id}")
public ResponseEntity update(@PathVariable("id")Long id, @RequestBody ParticipanteModel participanteModel){
        return repository.findById(id)
                .map(record-> {
                    record.setNome(participanteModel.getNome());
                    record.setCpf(participanteModel.getCpf());
                    record.setItem(participanteModel.getItem());
                    ParticipanteModel update = repository.save(record);
                    return ResponseEntity.ok().body(update);
                }).orElse(ResponseEntity.notFound().build());
}
public ResponseEntity <?> delete(@PathVariable Long id){
        return repository.findById(id)
                .map(record->{
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
}

}