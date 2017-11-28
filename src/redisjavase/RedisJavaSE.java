/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redisjavase;

import redis.clients.jedis.Jedis;

/**
 *
 * @author formation
 */
public class RedisJavaSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jedis jedis = new Jedis("172.26.10.147");

        /*
         Cela a été stocké via la console
         */
        String lsValeur = jedis.get("nom");
        System.out.println(lsValeur);

        /*
         Stockage ici
         Allez vérifier à la console !
         */
        jedis.set("nom", "Buguet");

    } /// main

    
}
