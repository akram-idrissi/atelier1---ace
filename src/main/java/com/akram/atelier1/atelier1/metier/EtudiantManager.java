package com.akram.atelier1.atelier1.metier;


import lombok.Data;
import com.akram.atelier1.atelier1.dao.Etudiant;
import com.akram.atelier1.atelier1.dao.IEtudiantDAO;

@Data
public class EtudiantManager {

    public IEtudiantDAO etudiantDAO;

    public boolean emailDoesntExist(Etudiant etd) { // methode sera modifée
        return etudiantDAO.emailDoesntExist(etd);
    }
    
    public Etudiant addEtudiant(Etudiant etudiant) {
       if(emailDoesntExist(etudiant))
            return etudiantDAO.addEtudiant(etudiant);
        return null;
    }

    public Object getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }

    public void updateEtudiant(Etudiant etudiant) {
        etudiantDAO.updateEtudiant(etudiant); ;
    }

}
