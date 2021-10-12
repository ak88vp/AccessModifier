public class Book {
    String name;
    String theloai;
    int gia;

    public Book() {
    }

    public Book(String name, String theloai, int gia) {
        this.name = name;
        this.theloai = theloai;
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", theloai='" + theloai + '\'' +
                ", gia=" + gia +
                '}';
    }
}
