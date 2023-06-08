package method;

public class Method {

    /**
     * ამ ახალ მეთოდში რა თანმიმდევრობითაც გვაქვს დაწერილი პარამეტრები აუცილებლად იგივე თანმიმდევრობით უნდა გადავცეთ პარამეტრები
     * ანუ (String name, int age) ჯერ მითითებული მაქვს String და მერე int
     * <p>
     * void:
     * void-ით თუ არის შექმნილი მეთოდი ის მეთოდი პარამეტრებს არ დაგვიბრუნებს
     * თუ გვინდა რომ დაგვიბრუნოს მაგალითად int ან String უნდა დავწეროთ, მაგ.. public static int example(int x){
     * მეთოდის ბოლოს უნდა მიუწეროთ return;
     * თუ გვინდა რომ რაღაც ოპერაციები ანუ მეთოდები გამოვიყენოთ სხვაგან აუცილებლად არ უნდა გამოვიყენოთ void-იანი მეთოდი
     */


    // void-ის მააგალითი:
    public static int otherMethod (int x) {
        int result = x * 5;
        return result;
    }

    // მეორე მაგალითი
    public static String secondMethod (int y) {
        int result = y * 5;
        String math = "my result is " + result;
        return math;

    }


    // პარამეტრის გადაცემა ხდება ამ მეთოდის ბრჩხილებში ---> (String name, int age)
    public static void exemple (String name, int age) {

        System.out.println ("my name is" + " " + name + " " + age + "------------> 1");

    }

    // Java Scope: ცვლადები ხელმისაწვდომია მხოლოდ მათ მიერ შექმნილი ადგილიდან ქვემოთ.
    //Block Scope: ბლოკში დეკლარირებული კოდი ხელმისაწვდომია მხოლოდ ბლოკში.


    public static void main (String[] args) {


        /**
         *  რა არის მეთოდი:
         *  მეთოდი ყოველთვის უნდა შეიქმნას კლასის შიგნით. მეთოდში მეთოდის საშუალება არ შეიძლება.
         *  ჩვენ შეგვიძლია მეთოდში გადავცეთ მონაცემები, რომლებსაც პარამეტრები ეწოდება.
         *  მეთოდების მთავა აზრი ის არის რომ ჩვენ განვსაზღვრავთ კოდს ერთხელ და შემდეგ ვიყენებთ
         *  სხვადასხვა ადგილებში რამდენჯერაც გვინდა.
         */


        exemple ("Data", 50);
        exemple ("Nika", 27);
        exemple ("Natia", 30);

        System.out.println (otherMethod (3) + "-------> 2");
        System.out.println (secondMethod (2) + "------> 3");


    }


}


