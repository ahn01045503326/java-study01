package api.array_object;

public class ObjectArrayExam {
    public static void main(String[] args) {
        ObjectArray list = new ObjectArray();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}