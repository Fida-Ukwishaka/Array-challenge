public class Main {

    public static void main(String[] args) {

        GradeManager manager = new GradeManager(5);

        try {
            manager.addGrade(85.5);
            manager.addGrade(90.0);
            manager.addGrade(72.3);
            manager.addGrade(100.0);
            manager.addGrade(20.45);
            manager.addGrade(150.0);
            manager.addGrade(55.0);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No more space to add grades/Accessing invalid index");
        }
        finally {
            System.out.println("Grades added successfully");
        }

        manager.sortGrades();

        manager.searchGrade(34.7);
        manager.searchGrade(72.3);
        

        System.out.println("Average grade: " + manager.getAverage());
        System.out.println("Highest grade: " + manager.getHighest());
        System.out.println("Lowest grade: " + manager.getLowest());
    }
}
