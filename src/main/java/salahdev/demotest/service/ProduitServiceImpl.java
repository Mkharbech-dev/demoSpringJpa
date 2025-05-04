package salahdev.demotest.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import salahdev.demotest.model.Produit;
import salahdev.demotest.repository.ProduitRepository;

import java.util.List;
// on demande a sprong de consederer cette class comme classe metier
@Service
//lombok creer un constructeur avec tous les chmaps
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService {
    // injection de dependance
    private final ProduitRepository produitRepository;

    @Override
    public Produit creer(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> lire() {
        return produitRepository.findAll();
    }

    @Override
    public Produit modifier(Long id, Produit produit) {
        return produitRepository.findById(id)
                .map(p-> {
                    p.setPrix(produit.getPrix());
                    p.setNom(produit.getNom());
                    p.setDescription(produit.getDescription());
                    return produitRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("produit non trouvé !"));
    }

    @Override
    public String supprimer(Long id) {
        produitRepository.deleteById(id);
        return "Produit supprimé!";
    }
}
