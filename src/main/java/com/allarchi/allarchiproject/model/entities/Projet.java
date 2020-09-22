package com.allarchi.allarchiproject.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "PROJET")
@NoArgsConstructor
@SuppressWarnings("serial")
public class Projet extends AbstractEntities {
@Getter @Setter
    private String nomProjet;
    @Getter @Setter
    private int CodeProjet;
    @Getter @Setter
    private LocalDate dateCreationProjet;
    @Getter @Setter
    private String Commentaire;
    @Getter
    @Setter
    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "listParticipant")
    private List<Participant> listParticipants = new ArrayList<>();
}
