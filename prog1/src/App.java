import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        jogodavelha jogo = new jogodavelha();
        Scanner leitor = new Scanner(System.in);
        while((jogo.empate() == false) || (jogo.vitoria() == false))
        {
            System.out.print("Jogo da Velha:");
            System.out.print("\n");
            jogo.exibegrade();
            System.out.print("Jogador 1, digite as coordenadas da sua jogada nessa ordem: Linha e depois Coluna");
            int l = leitor.nextInt();
            int c = leitor.nextInt();
            if(jogo.jogar(l, c,0) !=true)
            {
                System.out.print("Jogador 1, digite as coordenadas da sua jogada nessa ordem: Linha e depois Coluna");
                int l1 = leitor.nextInt();
                int c1 = leitor.nextInt();
                jogo.jogar(l1,c1,0);
            }
            jogo.exibegrade();

            if(jogo.vitoria())
            {
                System.exit(0);
            }
            if(jogo.empate()==true)
            {
                System.out.print("Deu Velha!");
                System.exit(0);
            }
            System.out.print("Jogador 2, digite as coordenadas da sua jogada nessa ordem: Linha e depois Coluna");
            int l2 = leitor.nextInt();
            int c2 = leitor.nextInt();
            if(jogo.jogar(l2, c2,1) !=true)
            {
                System.out.print("Jogador 2, digite as coordenadas da sua jogada nessa ordem: Linha e depois Coluna");
                int l1 = leitor.nextInt();
                int c1 = leitor.nextInt();
                jogo.jogar(l1,c1,1);
            }
            jogo.exibegrade();

            if(jogo.vitoria())
            {
                System.exit(0);
            }
            if(jogo.empate()==true)
            {
                System.out.print("Deu Velha!");
                System.exit(0);
            }
        }
        
        
    }
}
