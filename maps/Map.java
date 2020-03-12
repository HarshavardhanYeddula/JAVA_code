package maps;

import java.util.LinkedList;

public class Map {
    LinkedList<Entity> list = new LinkedList<>();

    public void push(String key, String value) {
        for (Entity entity : list) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;

            }

        }
        list.add(new Entity(key, value));
    }


    public String get(String key) {
        for (Entity entity : list) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
            return null;
        }



    public String remove(String key) {
        Entity temp = null;
        for (Entity entity : list) {
            if (entity.key.equals(key)) {
                temp = entity;
            }
            list.remove(temp);

        }
        return temp.value;
    }


    public void keyset(String  key) {
        for (Entity entity : list) {
            System.out.println(entity.key);
        }
    }


    class Entity {
        String key;
        String value;

        Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }

    }
}