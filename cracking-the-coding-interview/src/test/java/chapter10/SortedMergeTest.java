package chapter10;

import static chapter10.SortedMerge.merge;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class SortedMergeTest {
  @Test
  public void testMerge0() throws Exception {
    assertNull(merge(null, null));
  }

  @Test
  public void testMerge() throws Exception {
    int[] a = new int[]{1, 2, 5, 6, 7, 0, 0, 0, 0};
    int[] b = {-1, 4, 8, 11};
    assertArrayEquals(
      new int[]{-1, 1, 2, 4, 5, 6, 7, 8, 11},
      merge(a, b)
    );
  }

  @Test
  public void testMerge2() throws Exception {
    int[] a = new int[]{1, 2, 2, 3, 5, 0, 0, 0};
    int[] b = {10, 12, 13};
    assertArrayEquals(
      new int[]{1, 2, 2, 3, 5, 10, 12, 13},
      merge(a, b)
    );
  }
}