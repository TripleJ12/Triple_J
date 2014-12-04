import java.util.Vector;
import java.io.Serializable;

public class LibraryCollection implements Serializable
{
	private Vector<Library> collection; //a collection of Movie objects
	private int libraryCount; //number of movies

	//------------------------------------------------------------------------------
	//������ - collection �� �����ϰ�, movieCount�� 0���� �ʱ�ȭ�Ѵ�.
	//------------------------------------------------------------------------------
	public LibraryCollection()
	{
		collection = new Vector<Library>(); 
		libraryCount = 0;
	}
	
	//------------------------------------------------------------------------------
	//movieCount �� ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public int getLibraryCount()
	{
		return libraryCount;
	}
	
	//------------------------------------------------------------------------------
	//movieCount �� �����Ѵ�.
	//------------------------------------------------------------------------------
	public void setLibraryCount(int libraryCount)
	{
		this.libraryCount=libraryCount;
	}
	
	//------------------------------------------------------------------------------
	//Ư�� index �� ����� Movie �� ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	public Library getLibraryAt(int index)
	{
		return collection.elementAt(index);
	}
	

	//------------------------------------------------------------------------------
	//collection �� Movie �� �߰��ϰ�  movieCount �� 1 ������Ų��.
	//------------------------------------------------------------------------------
	public void addLibrary(Library m)
	{
		collection.add(m);
		libraryCount++;
	}
	
	//------------------------------------------------------------------------------
	//Ư�� index �� ����� Movie�� �����ϰ�  movieCount �� 1 ���ҽ�Ų��.
	//------------------------------------------------------------------------------
	public void delLibrary(int index){
		collection.remove(index);
		libraryCount--;
	}
	
	//------------------------------------------------------------------------------
	//collection �� ��� ��ȭ ������ ��ȯ�Ѵ�. ��ϵ� ��ȭ�� ���� ������ ��ȭ ������ ��� �ִ�.
	//------------------------------------------------------------------------------
	public String toString()
	{
		String report="�ڵ��� ������\n";
		report+=" ��ϵ� ���� : "+libraryCount+"��\n\n";
	
		for(int i=0;i<libraryCount;i++)
			report+=collection.elementAt(i).toString()+"\n";
		return report;
	}
	
}
