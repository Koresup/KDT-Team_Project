package com.aroundThirty.Resource;

import javax.swing.*;
import java.awt.*;

public class Resource {
    public static String[] location = {"서울", "부산", "대구", "인천", "광주", "대전", "울산", "세종", "경기", "강원", "충북", "충남", "전북", "전남", "경북", "경남", "제주"};
    public static JComboBox<String> locationCombo = new JComboBox<>(location);
    public static String[] gender = {"수컷", "암컷"};
    public static JComboBox<String> genderCombo = new JComboBox<>(gender);
    public static String[] dogAndCat = {"강아지", "고양이"};
    public static JComboBox<String> kindCombo = new JComboBox<>(dogAndCat);
    public static Color color = new Color(246, 230, 121, 255);
    public static Color color01 = new Color(255, 250, 200, 255);
    public static Font font = new Font("Gaegu", Font.BOLD, 20);

}
