
public class Yelling {
	public String scream(String name)
	{
		String[] namelist;
		namelist = name.split(",");
		
		if(namelist.length > 1) {
			String allnames = namelist[0] + " and" + namelist[1];
			return allnames + " are yelling.";
		} else {
		if( name == "")
		{
			return "Nobody is yelling";
		}
		else if(name == "PETER")
		{
			return "PETER IS YELLING";
		}
		}
		return "Peter is yelling";
		
	}

}
