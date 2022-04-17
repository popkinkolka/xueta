import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в казино Яблочко дъявола");
        Scanner scanner = new Scanner(System.in);
        Player human = new Player();
        System.out.println("Логин мне запили");
        human.setName(scanner.nextLine());
        System.out.println("Год нужен в формате цифирки");
        int bolvanchikiAge = 0;
        try {
            bolvanchikiAge = human.setAge(Integer.parseInt(scanner.nextLine()));
        } catch (Exception ex) {
            System.out.println("А я говорил нужна цифирка");
        }

        if (bolvanchikiAge < 18 | bolvanchikiAge > 90) {
            System.out.println("Ты нам не подходишь иди нахуй");
            System.exit(0);
        }
        System.out.println("Кто ты по гендору");
        human.setGender(scanner.nextLine());
        System.out.println("Выбери игрового персонажа. Напиши цифру от 1-3, а то будешь бобой");
        try {
            human.setCharacter(Integer.parseInt(scanner.nextLine()));
            switch (human.getCharacter()) {
                case 1:
                    System.out.println(".\n" +
                            "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣤⣤⣤⣤⣤⣤⣤⣤⣤⣀\n" +
                            "⠄⠄⠄⠄⠄⠄⣠⡶⠛⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠁⠙⢶⣀\n" +
                            "⠄⠄⠄⠄⢀⡼⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠹⣆\n" +
                            "⠄⠄⠄⢠⡟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢹⣆\n" +
                            "⠄⠄⢀⡟⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢹⣆\n" +
                            "⠄⠄⣾⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢿\n" +
                            "⠄⢸⡿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣇\n" +
                            "⠄⢸⣷⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⡽⣆\n" +
                            "⠄⠈⣿⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢈⣯⠻⢹⡄\n" +
                            "⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣠⣤⣤⡄⠄⠄⠸⣿⠄⢸⡇\n" +
                            "⠄⣼⠇⢿⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠴⠾⠛⣡⣤⣴⠶⠆⠄⠄⠟⢠⣿⠁\n" +
                            "⠄⣿⠰⡟⣷⠄⠄⣤⣤⣤⣤⣤⣦⡀⠄⠄⠄⠄⣾⡋⣯⠄⣼⠇⠄⢠⣴⡿⠁\n" +
                            "⠄⠹⣷⡀⢸⣧⠄⢶⣍⡉⠉⣤⣼⠇⠄⣦⠄⠄⠈⠛⠿⠟⠋⠄⠄⠈⠉\n" +
                            "⠄⠄⠈⠻⣦⣹⣆⠄⠉⠻⠶⠟⠋⠄⠄⣿⠄⠄⠄⠄⠄⠄⠄⠄⠄⣸⣧⣀\n" +
                            "⠄⠄⠄⠄⠘⠛⠻⣦⡀⠄⠄⠄⠄⠄⠄⢸⣇⡀⠄⠄⠄⠄⠄⠄⢰⣿⣿⣿⣿⣦\n" +
                            "⠄⠄⠄⠄⠄⠄⠄⠙⣷⣄⠄⠄⠄⠄⠄⠄⠉⠁⠄⠄⠄⠄⠄⢀⣿⣿⣿⣿⣿⣿\n" +
                            "⠄⠄⠄⠄⠄⠄⢀⣴⠟⣡⣶⡀⠄⠄⠄⠄⠄⠾⠂⠄⠄⠄⢠⣾⣿⣿⣿⢱⣿⠏\n" +
                            "⠄⠄⠄⠄⠄⢠⡙⣵⣿⣿⣿⠿⣷⣤⣀⡀⠄⠄⠄⠄⢀⣴⣿⣿⣿⣿⢣⣿⠏⠄\n" +
                            "⠄⠄⠄⠄⢰⡟⠻⠈⠻⣿⣿⣄⡻⠉⠻⣿⣷⣶⣶⣾⣿⣿⣿⣿⣿⢡⣿⠏⡄⠄\n" +
                            "⠄⠄⠄⢀⡟⠄⠄⠄⠰⢮⡛⠿⣿⣦⣄⡀⠈⠙⠻⢿⣿⣿⣿⣿⢧⣿⢏⡼⠁⣠\n" +
                            "⠄⠄⠄⢸⡇⠄⠄⠄⠄⠄⠙⠲⠌⠛⢿⣏⠠⣤⣤⣶⣾⣿⣿⡟⢠⠇⠈⢀⣶⠟\n" +
                            "⠄⠄⣰⠟⠛⠷⣶⣤⣤⣤⣄⡀⠄⢸⣶⣬⣛⠦⠉⠻⢿⣿⡿⠁⠋⠄⣾⣿⣇⠄\n" +
                            "⢀⣼⠋⠄⠄⠄⠄⠈⠉⠙⠛⠻⢷⣾⣿⣿⣭⣧⡶⠂⠄⠄⠄⠄⠄⠄⠸⣿⣿⠄\n" +
                            "⡾⠁⠄⠄⠄⠄⠄⠄⣀⠄⠄⠄⠄⠄⡌⣿⡃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⠄\n" +
                            "⠄⠄⠄⢀⠄⠄⠄⣼⠇⠄⠄⠄⠄⠄⣷⢻⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠘⣿⡇\n" +
                            "⣄⠄⠄⠸⡇⠄⣰⠏⠄⠄⠄⠄⠄⠄⢻⣸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⠓");
                    break;
                case 2:
                    System.out.println(".\n" +
                            "⠄⣠⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⡀\n" +
                            "⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄\n" +
                            "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠄\n" +
                            "⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠉⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠄\n" +
                            "⣿⣿⣿⣿⣿⣿⡟⠃⠄⠄⠄⠄⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆\n" +
                            "⣿⣿⣿⣿⣿⠋⠄⠄⠄⠄⠄⠄⠄⢿⣿⣿⣿⣿⣿⣿⣿⣿⡇\n" +
                            "⣿⡏⠈⠉⡯⣄⣀⣉⣉⡉⠉⠄⠄⢸⡷⣿⣿⣿⣿⣿⣿⡿⠁\n" +
                            "⣿⣧⠠⠄⠁⠹⣿⣿⣛⠿⠂⠄⠄⠸⣷⣿⣿⣿⣿⣿⣿⠁\n" +
                            "⣿⣿⡲⡄⠄⠄⠄⠈⠄⠄⠄⠄⠄⠄⠘⡟⣿⣿⣿⣿⣿\n" +
                            "⣿⣿⢹⡇⠄⠄⠄⠄⠄⠄⢀⣀⡀⠄⠈⠄⢿⣿⣿⣿⠁\n" +
                            "⣿⣿⠄⠈⠠⡀⠄⠄⠄⠠⣀⠈⠁⠄⢀⣤⣿⣿⠏⠹⡇\n" +
                            "⣿⣿⠄⠄⠄⠈⠳⣆⡀⠄⠄⢀⣤⣾⣿⣿⣿⣿⣷⣦⣁\n" +
                            "⠉⠹⢶⣤⡀⠄⠄⠈⠙⢿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⠷⣦⣤⣀⡀\n" +
                            "⠄⠄⠈⢿⣿⣦⡀⢀⣀⠄⠙⠻⣿⣿⣷⣦⠈⠛⣿⣿⣿⣷⣦⣌⠛⠻⢶⣤⡀\n" +
                            "⠄⠄⠄⠄⣿⣿⠄⠉⠁⠄⠄⠤⢍⢫⡿⢿⣷⡀⠈⠻⠿⣿⣿⣿⣿⣶⣀⠙⢿⣆\n" +
                            "⠄⠄⠄⢰⣿⡿⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⣽⢻⠄⠄⠄⠄⠄⠈⠙⢿⣿⣷⣌⢹\n" +
                            "⠄⠄⠄⠄⠻⠇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠛⢒⣶⡂⠄⠄⠄⠄⠄⠄⠹⣿⣿⣶\n" +
                            "⠄⠄⠄⠄⠈⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢹⡲⣀⡔⠄⠄⠄⠄⠄⢻⣿⣿\n" +
                            "⠄⠄⠄⠄⠄⠄⢠⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢈⣉⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿\n" +
                            "⠰⡄⠄⠄⣠⣤⣤⣧⡄⠄⠄⠄⠄⠄⠄⠄⠄⡴⣼⣿⣦⣄⠄⠄⠄⠄⠄⣾⣿⣿\n" +
                            "⠄⢰⣶⣿⣿⣿⣿⣿⣇⡀⢀⣴⣶⣦⣄⡒⣽⢳⡟⠛⢿⡋⠁⠄⠄⣀⣼⣿⣿⣿\n" +
                            "⠄⠄⠹⠿⠛⢉⣙⢿⣿⣕⣾⢹⣿⡿⢋⡞⠏⠄⠄⢀⣈⠛⠻⣿⣿⣿⣿⣿⣿⣿\n" +
                            "⣸⣿⢠⡄⠿⠘⠚⠄⢞⢉⡧⠄⠄⠄⠈⣠⠴⠒⠋⡹⠋⠄⠄⢿⣿⣿⣿⣿⣿⣿\n" +
                            "⠙⣿⣿⡉⡐⠴⠘⣓⠸⣄⣾⣦⠄⡾⠛⠁⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿⣿⣿⣿⣿\n" +
                            "⠄⠈⠁⠋⠃⣠⡄⠻⢃⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣸⣿⣿⣿⣿⡿⠋\n" +
                            "⠄⠄⠄⠄⠛⠠⣴⣾⣿⣿⣿⣿⣿⡄⠄⠄⠄⠄⠄⠄⡀⠄⢀⣿⣿⣿⣿⣇\n" +
                            "⠄⠄⠄⠄⣀⣀⢿⣿⣿⣿⣿⣿⣟⣷⠄⠄⠄⠄⠄⠄⡇⠄⢸⣿⣿⣿⣿⣿⡄\n" +
                            "⣀⡔⠊⡹⣿⡀⠈⢿⣿⣿⣿⣿⣿⣿⡄⠄⠄⠄⠄⠄⠆⠄⢸⣿⣿⣿⣿⣿⣇\n" +
                            "⣿⣧⠄⠘⣿⢷⡶⠾⣿⣿⣿⣿⣿⣿⣿⠄⠄⠄⠄⠄⠄⠄⡞⢿⣿⣿⣿⣿⣿\n" +
                            "⣿⣿⢳⠄⠘⢺⣿⣶⡝⣿⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⢀⠃⠸⣿⣿⣿⣿⣿⡆");
                    break;
                case 3:
                    System.out.println(".\n" +
                            "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠰⣤⣤⢀\n" +
                            "⠄⠄⠄⠄⠄⠄⠄⣀⣀⣀⠄⠄⢿⣿⣦⠈⢄\n" +
                            "⠄⠄⠄⠄⠄⠈⠻⣿⣶⣦⣍⠐⢼⣿⣿⣧⠈⡄\n" +
                            "⠄⠄⠄⠄⠄⠄⠄⠈⢿⣿⣿⣷⣄⣿⣿⣿⣦⣴⣦⣀\n" +
                            "⠄⠄⠄⠄⢀⢠⣄⣒⣚⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡧⠄\n" +
                            "⠄⠄⠄⠰⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡧⣤⣤⣤⣄⡀\n" +
                            "⠄⠄⠄⠄⠄⠄⠉⠻⢿⣿⣿⣿⡽⣿⠟⢃⣿⠟⡉⣿⣿⣿⣿⣿⠿⠛⠉\n" +
                            "⠄⠄⠄⠄⠄⠠⠶⢯⣭⣿⢹⡟⢶⣗⠄⢸⠇⢁⣠⠫⠟⣹⣿⣯⡭⠶⠂\n" +
                            "⠄⠄⠄⠄⠄⠄⠄⠄⠈⢙⣄⠣⠁⠈⠓⠊⠐⠃⠄⠄⣰⣿⣏⡀\n" +
                            "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠉⢉⣽⠄⠄⠄⠄⠄⠄⠄⣿⣯⠉⠉\n" +
                            "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⣿⣿⡀⠄⠄⠄⠄⠄⠄⣿⣿⣷⡀\n" +
                            "⠄⠄⠄⠄⠄⠄⢀⣴⣾⣿⣿⣿⣷⡀⠄⠄⠄⠄⢠⣿⣿⣿⣷⣦⣄⡀\n" +
                            "⠄⠄⠄⠄⣰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀\n" +
                            "⠄⠄⢀⠘⢛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⢿⣿⣿⣿⠗⠄\n" +
                            "⠄⢀⣧⣀⡀⠶⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣠⣀⣀⣿⡿⠃⢢⣠⡆\n" +
                            "⠄⢸⠿⣿⡿⣷⡿⠿⣿⢿⡿⠩⢹⣿⡟⠉⠉⠉⢹⣿⢻⠛⠛⠻⢿⣿⣷⣿⣿⠉⠟\n" +
                            "⠄⡾⢶⣿⣦⣿⣷⡇⢁⠚⡇⠐⢀⣿⣷⣤⣤⣤⣿⣧⣀⣠⣇⡰⢀⡿⣿⣿⣷⣾⣶⡀\n" +
                            "⢰⣵⡎⠹⣿⣿⣿⣁⣾⢻⣿⢻⣟⣩⣿⣿⣿⣿⣿⣿⣿⣿⣿⣥⣾⣿⡿⠛⠛⢛⡟⢇\n" +
                            "⣾⣿⣞⣰⠞⣩⣿⣻⡇⢠⠃⠸⠉⠙⣿⣿⣿⣿⢈⡁⠤⠁⠌⢉⢙⣿⣐⣧⣤⣾⢇⢸\n" +
                            "⢹⡿⢿⢋⡍⢇⠛⣿⣧⣼⣦⣴⣔⣠⣿⣿⣿⣯⣦⣤⣦⣤⣦⣄⣸⡻⢛⠋⠉⠻⠿⡇\n" +
                            "⠄⡰⠄⣆⣷⣴⣶⠿⣿⡿⣿⢿⣿⣿⣿⣿⣿⢿⡿⢿⣿⢉⠉⣿⣿⣷⣾⣤⣭⡁⠂⠄\n" +
                            "⠄⢱⣾⣿⣿⣿⣿⠐⣉⣌⠇⠐⠁⡄⣿⣿⣿⠈⡠⢾⡇⠠⠠⣼⣽⡟⢣⠄⣹⣿⡖\n" +
                            "⠄⠄⢿⣉⠁⣿⣷⣿⡟⢿⡵⣾⣶⣦⣿⣿⣿⣴⣷⣾⣷⠖⡴⠿⣿⣿⠷⠚⢛⡻⠁\n" +
                            "⠄⠄⠈⢿⣆⣿⣿⣿⣧⠐⡅⢘⠃⣿⣿⣿⣟⠿⡿⣿⣧⣈⠴⢃⠘⣻⣿⣿⡟\n" +
                            "⠄⠄⠄⢰⢻⣿⠃⢸⣿⣶⣿⡿⡟⢉⣿⢿⣻⣼⣧⠂⠛⢿⣷⣟⣀⣥⡼⠋\n" +
                            "⠄⠄⠄⣾⣏⡙⣿⣾⣿⣿⠿⢄⠉⣸⡿⠁⠉⠉⠟⢬⢛⢚⠻⣿⣿⠛\n" +
                            "⠄⠄⠄⣿⣷⣦⣅⣙⣿⣧⣮⣬⣽⡟⠄⠄⠄⠄⢶⣶⣮⢧⢠⠙⣰⢹⣦\n" +
                            "⠄⠄⠄⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⡀⠄⠄⠄⠄⠄⣈⣽⣶⣿⣿⣷⣼⠟⠆\n" +
                            "⠄⠄⠄⠘⢥⣏⢿⢯⣿⡟⠄⣿⣿⣿⣶⣄⣠⢈⠲⠟⣛⠏⣍⣏⠬⣄⡺\n" +
                            "⠄⠄⠄⠄⢸⣿⣿⣾⣿⣃⣧⣿⣿⣿⣿⣿⣧⣒⣴⣦⣾⣶⣾⣶⣿⡇");
                    break;
                default:
                    System.out.println("Ну будешь бобой");
                    break;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Ну будешь бобой");
        }
        File file = new File();
        List<String> bolvanchiki = file.ReadingFile();
        // Выбор ранудов
        int raundNamer = 0;
        System.out.println("Раундов может быть от 2 до 5");
        System.out.println("Скалько раундов тебе надо?");
        do {
            try {
                raundNamer = Integer.parseInt(String.valueOf(scanner.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("Ну ты блять совсем трижды тупой, Я Ж ТЕБЕ ПРЯМЫМ ТЕКСТОМ НАПИСАЛ, СЕРЫМ ПО ТЕМНО-СЕРОМУ, цифру не букву");
            }
            if (raundNamer < 2 | raundNamer > 5) {
                System.out.println("ЦИИИФРУУУ от 2 до 5");
            }

        } while (raundNamer < 2 | raundNamer > 5);
        //Выбор болванчиков
        int bolvanchikiNumber = 0;
        System.out.println("Болванчиков может быть от 2 до 5");
        System.out.println("Скалько болванчиков тебе надо?");
        do {
            try {
                bolvanchikiNumber = Integer.parseInt(String.valueOf(scanner.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("Ну ты блять совсем трижды тупой, Я Ж ТЕБЕ ПРЯМЫМ ТЕКСТОМ НАПИСАЛ, СЕРЫМ ПО ТЕМНО-СЕРОМУ, циру не букву");
            }
            if (bolvanchikiNumber < 2 | bolvanchikiNumber > 5) {
                System.out.println("ЦИИИФРУУУ от 2 до 5");
            }

        } while (bolvanchikiNumber < 2 | bolvanchikiNumber > 5);
        List<String> bolvanchikiInGame = bolvanchiki.subList(0, bolvanchikiNumber);
        List<Player> botyebomanye = new ArrayList<>();
        for (String bolvan : bolvanchikiInGame) {
            Player player = new Player(bolvan.split(";"));
            botyebomanye.add(player);
        }
        for (int i = 1; i <= raundNamer; i++) {
            System.out.println("\nРаунд " + i);
            System.out.println("Игрок по имени: " +  human.getName() + " Возраст = " + human.getAge() + " Гендер = " + human.getGender());
            int round;
            do {
                round = (int) (Math.random() * 100);
                System.out.println("Нажмите Enter что бы бросить кубик");
                scanner.nextLine();
            } while (round == 0);
            System.out.println("Бросок кубика за раунд " + i + " = " + round);
            int oldResultHuman = human.getResultsBolvanchik();
            human.setResultsBolvanchik(oldResultHuman + round);
            System.out.println("Результат броска кубика  = " + human.getResultsBolvanchik());
            for (Player player : botyebomanye) {
                int bolvanchikRandom;
                do {
                    bolvanchikRandom = (int) (Math.random() * 100);
                } while (bolvanchikRandom == 0);
                int oldResultBolvan = player.getResultsBolvanchik();
                player.setResultsBolvanchik(oldResultBolvan + bolvanchikRandom);
                System.out.println("\n");
                System.out.println("Блованчик:" + player.getName() + " Возраст:" + player.getAge() + " Гендер:" + player.getGender());
                System.out.println("Бросок кубика за раунд " + i + " = " + bolvanchikRandom);
                System.out.println("Результат броска кубика болванчика = " + player.getResultsBolvanchik());
            }
        }
        botyebomanye.add(human);
        Player podebitel = Collections.max(botyebomanye, Comparator.comparing(Player::getResultsBolvanchik));
        System.out.println("\nВЫЙГРАЛ: " + podebitel.getName() + " Возраст:" + podebitel.getAge() + " Гендер:" + podebitel.getGender());
    }

}


