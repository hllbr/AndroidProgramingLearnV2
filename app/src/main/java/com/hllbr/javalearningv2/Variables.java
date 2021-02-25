package com.hllbr.javalearningv2;

public class Variables {
    public static void main(String [] args){
    /*

    Bu alanda oncreate metodum bulunmakta adroid programlamada bu oncreate metoum uyguluma ilk açıldığında gerçekleştirilecek işlemleri yaptığım alan
    constructur gibi ama çalışma prensibi biraz farklı
    uygulama açıldığında kullanıcı daha uygulamayı görmeden uygulanan kısımdır.OnCreate metodu

     */
        System.out.println("Merhaba Android");

        System.out.println("Merhaba Java");

        System.out.println("Merhaba Digitalist Şehzade");

        System.out.println("@Prince");

        System.out.println(5*2);
        /*
        Değişkenler = Variables

        neden değişkenler var ?

        Eğer ben bir kişinin yaşı , maaşı , veya uygulama içerisinde belirli noktalarda farklı değerler almasını istediğim bir verim varsa yada sabit olarak kalmasını istediğim bir ifade varsa bunu sistemimde değişken olarak tanımlıyorum

        Örnek alt satırdadır -->>

         */

        //int ifadesei integer yani tam sayı anlamına geliyor
        int age = 20 ;
        //System.out.println(10*20); yapmak yerine age olarak tanımlamış odluğum ifade ile 10 değerini çarpabilirim
        //uzun denklemlerde bu yapıyı kullanmak büyük bir kolaylık sağlamktadır
        System.out.println("age * 10 = "+age*10+" age is 20");

        //bu age ifadesini başka işlemlerimdede kullanabilirim yukarda olduğu gibi yazdırabilirim yada çarpma bölme kalan bulma çıkarma vb....

        System.out.println("age ifadesinin 5 değerine bölümü = "+ age/5);//bölme işlemi

        //bir kalan işlemi yapmam gerekirse

        System.out.println("age ifadesinin 5 ile bölümünden kalan = "+age%5+ " dır");

        System.out.println("age ifadesinin 4 ile bölümünden kalan = "+age %4 +" dır");

        int x = 5 ;

        int y = 10 ;
        System.out.println("*********");
        System.out.println("bölme işlemi ");
        System.out.println(y/x);
        System.out.println("*********");
        System.out.println("kalan bulma");
        System.out.println(y % x );
        //bu alanda y ifademi eğer güncellersem
        int yy = 11 ;
        System.out.println("YY ifadesinin güncellenmesinden sonra işlemler : ");
        System.out.println("*********");
        System.out.println("Bölme işlemi sonucu");
        System.out.println(yy / x);
        System.out.println("*********");
        System.out.println("Kalan Bulma İşlemi Sonucu");
        System.out.println(yy% x);
        /*
        iki bölme işleminin sonuçlarının aynı olmasının sebebi iki ifadeyide integer yani tam sayı olarak tanımlamış olmamızdır
        İşlem sonucunu kesinliğe yaklaştırmak istersek bunun içinde farklı değişken Türlerimiz Mevcuttur.
         */
        //Double -- Float
        /*
        Eğer işlemlerimi Double yada Float tanımlasaydım işlem sonucum daha hassas olacaktır
         */
        double z = 5.0;

        double zz = 11.0;

        System.out.println("Double Veri Tipi ile Bölme İşlemini Tekrarlarsak ");
        System.out.println("sonucumuz "+zz/z+" çıkacaktır.");
        /*

        Yapmış olduğum işlem aynı fakat sonuç artık eskiye nazaran daha hassas
        Double ifade değişkenimizin küsürata sahip olduğunu dolayısıyla işlemin sonucunun küsüratlı çıkabileceğini ifade ediyor.
        Double tanımlama dışında birde tür dönüşümü var iki integer değer ile yaptığım işlemin sonucunu hasssaslaştırmak içinde bu dönüşümlerden faydalanabilirim.
         */
        System.out.println("Tür Dönüşümü ile integer değerlerin bölüm sonbucunu double bir ifade olarak alabilirim.Alt metinde gördüğünüz gibi");
        System.out.println((double) yy/x);
        /*
        Tam bir sıralama yapmam gerekirse
        INTEGER--LONG--FLOAT--DOUBLE şeklinde verilerin hassasiyetlerini tanımlamış olurum
        int bir ifade 32 bitlik bir alan kaplar belleğimizde
        long 64 bitlik bir alan kaplar
        float 32 bitlik yer kaplarken
        Double veri tipi ise bellekte 64 bitlik ver kaplamaktadır
        Bu bilgi yaptığınız projede hafızaya yönelikse bu konu diğerlerinden daha ağırlıklıysa
        o zaman dikkate almak gerekir diğer durumlar için genellikle tercih edilen veri tiplerimiz sabittir
        Örneğin float veri tipi yerine genellikle double veri tipi tercih edilir.
         */
        //bir long ifadesi tanımlama örneği =
        long mylong = 10 ;
        System.out.println("******");
        System.out.println("Long değişkeni ile bir işlemi gerçekleştirecek olursak : "+mylong/5);
        //Float bir tanımlama örneği =
        float myfloat = 10.0f;
        /*
        float tanımlamanın diğerlerinden bir farkı bulunuyor bunun tanımlamasında sonda f ile bu değerin float olduğunu belirtmek gerek derleyici bu konuda programcıyı uyarıyor
        Float işlemi ifade etmek için bir ayrıştırma yöntemi olarak sonuna f koyuyuroz.
        Sırf bu sonuna konulan f ifadesi unutulabildiği için programcılar bunu kullanmayı genellikle tercih etmiyorlar


         */
        System.out.println("******");
        System.out.println("Float ifade ile işlemimizi gerçekleştirecek olursak : "+ myfloat/5);

        //Veri Tipleri ve Değişkenler 2. Kısım ==

        System.out.println("*********************************************************************");
        System.out.println("Veri Tipleri ve Değişkenler 2. Kısım ==");

        double pi = 3.14 ;
        int r = 5 ; //dairenin yarıçapı 5 olsun

        System.out.println("Dairenin alanı : "+pi*r*r);
        System.out.println("Dairenin Çevresi : "+2*pi*r);

    /*
    Double bir ifade ile integer bir ifadeyi işleme sokarsak işlem java tarafından double olarak algılanacaktır.Sonuç buna göre elde edilmiş olur.
    Değişkenler illa numara olmaz zorunda değil kelime kelime grupları karakterlerde değişken olarak tanımlanabilir.

     */
    //String == Meting Değişkenleri ==

        /*
        Stringlerde S büyük harftir bunun sebebi ise String klasından bir referans oluşturuyor ve bu referansa değer ataması yapıyor olmamızdır.int değerden farkı mantığıdır.

         */
        String username = "@PRİNCE";
        String username2 = "H2lbr";
        String name  ="Halil İbrahim";
        String sirname = " KOÇAK";
        //Stringler ifadelerde toplama işlemi gerçekleştirilebilir.Diğer işlemleri yapamıyoruz String ifadelerde

        System.out.println("*********");
        System.out.println("String ifadelerin toplamı : ");
        System.out.println(username+" "+username2);
        System.out.println(name+" "+sirname);

        //Boolean Veri Tipleri == Doğruluk/Yanlışlık İfadeleri

        boolean alive = true;//bu yapılar bir oyun içerisinde karakter ölümü değilmi kullanıcı giriş ekranı için düşünecek olursak tüm haklarını kullanıcı kullandımı kullanmadımı şeklinde sorgular yaparken kullanılırız.
        //bu yapının değeri diğer satırlarda değiştirilebilir.

        System.out.println("Karakter hayatta mı ? "+alive);
        alive = false ;
        System.out.println("Kullanıcı Giriş Ekranında Şifre Deneme Hakkım Kaldı mı ? "+alive);

        //String ifadelerde tanımlama yaparken "" işareti kritik önem arz etmekte
        //String = 40; hatalı kullanım
        //Değişken veri tipini belirledikten sonra buna belirtilen veri için sadık kalmak gerekiyor.
        //Bu yapı Python Yazılım Tipi için geçerli değil Python Yazılım dili javaya göre bu konuda daha fazla esneklik sağlamakta programcısına

        //********************************* DEĞİŞKEN VE SABİT KAVRAMLARI """""""""""""""""""""""""""""""""""""""""""""
        //Bir değişkenin değerini veri tipine sağdık kalmak koşulu ile değiştirebiliyoruz.Bunun için Final Anahtar Kelimesini Kullanıyoruz.

        int myinteger = 58;
        System.out.println("myinteger : "+myinteger);
        myinteger = 85 ;
        //istediğim bir yerde bu myinteger değişkeninin değerini değiştirebiliyorum.Bunu engellemek için final anahtar kelimesini kullanıyorum
        //Javada diğer dillerde olduğu gibi kodlar yukardan aşağıya doğru sıra sıra çağrıldığı için ...
        System.out.println("muinteger : "+myinteger);

        //eğer ben değişken tanıumlanırken final anahtar kelimesini kullanırsam bu benim için artık değişmeyecek bu benim bundan sonraki kodlarım için standart oalcak bir nevi bir sabit olacak bilgisini vermiş oluyoruz.
        //bunun amacı çok uzun kodlarda yada karmaşık kod dizinlerinde yada internetten veri indirirken verilerin değerleri değişmesin istiyorsam bu yapıyı kullanmalıyım



        final int aliler = 5885555;//standart bir sabit oluşturdum
        final String veliler = "Delidir";
        System.out.println("veliler "+veliler+" bu sebeple "+aliler+" kez ağırlaştırılmış şakalara maruz kalırlar:)");

    }
}
