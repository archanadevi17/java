package generic;

public class datagen {

    public static void main(String[] args) {
        DataStore<Integer> intst = new DataStore<>();
        intst.setdata(200);
        System.out.println(intst.getdata());

        DataStore<String> st = new DataStore<>();
        st.setdata("hai");
        System.out.println(st.getdata());
    }
}
