/**
 * Created by Eugene.Kudelevsky on 21.10.2014.
 */
public class NewFile2 {
    public void f() {
    }
    public void h(String param) {
        if (param == null) {
            System.out.println("hi");
        }

        System.out.println(param.length());
        int a = 1;
        a += 2;
        new NewFile3().f();
        String s = "New super text";
    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
}
