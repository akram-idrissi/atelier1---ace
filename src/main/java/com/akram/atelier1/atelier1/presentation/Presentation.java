package com.akram.atelier1.atelier1.presentation;

import java.io.File;
import java.util.Scanner;

import com.akram.atelier1.atelier1.dao.Etudiant;
import com.akram.atelier1.atelier1.dao.IEtudiantDAO;
import com.akram.atelier1.atelier1.metier.EtudiantManager;


public class Presentation {

    @SuppressWarnings("resource")
    public static void main() {
        Etudiant etd1 = new Etudiant(1, "akram", "idrissi", "abc@gmail.com");
        Etudiant etd2 = new Etudiant(2, "amine", "dami", "def@gmail.com");
        Etudiant etd3 = new Etudiant(3, "ayman", "hani", "ghi@gmail.com");
        Etudiant etd4 = new Etudiant(4, "anas", "rami", "jkl@gmail.com");
        Etudiant etd5 = new Etudiant(5, "amal", "maki", "jkl@gmail.com");

        EtudiantManager etdManager = new EtudiantManager();

        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String IEtudiantDAOImpl = scanner.nextLine();
            @SuppressWarnings("rawtypes")
            Class cDao = Class.forName(IEtudiantDAOImpl);
            @SuppressWarnings("deprecation")
            IEtudiantDAO dao = (IEtudiantDAO) cDao.newInstance();
            etdManager.setEtudiantDAO(dao);
        } catch (Exception e) {
            e.printStackTrace();
        }

        etdManager.addEtudiant(etd1);
        etdManager.addEtudiant(etd2);
        etdManager.addEtudiant(etd3);
        etdManager.addEtudiant(etd4);
        etdManager.addEtudiant(etd5);

        // avant update
        etdManager.getEtudiantDAO().show();

        System.out.println("\n\n");

        // apres update
        etd1.setEmail("abc-updated@gmail.com");
        etdManager.updateEtudiant(etd1);
        etdManager.getEtudiantDAO().show();

        /*
         ************************ PARTI 2 ******************************
         * 
         * Pour integrer la nouvelle classe EtudiantDAODictionary, il faut
         * modifier la methode emailDoesntExist dans le fichier
         * metier/EtudiantManager.java
         * et modifier la ligne ou on invoke le setter de la classe EtudiantManager
         * dans le fichier presentation/Presentation.java
         * 
         */

        /*
         ************************ PARTI 3 ******************************
         * 
         * La solution est d'utiliser des interfaces car elles sont plus stable
         * en utilisant les interfaces, on peut avoir plusieurs implementation
         * du même besoin, ce qui nous permet d'étendre l'application sans modifier
         * ce qui existe.
         * 
         * De plus, on peut dynamiquement initializer les implementations, en mettant
         * les
         * classes à implementer dans un fichier, puis les instancier en temps
         * d'execution
         * (runtime)
         * 
         * 
         * Dans le fichier config.txt (Instanciation dynamique) les implementations 
         * dispo sont: 
         *      com.akram.atelier1.atelier1.dao.EtudiantDAO
         *      com.akram.atelier1.atelier1.dao.EtudiantDAODictionary
         * 
         */

    }

}
