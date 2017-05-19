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
	@Test
	public void test43入れたらfourtythreeと表示される() {
		//fail("Not yet implemented");
		IntToEng ite=new IntToEng();
		String expected="fourty three";
		String actual=ite.translateEng(43);
		assertThat(actual,is(expected));
	}
	@Test
	public void test20入れたらtwentyと表示される() {
		//fail("Not yet implemented");
		IntToEng ite=new IntToEng();
		String expected="twenty ";
		String actual=ite.translateEng(20);
		assertThat(actual,is(expected));
	}
	@Test
	public void test0入れたらzeroと表示される() {
		//fail("Not yet implemented");
		IntToEng ite=new IntToEng();
		String expected="zero";
		String actual=ite.translateEng(0);
		assertThat(actual,is(expected));
	}
	@Test
	public void test456入れたらfourhundredandfiftysixと表示される() {
		//fail("Not yet implemented");
		IntToEng ite=new IntToEng();
		String expected="four hundred and fifty six";
		String actual=ite.translateEng(456);
		assertThat(actual,is(expected));
	}
	@Test
	public void test800入れたらeighthundredと表示される() {
		//fail("Not yet implemented");
		IntToEng ite=new IntToEng();
		String expected="eight hundred";
		String actual=ite.translateEng(800);
		assertThat(actual,is(expected));
	}
}
