import java.util.Scanner;

public class CellPhoneService
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter maximum monthly talk minutes:");
        int maximumTalk = input.nextInt();
        System.out.println("Enter maximum monthly text messages sent:");
        int maximumTexts = input.nextInt();
        System.out.println("Enter maximum monthly data usage (GB):");
        int maximumData = input.nextInt();
        if (maximumTalk < 500 && maximumTexts == 0 && maximumData == 0)
           System.out.println("Plan A recommended at $49/month");
        else
            if (maximumTalk < 500 && maximumTexts > 0 && maximumData == 0)
                System.out.println("Plan B recommended at $55/month");
            else
                if (maximumTalk > 500 && maximumTexts < 100 && maximumData == 0)
                    System.out.println("Plan C recommended at $61/month");
                else
                    if (maximumTalk > 500 && maximumTexts >= 100 && maximumData == 0)
                        System.out.println("Plan D recommended at $70/month");
                    else
                        if (maximumData <= 2)
                            System.out.println("Plan E recommended at $79/month");
                        else
                            System.out.println("Plan F recommended at $87/month");
    }
}
