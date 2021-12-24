package com.as.service;

import com.as.model.Accessory;
import com.as.repository.AccessoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * MISION TIC 2022
 */
@Service
public class AccesoryService {

    @Autowired
    private AccessoryRepository repositorio;

    public List<Accessory> listAll() {
        return repositorio.listAll();
    }

    public Optional<Accessory> getAccesory(String reference) {
        return repositorio.getAccesory(reference);
    }

    public Accessory create(Accessory accesory) {
        if (accesory.getReference() == null) {
            return accesory;
        } else {
            return repositorio.create(accesory);
        }
    }

    public Accessory update(Accessory accesory) {

        if (accesory.getReference() != null) {
            Optional<Accessory> accesoryDb = repositorio.getAccesory(accesory.getReference());
            if (!accesoryDb.isEmpty()) {
                if (accesory.getBrand() != null) {
                    accesoryDb.get().setBrand(accesory.getBrand());
                }

                if (accesory.getCategory() != null) {
                    accesoryDb.get().setCategory(accesory.getCategory());
                }


                if (accesory.getDescription() != null) {
                    accesoryDb.get().setDescription(accesory.getDescription());
                }
                if (accesory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accesory.getPrice());
                }
                if (accesory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accesory.getQuantity());
                }
                if (accesory.getPhotography() != null) {
                    accesoryDb.get().setPhotography(accesory.getPhotography());
                }
                accesoryDb.get().setAvailability(accesory.isAvailability());
                repositorio.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return accesory;
            }
        } else {
            return accesory;
        }
    }

    public boolean delete(String reference) {
        Boolean aBoolean = getAccesory(reference).map(accesory -> {
            repositorio.delete(accesory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
    //Reto 5
    public List<Accessory> productsByPrice(double precio){
        return repositorio.productsByPrice(precio);
    }
    
    //Reto 5
    public List<Accessory> findByDescriptionLike(String description) {
	return repositorio.findByDescriptionLike(description);
    }
}
