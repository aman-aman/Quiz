


@Controller
@RequestMapping("/submit/{userId}")
public class submitquiz {
	
	static Sring userid="10";
	
	void submitquizz(@PathVariable String UserId)
	{
		User user=getList(UserId);
		
		
	}

	private User getList(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
}


class emp
{
	
}

class user
{
	emp e;
	//cons inject
	user(emp e)
	{
		this.e=e;
	}
	
	
}

class user
{
	emp e;
	//setter inject
	void setemp(emp e)
	{
		this.e=e;
	}
	
	
}


interface chain{
	void nextchain(chain ch);
	void operation(Num req);
}
class Num
{
	int a;
	int b;
	String op;
}
class Add implements chain
{
	if(req=="Add")
	{
		
	}
	else
	{
		super.operation(req);
	}
}
class Sub implements chain
{
	
}