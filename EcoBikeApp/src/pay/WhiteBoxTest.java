package pay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class WhiteBoxTest {

	PayPageController payPageController = new PayPageController();
	@Test
	void test1() {
		final int expected = 0;
		final int actual = payPageController.calculateMoney(1, 9);
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
		final int expected = 10000;
		final int actual = payPageController.calculateMoney(1, 20);
		Assert.assertEquals(expected, actual);
	}
	@Test
	void test4() {
		final int expected = 24000;
		final int actual = payPageController.calculateMoney(3, 60);
		Assert.assertEquals(expected, actual);
	}
	@Test
	void test5() {
		final int expected = 15000;
		final int actual = payPageController.calculateMoney(2, 30);
		Assert.assertEquals(expected, actual);
	}
}
