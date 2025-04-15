import java.util.HashMap;
import java.util.Map;

public class MapListPractise {

	public static void main(String[] args) {
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("user1", "0001");
		userMap.put("user2", "0002");
		//userMap.put("user3", null);
		userMap.put("user4", "0004");
		userMap.put(null, null);
		userMap.put("user6", "0006");
		//userMap.put(null, "0007");

		
		System.out.println(userMap);
		System.out.println(userMap);
		System.out.println(userMap.size());

		
		System.out.println(userMap.get("user1"));
		
		userMap.remove(null);
		
		System.out.println(userMap.get(null));
		
		System.out.println(userMap.containsKey(null));
		System.out.println(userMap.containsKey("user3"));

		System.out.println(userMap.containsValue(null));
		System.out.println(userMap.containsValue("0007"));


	
		System.out.println(userMap.size());
		
		System.out.println(userMap);

		
	}

}
