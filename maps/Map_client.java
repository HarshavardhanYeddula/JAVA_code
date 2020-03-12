package maps;

public class Map_client {
    public static void main(String[] args) {
        MapUsingARRay map = new MapUsingARRay();
        map.put("a", "b");
        map.put("hash", "map");
        map.put("ac","b");
        System.out.println(map.get("a"));
        System.out.println(map.get("ac"));
    }
}
