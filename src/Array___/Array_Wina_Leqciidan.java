package Array___;

public class Array_Wina_Leqciidan {


    // მინდა რომ დავბეჭდო მრავალგანზომილებიანი მასივის ყველა ელემენტი ერთად
    // აქ დაგჭირდება ორი for-loop-ი იმიტომ რომ ერთი for-ით მივწვდები მთლიან მასივებს{1, 2, 3, 4}, მეორე for-loop-ით მასივების შიგნით

    public static void test () {
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 3, 8, 9 }, { 3, 8, 9 }, { 3, 8, 9 }, { 3, 8, 9 } };
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[ i ].length; j++) {
                System.out.println (myNumbers[ i ][ j ]);
            }
        }

    }

    // გააკეთეთ ერთი მეთოდი სადაც შექმნით ასაკის შესამოწმებელ ლოდიკას, main მეთოდში კი გადაამოწმებთ სხვადასხვა ასაკზე,
    // სხვადასხვა ვარიანტი. ნაკლები 18,18 და 18-ზე მეტი (გამოძახება); დაწერეთ void-იანი და return-იანი მაგალითი


    // void-იანი მაგალითო
    public static void checkAge () {
        int age = 18;
        if (age < 18) {
            System.out.println ("ვერ შევა");
        } else if (age == 18) {
            System.out.println ("შევა თანხმობით"); // ამ მაგალითიდ მივიღებთ ერთ მნიშვნელობას ანუ -
        } else {                                   // - else if (age == 18)დაადასტურებს რომ 18 ტოლია 18-ზე
            System.out.println ("შევა");
        }
    }


    // ამ შემთხვევაში შემიძლია გამოვიტანო 3 სხვადასხვა მნიშვნელობა რომელსაც მიუთითებ
    // ამას--> (int age = 19;)  ატრიბუტს ჩაუწერთ მეთოდის ბრჩხილებში
    //


    public static void checkAge_1 (int age) {
        if (age < 19) {
            System.out.println ("ვერ შევა");
        } else if (age == 19) {
            System.out.println ("შევა თანხმობით");
        } else {
            System.out.println ("შევა");
        }
    }


    // void-ის გარეშე ანუ return-ით: რახან პრინტელენის გარეშეა შექმნილია მეთოდი main-ში ჩავსვავთ ესე System.out.println (checkAge_2 (20));

    // return-იანი მაგალითი
    public static String checkAge_2 (int age) {
        String result;
        if (age < 19) {
            result = "ვერ შევა";
        } else if (age == 19) {
            result = "შევა თანხმობით";
        } else {
            result = "შევა";
        }
        return result;
    }

    // ამის ზემოთ მაგალითის ესე დაწერაც შეიძლება
//    public static String checkAge_2 (int age) {
//        if (age < 19) {
//            return "ვერ შევა";
//        } else if (age == 19) {
//            return "შევა თანხმობით";
//        } else {
//            return "შევა";
//        }
//    }


    // შექმენი ინტეჯერების მასივი და იპოვეთ მასივის ელემენტების ჯამი

    // result-ი არის ნულიანი დაემატა array[i] ანუ მასივში 5-იანი გაიზარდა ერთით და result გახდა 5-თი შემდეგ 5-ს
    // დაემატა array[i] ანუ მაშივში მოცემული 6-ი და result-ის მნიშვნელობა გახდა 11-ტი შემდეგ კრუზე დაემატე ისევ ბოლო 5-თანი
    // და გახდება 16-ტი
    // დაპრინტვა უნდა გავიტანოთ ბრჩხილის გარეთ იმიტომ რომ რამდენჯერაც დატრიალდებოდა ციკლი იმდინჯერ დაპრინტავდა
    // ამ შემთხვევაშ ჩვენ გვჭირდება მხოლოდ ჯამი. main-შიც უნდა მიუტიტოდ მეთოდის სახელი sum ();


    public static void sum() {
        int[] array = {5, 6, 5};
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
            // result = result + array[i] ეს არის იდენტური მნიშვნელობა

        }

        System.out.println (result);
    }

    public static void main (String[] args) {
        test ();
        checkAge ();
        checkAge_1 (16);
        checkAge_1 (19);
        checkAge_1 (20);
        System.out.println (checkAge_2 (20) + "----------> ");
        sum ();


    }


}
