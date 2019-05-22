package ex_03.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import ex_03.main.Account;

public class AccountTest {
	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		if (account.getBalance() != 10000) {
			fail("Error occurred!");
		}
	}
}
