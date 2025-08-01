package com.example.lunch;

public enum LunchOption {
    MILK_SOUP_PUCAI("奶汤蒲菜"),
    SWEET_SOUR_CARP("糖醋鲤鱼"),
    SWEET_SOUR_TENDERLOIN("糖醋脊丝"),
    STIR_FRIED_KIDNEY("爆炒腰花"),
    BRAISED_PORK_KNUCKLE("锅烧肘子"),
    FOUR_JOY_MEATBALLS("四喜丸子"),
    DEZHOU_BRAISED_CHICKEN("德州扒鸡"),
    NINE_TURN_INTESTINE("九转大肠"),
    SCALLION_BRAISED_SEA_CUCUMBER("葱烧海参"),
    SWEET_SOUR_SPARE_RIBS("糖醋排骨"),
    BRAISED_TOFU("软烧豆腐"),
    CRYSTAL_PEACH("水晶桃"),
    HONEY_SWEET_POTATO("拔丝地瓜"),
    DOUBLE_CRISPY("油爆双脆"),
    SOUP_DOUBLE_CRISPY("汤爆双脆"),
    BRAISED_FISH_SOUP("鱼汤");

    private final String description;

    LunchOption(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}