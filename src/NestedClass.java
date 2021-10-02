public class NestedClass {
    static int a = 10;
    static class inner {
        int b = 20;
        public void display(){
            System.out.println(a+"  "+b);
        }
    }
}
class test{
    public static void main(String[] args) {
        NestedClass.inner obj = new NestedClass.inner();
        obj.display();
    }
}
