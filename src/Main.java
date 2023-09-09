import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Объекты и Классы");
        System.out.println("------------");
        Author levTolstoy = new Author("Лев", "Толстой");
        Book sunday = new Book("Воскресенье", levTolstoy, 1899);
        System.out.println(sunday);
        System.out.println("------------");
        Author stanislavLem = new Author("Станислав", "Лем");
        Book techSum = new Book("Сумма технологий", stanislavLem, 1963);
        System.out.println(techSum);

    }

}