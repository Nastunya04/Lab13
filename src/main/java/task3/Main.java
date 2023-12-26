package task3;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        PDLReader pdl = new PDLReader();
        Company comp = pdl.parse("https://github.com/Nastunya04/Lab13");
        System.out.println(comp);
    }
}
