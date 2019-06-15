package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	private Mathutils mathutils;
	
	
	@BeforeEach
	void initEach() {
		mathutils = new Mathutils();
	}

	@Nested
	class AddTest {
		@Test
		void testAddingTwoPositives() {
			assertEquals(2, mathutils.add(1, 1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingTwoNegatives() {
			assertEquals(-2, mathutils.add(-1, -1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingAPositiveAndANegative() {
			assertEquals(0, mathutils.add(-1, 1), 
					"Add method should return the sum of two numbers");
		}
	}
	
	@Test 
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathutils.multiply(1, 0)),
				() -> assertEquals(1, mathutils.multiply(1, 1)),
				() -> assertEquals(6, mathutils.multiply(2, 3))
				);
	}
	
	@Test 
	void computeCircleArea() {
		assertEquals(314.1592653589793, mathutils.computeCircleArea(10), 
				"Should return right circle area");
	}
	
	@Test
	@DisplayName("Testing Divide method")
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathutils.divide(1, 0), 
				"Divide should throw ArithmeticException when denominator is zero");
	}
	
	
	
}