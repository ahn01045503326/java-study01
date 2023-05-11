package api.array_int;

public class MyIntArray {
    public static void main(String[] args) {
        // 정수 3개를 배열에 저장하고 출력하세요. =>[]
        IntArray list=new IntArray();  // 5크기의 정수형 배열
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
