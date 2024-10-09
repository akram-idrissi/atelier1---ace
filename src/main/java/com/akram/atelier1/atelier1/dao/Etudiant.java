package com.akram.atelier1.atelier1.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = "email")
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String email;
}
