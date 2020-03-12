//package maps;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class MAPARRAYLIST {
//    private ArrayList<LinkedList<Entity>> list = new ArrayList<>();
//
//    private MAPARRAYLIST() {
//        for (int i = 0; i < 100; i++) {
//            list.add(new LinkedList<>());
//
//
//        }
//    }
//
//    public void put(String key, String value) {
//        int hashcode = Math.abs(key.hashCode() % list.size());
//        LinkedList<Entity> entity = list.get(hashcode);
//        for (Entity e : entity) {
//            if (e.key.equals(key)) {
//                e.value = value;
//                return;
//
//            }
//
//        }
//        if (((float)(size))/list.size()>1f) {
//            rehash()
//        }
//        entity.add(new Entity(key, value));
//    }
//
//    public String get(String key) {
//        int hashcode = Math.abs(key.hashCode() % list.size());
//        LinkedList<Entity> entity = list.get(hashcode);
//        for (Entity e : entity) {
//            if (e.key.equals(key)) {
//                return e.value;
//            }
//        }
//        return null;
//    }
//
//
//    public String remove(String key) {
//        int hashcode = Math.abs(key.hashCode() % list.size());
//        LinkedList<Entity> entity = list.get(hashcode);
//        Entity temp = null;
//        for (Entity e : entity) {
//            if (e.key.equals(key)) {
//                temp = entity;
//            }
//        }
//        entity.remove(temp);
//        return temp.value;
//    }
//
//
//    private void rehash(){
//        ArrayList<LinkedList<Entity>> old = list;
//        list=new ArrayList<>();
//        for (int i = 0; i <old.size()*2; i++) {
//            list.add(new LinkedList<>());
//        }
//    }
//
//    class Entity {
//        String key;
//        String value;
//
//        Entity(String key, String value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
//}
//
//
