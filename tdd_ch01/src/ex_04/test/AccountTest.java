package ex_04.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ex_04.main.Account;

/*
 * 1. fail();
 * 2. fail("getBalance() => " + account.getBalance());
 *   - 테스트 케이스의 기본 사상 나타냄
 *   - 예상값과 실제값을 비교하는 조건을 만족하지 않으면 실패!
 * 3. 좀 더 간편한 표현(if문 대체)
 *   A. assertEquals(예상값, 실제값)
 *   B. assertEquals("설명", 예상값, 실제값)
 *     - 테스트 실패 메시지까지 정확하게 표현하고 싶은 경우
 */
public class AccountTest {
	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);
	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		// assertEquals(10000, account.getBalance());
		assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());

		account = new Account(1000);
		assertEquals(1000, account.getBalance());

		account = new Account(0);
		assertEquals(0, account.getBalance());

	}
}
