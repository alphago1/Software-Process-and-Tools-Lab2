package tree;

import java.awt.Color;
import java.util.*;

import tree.Node;

public class BinaryTree implements tree{
	private Node head=new Node(1, 200, 15, 0, Color.green, null, null);
	private List<Node> nodes=new ArrayList<>();
	private List<Integer>sequence=new ArrayList<>();
	public BinaryTree()
	{
		nodes.add(head);
		sequence.add(head.getNumber());
	}
	
	@Override
	public void AddNode(Node father,int lor)
	{
		Node node;
		if(lor==0)
		{
			node=new Node(father.getNumber()*2, father.getX()-100/(1<<father.getDepth()), father.getY()+40, father.getDepth()+1, father.getColor(), null, null);
			father.setLNode(node);
			if(father.getRNode() != null) {
				sequence.remove((Integer)father.getNumber());
			}
			
		}
		else
		{
			node=new Node(father.getNumber()*2+1, father.getX()+100/(1<<father.getDepth()), father.getY()+40, father.getDepth()+1, father.getColor(), null, null);
			father.setRNode(node);
			if(father.getLNode() != null) {
				sequence.remove((Integer)father.getNumber());
			}
		}
		nodes.add(node);
		sequence.add(node.getNumber());
		
	}

	@Override
	public Node GetByNumber(int number) {
		for (Node e:nodes)
		{
			if(e.getNumber()==number)
			{
				return e;
			}
		}
		
		return null;
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public List<Integer> getSequence() {
		return sequence;
	}
	
	
	
	
	
	
}
