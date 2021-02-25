package com.hllbr.javalearningv2;

public class Statements {
    public static void main(String [] args){
        //-------------------------------------------- OPERATORLER --------------------------------------------
        int x = 5 ;
        System.out.println(x);
        x = x + 1 ;
        System.out.println(x);
        x ++;
        System.out.println(x);
        x--;
        System.out.println(x);
        --x;
        System.out.println(x);
        ++x;
        System.out.println(x);

        int y = 4 ;

        //Kontrol mekanizması =

        System.out.println(x>y);//True değer döndürür

        System.out.println(y>x);//False değer döndürür

        System.out.println("****************************************");

        System.out.println("Y ifadesinin değeri 30 olarak güncellendikten sonra : ");

        y = 30 ;//y ifadesinin değerini final anahtar kelimesi kullanmadığım için istediğim noktalarda tekrara güncelleyebiliyorum

        System.out.println(x>y);//False değer döndürecek

        System.out.println(y>x);//True değer Döndürecek

        System.out.println("x ifadesi 36 olarak değiştirildiğinde >= şeklinde gösterilen ifadenin u : ");
        x = 36;

        System.out.println(x>=y);
        //bu yapılar içerisinde = ifadesi kullacak olursak xi y değerine eşitle oalrak programımız tarafından algılanacaktır.Bunun yerine == ifadesi kullanıyoruz

        System.out.println(x == y );//False ifade döndürülecektir.

        //Eşit değiller mi şeklinde bir sorgulama yapmak için != sembolleri birlikte kullanılmalıdır

        System.out.println(x != y);//True ifade döndürülecektir


        /*
        Programlamada en çok kullanılan yapıların başında (and) && , (or) || yapıarlı gelmektedir.

        Matematik ve felsefe derslerinde de gösterilen logaritmalarıkn temelinde bulunan bir işaretleme , sorgulama ,filtreleme ki en çok bunun için kullanılır yapılarımız mevcuttur

        Ve yapımız sorguda her iki veya daha fazla sorgum varsa her biri doğru ise True ifade döndürecektir

        Veya ifadesi ise tek bir şartın doğru olması durumunda True ifade döndürür.

         X ve Y değişkenlerimin değerlerini değiştirerek yeni yapılar kurmaya çalışıyorum
         */

        x = 3;
        y = 4 ;
        int z = 5;

        System.out.println("/--------------------------------------------------------/");

        System.out.println("Yeni Sorgularımız : ");

        System.out.println("&&");

        System.out.println(x<y && y<z);//True ifade döner

        System.out.println(x<y && z<y);//z<y den kaynaklı olarak False ifade döner

        System.out.println("||");

        System.out.println(y<z || z<x);//y<z ifadesinden kaynaklı olarak True ifade döner

        //IF STATEMENT == Eğer(if) Kontrölleri ==

        //bu yapıları eğer şu olursa(Koşul sağlanırsa) bunları(bunu) yap şekilde bir tanımlama (sorgulama) katmanı olarak ifade edebiliriz

        //if programlamada ingilizcede olduğu gibi eğer anlamına gelmektedir.

        if(x<y){
            //eğer parantez içerisindeki koşul geçerli ise süslü parantezlerin içerisindeki metod,mewtodlar,işlem,işlemleri yap diyoruz

            //Her Kod bloku kendi içinde bir süslü parantez yapısına sahip olmak zorunda....

            //Buradaki yapılar sadece ve sadece koşul geçerli olursa devreye girecek ve çalıştırılacaktır

            System.out.println("y ifadesi x ifadesinden büyüktür");

            System.out.println("y is bigger");

            System.out.println("hllbr is @prince");

        }else{
            //buradaki kodlar ise şart yerine gelmediğinde koşul sağlanmadığında çalıştırılacak kodları ifade eder

            System.out.println("X ifadesi y ifadesinden büyüktür");

            System.out.println("x is bigger");

            System.out.println("hllbr has big dreams");

        }
        System.out.println("Bu alan ise şart(koşul) dan bağımsız şekilde çalıştırılır.");

        //sadece bir koşulun sağlanması yada sağlanmaması durumu değil diğer ihitimaller içinde sorgular yapılabiliyor bunun için else if adlı bir yapı kullanılmaktadır

        if(z>x){

            System.out.println("z is bigger");

        }else if(z == x){

            System.out.println("z is equal x");

        }else if(z<x){

            System.out.println("x is bigger");

        }
        /*

        else'i olmayan yada yukarıda gösterildiği gibi else if'i olmayan sadece if yazılabilir fakat

        if'i olmayan bir else yada ifi olmayan bir else if yazılamaz .....!!!!!!

        Operatorleri if-else if yapıları içerisinde kullanabiliriz.
         */

    if(x>y || y<z){

        System.out.println("if Build is active");//çalıştırılan kod blok bu alandadır.

    }else if(x==y && y!=z){

        System.out.println("else if Build is active");

    }else{

        System.out.println("else build is active");

    }
    //--------------------------- Switch ---------------------------
        //swtich değiştirmek anlamına gelmektedir

         int day = 3 ;

    String dayString = "";//boş string quotation mark ile oluşturabiliriyoruz

        if(day == 1){

            dayString = "monday";

        }else if(day == 2){

            dayString = "Tuesday";

        }else if(day == 3){

            dayString = "Wednesday";

        }else{

            dayString = "Sunday";

        }
        System.out.println(dayString);

            //Bu işlemin aynısını switch yapısı ile gerçekleştirebilirim

        day = 1 ;
        switch (day){//bu alanda parametre olarak neyi değiştireceksek onu veriyoruz


            case 1 :
                dayString = "Monday";
                break;//fren/kırmak/durmak anlamına geliyor
            case 2 :
                dayString = "TuesDay";
                break;
            case 3 :
                dayString = "Wednesday";
                break;
            default://else gibi bir yapı default = direkt bana gelen standart değer anlamını taşımakta (hiçbirşey yapılmadğı taktirde gerçekleştirilecek işlemler)
                dayString = "Sunday";
                break;


        }
        System.out.println("Switch işleminin sonucu : "+dayString);

        //Bazı örnekleri switch ile yapmak daha kolay olabiliyor if yapısına göre .Durum(Olay) Çok özel olmadıkça programcılar tarafıdan çok tercih edilmiyor.





    }
}
