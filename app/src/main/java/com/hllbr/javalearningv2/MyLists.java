package com.hllbr.javalearningv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyLists {
    public static void main(String [] args){
        //Listeler-Dizi Listeleri (Lists)
        /*
        Dizi yapımızın daha esnek çalışma koşullarına sahip halleri

         */
        ArrayList<String> myStringArrayList = new ArrayList<String>();
        myStringArrayList.add("@Prince");//Yeni bir eleman eklemek için add adlı bir metoda sahip arraylist'ler
        //liste elemanlarını yazdırmak için ...
       // System.out.println(myStringArrayList.get(0));//0.indexte bulunan elemanımı yaz
        myStringArrayList.add("hllbr");
        myStringArrayList.add("Halil İbrahim KOÇAK");
        //ekleme sırasında bir karışıklık olursa bir index kayması söz konusu olduğunda bu durumu düzeltecek bir bir ekleme yöntemi söz konusu listeler için

        myStringArrayList.add(2,"DEVELOPER IS @PRİNCE");
        for(String s : myStringArrayList){//bu yapı foreach döngüsü adını alır listeler üzerinde kolay bir gezinme yöntemi olarak kullanılır.
            System.out.println(s);
        }


        myStringArrayList.remove(3);
        myStringArrayList.remove("hllbr");//Liste içersindeki elemanları silmek için indexi yada direkt olarak değeri kullanabiliriz.

        System.out.println("**********************************");
        for(String s : myStringArrayList){
            System.out.println(s);
        }
        //Listelere benzeyen fakat ufarak kullanım farklılıkları bulunan başka liste benzeri yapıalrımız var bunlardan bir tanesi....


        //--SET--
        /*
        Bu yapıların arraylistelerden en büyük farkı bir elemanın listemizde sadce bir kez yer alabiliyor olmasıdır.
        sadece bir adet hllbr,@prince olabilir diyor ikinci kez aynı elemanı eklemeyi denersem kod yapısında sorun çıkarmaz fakat yazdırırken sadece bir kez elemanı yazdırır.ikinci satırdaki elemanı görmezden geliyor


         */


        System.out.println("***************************************************");
        System.out.println("Set listeleme yapısı = ");
        HashSet<String> mySet = new HashSet<String>();

        //bu yapıdada arrayList yapısında olduğu gibi kaç adet eleman olması gerektiğini yazmama gerek yok.

        mySet.add("hllbr");
        mySet.add("hllbr");
        for(String s : mySet){
            System.out.println(s);
            //hllbr adlı elemanlarımda sadece ilk sıradaki elemanı listeye atabildim.
        }
        //yapının boyutunu öğrenmem için size adı verilen bir metodu kullanırsam ikinci elemanın eklenmediğini anlayabilirim
        System.out.println("Set Listeleme yönteminin boyutu : "+mySet.size());//boyut burada 1 oalrak verildi yani 0. indexim dolu 1. indexim ise boş bu yapı sayesinde bunu anlamış oldum
        mySet.add("@prince");
        mySet.add("hllbr has a githup link");
        mySet.add("Has a character with hllbr egos");

        for(String s : mySet){
            System.out.println(s);//set listesinin eklemelerden sonraki son hali  son hali

        }


        mySet.remove("hllbr");
        mySet.remove(3);
        System.out.println("********** set listesinden indexle ve değerle çıkarma işlemi yapıldıktan sorna listenin son hali **********");
        for(String s:mySet){
            System.out.println(s);
        }


        //********************************************* HashMap Listeleme Yöntemi *********************************************
        /*
        key ve value olarak ifade edebileceğimiz bir eşleşme algoritması bulunmakta

         */
        System.out.println("*******************************************************");
        System.out.println("Haritalandrılabilen map yapısı == ");
        HashMap<String,String> myHashMap = new HashMap<String,String>();


        //burada add kelimesi yerine put yani koymak anlamında bir metod kullanıyoruz
        myHashMap.put("hllbr","@prince");//biz dizilerde indexleri kullanarak değerlere ulşıyorduk şimdi ise indexleride biz belirliyoruz gibi düşünmemiz doğru olacaktır.
        //bu yapıyı en çok internetten veri çekerken kullanıyoruz
        myHashMap.put("Güzel Ses","Veysel");
        myHashMap.put("Güzel Söz","uzun ince bir yoldayım");
        //burada haritalandırdığım yapı içerisinden veriyi almak için yine get methodunu kullanabiliyorum
        System.out.println(myHashMap.get("Güzel Ses"));
        System.out.println(myHashMap.get("hllbr"));
        System.out.println("*******************************************************");
        HashMap<String,Integer> myhash = new HashMap<String,Integer>();
        //Hashmap içerisinde key yada value ifadeleri primitive (ilkel) tip olamaz
        //Bu sebeble Integer Classtan türetilmesi şeklinde bir ifade kullandık
        //Integer int ifadesinden daha fazla yer kaplar bellekte .
        myhash.put("run",120);
        myhash.put("basketball",250);
        System.out.println("Basketbolun ortalma kalorisi "+myhash.get("basketball"));




    }
}
