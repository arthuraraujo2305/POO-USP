public class Main {
    public static void main(String[] args) {
        Futebol[] times = {
                new Futebol("Sao Paulo", 30, 100000),
                new Futebol("Palmeiras", 40, 50000),
                new Futebol("Sao Carlense", 10, 100)
        };

        System.out.println("Times antes da ordenação:");
        for (Futebol time : times) {
            System.out.println(time);
        }

        Sorter<Futebol> sorter = new Sorter<>();
        sorter.insertionSort(times);

        System.out.println("\nTimes após a ordenação (por capacidade do estádio):");
        for (Futebol time : times) {
            System.out.println(time);
        }
    }
}