package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import tree.*;
public class binaryTest {
	@Test
	public void test()
	{
		BinaryTree T=new BinaryTree();
		assertEquals(1,T.GetByNumber(1).getNumber());
		T.AddNode(T.GetByNumber(1), 0);
		T.AddNode(T.GetByNumber(1), 1);
		System.out.print(T.getSequence());
		assertEquals(T.getSequence().size(), 2);//sequence把1移除了，因为1左右节点都有了
		//不能再产生新节点
		assertEquals(T.getNodes().size(),3);
		assertEquals("[1, 2, 3]", T.getTravelOrder("前序遍历").toString());
		assertEquals("[2, 1, 3]", T.getTravelOrder("中序遍历").toString());
		assertEquals("[2, 3, 1]", T.getTravelOrder("后序遍历").toString());
	}
}
