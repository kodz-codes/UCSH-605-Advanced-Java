import annotations.*;

@RestController(number = 10)
public class CustomController {

	@SortMapping()
	public void method() {
		double[] list = {1, 5, 2, 3, 9, 0};
		Class<Sorter> sorter = Sorter.class;
		double[] output = sorter.Sort(list, new MergeSort());
		for(int i =0 ; i < output.length ; i++ )
		{
			System.out.println(output[i]);
		} 
	}
		
		
	/*@RequestMapping
	public String method () {
		System.out.println("Sairam0");
		return "Sairam";
	}
	
	@RequestMapping(invoke = true)
	public String method1 () {
		System.out.println("Sairam1");
		return "Sairam";
	}
	
	@RequestMapping
	public String method2 () {
		System.out.println("Sairam2");
		return "Sairam";
	}
	
	@RequestMapping(invoke = true)
	public String method3 () {
		System.out.println("Sairam3");
		return "Sairam";
	}  */
}
