package ex_04.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ex_04.main.Account;

/*
 * 1. fail();
 * 2. fail("getBalance() => " + account.getBalance());
 *   - �׽�Ʈ ���̽��� �⺻ ��� ��Ÿ��
 *   - ���󰪰� �������� ���ϴ� ������ �������� ������ ����!
 * 3. �� �� ������ ǥ��(if�� ��ü)
 *   A. assertEquals(����, ������)
 *   B. assertEquals("����", ����, ������)
 *     - �׽�Ʈ ���� �޽������� ��Ȯ�ϰ� ǥ���ϰ� ���� ���
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
		assertEquals("10000������ ���� ���� �� �ܰ� ��ȸ", 10000, account.getBalance());

		account = new Account(1000);
		assertEquals(1000, account.getBalance());

		account = new Account(0);
		assertEquals(0, account.getBalance());

	}
}