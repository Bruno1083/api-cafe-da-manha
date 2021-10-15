package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name= "Participante")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ParticipanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(unique = true, nullable = false, length = 20)
    private String cpf;

    @Column(unique = true, nullable = false)
    private String item;
}
