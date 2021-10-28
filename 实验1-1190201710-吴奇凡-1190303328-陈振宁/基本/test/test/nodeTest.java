package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.awt.Color;

import org.junit.Test;

import tree.*;
public class nodeTest {

	@Test
	public void test()
	{
		Node A = new Node(342, 201, 220, 0, Color.BLACK, null, null);
		assertEquals(342, A.getNumber());
		assertEquals(201, A.getX());
		assertEquals(220, A.getY());
		assertEquals(0, A.getDepth());
		assertEquals(Color.black, A.getColor());
		assertEquals(null, A.getLNode());
		assertEquals(null, A.getRNode());
		BinaryTree B=new BinaryTree();
		B.AddNode(B.GetByNumber(1), 0);
		assertNotEquals(B.GetByNumber(1).getLNode(),null);
		assertEquals(B.GetByNumber(1).getRNode(),null);
		B.AddNode(B.GetByNumber(1), 1);
		assertNotEquals(B.GetByNumber(1).getRNode(),null);
	}
	
}
