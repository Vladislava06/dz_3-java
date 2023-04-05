
import java.util.ArrayList;
import java.util.List;

public class task_3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");

        removeEvenNumber(strings);
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]

    }

    static void removeEvenNumber(List<String> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            try {
                Integer numb = Integer.parseInt(numbers.get(i));
                if(numb % 2 == 0){
                    numbers.remove(i);
                }
            }
            catch (NumberFormatException e)
            {

            }


        }
    }

    static void removeIntegers(List<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            try {
                Integer numb = Integer.parseInt(strings.get(i));
                if(numb <= 9 && numb >= -9){
                    strings.remove(i);
                }
            }
            catch (NumberFormatException e)
            {

            }


        }
    }
}

