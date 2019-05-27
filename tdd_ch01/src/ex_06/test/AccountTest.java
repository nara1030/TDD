package ex_06.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ex_06.main.Account;

public class AccountTest {
	private Account account;

	@Test
	public void testAccount() throws Exception {
		setup();
	}

	@Test
	public void testGetBalance() throws Exception {
		setup();
		// assertEquals(10000, account.getBalance());
		assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());

		account = new Account(1000);
		assertEquals(1000, account.getBalance());

		account = new Account(0);
		assertEquals(0, account.getBalance());
	}

	public void setup() {
		account = new Account(10000);
	}

	@Test
	public void testDeposit() throws Exception {
		setup();
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}

	@Test
	public void testWithdraw() throws Exception {
		setup();
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}
}
