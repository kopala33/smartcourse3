import java.util.ArrayList;
import java.util.Collections;

import static method.Method.otherMethod;

public class SmartCourse3 {


    public static void main (String[] args) {
        /**
         *   ArrayList: განსხვავდება Array-გან იმითი რომ Array-ში თუ კი რამის დამატება გინდა ძალიან რთულია და ArrayList-ში შეგიძლია ყველაფრის დამატება.
         *   ArrayList-ი მაგალითად სტრინგის თუ გვინდა (ArrayList<String> array = new ArrayList<String>();) მერეც შეგვიძლია რამდენი დამატება სტრინგიც გვინდა
         *   თუ გვინდა მაგალითად ამოვაპრინტეროთ  array.add("data"); ჩავწერთ System.out.println(array); ან თუ იქნება რამოდენიმე როგორც ქვემოთ მოცემულ მაგალითშია
         *   დაგვიპრინტავს array.add("data"); array.add("kopala");array.add("davit"); თუ ამ სამიდან კონკრეტულად გვინდა მხოლოდ ერთის ამოღეება მაგალითად ეს-> array.add("kopala");
         *   პრინტელენში დაუმატებთ ახალ ბრზანებას System.out.println(array.get(აქ მიუთითებთ ინდექს კოპალას შემთხვევაში არის--->1));
         *   თუ კონკრეტულად ერტი სტრინგის პრინტი გვინდა მაგ--> array.set(0, "davit"); პრინტში ჩავწერთ --> System.out.println(array.get(2)); 0, 1, 2რე ინდექსზეა "davit"
         *   თუ გვინდა ამ სამი სტრინგიდან მოვხსნათ ერთერთი "data" ამშემთხვევაში ვიყენებთ ამ ბრძანებას--> array.remove(0); დაპრინტშიც მითითებთ System.out.println(array);
         *   იმ შემთხვევაში თუ გვინდა რომ წავშალოთ ყველა ვაძლევთ ამ რზანებას array.clear(); პრინტშიც ესე System.out.println(array);
         *
         */


        ArrayList<String> array = new ArrayList<String> ();
        array.add ("data");
        array.add ("kopala");
        array.add ("davit");
        System.out.println (array);
        System.out.println (array.get (0));
        array.set (0, "davit");
        System.out.println (array.get (0));
        array.remove (0);
        System.out.println (array);
        array.clear ();
        System.out.println (array);

        /**
         * ArrayList ზომა სორტირება
         *
         */

        ArrayList<String> names = new ArrayList<String> ();
        names.add ("data");
        names.add ("davit");
        names.add ("datiko");
        names.add ("datuna");
        System.out.println (names.size ()); // პასუხი 4 ანუ დაასორტირა რომ ოთხი სახელი წერია
        // თუ მაგალითად მინდა შევცვალო ერთი მონაცემი მეორეთი. მაგ: "datuna" მინდა გადავაკეთო "kopala"-თი

        names.set (3, "kopala" + "---->kopala"); //ამ შემთხვევაში "datuna" იმყოვება 3-მე ინდექსზე
        System.out.println (names.get (3)); // პრინტში მივიღეთ "kopala" "datuna"-ნას მაგივრად

        // თუ მინდა რომ წავშალო რომელიმე მონაცემი
        names.remove (3);
        System.out.println (names); // წაშლის დათუნას იმიტომ რომ მიუთიტე 3-მე ინდექსი [data, davit, datiko]

        // და თუ მინდა მთლიანად წავშალო ყველა მონაცემი
        names.clear ();
        System.out.println (names + "--------------->[]");

        // სორტირება

        ArrayList<Integer> numbers = new ArrayList<Integer> ();
        numbers.add (28);
        numbers.add (72);
        numbers.add (9);
        System.out.println (numbers);
        Collections.sort (numbers); // for (int d: numbers){ გარეშე დაპრინტავს - დაასორტირებს ესე [28, 72, 9]

        // for each loop
        for (int d : numbers) {
            System.out.println (d + "----->ზრდადობის მიხედვით"); // პასუხი 9, 28, 72, ვერტიკალურად დაასორტირებს ზრდადობის მიხედვით
        }

        // ესეც იგივია for each loop-ის მაგალითზე ოღონდ გაშლილად დაწერილი

        for (int b = 0; b < numbers.size (); b++) {  // თუ ესეთი ვარიანტით დავამატებთ მეთოდს მაშინ გაგვიკეთებს Collections.reverseOrder ანუ შეგვიბრუნებს 72, 28, 9,
            System.out.println (numbers.get (b));

        }

        Collections.sort (numbers, Collections.reverseOrder ()); // ამ ლოგიკით ციფრებს რივერს გაუკეტებს ანუ შემოაბრუნებს
        System.out.println (numbers);
        for (int b : numbers) {
            System.out.println (b + "-------> reverse შებრუნებული");
        }


        /**
         *  რა არის მეთოდი:
         *  მეთოდი ყოველთვის უნდა შეიქმნას კლასის შიგნით. მეთოდში მეთოდის საშუალება არ შეიძლება.
         *  ჩვენ შეგვიძლია მეთოდში გადავცეთ მონაცემები, რომლებსაც პარამეტრები ეწოდება.
         *  მეთოდების მთავა აზრი ის არის რომ ჩვენ განვსაზღვრავთ კოდს ერთხელ და შემდეგ ვიყენებთ
         *  სხვადასხვა ადგილებში რამდენჯერაც გვინდა.
         */
         //---------------------------------------------------------------------------------------------------//




    }


}

