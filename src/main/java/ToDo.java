
public class ToDo {
    public static void main(String[] args) {

        Subject listSubject = new Subject(Category.COLLECTIONS, "https://javastart.pl/baza-wiedzy/klasy/interfejs-list"
                , Priority
                .TODAY);

        Subject linkedListSubject = new Subject(Category.COLLECTIONS, "https://www.samouczekprogramisty.pl/struktury-danych-lista-wiazana/"
                , Priority
                .TODAY);

        Subject countingSortSubject = new Subject(Category.ALGORYTHMS, "http://www.algorytm.org/algorytmy-sortowania/sortowanie-przez-zliczanie-countingsort/count-j.html"
                , Priority
                .THIS_MONTH);

        Subject quickSortSubject = new Subject(Category.ALGORYTHMS, "http://www.algorytm.org/algorytmy-sortowania/sortowanie-szybkie-quicksort/quick-j.html"
                , Priority
                .THIS_WEEK);

        ToCheck.subjectsToCheck.add(listSubject);
        ToReview.subjectsToReview.add(linkedListSubject);
        ToCheck.subjectsToCheck.add(countingSortSubject);
        ToReview.subjectsToReview.add(quickSortSubject);

        System.out.println("Before changes");
        System.out.println("size: " + ToReview.subjectsToReview.size());
        System.out.println("size: " + ToCheck.subjectsToCheck.size());

        for (Subject subject : ToCheck.subjectsToCheck) {
            System.out.println(subject);
        }
        for (Subject subject : ToReview.subjectsToReview) {
            System.out.println(subject);
        }
        ToCheck.subjectsToCheck.get(0);
        ToCheck.subjectsToCheck.remove(listSubject);
        ToReview.subjectsToReview.remove(0);
        ToCheck.subjectsToCheck.remove(ToCheck.subjectsToCheck.get(0));

        System.out.println("After changes");

        for (Subject subject : ToCheck.subjectsToCheck) {
            System.out.println(subject);
        }
        for (Subject subject : ToReview.subjectsToReview) {
            System.out.println(subject);
        }
        System.out.println("size: " + ToReview.subjectsToReview.size());
        System.out.println("size: " + ToCheck.subjectsToCheck.size());

        String category = String.valueOf(ToCheck.subjectsToCheck.get(0).getPriority());
        Priority priority = ToCheck.subjectsToCheck.get(0).getPriority();
    }
}