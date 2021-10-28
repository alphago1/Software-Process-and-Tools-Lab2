package tree;
public interface tree
{
	//根据序号获取节点
	public Node GetByNumber(int number);
	
	//给父节点加子节点，lor=0加入左节点，lor=1加入右节点
	public void AddNode(Node father,int lor);
}