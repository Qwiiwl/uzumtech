import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        String line = sc.nextLine();
		int n = sc.nextInt();
		String[] words = line.split("[^\\p{L}\\p{Nd}]");
		Map<String, Integer> count = new LinkedHashMap<>();
		for(String w: words) {
			if(w.isEmpty()) continue;
			String key = w.toLowerCase(Locale.ROOT);
			count.put(key, count.getOrDefault(key, 0) +1);
		}

		boolean found = false;
		for (Map.Entry<String, Integer> e: count.entrySet()) {
			if (e.getValue() == n) {
				System.out.println(e.getKey());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No words");
		}
	}
}
