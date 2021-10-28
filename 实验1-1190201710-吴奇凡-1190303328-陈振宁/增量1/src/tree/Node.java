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
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node object = (Node) obj;
		if(object.number!=this.number||object.color!=this.color
		||object.depth!=this.depth||object.x!=this.x||object.y!=this.y)
			return false;
		//判断左子树是否相等
		if(object.LNode==null)
		{
			if(this.LNode!=null)
			{
				return false;
			}
			else
			{
				if(!(this.LNode.equals(object.LNode)))
				{
					return false;
				}
			}
		}
		
		if(object.RNode==null)
		{
			if(this.RNode!=null)
			{
				return false;
			}
			else
			{
				if(!(this.RNode.equals(object.RNode)))
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	

}
