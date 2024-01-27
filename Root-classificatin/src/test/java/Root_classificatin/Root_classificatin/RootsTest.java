package Root_classificatin.Root_classificatin;
import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;
	//--------------------- A test--------------------------
	@Test
	public void testPartion1() 
	{
		Roots.calculate_roots(-2,1, 2);
		
		String  root_expected = Root_Types.ERROR.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void testPartionA_min() 
	{
		Roots.calculate_roots(0, 4, 5);
		String  root_expected = Root_Types.Not_quadratic.toString();
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionA_min_plus1() 
	{
		Roots.calculate_roots(1, 15, 22);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionA_max_menus1() 
	{
		Roots.calculate_roots(49, 37, 20);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionA_max() 
	{
		Roots.calculate_roots(50, 9, 15);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	//------------------------------------B test--------------------------------------------
	@Test
	public void testPartion2() 
	{
		Roots.calculate_roots(2, -1, 5);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void testPartionB_min() 
	{
		Roots.calculate_roots(9, 0, 5);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionB_min_plus1() 
	{
		Roots.calculate_roots(4, 1, 3);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionB_max_menus1() 
	{
		Roots.calculate_roots(4, 49, 9);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionB_max() 
	{
		Roots.calculate_roots(10, 50, 15);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	//----------------------------C test------------------------------
	@Test
	public void testPartion3() 
	{
		Roots.calculate_roots(2, 1, -2);
		
		String  root_expected = Root_Types.ERROR.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void testPartionC_min() 
	{
		Roots.calculate_roots(7, 6, 0);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionC_min_plus1() 
	{
		Roots.calculate_roots(10, 15, 1);
		
		String  root_expected = Root_Types.Two_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionC_max_menus1() 
	{
		Roots.calculate_roots(20, 13, 99);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void testPartionC_max() 
	{
		Roots.calculate_roots(22, 34, 100);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}
	@Test
	public void Nominal() 
	{
		Roots.calculate_roots(25, 25, 50);
		
		String  root_expected = Root_Types.No_roots.toString();
		
		
		assertEquals(root_expected, Roots.root_types().toString());
	}


	
	}
