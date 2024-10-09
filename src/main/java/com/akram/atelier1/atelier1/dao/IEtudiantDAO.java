package com.akram.atelier1.atelier1.dao;

public interface IEtudiantDAO {
    public Etudiant addEtudiant(Etudiant etudiant);
    public boolean emailDoesntExist(Etudiant etudiant);
    public Object getAllEtudiants();
    public void updateEtudiant(Etudiant etudiant);
    public void show();
}
