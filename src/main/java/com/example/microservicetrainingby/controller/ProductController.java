package com.example.microservicetrainingby.controller;

import com.example.microservicetrainingby.model.Availability;
import com.example.microservicetrainingby.model.Capacity;
import com.example.microservicetrainingby.model.Product;
import com.example.microservicetrainingby.model.ProductList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class ProductController {

  @GetMapping(value = "/")
  public String helloWorld(){
    return "Hello World";
  }

  @PostMapping(value = "/sortProducts")
  public ResponseEntity<List<Product>> home(@RequestBody ProductList productList) throws Exception{
    SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
    Date date1 = formatter1.parse("2021-02-19");
    Product product1 = new Product("Prod2", "Trousers", "EACH", date1);
    Date date2 = formatter1.parse("2021-02-21");
    Product product2 = new Product("Prod1", "Shirt", "EACH", date2);
    Date date3 = formatter1.parse("2021-02-22");
    Product product3 = new Product("Prod3", "Tie", "EACH", date3);
    Date date4 = formatter1.parse("2021-02-24");
    Product product4 = new Product("Prod2", "Trousers", "EACH", date4);

    //DOUBT
    //where is the input hardcode, does not suppose that it comes from the input within the POST request?
    List<Product> sortedProductList = new ArrayList<>();

    return ResponseEntity.ok(productList.getProductList().stream()
        .sorted((p1, p2)->p2.getProductId().compareTo(p1.getProductId()))
            .sorted((p1,p2)->p2.getLaunchDate().compareTo(p1.getLaunchDate()))
        .collect(Collectors.toList()));
  }

  @GetMapping(value="/getProdAvailability")
  public ResponseEntity<?> getProdAvailability(@RequestParam String storeNumber){
    SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
    Availability availability1 = new Availability("Store001", "Prod1",1.0, new Date(2021-02-19));
    Availability availability2 = new Availability("Store001", "Prod1", 3.0, new Date(2021-02-20));
    Availability availability3 = new Availability("Store001", "Prod1",0.0, new Date(2021-02-21));

    List<Availability> availabilityList = new ArrayList<>();
    availabilityList.add(availability1);
    availabilityList.add(availability2);
    availabilityList.add(availability3);

    Capacity capacity1 = new Capacity("Store001", "Prod1", new Date(2021-02-19), 0.0);
    Capacity capacity2 = new Capacity("Store001", "Prod1",  new Date(2021-02-20), 2.0);
    Capacity capacity3 = new Capacity("Store001", "Prod1", new Date(2021-02-21),2.0);

    List<Capacity> capacityList = new ArrayList<>();
    capacityList.add(capacity1);
    capacityList.add(capacity2);
    capacityList.add(capacity3);

//fetchAvailability by storeNo
    // getCapacity by StoreNo

    Optional<Availability> fetchedAvailability = availabilityList.parallelStream().filter(p->p.getStoreId().equals(storeNumber)).findFirst();
    Optional<Capacity> fetchedCapacity = capacityList.parallelStream().filter(p->p.getStoreid().equals(storeNumber)).findFirst();


    return ResponseEntity.ok(availability1);
  }


}
