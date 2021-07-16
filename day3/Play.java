package com.hopu.day3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Play {


    public static void main(String[] args) {
        /**
         * 添加歌曲到ArrayList集合中
         */
        //添加10首歌到ArrayList集合中
        ArrayList<Music> music = new ArrayList<>();
        Music music0 = new Music("七里香", "周杰伦", 160);
        Music music1 = new Music("想你的夜", "关喆", 159);
        Music music2 = new Music("稻香", "周杰伦", 146);
        Music music3 = new Music("牵丝戏", "银临", 230);
        Music music4 = new Music("本草纲目", "周杰伦", 135);
        Music music5 = new Music("风吹麦浪", "李建", 213);
        Music music6 = new Music("贝加尔湖畔", "李建", 125);
        Music music7 = new Music("冷雨夜", "beyond", 233);
        Music music8 = new Music("传奇", "李建", 156);
        Music music9 = new Music("全是爱", "凤凰传奇", 212);
        music.add(music0);
        music.add(music1);
        music.add(music2);
        music.add(music3);
        music.add(music4);
        music.add(music5);
        music.add(music6);
        music.add(music7);
        music.add(music8);
        music.add(music9);

        /**
         * 遍历歌曲信息
         */
        for (int i = 0; i < music.size(); i++) {
            System.out.printf("歌曲名:%s  歌手名:%s  歌曲时长:%d秒\n", music.get(i).musicName, music.get(i).musician, music.get(i).musicTime);
        }
        /**
         * 找出播放时间最长的歌曲
         */
        int largeTime =0;
        for (int i = 0; i <music.size() ; i++) {
            if(music.get(i).musicTime > largeTime){
                largeTime = music.get(i).musicTime;//此时找到了播放时间最长的曲目
            }

            /**
             * 用播放时长对应曲目信息，查找时间最长的曲目对应的曲目名称
             */
            //如果i等于找到的最大的那个值
        if (i==music.size()-1){
            for (int j = 0; j <music.size(); j++) { //通过循环j找到时间最长的歌曲
                if (music.get(j).musicTime == largeTime) {//此时找到了largeTime对应的曲目
                    System.out.println("时间最长的歌曲是：" + music.get(j).musicName);//输出曲目名称
                }

            }
        }

        }


        //用户输入歌名

        Scanner msName = new Scanner(System.in);  // 创建输入功能
        System.out.println("输入歌名");
        String userInput = msName.nextLine();  //读取用户输入

        //遍历查找歌曲信息
        for (int i = 0; i < music.size(); i++) {
            if (music.get(i).musicName.equals(userInput)) {
                System.out.println("歌曲信息" + "歌曲名：" + music.get(i).musicName + "歌手名：" + music.get(i).musician + "歌曲时长：" + music.get(i).musicTime + "秒");  // 输出歌曲信息

                //删除歌曲
                Scanner msNum = new Scanner(System.in);  // 创建输入功能
                System.out.println("输入整数：");
                int userInput1 = msNum.nextInt();  //读取用户输入

                System.out.println("已删除歌曲："+music.get(userInput1).musicName);
                music.remove(userInput1);//删除歌曲

                }
            }

        //遍历歌曲信息 确认歌曲删除
        for (Music value : music) {
            System.out.printf("歌曲名:%s  歌手名:%s  歌曲时长:%d秒\n", value.musicName, value.musician, value.musicTime);
        }


    }
}


