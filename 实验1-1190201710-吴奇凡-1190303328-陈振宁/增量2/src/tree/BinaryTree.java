
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
	private List<Integer> list=new ArrayList<>();
	public List<Integer> getTravelOrder(String choice)
	{
		list.clear();
		if(choice=="前序遍历")
		{
			preOrder(GetByNumber(1));
		}
		if(choice=="中序遍历")
		{
			inOrder(GetByNumber(1));
		}
		if(choice=="后序遍历")
		{
			postOrder(GetByNumber(1));
		}
		return list;
	}
	
	public void preOrder(Node node)
	{
		if(node!=null)
		{
			list.add((Integer)node.getNumber());
			preOrder(node.getLNode());
			preOrder(node.getRNode());
		}
	}
	public void inOrder(Node node)
	{
		if(node!=null)
		{
			
			inOrder(node.getLNode());
			list.add((Integer)node.getNumber());
			inOrder(node.getRNode());
		}
	}
	public void postOrder(Node node)
	{
		if(node!=null)
		{
			
			postOrder(node.getLNode());
			postOrder(node.getRNode());
			list.add((Integer)node.getNumber());
		}
	}
	
	
	
	public void DeleteNode(Node node) {
		Stack<Node> st = new Stack<>();
		st.push(GetByNumber(1));
		while(!st.empty()) {
			Node e = st.pop();
			if(e == null)continue;
			if(node.equals(e.getLNode())) {
				e.setLNode(null);
				break;
			}
			else {
				st.push(e.getLNode());
			}
			
			if(node.equals(e.getRNode())) {
				e.setRNode(null);
				break;
			}
			else {
				st.push(e.getRNode());
			}
		}
		
		st.clear();
		st.push(node);
		while(!st.empty()) {
			Node e = st.pop();
			if(e != null) {
				st.push(e.getLNode());
				st.push(e.getRNode());
				nodes.remove(e);
				//System.out.print(nodes.remove(e));
			}	
		}
		
	}
	
}

