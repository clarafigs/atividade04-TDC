public class Main {
    public static void main(String[] args) {
        AutomatoPilha ap = new AutomatoPilha();


        String[] palavras = {"", "01", "0011", "000111", "001", "10", "0001111"};

        for (String palavra : palavras) {
            System.out.println("Palavra: " + palavra + " => " +
                    (ap.reconhecer(palavra) ? "Aceita" : "Rejeitada"));
        }
    }
}