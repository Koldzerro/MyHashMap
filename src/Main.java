public class Main {
        public static void main(String[] args) {
            MyHashMap<String, Integer> map = new MyHashMap<>();
            map.put("Лопата", 1);
            map.put("Грабли", 2);
            map.put("Ведро", 3);

            System.out.println(map.get("Грабли"));
            System.out.println(map.get("Лопата"));
            System.out.println(map.get("Ведро"));

            map.remove("Лопата");
            System.out.println(map.get("Лопата"));
        }
    }

