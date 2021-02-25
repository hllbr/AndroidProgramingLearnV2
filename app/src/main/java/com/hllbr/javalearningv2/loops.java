package com.hllbr.javalearningv2;

public class loops {
    public static void main(String [] args){

        // ******************************************** DÖNGÜLER (LOOPS) ********************************************

        /*
        for loop (for döngüsü)

        Dizilerle çalışıyoruz çünkü döngüleri genellikle dizilerle kullanırız.

        Döngüler bize belirli bir veri koleksiyonu içerisinde aynı işlemi devamlı yapma olanağı sağlayan metodlardır.


         */
        int [] myNumbers = {12,13,15,17,85,21,58};

        int x = myNumbers[0] /3 * 5 ;

        System.out.println(" x ifadesinin 0.index için karşılığı " + x + " dir");//tüm indexler için bu işlemi bu şekilde yapmak zaman ve alan kaybı oluşturur bu yükten kurtulmak için for döngüsü yazarım

        for(int i = 0;i<myNumbers.length;i++){//verdiğimiz koşul devam ettiği sürece devam eden bir döngüdür.For Loop
            int y = myNumbers[i] / 3 * 5 ;
            System.out.println("x ifadesinin " + i + ".index için karşılığı " + y + " dir");




        }



        //For loop V2 ==
        System.out.println("2. for döngüsü = ");

        for(int number : myNumbers){

            //for number in mynumbers anlamına gelmekte yapım == dizinin elemanlarını al ve number adlı değişkene eşitle şeklinde ifade etmiş oldum
            System.out.println(number);

        }

        //for loop sadece dizilerle kullanılmaz .Fakat dizilerle iyi bir uyumu olduğu için genellikle bu yapılarla birlikte kullanmayı tercih ediyoruz


        //********************************* While Loop ---------------------------------------

        /*
        While kelimesinin anlamı şu olurken bu olurken şeklinde ifade edilebilir.

        kullanım mantığı olarak x ifadesi y ifadesinden küçük olduğu sürece büyük olduğu sürece eşit olmadığı sürece vb ....

        Devam et şeklinde düşünülebilir.

         */
        System.out.println("While Loop");

        int j = 0;

        while(j<10){

            //bu alada illa j ile işlem yapmaya gerek yok bundan bağımsız işlemlerde yapılabilir.

            //Bu alan içinde en çok dikkar edilmesi gerekn konu sonsuz döngü oluşmamasına dikkat etmemiz gerekiyor.

            System.out.println("Test");//sadece bu işlemi yapar ve kodu çalıştırırsam programımı sonsuz döngüye girer bunu istemiyorsam butlaka döngüyü kıracak bir işlem yada işlem dizisi yazmam gerekiyor

            j++;//sonsuz döngüyü kıracak yapıya bir örnek olabilir.
            int m = j * 18;

            System.out.println(m);

        }





    }
}
