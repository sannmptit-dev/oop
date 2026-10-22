package btvn;

public class Buoc02 {
    static class SanPham {
        private String maSP;
        private String tenSP;
        private double donGia;
        private int soLuongTon;

        public SanPham(String maSP, String tenSP, double donGia, int soLuongTon) {
            this.maSP = maSP;
            this.tenSP = tenSP;
            this.donGia = donGia;
            this.soLuongTon = soLuongTon;
        }

        public SanPham(String maSP, String tenSP) {
            this.maSP = maSP;
            this.tenSP = tenSP;
        }

        public String getTenSP() { return tenSP; }
        public double getDonGia() { return donGia; }
        public void setDonGia(double donGia) { this.donGia = donGia; }
        public void setSoLuongTon(int soLuongTon) { this.soLuongTon = soLuongTon; }

        public void hienThi() {
            System.out.printf("%-6s %-18s %,10.0f   tồn %d\n", maSP, tenSP, donGia, soLuongTon);
        }
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham sp2 = new SanPham("SP02", "Chuột không dây", 200000, 50);
        SanPham sp3 = new SanPham("SP03", "Tai nghe");
        sp3.setDonGia(350000);
        sp3.setSoLuongTon(10);

        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        sp1.hienThi();
        sp2.hienThi();
        sp3.hienThi();
    }
}