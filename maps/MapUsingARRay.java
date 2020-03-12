package maps;



public class MapUsingARRay {
    private  Entity entity[] = new Entity[100];


    public void put(String key,String value){
         int hashcode = Math.abs(key.hashCode()%entity.length);
         entity[hashcode]=new Entity(key,value);
    }

    public String  get(String key){
        int hashcode=Math.abs(key.hashCode()%entity.length);

        if (entity[hashcode]!=null && entity[hashcode].key.equals(key)){
            return entity[hashcode].value;
        }
        return null;
    }


    public void remove(String key)
    {
        int hashcode=Math.abs(key.hashCode()%entity.length);
        if (entity[hashcode]!=null && entity[hashcode].key.equals(key)){
            entity[hashcode]=null;
        }
    }

    class Entity {
        String key;
        String value;


        Entity(String key, String value) {
            this.key=key;
            this.value=value;
        }
    }
}
