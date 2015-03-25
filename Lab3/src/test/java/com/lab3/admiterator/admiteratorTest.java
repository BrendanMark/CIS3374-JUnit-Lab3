package com.lab3.admiterator;
@RunWith(JUnitParameterRunner.class);

public class admiteratorTest {
	@Test
	@Parameters(method = "method_for_params")
	
	public void name_of_test(Type parameter1, Type param2)
	//{your test goes gere}
	
	private Object methos_for_params() {
		return new object[][]{{arg1_for_run1, arg2_for_run1, etc...},
				{arg1_for_run2, arg2_for_run2} };
		}
	}

}
