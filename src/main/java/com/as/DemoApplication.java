package com.as;

import com.as.model.Accessory;
import com.as.model.Order;
import com.as.model.User;
import com.as.repository.crud.AccessoryCrudRepository;
import com.as.repository.crud.OrderCrudRepository;
import com.as.repository.crud.UserCrudRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private AccessoryCrudRepository crudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;
    

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Aqui se ejecutaran la creación de documentos de mongo...");
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        crudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();

//        crudRepository.saveAll(List.of(
//                new Accessory("AP-903", "ACME", "MATERIAL 1", "PRESENTACION 1", "DESCRIPCION... alta calidad, bajos precios", true, 100000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-006127.jpg"),
//                new Accessory("AP-904", "ACME", "MATERIAL 2","PRESENTACION 2", "DESCRIPCION... relacion beneficio costo, EXCLUSIVIDAD",  true, 130000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-007.jpg"),
//                new Accessory("AP-905", "ACME", "MATERIAL 1", "PRESENTACION 1", "DESCRIPCION... alta calidad, bajos precios", true, 100000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-006127.jpg"),
//                new Accessory("AP-906", "ACME", "MATERIAL 2","PRESENTACION 2", "DESCRIPCION.. relacion beneficio costo, EXCLUSIVIDAD",  true, 130000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-007.jpg"),
//                new Accessory("AP-907", "ACME", "MATERIAL 1", "PRESENTACION 1", "DESCRIPCION.. alta calidad, bajos precios", true, 100000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-006127.jpg"),
//                new Accessory("AP-908", "ACME", "MATERIAL 2","PRESENTACION 2", "DESCRIPCION... relacion beneficio costo, EXCLUSIVIDAD",  true, 130000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-007.jpg"),
//                new Accessory("AP-909", "ACME", "MATERIAL 1", "PRESENTACION 1", "DESCRIPCION.. alta calidad, bajos precios", true, 100000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-006127.jpg"),
//                new Accessory("AP-910", "ACME", "MATERIAL 2","PRESENTACION 2", "DESCRIPCION... relacion beneficio costo, EXCLUSIVIDAD",  true, 130000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-007.jpg"),
//                new Accessory("AP-911", "ACME", "MATERIAL 1", "PRESENTACION 1", "DESCRIPCION... alta calidad, bajos precios", true, 100000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-006127.jpg"),
//                new Accessory("AP-912", "ACME", "MATERIAL 2","PRESENTACION 2", "DESCRIPCION... relacion beneficio costo, EXCLUSIVIDAD",  true, 130000, 10, "https://www.avasoluciones.com/uploads/2021/09/910-007.jpg")
//        ));
//
//        userCrudRepository.saveAll(List.of(
//                new User(1, "123123", "ALAN BRITO", ft.parse("1986-11-15"),"11","CR 34-45", "311222222", "abrito@gmail.com", "Demo123.", "ZONA 2", "ADM"),
//                new User(2, "61123211", "NAPOLEON BONAPARTE", ft.parse("1966-11-15"),"11","CR 34-45", "3168965645", "nbonaparte@gmail.com", "Demo123.", "ZONA 2", "COORD"),
//                new User(3, "46669989", "BLODY MARRY", ft.parse("1996-11-15"),"11","CR 34-45", "3174565625", "stellez@gmail.com", "Demo123.", "ZONA 2", "ASE"),
//                new User(4, "52369563", "JUANA DE ARCO", ft.parse("1987-05-15"),"05","CR 34-45", "3265632", "jdarco@gmail.com", "Demo123.", "ZONA 2", "ASE"),
//                new User(5, "123456789", "ALCIRA LA ALPACA", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "aalpaca@gmail.com", "Demo123.", "ZONA 1", "COORD"),
//                new User(6, "213456789", "PEDRO CAPAROSA", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "pcaparosa@gmail.com", "Demo123.", "ZONA 1", "ASE"),
//                new User(7, "312456789", "LUIS IXV UN SOL", ft.parse("1966-02-15"),"02","CR 34-45", "3168965645", "reysol@gmail.com", "Demo123.", "ZONA 1", "ASE")
//        ));
    }
}
