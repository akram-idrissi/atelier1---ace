package com.akram.atelier1.atelier1.dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IEtudiantDAO {

    List<Etudiant> etudiants = new ArrayList<Etudiant>();

    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiants.add(etudiant) ? etudiant : null;
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }

    @Override
    public boolean emailDoesntExist(Etudiant etudiant) {
        return etudiants
            .stream()
                .filter(e -> e.getEmail().equals(etudiant.getEmail()))
                    .toList()
                        .isEmpty();
    }

    @Override
    public void show() {
        etudiants
            .stream()
                .forEach(e -> System.out.println(e));
    }

    @Override
    public void updateEtudiant(Etudiant etudiant) {
        int index = 0;
        for(int i = 0; i < etudiants.size(); i++ ) {
            if (etudiants.get(i).getId() == etudiant.getId()) {
                index = i;
                break;
            }
        }            
        etudiants.set(index, etudiant);
    }

}
