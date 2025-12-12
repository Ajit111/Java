public class CharacterCount{
	public static void main(String []args) {
		String str="Test";
		
		str=str.toLowerCase();
		Map<Character,Integer> map= new LinkedHashMap<>();
		for (int i=0;i<str.length();i++) {
			char c =str.charAt(i);
			int count =map.getOrDefault(c,0);
			map.put(c, count+1);
		}
		for (char key : map.keySet()) {
			System.out.println(key+"="+map.get(key));		
		}
	}
}	
