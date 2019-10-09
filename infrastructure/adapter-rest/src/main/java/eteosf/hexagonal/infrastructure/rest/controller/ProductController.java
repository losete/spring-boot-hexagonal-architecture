package eteosf.hexagonal.infrastructure.rest.controller;

import eteosf.hexagonal.domain.model.Product;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProductController {

  @GetMapping("/product")
  ResponseEntity<List<Product>> getProducts();

  @PostMapping("/product")
  ResponseEntity<Void> addProduct(@RequestBody Product product);

  @DeleteMapping("/product")
  ResponseEntity<Void> removeProduct(@RequestBody Product product);

  @GetMapping("/product/{productId}")
  ResponseEntity<Product> getProductById(@PathVariable Integer productId);
}
