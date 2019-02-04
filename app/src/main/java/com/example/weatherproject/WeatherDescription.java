package com.example.weatherproject;


public class WeatherDescription extends WeatherInfoActivity{
    String description;

    public String getDescription(String weather_code) {
        String description="";
        switch (weather_code) {
            case "113": {
                description = " آسمان صاف";
                break;
            }
            case "116": {
                description = "کمی ابری";
                break;
            }
            case "119": {
                description = "ابری";
                break;
            }
            case "176": {
                description = "بارش پراکنده باران";
                break;
            }
            case "179": {
                description = "بارش پراکنده برف";
                break;
            }
            case "182": {
                description = "بارش پراکنده تگرگ";
                break;
            }
            case "143": {
                description = "غبار";
                break;
            }
            case "365": {
                description = "بارش شدید تگرگ";
                break;
            }
            case "122": {
                description = " ابری";
                break;
            }
            case "185": {
                description = " بارش نم نم باران";
                break;
            }
            case "323": {
                description = " بارش پراکنده برف";
                break;
            }
            case "320": {
                description = " بارش شدید برف و باران";
                break;
            }
            case "317": {
                description = " بارش ملایم برف و باران";
                break;
            }
            case "314": {
                description = " بارش شدید باران یخ";
                break;
            }
            case "211": {
                description = " بارش ملایم باران یخ";
                break;
            }
            case "308": {
                description = " بارش  شدید باران";
                break;
            }
            case "305": {
                description = " بارش  شدید باران در برخی ساعات";
                break;
            }
            case "302": {
                description = " بارش  باران";
                break;
            }
            case "299": {
                description = " بارش باران در برخی ساعات";
                break;
            }
            case "296": {
                description = " بارش  ملایم باران";
                break;
            }
            case "393": {
                description = " بارش  پراکنده ملایم  باران";
                break;
            }
            case "384": {
                description = " بارش  شدید باران";
                break;
            }
            case "281": {
                description = " بارش  شدید باران";
                break;
            }
            case "266": {
                description = " بارش  ملایم باران";
                break;
            }
            case "263": {
                description = " بارش  پراکنده ملایم باران";
                break;
            }
            case "260": {
                description = " بارش  شدید باران";
                break;
            }
            case "248": {
                description = " مه آلود";
                break;
            }
            case "230": {
                description = "طوفان به همراه برف";
                break;
            }
            case "227": {
                description = " وزش باد همراه با برف";
                break;
            }
            case "200": {
                description = " احتمال وقوع طوفان";
                break;
            }


        }
        return description;
    }

}








