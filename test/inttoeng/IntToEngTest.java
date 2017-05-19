package inttoeng;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class IntToEngTest {

	@Test
	public void test1と入れたらoneと表示される() {
		//fail("Not yet implemented");
		IntToEng ite=new IntToEng();
		String expected="one";
		String actual=ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	@Test
	public void test15入れたらfifteenと表示される() {
		//fail("Not yet implemented");
		IntToEng ite=new IntToEng();
		String expected="fifteen";
		String actual=ite.translateEng(15);
		assertThat(actual,is(expected));
	}

}
