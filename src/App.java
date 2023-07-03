class A{
    int varA=10;
    void doA(){
        System.out.println("Nilai A :"+ varA);
    }
}

interface B{
    public void doB();
}
interface C extends B{
    public void doC();
}

public class App {
    public static void main(String[] args) throws Exception {
        A a = new A();
        a.doA();
        A a2 = new A(){
            void doA(){
                varA-=2;
                System.out.println("Nilai A :"+ varA);
            }
        };
        a2.doA();
        C c = new C(){
            public void doB(){
                System.out.println("Cetak B");
            }
            public void doC(){
                System.out.println("Cetak C");
            }
        };

    }
}
