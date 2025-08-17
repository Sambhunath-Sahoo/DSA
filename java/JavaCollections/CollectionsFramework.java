

class Data {
    public Integer num;
    public String name;
    Data(Integer num, String name) {
        this.num = num;
        this.name = name;
    }
}

public class CollectionsFramework {

    public static void main(String[] args) {
        Data obj = new Data(1, "Sam");
        System.out.println(obj.name);
    }

}
