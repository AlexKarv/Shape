package interfaces;

public interface IDance {
    final String STR = "iDance";

    void dancingTango();
    default void dancingSalso() {

        System.out.println("Dancing Salso");
    }



}
