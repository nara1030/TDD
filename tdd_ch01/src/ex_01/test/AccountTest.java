package ex_01.test;

import ex_01.main.Account;

public class AccountTest {
	public void testAccount() throws Exception {
		Account account = new Account();
		if (account == null) {
			throw new Exception("���»��� ����");
		}
	}

	public static void main(String[] args) {
		AccountTest test = new AccountTest();
		try {
			test.testAccount(); // �׽�Ʈ ���̽� ����
		} catch (Exception e) {
			System.out.println("����(X)"); // ���ܰ� �߻��ϸ� ����(X)
			return;
		}
		System.out.println("����(O)");
	}
}