public class Sorter{
	Strategy strategy;

	Sorter()
	{
		strategy = null;
	}

	double[] Sort(double arr[] , Strategy strategy)
	{
		return strategy.sortstrategy(arr);

	}

	double[] Sort(double arr[])
	{
		return strategy.sortstrategy(arr);
	}

	void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;

	}

	public static void main(String[] args)
	{
		Sorter sorter = new Sorter();
		double temp[] = {1,14,12,1,2,3,4};

		double output[] = sorter.Sort(temp,new Bubblesort());

		for(int i =0 ; i < output.length ; i++ )
		{
			System.out.println(output[i]);
		}

		output = sorter.Sort(temp, new Insertsort());

		for(int i =0 ; i < output.length ; i++ )
		{
			System.out.println(output[i]);
		}	

		output = sorter.Sort(temp, new MergeSort());

		for(int i =0 ; i < output.length ; i++ )
		{
			System.out.println(output[i]);
		} 
	}
}

