package pack.API;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import Debug.Employee;

public class ReflectionAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		Class cls=e.getClass();
		System.out.println(cls.getName());
		
		Method[] meth=cls.getMethods();
		for(Method m:meth)
		{
			System.out.println(m.getName());
		}
		
		try {
			meth[0].invoke(e,null);
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
