package com.zcwork.zfc.pojo;


import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Order {


    @NotEmpty(message = "请求流水号不能为空")
    private String requestNo;

    @Min(value = 1,message = "至少购买1件")
    @Max(value = 10,message = "最多不超过10件")
    private int amount;

    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机号码格式错误")
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    private String goodsName;


}
