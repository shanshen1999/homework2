import java.util.Scanner;

public class HW4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();

        switch(month)
        {
            case 1:
                if(day<=19)
                    System.out.printf("Capricorn");//摩羯
                else
                    System.out.printf("Aquarius");// ⽔瓶
                break;
            case 2:
                if(day<=18)
                    System.out.printf("Aquarius");
                else
                    System.out.printf("Pisces");//雙⿂
                break;
            case 3:
                if(day<=20)
                    System.out.printf("Pisces");
                else
                    System.out.printf("Aries");// 牡⽺
                break;
            case 4:
                if(day<=19)
                    System.out.printf("Aries");
                else
                    System.out.printf("Taurus");//⾦⽜
                break;
            case 5:
                if(day<=20)
                    System.out.printf("Taurus");
                else
                    System.out.printf("Gemini");//雙⼦
                break;
            case 6:
                if(day<=21)
                    System.out.printf("Gemini");
                else
                    System.out.printf("Cancer");//巨蟹
                break;
            case 7:
                if(day<=22)
                    System.out.printf("Cancer");
                else
                    System.out.printf("Leo");// 獅⼦
                break;
            case 8:
                if(day<=22)
                    System.out.printf("Leo");
                else
                    System.out.printf("Virgo");// 處女
                break;
            case 9:
                if(day<=22)
                    System.out.printf("Virgo");
                else
                    System.out.printf("Libra");//天秤
                break;
            case 10:
                if(day<=23)
                    System.out.printf("Libra");
                else
                    System.out.printf("Scorpio");// 天蠍
                break;
            case 11:
                if(day<=22)
                    System.out.printf("Scorpio");
                else
                    System.out.printf("Sagittarius");//射⼿
                break;
            case 12:
                if(day<=21)
                    System.out.printf("Sagittarius");
                else
                    System.out.printf("Capricorn");//摩羯
                break;

        }
    }

}