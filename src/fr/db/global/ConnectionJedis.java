/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.db.global;

import redis.clients.jedis.Jedis;

/**
 *
 * @author formation
 */
public class ConnectionJedis {
    
    public static Jedis connect(String ip, int port) {
        Jedis jedis = new Jedis(ip, port);
        return jedis;
    } /// connexion
    
    public static void disconnect(Jedis jedis) {
        jedis.close();
    } /// connexion
    
    public static String getString(Jedis jedis, String key) {
        String lsValue = "";
        try {
            lsValue = jedis.get(key);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lsValue;
    } /// getChaine    
}
