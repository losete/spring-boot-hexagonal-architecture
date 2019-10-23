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
