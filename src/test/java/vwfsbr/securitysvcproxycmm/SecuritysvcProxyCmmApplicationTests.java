package vwfsbr.securitysvcproxycmm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import vwfsbr.services.UserDto;
import vwfsbr.services.UserMock;
import vwfsbr.services.Impl.UserMockImpl;

@SpringBootTest
class SecuritysvcProxyCmmApplicationTests {

	@Test
	void contextLoads() {
		UserMock repo = new UserMockImpl();
		UserDto user = repo.obter("24880918806");

		assertNotNull(user);
		assertEquals("Kleber", user.getFirstname());
	}
}
