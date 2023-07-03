public class Luar {
    int varLuar = 11;
    void cetakLuar(){
        System.out.println("Hasil cetak luar : "
                +varLuar);
        //cetakDalam();
    }
    class Dalam{
        int varDalam = 10;
        void cetakDalam(){
            System.out.println("Hasil cetak dalam : "
                    +varDalam);
                    cetakLuar();
        }
    }
}
