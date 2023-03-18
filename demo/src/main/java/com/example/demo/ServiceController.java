package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mycompany.app.Sorter;

@RestController
public class ServiceController{

	@RequestMapping("/Resource")
	public double[] service(){
		Sorter object = new Sorter();
		double arr[] = object.main();
		return(arr);
	}		
}
