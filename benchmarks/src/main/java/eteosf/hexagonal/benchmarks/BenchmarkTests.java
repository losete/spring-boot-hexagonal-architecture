package eteosf.hexagonal.benchmarks;

import eteosf.hexagonal.domain.model.Product;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import static org.junit.jupiter.api.Assertions.*;

public class BenchmarkTests {

  @Benchmark
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  @Warmup(iterations = 5)
  @Measurement(iterations = 10)
  @BenchmarkMode(Mode.AverageTime)
  public void benchmarkTestGetProductID(){
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    assertEquals((Integer) productId, p.getProductId());
  }
}
