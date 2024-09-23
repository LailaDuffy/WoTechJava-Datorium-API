package com.datorium.Datorium.API;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class  DatoriumApiApplicationTests {

	@Test
	void contextLoads() {
	}
	// test naming convention - GIVEN (What's given to the method), WHEN (The method that is run), THEN (The result of the method)
	@Test
	void WHEN_NameIsLailaAndSurnameIsDuffy_THEN_Result_Laila_Duffy() {
		// Arrange - prepare data and services
		UserService userService = new UserService();

		// Act - do some action, usually call the method
		String fullName = userService.getFullName("Laila", "Duffy");

		// Assert - test weather or not the result is correct

		Assert.isTrue(fullName.equals("Laila Duffy"), "THe name should be with a space in between and should contain both name and surname");
	}

	@Test
	void GIVEN_aIS5AndbIs78_WHENsum_THEN_Result_IS83() {
		MathService mathService = new MathService();
		int sum = mathService.sum(5, 78);
		Assert.isTrue(sum == 83, "THIS sum should be 83");
	}

	@Test
	void GIVEN_aIS55AndbIs78_WHENsum_THEN_Result_IS0() {
		MathService mathService = new MathService();
		int sum = mathService.sum(55, 78);
		Assert.isTrue(sum == 0, "THIS sum should be 0");
	}

}
