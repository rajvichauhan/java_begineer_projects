import java.time.LocalTime;
import java.util.*;

class WPMCounter4copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logic4copy a[] = new logic4copy[9999];
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println(" Welcome to the Typing Tutor! ");
        System.out.println(
                "---------------------------------------------------------------------------------------------");

        System.out.print("Enter your Username : ");

        String userName = sc.nextLine();
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out
                .println(" Hello, " + userName + "!                                                             ");
        System.out.println(" By using Typing Tutor, you can improve your typing speed and accuracy.");
        System.out.println(" You will be presented a sentence or some random words to type.        ");
        System.out.println(" The exercise you get is be based on the difficulty level you choose.  ");
        System.out.println(" After each exercise, we'll provide feedback on your typing speed      ");
        System.out.println(" in Words Per Minute (WPM) and your typing accuracy.                   ");
        System.out.println(" Challenge yourself and track your progress with each session.         ");
        System.out.println(
                "---------------------------------------------------------------------------------------------");

        for (int i = 0; i < 9999; i++) {
            a[i] = new logic4copy();
        }
        int count = 1;
        char yn;
        for (int i = 0; i < 9999; i++) {
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
            System.out.println(" Choose your difficulty level                                          ");
            System.out.println(" Press 1 for EASY                                                      ");
            System.out.println(" Press 2 for MEDIUM                                                    ");
            System.out.println(" Press 3 for HARD                                                      ");
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
            int level = 0;
            boolean flag = true;
            while (flag) {
                level = sc.nextInt();
                if (level != 1 && level != 2 && level != 3) {
                    System.out.println(
                            "---------------------------------------------------------------------------------------------");
                    System.out.println(" Invalid choice. Please choose from one of these options 1,2 or 3      ");
                    System.out.println(
                            "---------------------------------------------------------------------------------------------");
                    System.out.println();
                } else {
                    flag = false;
                    break;
                }
            }
            if (level == 1) {
                a[i].setEasy();
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                System.out.println(" Now press ENTER to get started and then type the displayed sentence.  ");
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                sc.nextLine();
                sc.nextLine();
                a[i].Method1();
            } else if (level == 2) {
                a[i].setMedium();
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                System.out.println(" Now press ENTER to get started and then type the displayed sentence.  ");
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                sc.nextLine();
                sc.nextLine();
                a[i].Method1();
            } else {
                a[i].setHard();
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                System.out.println(" Now press ENTER to get started and then type the displayed sentence.  ");
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                sc.nextLine();
                sc.nextLine();
                a[i].Method1();
            }
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
            System.out.println(" DO you want to continue?(Y/N) ");
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
            yn = sc.next().charAt(0);
            if (yn == 'N' || yn == 'n') {
                break;
            } else {
                count++;
                continue;
            }

        }
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println(
                " Would you like to review the Words Per Minute (WPM) and accuracy for all your attempts \nbefore ending your session?(Y/N) ");
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        char yn2 = sc.next().charAt(0);
        if (yn2 == 'Y' || yn2 == 'y') {
            for (int i = 0; i < count; i++) {
                System.out.println();
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                System.out.println(" Below are the performance records for Attempt Number " + (i + 1)
                        + " showcasing your Words Per Minute \n(WPM) and accuracy results. ");
                a[i].displayRecords();

            }
            System.out.println();
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
            System.out.println(
                    "Thank you for choosing Typing Tutor! We appreciate your commitment to \nimproving your typing skills. Happy typing!");
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
        } else {
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
            System.out.println(
                    "Thank you for choosing Typing Tutor! We appreciate your commitment to \nimproving your typing skills. Happy typing!");
            System.out.println(
                    "---------------------------------------------------------------------------------------------");
            System.exit(0);
        }
    }
}

class logic4copy {
    String sentences[];
    String line, input, userName;
    double grossWPM, accuracy;
    int correctWordCount;
    int incorrectWordCount;
    double netWPM;
    Scanner sc = new Scanner(System.in);

    void setEasy() {
        sentences = new String[] {
                "my favorite color is blue",
                "i enjoy going for walks in the park",
                "apples are a tasty and healthy snack",
                "i like to play with my pet dog in the backyard",
                "reading a good book is a relaxing activity",
                "sunsets are beautiful with their vibrant colors",
                "i often listen to music while doing homework",
                "cats are soft and make great companions",
                "i have a collection of colorful butterflies",
                "learning new things is always an adventure",
                "i like to draw and express my creativity",
                "playing games with friends is a lot of fun",
                "i dream of traveling to exotic places someday",
                "rainbows appear after the rain with bright colors",
                "ice cream is a delightful treat on a hot day",
                "birds chirping in the morning is a soothing sound",
                "i enjoy spending time with my family",
                "the ocean waves crashing are a calming sight",
                "balloons add a festive touch to celebrations",
                "i love to explore nature and discover new things"
        };

    }

    void setMedium() {
        sentences = new String[] {
                "Learning to code is like learning a new language for computers.",
                "The internet connects people from all around the world.",
                "Plants need sunlight, water, and nutrients to grow.",
                "Reading books is a great way to expand your knowledge.",
                "Cats and dogs make wonderful pets and companions.",
                "Mathematics helps us solve problems and understand patterns.",
                "A healthy diet includes a variety of fruits and vegetables.",
                "Bicycling is a fun and eco-friendly way to stay active.",
                "Colors can evoke different emotions and feelings.",
                "Listening to music can be a relaxing and enjoyable activity.",
                "The sun rises in the east and sets in the west.",
                "Oceans are home to a diverse range of marine life.",
                "Plants convert carbon dioxide into oxygen through photosynthesis.",
                "Happiness often comes from appreciating the simple things in life.",
                "Kindness and empathy can make the world a better place.",
                "Rivers play a crucial role in supporting ecosystems and wildlife.",
                "Exploring nature and spending time outdoors has many health benefits.",
                "Reading fairy tales can spark creativity and imagination.",
                "The moon reflects the sunlight and has phases.",
                "Recycling helps reduce waste and protects the environment." };

    }

    void setHard() {
        sentences = new String[] {
                "My enjoys color is walks in favorite park blue going for.",
                "Apples a my in to pet tasty play and snack dog with healthy are.",
                "A a relaxing is activity reading good book.",
                "The and beautiful vibrant with are colors sunsets.",
                "I often music while to listen homework doing.",
                "The screen flickered normal computer returning before briefly to.",
                "A a a is butterfly I of have collection colorful.",
                "A nature explore to to I exotic of dream places is someday travel.",
                "I to with family enjoy time spending my.",
                "Delightful is a ice treat on cream hot day a.",
                "Balloons a touch festive add celebrations to.",
                "Giraffe fits its a head on with hat a wears that cat a.",
                "It, but rope jump can't tree a on.",
                "Monkey a balancing tightrope a on is banana a on.",
                "Backwards it walks on but flag the on moon the on kangaroo a.",
                "Talks but never loud is the lion.",
                "And around all bouncing it, like ball over a bounces.",
                "Climbs a but tree up afraid spider is a heights of.",
                "Books can't because read penguin a they are upside-down.",
                "A and rollercoaster a riding is eats elephant an banana a while who monkey a.",
                "A a eats treats ice cream and as day a hot a on delight a is cream ice.",
                "Dances it, but the on feet its on disco the hits elephant an.",
                "Spacesuit a in space to goes elephant an." };
    }

    void Method1() {
        Random r = new Random();
        line = sentences[r.nextInt(sentences.length)];

        System.out.println(line);

        double start = LocalTime.now().toNanoOfDay();

        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();

        double end = LocalTime.now().toNanoOfDay();

        String[] originalWords = line.split(" ");
        int numberOfWords = originalWords.length;
        String[] inputWords = input.split(" ");
        boolean flag = true;
        while (flag) {
            if (inputWords.length == 0 || originalWords.length < inputWords.length) {
                System.out.println();
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                System.out.println(
                        "Please try again. There was no input provided or the number of words in your input \nexceeds the original sentence's number of words. Press ENTER when you are ready.");
                System.out.println(
                        "---------------------------------------------------------------------------------------------");
                System.out.println();
                sc.nextLine();
                System.out.println(line);
                start = LocalTime.now().toNanoOfDay();
                input = sc.nextLine();
                end = LocalTime.now().toNanoOfDay();
                originalWords = line.split(" ");
                inputWords = input.split(" ");
            } else if (originalWords.length == inputWords.length || inputWords.length < originalWords.length) {
                flag = false;
                break;
            }
        }

        double elapsedTime = (end - start) / 1000000000;
        this.Method2();
        grossWPM = (numberOfWords / (elapsedTime / 60));

        System.out.println();
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.printf(" Your raw typing speed: %.2f WPM\n", grossWPM);

        netWPM = (numberOfWords / (elapsedTime / 60)) - (incorrectWordCount / (elapsedTime / 60));

        System.out.printf("Your net typing speed based on words corrected: %.2f WPM\n", netWPM);

        accuracy = ((double) correctWordCount / numberOfWords) * 100;
        System.out.printf("Your accuracy based on words corrected: %.2f%%\n",
                accuracy);
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println();

    }

    void Method2() {

        String[] originalWords = line.split(" ");

        String[] inputWords = input.split(" ");

        correctWordCount = 0;
        incorrectWordCount = 0;

        if (originalWords.length == inputWords.length) {
            for (int i = 0; i < originalWords.length; i++) {
                if (originalWords[i].equals(inputWords[i])) {
                    correctWordCount++;

                } else {
                    incorrectWordCount++;

                }
            }
        } else if (inputWords.length < originalWords.length) {
            for (int i = 0; i < inputWords.length; i++) {
                if (originalWords[i].equals(inputWords[i])) {
                    correctWordCount++;

                } else {
                    incorrectWordCount++;

                }

            }
            incorrectWordCount = incorrectWordCount + (originalWords.length - inputWords.length);

        }

    }

    void displayRecords() {
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.printf("Your raw typing speed: %.2f WPM\n",
                grossWPM);
        System.out.printf("Your net typing speed based on words corrected: %.2f WPM\n", netWPM);
        System.out.printf("Your accuracy based on words corrected: %.2f%%\n",
                accuracy); // %format sepcifier
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println();
    }

}