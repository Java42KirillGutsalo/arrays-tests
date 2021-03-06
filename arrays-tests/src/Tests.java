import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTests {

	@Test
	void simpleArrayTests() {
		int ar[] = new int[10];
		ar[9] = 2;
		assertEquals(2, ar[9]);
		int ar1[] = ar;
		ar1[9] = 20;
		assertEquals(20, ar1[9]);
		assertEquals(20, ar[9]);
		
	}
	@Test
	void swapTests () {
		int ar[] = {-10, 20, 12, 40};
		assertEquals(40, ar[3]);
		assertEquals(12, ar[2]);
		//swap
		int tmp = ar[3];
		ar[3] = ar[2];
		ar[2] = tmp;
		assertEquals(12, ar[3]);
		assertEquals(40, ar[2]);
	}
	@Test
	void twoDimensional1() {
		int ar[][] = {{1, 2, 3}, {10, 20 , 30}, {100, 200, 300}};
		assertEquals(20, ar[1][1]);
	}
	@Test
	void twoDimensional2() {
		int ar1[] = {10, -3, 8};
		int ar2[] = {-7, 11};
		int ar3[] = {1, 2, 3 ,4};
		int ar[][] = {ar1, ar2, ar3};
		ar[1][1] = 10;
		assertEquals(10, ar2[1]);
	}
	@Test
	void systemArrayCopy1() {
		int ar[] = new int[5];
		int ar1[] = {1, 2, 3};
		int ar2[] = {4, 5};
		int expected[] = {1, 2, 3, 4, 5};
		System.arraycopy(ar1, 0, ar, 0, ar1.length);
		System.arraycopy(ar2, 0, ar, 3, ar2.length);
		assertArrayEquals(expected, ar);
		
	}
	@Test
	void systemArrayShift() {
		int ar[] = {1, 2, 3, 4, 5};
		System.arraycopy(ar, 1, ar, 0, ar.length - 1); //{2, 3, 4, 5, 5};
		ar[ar.length - 1] = 0;
		int expected[] = {2, 3, 4, 5, 0};
		assertArrayEquals(expected, ar);
	}
	@Test
	void systemArrayDelete() {
		int ar[]= {1, 2, 3, 4, 5};
		int actual[] = new int[4];
		int expected[] = {1, 2, 4, 5};
		//TODO make sure the following assert will pass using System.arraycopy
		System.arraycopy(ar, 0, actual, 0, 2);
		System.arraycopy(ar, 3, actual, 2, 2);
		assertArrayEquals(expected, actual);
	}
	@Test
	void systemArrayInsert() {
		int ar[]= {1, 2, 3, 4, 5};
		int actual[] = new int[6];
		int expected[] = {1, 2, 3,-10, 4, 5};
		//TODO make sure the following assert will pass using System.arraycopy
		System.arraycopy(ar, 0, actual, 0, 3);
		actual[3] = -10;
		System.arraycopy(ar, 3, actual, 4, 2);
		assertArrayEquals(expected, actual);
	}
	@Test
	void arraysCopyOf() {
		//TODO write tests for Arrays.copyOf functionality according to the doc
		int ar[] = {1, 2, 3, 4, 5, 6, 7};
		int expected[] = {1, 2, 3, 4};
		int actual[] = Arrays.copyOf(ar, 4);
		assertArrayEquals(expected, actual);
	
	}
	@Test
	void arraysCopyOfRange() {
		//TODO write tests for Arrays.copyOfRange functionality according to the doc
		int ar[] = {0, -34, 99, 156, 999, 23, 54, 77};
		int expected[] = {99, 156, 999, 23};
		int actual[] = Arrays.copyOfRange(ar, 2, 6);
		assertArrayEquals(expected, actual);
	}
	

	@Test
	void arraysBinarySearch() {
		//TODO write tests for Arrays.binarySearch functionality according to the doc
		int ar[] = {10, 20, 30, 40, 50, 60, 70};
		int expected = Arrays.binarySearch(ar, 40);
		assertEquals(3, expected);
		int expected1 = Arrays.binarySearch(ar, 33);
		assertEquals(-4, expected1);
	}

}
