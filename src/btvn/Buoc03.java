package btvn;

public class Buoc03 {
    // 1. Lớp SanPham theo yêu cầu slide 3/4
    static class SanPham {
        private String maSP;
        private String tenSP;
        private double donGia;
        private int soLuongTon;

        public SanPham() {}

        public SanPham(String maSP, String tenSP) {
            this.maSP = maSP;
            this.tenSP = tenSP;
        }

        public SanPham(String maSP, String tenSP, double donGia, int soLuongTon) {
            this(maSP, tenSP);
            this.donGia = donGia;
            this.soLuongTon = soLuongTon;
        }

        public String getTenSP() { return tenSP; }
        public double getDonGia() { return donGia; }
        public void setDonGia(double donGia) { this.donGia = donGia; }
        public void setSoLuongTon(int soLuongTon) { this.soLuongTon = soLuongTon; }

        public void hienThi() {
            System.out.printf("%-6s %-18s %,10.0f   tồn %d\n", maSP, tenSP, donGia, soLuongTon);
        }
    }

    // 2. Lớp DonHang theo yêu cầu slide 3/4
    static class DonHang {
        private String tenKhach;
        private SanPham sanPham;
        private int soLuong;

        public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
            this.tenKhach = tenKhach;
            this.sanPham = sanPham;
            if (soLuong < 1) {
                this.soLuong = 1;
            } else {
                this.soLuong = soLuong;
            }
        }

        public double tinhThanhTien() {
            double thanhTien = sanPham.getDonGia() * soLuong;
            if (soLuong >= 5) {
                thanhTien *= 0.9;
            }
            return thanhTien;
        }

        public void inDonHang() {
            System.out.printf("%-6s %-18s %-4d %,10.0f\n", tenKhach, sanPham.getTenSP(), soLuong, tinhThanhTien());
            if (soLuong >= 5) {
                System.out.printf("%-6s %-18s\n", "", "(đã giảm 10%)");
            }
        }
    }

    public static void main(String[] args) {
        SanPham sp1 = new SanPham("SP01", "Bàn phím cơ", 450000, 20);
        SanPham sp2 = new SanPham("SP02", "Chuột không dây", 200000, 50);
        SanPham sp3 = new SanPham("SP03", "Tai nghe", 350000, 10);

        DonHang dh1 = new DonHang("An", sp1, 2);
        DonHang dh2 = new DonHang("Bình", sp2, 5);
        DonHang dh3 = new DonHang("Chi", sp3, 0);

        System.out.println("===== DANH SÁCH ĐƠN HÀNG =====");
        System.out.printf("%-6s %-18s %-4s %s\n", "Khách", "Sản phẩm", "SL", "Thành tiền");
        dh1.inDonHang();
        dh2.inDonHang();
        dh3.inDonHang();
    }
}