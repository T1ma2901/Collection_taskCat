import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Cat> catsMap = new HashMap<>();
        catsMap.put("Bobo",new Cat("Bobo",2));
        catsMap.put("Timmy",new Cat("Timmy",1));
        catsMap.put("Molly",new Cat("Molly",4));
        catsMap.put("Lilo",new Cat("Lilo",3));
        catsMap.put("Jojo",new Cat("Jojo",5));
        catsMap.put("Flop",new Cat("Flop",7));
        catsMap.put("Olaf",new Cat("Olaf",6));
        catsMap.put("Bambl",new Cat("Bambl",4));
        catsMap.put("Puffy",new Cat("Puffy",3));
        catsMap.put("Piko",new Cat("Piko",1));


        for (Cat cats: catsMap.values()) {
            System.out.println(cats);
        }
        System.out.println("----------------------");
        System.out.println(catsMap.get("Bobo"));//return вывод

        catsMap.remove("Piko");//удаление ключа
        System.out.println("----------------------");
        System.out.println(catsMap.containsKey("Piko"));//возвращает true если есть такой ключ
        System.out.println("----------------------");
        System.out.println(catsMap.isEmpty());//boolean true если пуста коллкция
        System.out.println("----------------------");
        System.out.println(catsMap.keySet());//набор всех ключей возвращает
        System.out.println("----------------------");
        System.out.println(catsMap.values());//набор значений возвращает
        System.out.println("----------------------");
        System.out.println(catsMap.size());//возвращает количество элементов в коллекции
        catsMap.get("Olaf").setAge(1);//меняем значение
        catsMap.clear();//чистка коллекции
        for (Cat c:catsMap.values()) {
            System.out.println(c);
        }

    }
}
//Создайте класс Cat с полями имя, возраст.
//Создайте коллекцию HashMap<String, Cat>.
//Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//Вывести результат на экран, каждый элемент с новой строки.
//Реализуйте все известные вам методы HashMap.
//Выведите результат на консоль.