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
		//System.out.print(T.getSequence());
		assertEquals(T.getSequence().size(), 2);//sequence��1�Ƴ��ˣ���Ϊ1���ҽڵ㶼����
		//�����ٲ����½ڵ�
		assertEquals(T.getNodes().size(),3);
		
		
		
	}
}
