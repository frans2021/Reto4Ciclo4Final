package com.as.repository.crud;

import com.as.model.Accessory;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * MISION TIC 2022
 */
public interface AccessoryCrudRepository extends MongoRepository<Accessory, String> {
    //Reto 5
    public List<Accessory> findByPriceLessThanEqual(double precio);
    
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Accessory> findByDescriptionLike(String description);
}
