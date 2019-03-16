package cn.tju.swtest.lab1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cn.tju.swtest.lab1.Coin;
import junit.framework.Assert;

class testCoin {

	@Test
	void test_getChanged() {
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		boolean res1 = coin1.getChange(30);
		boolean res2 = coin2.getChange(34);
		Assert.assertEquals(true, res1);
		Assert.assertEquals(false, res2);
		
	}

}
