package tree;
public interface tree
{
	//������Ż�ȡ�ڵ�
	public Node GetByNumber(int number);
	
	//�����ڵ���ӽڵ㣬lor=0������ڵ㣬lor=1�����ҽڵ�
	public void AddNode(Node father,int lor);
}