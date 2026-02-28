import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ukrishna.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {
	
	
	@Test
	public void whenEmptyString_thenAccept() { // isPalindrome
		UserServiceImpl palindromeTester = new UserServiceImpl();
	    assertTrue(palindromeTester.isPalindrome(""));
	    
	    assertTrue(palindromeTester.isPalindrome("noon"));
	    
	    assertFalse(palindromeTester.isPalindrome("neon"));
	}


}
