package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import tree.*;
public class treeTest {
	@Test
	
	public void test()
	{
		tree T=new BinaryTree();
		assertEquals(1,T.GetByNumber(1).getNumber());
		T.AddNode(T.GetByNumber(1), 0);
		T.AddNode(T.GetByNumber(1).getLNode(), 0);
		assertNotEquals(T.GetByNumber(1),null);
		assertNotEquals(T.GetByNumber(2),null);
		assertNotEquals(T.GetByNumber(4),null);
		assertEquals(T.GetByNumber(3),null);
		assertEquals(T.GetByNumber(1).getDepth(),0);
		assertEquals(T.GetByNumber(2).getDepth(),1);
		assertEquals(T.GetByNumber(4).getDepth(),2);
		
	}
}
