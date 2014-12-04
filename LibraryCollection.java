import java.util.Vector;
import java.io.Serializable;

public class LibraryCollection implements Serializable
{
	private Vector<Library> collection; //a collection of Movie objects
	private int libraryCount; //number of movies

	//------------------------------------------------------------------------------
	//생성자 - collection 을 생성하고, movieCount는 0으로 초기화한다.
	//------------------------------------------------------------------------------
	public LibraryCollection()
	{
		collection = new Vector<Library>(); 
		libraryCount = 0;
	}
	
	//------------------------------------------------------------------------------
	//movieCount 을 반환한다.
	//------------------------------------------------------------------------------
	public int getLibraryCount()
	{
		return libraryCount;
	}
	
	//------------------------------------------------------------------------------
	//movieCount 을 변경한다.
	//------------------------------------------------------------------------------
	public void setLibraryCount(int libraryCount)
	{
		this.libraryCount=libraryCount;
	}
	
	//------------------------------------------------------------------------------
	//특정 index 에 저장된 Movie 를 반환한다.
	//------------------------------------------------------------------------------
	public Library getLibraryAt(int index)
	{
		return collection.elementAt(index);
	}
	

	//------------------------------------------------------------------------------
	//collection 에 Movie 를 추가하고  movieCount 를 1 증가시킨다.
	//------------------------------------------------------------------------------
	public void addLibrary(Library m)
	{
		collection.add(m);
		libraryCount++;
	}
	
	//------------------------------------------------------------------------------
	//특정 index 에 저장된 Movie를 삭제하고  movieCount 를 1 감소시킨다.
	//------------------------------------------------------------------------------
	public void delLibrary(int index){
		collection.remove(index);
		libraryCount--;
	}
	
	//------------------------------------------------------------------------------
	//collection 에 담긴 영화 정보를 반환한다. 등록된 영화의 수와 각각의 영화 정보를 담고 있다.
	//------------------------------------------------------------------------------
	public String toString()
	{
		String report="★도서 정보★\n";
		report+=" 등록된 도서 : "+libraryCount+"권\n\n";
	
		for(int i=0;i<libraryCount;i++)
			report+=collection.elementAt(i).toString()+"\n";
		return report;
	}
	
}
