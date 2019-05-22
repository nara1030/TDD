package ex_02.test;

import org.junit.Test;

import ex_02.main.Account;

/*
 * - JUnit 도입
 *   - 단위 테스트 프레임 워크
 *   - TDD의 부흥을 만들었고, 소프트웨어 개발 방식의 전환을 만든 초석
 * - 예제에 도입한 건 JUnit 4 버전에서 사용하는 방식
 */


public class AccountTest {
	@Test
	public void testAccount() throws Exception {
		Account account = new Account();
	}
}
