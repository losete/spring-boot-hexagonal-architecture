package eteosf.hexagonal.benchmarks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import eteosf.hexagonal.domain.model.Product;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class BenchmarkTests {

  /**
   * Benchmark for testGetProductID.
   */
  @Benchmark
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public void benchmarkTestGetProductID() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    assertEquals((Integer) productId, p.getProductId());
  }

  /**
   * Benchmark for testSetProductID.
   */
  @Benchmark
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public void benchmarkTestSetProductID() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    productId = 2;
    p.setProductId(productId);
    assertEquals((Integer) productId, p.getProductId());
  }

  /**
   * Benchmark for testGetName.
   */
  @Benchmark
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public void benchmarkTestGetName() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    assertEquals(name, p.getName());
  }

  /**
   * Benchmark for testSetName.
   */
  @Benchmark
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public void benchmarkTestSetName() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    name = "Beeer";
    p.setName(name);
    assertEquals(name, p.getName());
  }

  /**
   * Benchmark for testGetDescription.
   */
  @Benchmark
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public void benchmarkTestGetDescription() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    assertEquals(description, p.getDescription());
  }

  /**
   * Benchmark for testSetDescription.
   */
  @Benchmark
  @OutputTimeUnit(TimeUnit.MILLISECONDS)
  public void benchmarkTestSetDescription() {
    int productId = 1;
    String name = "Beer";
    String description = "7%";
    Product p = new Product(productId, name, description);
    description = "13%";
    p.setDescription(description);
    assertEquals(description, p.getDescription());
  }

  /**
   * Main method.
   * @param args args if required
   */
  public static void main(String[] args) throws RunnerException {
    Options opt = new OptionsBuilder()
        .include(BenchmarkTests.class.getSimpleName())
        .warmupTime(TimeValue.milliseconds(1))
        .warmupIterations(5)
        .measurementTime(TimeValue.milliseconds(1))
        .measurementIterations(5)
        .mode(Mode.AverageTime)
        .build();

    new Runner(opt).run();
  }
}
