package com.example.buoi5_jstl;

import java.util.ArrayList;
import java.util.List;

public class NguoiYeuRepository {

    private static final List<NguoiYeu> DANH_SACH_NGUOI_YEU
            = new ArrayList<NguoiYeu>();
    static {
        DANH_SACH_NGUOI_YEU.add(new NguoiYeu("An", 2000));
        DANH_SACH_NGUOI_YEU.add(new NguoiYeu("Bình", 1989));
        DANH_SACH_NGUOI_YEU.add(new NguoiYeu("Cúc", 2010));
    }

    public List<NguoiYeu> layDanhSachNguoiYeu() {
        return DANH_SACH_NGUOI_YEU;
    }

    public Integer themNguoiYeu(NguoiYeu nym) {
        DANH_SACH_NGUOI_YEU.add(nym);
        return 1; // Thêm thành công
    }
}
