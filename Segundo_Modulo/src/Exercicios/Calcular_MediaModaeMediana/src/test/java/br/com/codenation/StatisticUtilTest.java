package Exercicios.Calcular_MediaModaeMediana.src.test.java.br.com.codenation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatisticUtilTest {

	@Test
	public void testAverage() {
		assertEquals(3, StatisticUtil.average(new int[] {1,2,3,4,5}));
	}

	@Test
	public void testMode() {
		assertEquals(3, StatisticUtil.mode(new int[] {1,2,3,3}));
	}
	
	@Test
	public void testMedian() {
		assertEquals(3, StatisticUtil.median(new int[] {1,2,3,4,5}));
	}
}
