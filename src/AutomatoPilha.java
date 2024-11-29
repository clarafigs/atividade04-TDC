import java.util.Stack;

public class AutomatoPilha {
    private Stack<Character> pilha;

    public AutomatoPilha() {
        this.pilha = new Stack<>();
    }

    public boolean reconhecer(String palavra) {

        for (char c : palavra.toCharArray()) {
            if (c == '0') {

                pilha.push('0');
            } else if (c == '1') {

                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            } else {

                return false;
            }
        }


        return pilha.isEmpty();
    }
}
