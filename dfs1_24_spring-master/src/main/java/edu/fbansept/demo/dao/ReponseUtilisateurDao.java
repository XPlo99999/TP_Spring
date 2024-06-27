package edu.fbansept.demo.dao;

import edu.fbansept.demo.model.ReponseUtilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReponseUtilisateurDao extends JpaRepository<ReponseUtilisateur, Integer> {
}
