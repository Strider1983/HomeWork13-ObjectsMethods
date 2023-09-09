import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Объекты и Классы");
        System.out.println("------------");
        Author levTolstoy = new Author("Лев", "Толстой");
        Author stanislavLem = new Author("Станислав", "Лем");
        Author alexTolstoy = new Author("Алексей", "Толстой");
        Book sunday = new Book("Воскресенье", levTolstoy, 1899);
        System.out.println(sunday);
        Book techSum = new Book("Сумма технологий", stanislavLem, 1963);
        System.out.println(techSum);
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1865);
        System.out.println(warAndPeace);
        System.out.println(sunday.equals(warAndPeace));
    }

}