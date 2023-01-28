package Gun11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a = -12;
        int b = 4;

        System.out.println("a nin mutlak degeri =   " + Math.abs(-12)) ;  // 12  (absoulte = mutlak) dan geliyor
        System.out.println("a ve b den büyuk olani= " + Math.max(a, b));  // 4 ü verir
        System.out.println("a ve b den kücük olan = " + Math.min(a, b));  // -12 gelir
        System.out.println("2 nin 3. kuvveti =      " + Math.pow(2, 3));  // 8 verir
        System.out.println("b nin karekökü=         " + Math.sqrt(b))  ;  // 2 verir
        System.out.println("round 3.1             = " + Math.round(3.1)); // 3
        System.out.println("round 3.5             = "   + Math.round(3.5)); // 4

        System.out.println("ceil 3.1 = " + Math.ceil(3.1)); // bu rakamdan büyük en yakın tam sayi = 4
        System.out.println("floor 3.1 =" + Math.floor(3.1)); // bu rakamdan kücük en yakin tam sayi = 3


        int enb = Gun20._01_JavaMethod.enbBul(a,b);


    }
}
