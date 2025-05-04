package salahdev.demotest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salahdev.demotest.model.Produit;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
