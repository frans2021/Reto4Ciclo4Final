package com.as.controller;

import com.as.model.Accessory;
import com.as.service.AccesoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * MISION TIC 2022
 */
@RestController
@RequestMapping("/api/cleaningproduct")
@CrossOrigin("*")
public class AccessoryController {

    @Autowired
    private AccesoryService servicio;

    @GetMapping("/all")
    public List<Accessory> listAll() {
        return servicio.listAll();
    }

    @GetMapping("/{reference}")
    public Optional<Accessory> getAccesory(@PathVariable("reference") String reference) {
        return servicio.getAccesory(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Accessory create(@RequestBody Accessory accessory) {
        return servicio.create(accessory);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Accessory update(@RequestBody Accessory accessory) {
        return servicio.update(accessory);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return servicio.delete(reference);
    }
    
    @GetMapping("/price/{price}")
    public List<Accessory> productsByPrice(@PathVariable("price") double precio){
        return servicio.productsByPrice(precio);
    }
    
    //Reto 5
    @GetMapping("/description/{description}")
    public List<Accessory> findByDescriptionLike(@PathVariable("description") String description){
	return servicio.findByDescriptionLike(description);
    }    
}
