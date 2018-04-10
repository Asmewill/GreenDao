package com.hensen.greendaodemo.Bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by handsome on 2016/4/8.
 */
@Entity
public class Goods {

    private String price;
    private int sell_num;
    private String image_url;
    private String address;
    private String  kucun;

    @Generated(hash = 260120053)
    public Goods(String price, int sell_num, String image_url, String address,
            String kucun) {
        this.price = price;
        this.sell_num = sell_num;
        this.image_url = image_url;
        this.address = address;
        this.kucun = kucun;
    }

    @Generated(hash = 1770709345)
    public Goods() {
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSell_num() {
        return sell_num;
    }

    public void setSell_num(int sell_num) {
        this.sell_num = sell_num;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKucun() {
        return kucun;
    }

    public void setKucun(String kucun) {
        this.kucun = kucun;
    }
}
