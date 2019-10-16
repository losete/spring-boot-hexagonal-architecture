package eteosf.hexagonal.domain.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ProductTest {

  @Test
  public void testGetProductId() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    assertEquals((Integer) productId, p.getProductId());
  }

  @Test
  public void testSetProductId() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    productId = 2;
    p.setProductId(productId);
    assertEquals((Integer) productId, p.getProductId());
  }

  @Test
  public void testGetName() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    assertEquals(name, p.getName());
  }

  @Test
  public void testSetName() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    name = "Beeer";
    p.setName(name);
    assertEquals(name, p.getName());
  }

  @Test
  public void testGetDescription() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    assertEquals(description, p.getDescription());
  }

  @Test
  public void testSetDescription() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    description = "13%";
    p.setDescription(description);
    assertEquals(description, p.getDescription());
  }
}