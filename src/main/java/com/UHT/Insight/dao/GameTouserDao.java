package com.UHT.Insight.dao;

import com.UHT.Insight.pojo.GameEverydayData;
import com.UHT.Insight.pojo.GameStarLevel;
import com.UHT.Insight.pojo.GameTouser;
import com.UHT.Insight.pojo.TapUserAndGameToUser;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface GameTouserDao {
    /**
     * 查询所有GameTouser
     * @return list
     */
    List<GameTouser> findAll();
    //插入数据
    Integer saveGameTouser(GameTouser gameTouser);
    //根据评论id查询
    GameTouser findGameTouserById(Integer D_ID);
    //根据游戏id查询条数
    Integer findGameTouserCountByGId(Integer G_ID);
    //根据游戏Id分页查询  start--开始位置  size---查询条数
    List<GameTouser> findGameTouserPageByGId(Integer G_ID,Integer start,Integer size);
    //根据游戏Id查询
    List<GameTouser> findGameTouserByGId(Integer G_ID);
    //根据id删除
    Integer deleteGameTouser(Integer D_ID);
    //根据游戏id删除
    Integer deleteGameTouserByGameId(Integer G_ID);
    //更新
    Integer updateGameTouser(GameTouser gameTouser);
    //每天的评论数量和平均星级所有
    List<GameEverydayData> findCountEverydayAll(Integer G_ID);
    /*I_TIME（开始）,I_TIME1（结束）的值，
    *时间格式 Date date= new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-00");
    *具体一天的评论数量和评价星级
    **/
    GameEverydayData findCountByDay(Map<String,Object> map);
    //从某天开始的评论数量和星级
    List<GameEverydayData> findCountAfterDayA(Map<String,Object> map);
    //从某天到某天的评论数量和星级
    List<GameEverydayData> findCountBetweenDayAAndB(Map<String,Object> map);
    //每天的各星级数量
    List<GameStarLevel> findCountByStar(Integer D_START,Integer G_ID);
    /*{ Map中设定star（星级），start（开始时间）,end（结束时间）的值}
    *时间格式 Date date= new SimpleDateFormat("yyyy-MM-dd").parse("2019-11-00");
    * */
    //具体一天的各星级数量----不用设置end值，star和start（这一天的星级）
    GameStarLevel findCountStarByDay(Map<String,Object> map);
    //从某天开始的各星级数量----不用设置end值，star和start（从这一天开始）
    List<GameStarLevel> findCountStarAfterDay(Map<String,Object> map);
    //从某天到某天的各星级数量------map设置star（integer） start(Date) end(Date)
    List<GameStarLevel> findCountStarBetweenDay(Map<String,Object> map);
    //批量插入
    Integer addGameList(List<GameTouser> list);
    //tapUser表与gameToUser表的联合查询，map设置G_ID和TapUser的所有元素
    List<TapUserAndGameToUser> findUnionByGId(Map<String,Object> map);

}
