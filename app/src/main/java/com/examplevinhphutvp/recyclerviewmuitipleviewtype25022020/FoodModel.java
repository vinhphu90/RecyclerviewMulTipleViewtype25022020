package com.examplevinhphutvp.recyclerviewmuitipleviewtype25022020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FoodModel {

    private  String Name ;
    private  int Price ;
    private String describe ;
    private int image ;

    public FoodModel(String name, int price, String describe, int image) {
        Name = name;
        Price = price;
        this.describe = describe;
        this.image = image;
    }

    public static ArrayList<FoodModel> mock (){
        return new ArrayList<>(Arrays.asList(
                new FoodModel("Bánh Khọt",100000,"là loại bánh Việt Nam (chính xác là loại bánh đặc trưng của miền nam Việt Nam) làm từ bột gạo hoặc bột sắn, có nhân tôm, được chiên và ăn kèm với rau sống, ớt tươi, thường ăn với nước mắm pha ngọt, rất ít khi chấm nước sốt mắm tôm (không phải mắm tôm hay mắm tôm chua)",R.drawable .hinh_mon_banh_khot ),
                new FoodModel("Bánh Mì", 35000, "Bánh mì là món ăn nhanh buổi sáng, buổi tối cho giới học sinh, sinh viên và người lao động vì có giá thành phù hợp",R.drawable .hinh_mon_banh_my),
                new FoodModel("Bí ngòi chiên xù",50000, "Bí ngòi hay bí Nhật Bản là một loài thực vật thuộc chi Bí với tên khoa học Cucurbita pepo. Quả bí ngòi thường được dùng làm một loại rau nấu lên dùng trong",R.drawable .hinh_mon_bi_ngoi_chien_xu),
                new FoodModel("Bún mắm", 60000, " là một trong số các món ăn đặc sản của miền tây Nam bộ Việt Nam. Bún mắm có nguồn gốc từ Campuchia, được nấu từ mắm bù hốc. Khi sang đến Việt Nam thường được nấu bằng mắm cá linh hay cá sặc, đây là các loại cá có nhiều tại miền Tây, đặc biệt là các tỉnh Trà Vinh và Sóc Trăng",R.drawable .hinh_mon_bun_mam),
                new FoodModel("Bún riêu", 25000,"là một món ăn truyền thống Việt Nam được biết đến rộng rãi trong nước và quốc tế [1]. Món ăn này gồm bún (bún rối hoặc bún lá) và 'riêu cua'. Riêu cua là canh chua được nấu từ gạch cua, thịt cua giã và lọc cùng với quả dọc, cà chua, mỡ nước, giấm bỗng, nước mắm, muối, hành hoa. Bún riêu thường thêm chút mắm tôm để tăng thêm vị đậm đà, thường ăn kèm với rau sống",R.drawable.hinh_mon_bun_rieu ),
                new FoodModel("Mực",75000," là một phương pháp nấu ăn được sử dụng trong ẩm thực Nhật Bản, theo đó thức ăn được hun hoặc nướng cùng nước xốt được phết lên thực phẩm, với thành phần nước xốt chủ yếu là nước tương, mirin và đường",R.drawable.hinh_mon_muc)

                ));

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
