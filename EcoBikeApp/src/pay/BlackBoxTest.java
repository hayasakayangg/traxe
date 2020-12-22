package pay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class BlackBoxTest {
	PayPageController payPageController = new PayPageController();
	@Test
	void test1() {
		final int expected = 0;
		final int actual = payPageController.calculateMoney(1, 10);
		Assert.assertEquals(expected, actual);
	}
	@Test
	void test2() {
		final int expected = 13000;
		final int actual = payPageController.calculateMoney(1, 45);
		Assert.assertEquals(expected, actual);
	}
	@Test
	void test3() {
		final int expected = 24000;
		final int actual = payPageController.calculateMoney(2, 60);
		Assert.assertEquals(expected, actual);
	}
	@Test
	void test4() {
		final int expected = 0;
		final int actual = payPageController.calculateMoney(3, 7);
		Assert.assertEquals(expected, actual);
	}
	@Test
	void test5() {
		final int expected = 15000;
		final int actual = payPageController.calculateMoney(2, 20);
		Assert.assertEquals(expected, actual);
	}
}
