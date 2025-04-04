package generic;

public class DataStore<a> {
    private a data;

    public void setdata(a data) {
        this.data = data;
    }

    public a getdata() {
        return data;
    }
}