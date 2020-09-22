package com.allarchi.allarchiproject.model.entities;

import com.allarchi.allarchiproject.model.exceptions.ConstructionException;
import com.allarchi.allarchiproject.model.references.Pays;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EntitiesFactory {

    public final Participant fabriquerUnParticipant(String nom, String prenom, int telPortable, String email, String adresse, int codePostal, Pays pays) throws ConstructionException {
        Participant p = new Participant();
        try {
            p.setNom(nom);
            p.setPrenom(prenom);
            p.setTelPortable(telPortable);
            p.setEmail(email);
            p.setAdresse(adresse);
            p.setCodePostal(codePostal);
            p.setPays(pays);
        } catch (Exception e) {
            throw new ConstructionException(e);
        }

        return p;
    }

    public final Projet fabriquerProjet(String nomProjet, int codeProjet, String commentaire, LocalDate dateCreationProjet, List<Participant> listParticipants) throws ConstructionException {
        Projet projet = new Projet();
        try {
            projet.setNomProjet(nomProjet);
            projet.setCodeProjet(codeProjet);
            projet.setCommentaire(commentaire);
            projet.setDateCreationProjet(dateCreationProjet);
            projet.setListParticipants(listParticipants);
        } catch (Exception e) {
            throw new ConstructionException(e);
        }

        return projet;
    }
}
