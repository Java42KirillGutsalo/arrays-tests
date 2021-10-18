package telran.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.util.ArraysOperations.*;

class ArraysOperationsTests {

	private static final String INSERTED_STRING = "World and ";
	private static final int INSERTED_NUMBER = 100;

	@Test
	void testInsert() {
		String arStr[] = {"hello", "Java"}; 
		String expectedStr[] = {"hello", INSERTED_STRING, "Java"}; 
		String actualStr[] = new String[arStr.length + 1];
		int indexInsert = 1;
		assertEquals(OK,insert(arStr, INSERTED_STRING, indexInsert, actualStr));
		assertArrayEquals(expectedStr, actualStr);
		assertEquals(WRONG_INDEX,insert(arStr, INSERTED_STRING, 100, actualStr));
		actualStr = new String[1];
		assertEquals(WRONG_RESULT_LENGTH,insert(arStr, INSERTED_STRING, indexInsert, actualStr));
		Integer numbers[] = {1, 2, 3};
		indexInsert = 0;
		Integer actualNumbers[] = new Integer[numbers.length + 1];
		Integer expectedFirst[] = {INSERTED_NUMBER, 1, 2, 3};
		insert(numbers,INSERTED_NUMBER, indexInsert, actualNumbers );
		assertArrayEquals(expectedFirst, actualNumbers);
		indexInsert = numbers.length;
		Integer expectedLast[] = { 1, 2, 3, INSERTED_NUMBER};
		insert(numbers,INSERTED_NUMBER, indexInsert, actualNumbers );
		assertArrayEquals(expectedLast, actualNumbers);
		
		
		
		
	}

	@Test
	void testRemove() {
		String arStr[] = {"hello", INSERTED_STRING, "Java"}; 
		String expectedStr[] = {"hello", "Java"}; 
		String actualStr[] = new String[arStr.length - 1];
		int indexRemove = 1;
		assertEquals(OK,remove(arStr, indexRemove, actualStr));
		assertArrayEquals(expectedStr, actualStr);
		assertEquals(WRONG_INDEX,remove(arStr, 100, actualStr));
		actualStr = new String[1];
		assertEquals(WRONG_RESULT_LENGTH,remove(arStr, indexRemove, actualStr));
		Integer numbers[] = {1, 2, 3};
		indexRemove = 0;
		Integer actualNumbers[] = new Integer[numbers.length - 1];
		Integer expectedFirst[] = {2, 3};
		remove(numbers, indexRemove, actualNumbers);
		assertArrayEquals(expectedFirst, actualNumbers);
		indexRemove = numbers.length - 1;
		Integer expectedLast[] = {1, 2};
		remove(numbers, indexRemove, actualNumbers );
		assertArrayEquals(expectedLast, actualNumbers);
	}

	@Test
	void testInsertSorted() {
		fail("Not yet implemented");
	}

	@Test
	void testAddLast() {
		int elementAddLast = 1;
		Integer numbers[] = {1, 2, 3};
		Integer actualNumbers[] = new Integer[numbers.length + 1];
		Integer expected[] = {1, 2, 3, 1};
		addLast(numbers, elementAddLast, actualNumbers );
		assertArrayEquals(expected, actualNumbers);
		actualNumbers = new Integer[1];
		assertEquals(WRONG_RESULT_LENGTH, addLast(numbers, elementAddLast, actualNumbers));
	}

	@Test
	void testAddFirst() {
		int elementAddFirst = -5;
		Integer numbers[] = {1, 2, 3};
		Integer actualNumbers[] = new Integer[numbers.length + 1];
		Integer expected[] = {-5, 1, 2, 3};
		addFirst(numbers, elementAddFirst, actualNumbers);
		assertArrayEquals(expected, actualNumbers);
		actualNumbers = new Integer[1];
		assertEquals(WRONG_RESULT_LENGTH, addFirst(numbers, elementAddFirst, actualNumbers));
	}

}
