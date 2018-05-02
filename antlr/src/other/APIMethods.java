package other;

public class APIMethods {
    public String APIname;
    public String DYERname;
    public String Rtype;
    public String Param;

    @Override
    public int hashCode() {
        return DYERname.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.equals(DYERname);
    }
}
