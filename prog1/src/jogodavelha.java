public class jogodavelha
{
    public int  grade[][] = new int[3][3];
    jogodavelha()
    {
        for(int c=0; c<3;c++)
        {
            for(int l=0;l<3;l++)
            {
                grade[l][c]=0;
            }
        }
    }
    void exibegrade()
    {
        for(int l=0; l<3;l++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print("["+grade[l][c]+']');
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    int getcasa(int l,int c)
    {
        return grade[l][c];
    }
    boolean jogar(int l,int c,int jogador)
    {
        if(jogador == 0 && getcasa(l,c) == 0)
        {
            grade[l][c] = 1;
            return true;
        }
        else if (jogador == 1 && getcasa(l,c) == 0)
        {
            grade[l][c] = -1;
            return true;
        }
        else if (getcasa(l,c) != 0)
        {
            System.out.print("Casa ja coupada,tente novamente");
            return false;
        }
        else
        {
            return false;
        }
        
    }
    boolean empate()
    {   int cont=0;
        for(int c=0; c<3;c++)
        {
            for(int l=0; l<3; l++)
            {
                if(grade[c][l] != 0)
                {
                    cont = cont+1;
                }
            }
        }
        if(cont==9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean vitoria()
    {
        for(int i=0; i<3; i++)
        {
            if((checacoluna(i) == 3) || (checacoluna(i) == -3))
            {
                if(checacoluna(i)== 3)
                {
                    System.out.print("Vitoria jogador 1");
                    return true;
                }
                else if(checacoluna(i)== -3)
                {
                    System.out.print("Vitoria jogador 2");
                    return true;
                }
            }
            else if((checalinha(i) == 3) || (checalinha(i) == -3))
            {
                if(checalinha(i)== 3)
                {
                    System.out.print("Vitoria jogador 1");
                    return true;
                }
                else if(checalinha(i)== -3)
                {
                    System.out.print("Vitoria jogador 2");
                    return true;

                }
            }
            
        }
        if((checadiagonal(0) == 3) || (checadiagonal(0) == -3))
        {
            if(checadiagonal(0)== 3)
            {
                System.out.print("Vitoria jogador 1");
                return true;
            }
            else if(checadiagonal(0)== -3)
            {
                System.out.print("Vitoria jogador 2");
                return true;
            }
        }
        else if((checadiagonal(2) == 3) || (checadiagonal(2) == -3))
        {
            if(checadiagonal(2)== 3)
            {
                System.out.print("Vitoria jogador 1");
                return true;
            }
            else if(checadiagonal(2)== -3)
            {
                System.out.print("Vitoria jogador 2");
                return true;
            }
        }
        return false;   
    }
    int checadiagonal(int ncoluna)
    {
        int soma = 0;
        int diagonal = ncoluna;
        if(diagonal==0)
        {
                for(int i=0; i<3; i++)
                {
                    soma = soma + grade[i][diagonal];
                    diagonal = diagonal +1;
                }
        }
        else if(diagonal==2)
        {
            for(int i=0; i<3; i++)
            {
                soma = soma + grade[i][diagonal];
                diagonal = diagonal -1;
            }
        }
    
        return soma;
    }


    int checalinha(int nlinha)
    {
        int soma=0;
        for(int i=0; i<3; i++)
        {
            soma = soma + grade[nlinha][i];
        }
        return soma;
    }
    int checacoluna(int ncoluna)
    {
        int soma=0;
        for(int i=0; i<3; i++)
        {
            soma = soma + grade[i][ncoluna];
        }
        return soma;
    }

}