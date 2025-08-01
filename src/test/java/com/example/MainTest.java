package com.example;

import com.example.lunch.LunchOption;
import com.example.lunch.LunchSelector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testLunchSelector() {
        LunchSelector selector = new LunchSelector();
        
        // 测试随机选择的午餐选项不为空
        LunchOption option = selector.selectRandomLunch();
        assertNotNull(option, "随机选择的午餐选项不应为空");
        
        // 测试随机选择的午餐描述不为空
        String description = selector.getRandomLunchDescription();
        assertNotNull(description, "随机选择的午餐描述不应为空");
        assertFalse(description.isEmpty(), "随机选择的午餐描述不应为空字符串");
    }

    @Test
    void testLunchOptionDescriptions() {
        // 测试所有午餐选项的描述都不为空
        for (LunchOption option : LunchOption.values()) {
            assertNotNull(option.getDescription(), "午餐选项描述不应为空");
            assertFalse(option.getDescription().isEmpty(), "午餐选项描述不应为空字符串");
        }
    }
}