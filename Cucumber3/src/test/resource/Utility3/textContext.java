package Utility3;

import java.util.HashMap;
import java.util.Map;

public class textContext {

	
	private Map<String,Object> current_Context;
	public  textContext() {
		current_Context=new HashMap<>();
		
	}
	public void set(String key,Object value) {
		
		current_Context.put(key, value);
		
	}
	public Object get(String key) {
		return current_Context.get(key);
	}
	
}
