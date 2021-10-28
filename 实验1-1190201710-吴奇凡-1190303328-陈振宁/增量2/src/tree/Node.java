package tree;
import java.awt.Color;

import tree.Node;
public class Node {
	
	private int number;
	private int x,y,depth;
	private Color color;
	private Node LNode;
	private Node RNode;
	public Node(int number,int x,int y,int depth,Color color,Node LNode,Node RNode)
	{
		this.number = number;
		this.x = x;
		this.y = y;
		this.depth = depth;
		this.color = color;
		this.LNode = LNode;
		this.RNode = RNode;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Node getLNode() {
		return LNode;
	}
	public void setLNode(Node lNode) {
		LNode = lNode;
	}
	public Node getRNode() {
		return RNode;
	}
	public void setRNode(Node rNode) {
		RNode = rNode;
	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Node object = (Node) obj;
		
		//判断左子树是否相等
		if (LNode == null) {
			if (object.LNode != null)
				return false;
		} else if (!LNode.equals(object.LNode))
			return false;
		if (number != object.number)
			return false;
		if (RNode == null) {
			if (object.RNode != null)
				return false;
		} else if (!RNode.equals(object.RNode))
			return false;
		return true;
	}
		
	
	

}