package com.akram.atelier1.atelier1.dao;

import java.util.Map;
import java.util.HashMap;

public class EtudiantDAODictionary implements IEtudiantDAO {

    Map<Integer, Etudiant> etudiants = new HashMap<Integer, Etudiant>();

    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiants.put(etudiant.getId(), etudiant);
        return etudiant;
    }

    public Map<Integer, Etudiant> getAllEtudiants() {
        return etudiants;
    }

    @Override
    public boolean emailDoesntExist(Etudiant etudiant) {
        return etudiants
            .entrySet()
                .stream()
                    .filter(e -> e.getValue().getEmail().equals(etudiant.getEmail()))
                        .toList()
                            .isEmpty();
    }

    @Override
    public void show() {
        etudiants
            .entrySet()
                .stream()
                    .forEach(e -> System.out.println(e));
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) {
        if (etudiants.get(etudiant.getId()) != null)
            etudiants.replace(etudiant.getId(), etudiant);
    }

}
