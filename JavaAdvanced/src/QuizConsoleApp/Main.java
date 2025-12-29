import QuizConsoleApp.QuestionService;

void main() {
    QuestionService questionService = new QuestionService();
    questionService.playQuiz();
    questionService.printScore();
}
