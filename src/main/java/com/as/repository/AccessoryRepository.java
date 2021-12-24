package com.as.repository;

import com.as.model.Accessory;
import com.as.repository.crud.AccessoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * MISION TIC 2022
 */
@Repository
public class AccessoryRepository {

    @Autowired
    private AccessoryCrudRepository crudInterface;

    public List<Accessory> listAll() {
        return crudInterface.findAll();
    }

    public Optional<Accessory> getAccesory(String reference) {
        return crudInterface.findById(reference);
    }

    public Accessory create(Accessory accesory) {
        return crudInterface.save(accesory);
    }

    public void update(Accessory accesory) {
        crudInterface.save(accesory);
    }

    public void delete(Accessory accesory) {
        crudInterface.delete(accesory);
    }
    
    //Reto 5
    public List<Accessory> productsByPrice(double precio){
        return crudInterface.findByPriceLessThanEqual(precio);
    }
    //Reto 5
    public List<Accessory> findByDescriptionLike(String description){
	return crudInterface.findByDescriptionLike(description);
    }
}
