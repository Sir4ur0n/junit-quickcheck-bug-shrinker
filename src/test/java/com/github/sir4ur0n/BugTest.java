package com.github.sir4ur0n;

import static org.assertj.core.api.Assertions.assertThat;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.When;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class BugTest {

  @Property(maxShrinks = 100000, maxShrinkTime = 60_000_000, maxShrinkDepth = 5000)
  public void testShrink(@When(seed = -4493071121312539862L) int number) {
    assertThat(number).isLessThan(8);
  }

}
