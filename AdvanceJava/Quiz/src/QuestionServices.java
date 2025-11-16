import java.util.Scanner;
public class QuestionServices {
    Question[] questions = new Question[5];
    String[] solutions = new String[5];
    private int i = 0;
    private int j = 0;
    private int score = 0;
    public QuestionServices(){
        // Câu 1
        questions[0] = new Question(1, "Màu sắc nào bạn nhận được khi trộn màu Vàng và màu Xanh dương?", "Đỏ", "Cam", "Tím", "Xanh lá", "Xanh lá");

        // Câu 2
        questions[1] = new Question(2, "Thủ đô của Canada là gì?", "Toronto", "Vancouver", "Ottawa", "Montreal", "Ottawa");

        // Câu 3
        questions[2] = new Question(3, "Động vật nào sau đây là loài động vật trên cạn cao nhất?", "Voi", "Hươu cao cổ", "Tê giác", "Hà mã", "Hươu cao cổ");

        // Câu 4
        questions[3] = new Question(4, "Quốc gia nào nổi tiếng với Pizza và Mì Ý (Pasta)?", "Pháp", "Tây Ban Nha", "Hy Lạp", "Ý (Italy)", "Ý (Italy)");

        // Câu 5
        questions[4] = new Question(5, "Hành tinh nào gần Mặt Trời nhất?", "Sao Hỏa (Mars)", "Sao Thủy (Mercury)", "Sao Kim (Venus)", "Trái Đất (Earth)", "Sao Thủy (Mercury)");
    }

    public void playQuiz(){
        for(Question q : questions){
            System.out.print("Question " + q.getId() + ": ");
            System.out.println( q.getQuestion());
            System.out.println(q.getOp1());
            System.out.println(q.getOp2());
            System.out.println(q.getOp3());
            System.out.println(q.getOp4());
            System.out.print("Type you answer: ");
            Scanner scanner = new Scanner(System.in);
            solutions[i++] = scanner.nextLine();
        }
    }
//    public void printScore(){
//        for (String ans : solutions){
//            if (ans.equals(questions[j++].getAnswer())) {
//                score++;
//            }
//        }
//        System.out.println(score);
//    }
    public void printScore(){
        for (int k = 0; k < solutions.length; k++){
            if (questions[k].getAnswer().equals(solutions[k])){
                score++;
            }
        }
        System.out.println(score);
    }
}
