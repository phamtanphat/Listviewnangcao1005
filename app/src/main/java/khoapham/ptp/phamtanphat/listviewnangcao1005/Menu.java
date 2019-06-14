package khoapham.ptp.phamtanphat.listviewnangcao1005;

public class Menu {
    private int id;
    private String ten;
    private int gia;
    private int hinhanh;

    //alt + insert
    public Menu(int id, String ten, int gia, int hinhanh) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.hinhanh = hinhanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
