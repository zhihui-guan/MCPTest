package com.example;

import com.example.lunch.LunchSelector;

public class Main {
    public static void main(String[] args) {
        LunchSelector selector = new LunchSelector();
        String dish = selector.getRandomLunchDescription();
        System.out.println("今天推荐的鲁菜是: " + dish);
        System.out.println("\n鲁菜小知识：");
        System.out.println("鲁菜是中华美食文化的瑰宝！");
        System.out.println("- 鲁菜是中国八大菜系之首，历史最悠久、技法最丰富。");
        System.out.println("- 鲁菜以其'清鲜醇正'的特色著称，讲究实惠，风格浓重、浑厚。");
        System.out.println("- 鲁菜分为济南菜、胶东菜和孔府菜三大流派。");
        System.out.println("- 鲁菜的特色是以汤菜见长，尤其是清汤和奶汤的调制。");
        System.out.println("- 鲁菜的美食以其独特的口感和风格而闻名，是中国美食的重要代表之一。");
    }
}