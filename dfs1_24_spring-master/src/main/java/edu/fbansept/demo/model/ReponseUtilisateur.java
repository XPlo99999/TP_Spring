package edu.fbansept.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ReponseUtilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private ReponsePossible reponsePossible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public ReponsePossible getReponsePossible() {
        return reponsePossible;
    }

    public void setReponsePossible(ReponsePossible reponsePossible) {
        this.reponsePossible = reponsePossible;
    }
}
