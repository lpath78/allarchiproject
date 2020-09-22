package com.allarchi.allarchiproject.model.entities;

import com.allarchi.allarchiproject.model.references.Pays;
import com.allarchi.allarchiproject.model.references.TypeParticipant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "PARTICIPANT")
@NoArgsConstructor
@SuppressWarnings("serial")
public class Participant extends AbstractEntities {
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private TypeParticipant typeParticipant;
    @Getter
    @Setter
    private String nom;
    @Getter
    @Setter
    private String prenom;
    @Getter
    @Setter
    private int telPortable;
    @Getter
    @Setter
    private String adresse;
    @Getter
    @Setter
    private int codePostal;
    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private Pays pays;
    @Getter
    @Setter
    private String email;
}
