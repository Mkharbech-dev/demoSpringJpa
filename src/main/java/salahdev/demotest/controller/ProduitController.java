package salahdev.demotest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import salahdev.demotest.model.Produit;
import salahdev.demotest.service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping("/create-produit")
    public Produit create(Produit produit){
        return produitService.creer(produit);
    }

    @GetMapping("/read-produits")
    public List<Produit> read(){
        return produitService.lire();
    }

    @PutMapping("/update-produit/{id}")
    public Produit update(@PathVariable Long id,@RequestBody Produit produit){
        return produitService.modifier(id, produit);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return produitService.supprimer(id);
    }

}
