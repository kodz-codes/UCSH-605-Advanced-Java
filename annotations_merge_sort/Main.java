import java.lang.annotation.*;
import java.lang.reflect.Method;

import annotations.*;


public class Main{

	public String execute () throws Throwable {
		Class<CustomController> controller = CustomController.class;
		//		Annotation[] annotations = controller.getDeclaredAnnotations();
		//		boolean restController = controller.isAnnotationPresent(RestController.class);
		RestController restController = controller.getAnnotation(RestController.class);
		if (restController != null){
			Method[] methods = controller.getMethods();
			for(Method method : methods) {
//				boolean requestMapping = method.isAnnotationPresent(RequestMapping.class);
				SortMapping sortMapping = method.getAnnotation(SortMapping.class);
				if (sortMapping.sort() != null) {
					if (sortMapping != null) {
						method.invoke(controller.newInstance());
					}
				}
			}
		}
		return null;
	}
	
	public static void main(String... args) {
		try {
			new Main().execute();
		} catch (Throwable e) {
		
		}
	}
}
								
