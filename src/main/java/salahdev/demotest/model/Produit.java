package salahdev.demotest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "PRODUIT")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Produit {
    //pour mapper l'identifiant
    @Id
    // pour generer les cle promaires, et implementation de autocompletion de id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 150)
    private String description;
    private int prix;

}
