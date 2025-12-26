package src.main.com.java.ptc;

import java.util.Scanner;

public class Colors {
    public static void main(String[]args){
        //src.Colors colors = new src.Colors();
        //colors.colors_main();

    }
    public void colors_main(){

        //String initialization starts here.

String indigo = "Indigo is a color deeply connected to the soul and inner consciousness." +
        "\nIt represents strong intuition, inner strength, and spiritual awareness." +
        "\nIt reflects creativity, deep reflection, and the ability to explore inner truth." +
        "\nIndigo carries the feeling of mystery and the unknown." +
        "\nPeople who love indigo tend to think deeply and thoughtfully," +
        "\nwith a noble nature like purple," +
        "\nand a loyal heart like blue.";

String red = "Red represents love, passion, and powerful life energy." +
        "\nThose who are drawn to red are full of enthusiasm," +
        "\nstrong emotions, and courageous spirit." +
        "\nThey live boldly and express their feelings openly.";

String blue = "Blue symbolizes trust, loyalty, and sincerity." +
        "\nPeople who love blue carry calmness and peace within them." +
        "\nThey have gentle hearts," +
        "\nbut may sometimes feel quiet sadness beneath their calm surface.";

String orange = "Orange represents enthusiasm, vitality, and joyful energy." +
        "\nThose who like orange are confident and self-assured," +
        "\nwith a lively, healthy, and optimistic personality.";

String green = "Green symbolizes renewal, growth, and new beginnings." +
        "\nPeople who love green feel a deep connection with nature." +
        "\nThey are comforted by forests, mountains, and natural surroundings," +
        "\nand value balance and harmony in life.";

String yellow = "Yellow represents happiness, hope, and optimism." +
        "\nThose who love yellow tend to think positively" +
        "\nand bring brightness and warmth to others.";

String purple = "Purple symbolizes power, dignity, and deep mystery." +
        "\nIt reflects spiritual depth and hidden wisdom.";

String black = "Black represents darkness, depth, and mystery." +
        "\nAt the same time, it expresses comfort, protection," +
        "\nand a sense of quiet strength.";

String turquoise = "Turquoise symbolizes good fortune, creativity, and emotional balance." +
        "\nIt reflects calm energy and free expression.";

String pink = "Pink represents gentleness, tenderness, and love." +
        "\nIt also symbolizes emotional calmness," +
        "\nsensitivity, and soft compassion.";

String brown = "Brown represents strength, stability, and comfort." +
        "\nIt reflects warmth, simplicity," +
        "\nand a grounded, reliable nature.";

String gray = "Gray symbolizes calmness, neutrality," +
        "\nand a reserved, balanced personality.";

String white = "White represents simplicity, purity," +
        "\nand innocence." +
        "\nIt reflects clarity, peace, and a fresh beginning.";


        //String initialization ends here.

        for(int i = 0; i<100;i++) {


            //user choice for open and close the program starts here
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("\n"); // skips two lines
            System.out.print("Enter 'o' if you want to open the program\nor 'c' for close ---> ");
            String user_input1 = scanner1.nextLine();
            //user choice for open and close the program ends here

            if (user_input1.equals("o")) {


                //user input for choose the color starts here
                Scanner scanner = new Scanner(System.in);
                System.out.print("\nChoose your favorite color.\n1.Indigo = မဲနယ်ရောင်\n2.Red = အနီ\n3.Blue = အပြာ\n" +
                        "4.Orange = လိမ္မော်\n5.Green = အစိမ်း\n6.Yellow = အဝါ\n7.Purple = ခရမ်း\n" +
                        "8.Black = အမဲ/အနက်\n9.Turquoise = စိမ်းပြာ\n10.Pink = ပန်းရောင်\n" +
                        "11.Brown = အညို\n12.Gray = မီးခိုး\n13.White = အဖြူ\n\nEnter the number here ---> ");
                int user_input = scanner.nextInt();

                //switch case for user's favorite colors starts here
                switch(user_input){
                    case 1:
                        System.out.println(indigo);
                        break;
                    case 2:
                        System.out.println(red);
                        break;
                    case 3:
                        System.out.println(blue);
                        break;
                    case 4:
                        System.out.println(orange);
                        break;
                    case 5:
                        System.out.println(green);
                        break;
                    case 6:
                        System.out.println(yellow);
                        break;
                    case 7:
                        System.out.println(purple);
                        break;
                    case 8:
                        System.out.println(black);
                        break;
                    case 9:
                        System.out.println(turquoise);
                        break;
                    case 10:
                        System.out.println(pink);
                        break;
                    case 11:
                        System.out.println(brown);
                        break;
                    case 12:
                        System.out.println(gray);
                        break;
                    case 13:
                        System.out.println(white);
                        break;
                    default:
                        System.out.println("Something went wrong.  >-< \nPlease enter a number between 1 and 13.");

                }

                //switch case for user's favorite colors ends here

            } else if(user_input1.equals("c")) {
                break;
            }
        }

        //user input for choose the color ends here



    }
}

