class outer{
    public void show(){
        System.out.println("inside outer class");
    }
    class inner{
        public static void show(){
            System.out.println("inside the inner class");
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        outer obj=new outer();
        obj.show();
        outer.inner obj1=new outer().new inner();
        outer.inner.show();
    }
}
