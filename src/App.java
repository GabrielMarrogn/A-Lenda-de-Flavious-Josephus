import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < a; i++) {

            int qtd = sc.nextInt();
            int salto = sc.nextInt();
            salto--;
            int index = 0;

            List<Integer> pessoas = new ArrayList<>();

            for (int k = 0; k < qtd; k++) {
                pessoas.add(k);
            }

            int result = matar(pessoas, salto, index);
            results.add(result);

        }

        for (int i = 0; i < a; i++) {
            System.out.println("Case " +(i+1) +": " +results.get(i));
            
        }

        sc.close();

    }

    public static int matar(List<Integer> pessoas, int salto, int index) {
    
        while(true){

        index = (index + salto) % pessoas.size();

        pessoas.remove(index);

        if (pessoas.size() == 1) {
            break;
        }
        }
        return pessoas.get(0) + 1;

        
    }
}
