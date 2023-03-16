package com.example.buoi5_jstl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // tự động thêm hàm getter
@Setter // tự động thêm hàm setter
@AllArgsConstructor // tự động thêm hàm khởi tạo gồm tất cả tham số
@NoArgsConstructor // tự động thêm hàm khởi tạo không tham s
public class NguoiYeu {
    private String ten;
    private Integer namSinh;
}
