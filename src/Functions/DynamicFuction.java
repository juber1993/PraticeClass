package Functions;
import org.testng.annotations.Test;



@Test
public class DynamicFuction extends Calldriver
{

	XpathLoc  loc= new XpathLoc ();
	Values val= new Values();
	public void dynamicFunction()
	{
		typeByXpath(loc.emailxpath, val.Email);
		typeByXpath(loc.idxpath, val.Pass );
	}
}
