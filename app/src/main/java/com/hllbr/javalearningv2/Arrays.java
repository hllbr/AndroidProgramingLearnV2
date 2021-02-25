package com.hllbr.javalearningv2;

public class Arrays {
    // Diziler Bölümü

    public static void main(String [] args){
        //Yazmış olduğum programların çalışması için gerekli ana metod bu alandır.
        /*
        Diziler tüm yazılım dillerinde çok büyük öneme sahiptir.Dizi aslında bir veri koleksiyonu olarak tanımlanabilir.
        Birden çok veriyi bir arada tutmaya yarıyor .Birden çok string ,Birden çok integer ifade,birden çok double veri vb...
        Bunların düzenli olarak bir arada tutulması ve istediğimiz elemana istediğimiz zaman ulaşmaya olanak sağlayan bir yapı sunuyor diziler programlama içerisinde.

         */
        //Bir dizi oluşturmanın birden fazla yöntemi bulunmaktadır.
        /*
        burada direkt parantezi açığ direkt elemanları yerleştirebilirim yada ne tip bir obje oluşturduğumu yazıp sonradan elemanları ekleyebilirim.

         */
        String [] myStringArray = new String[3];//String classından bir string objesi(referansı oluştur) demiş oldum.Burada dizinin kaç elemandan meydana gelmesini istiyorsam bunu ifade edebilirim
       //yukarıda 3 elemana sahip olabilecek bir string dizisi oluşturdum burada dikkat edilmesi gerekn önemli nokta Stringlerin indexleri 0 dan başlamaktadır.
        myStringArray[0] = "HLLBR";//0. elemana HLLBR ifadesini atadım
        myStringArray[1] = "@Prince";
        myStringArray[2] = "105.66TL";

        System.out.println(myStringArray[0]);//myStringArray yazdır dediğimizd bizim için anlamsız olan bir ifade verir bu anlamsız veri nereye kaydedildiğidir biz bununla işlem yapmıyoruz şuan
        //biz 0. indexi yazdırmak istediğimizi ifade edersek sorun ortadan kalkar
        //Stringler ile aynı anda binlerce veri cekebilirim.İnternetten isimleri çektiğimde bunları arraylere atayarak üzerlerinde işlemler gerçekleştirebilirim.
        int [] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        System.out.println(myIntegerArray[0]);
        //dizilere verileri doğru şekilde işlersem çıktıları bu şekilde düznli olarak alabilrim.

        //Eğer dizinin sınırlarını belirlemişsem ve sınırın dışına çıkarak eleman eklersem arrayoutofbounds hatası ile karşılaşırım
        //bunlar içinde try catch bloklarımız var

        int[] myIntegerNumber = {1,2,3,4,5,6,7,8};
        System.out.println(myIntegerNumber[2]+myIntegerNumber[5]);//6+3



    }
}
