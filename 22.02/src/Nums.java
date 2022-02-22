import java.util.Scanner;

public class Nums {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cate elemente sa contina array-ul : ");
        int nr = input.nextInt();
        int[] numbersArray = new int[nr];
        System.out.println("introdu cifrele pentru array");
        for(int i=0; i<nr;i++)
        {
            numbersArray[i]=input.nextInt();
        }
        //int[] numbersArray = {1,2,4,25,5,3,15,10};
        int count = 0;
        int sum = 0;
        int product = 1;
        int countimpar = 0;
        for(int i=0;i< numbersArray.length;i++)
        {
            if(numbersArray[i]%2==1){
                count++;
            }else{
                product*=numbersArray[i];
                countimpar++;
            }
            if(numbersArray[i]%5==0){
                sum+=numbersArray[i];
            }
        }
        System.out.println("count pt numere impare : " + count);
        System.out.println("suma pt numerele divizibile cu 5 : " + sum);
        if(countimpar>0) {
            System.out.println("produsul pt numerele divizibile cu 2 : " + product);
        }else {
            System.out.println("Nu exista numere divizibile cu 2");
        }

    }
}
