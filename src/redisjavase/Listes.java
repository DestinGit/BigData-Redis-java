/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redisjavase;

import java.util.List;
import redis.clients.jedis.Jedis;

/**
 *
 * @author formation
 */
public class Listes {
    public static void main(String[] args) {
        try {
            Jedis jedis = new Jedis("172.26.10.147");

            /*
             Stockage ici
             Allez vérifier à la console !
             */
//            jedis.rpush("ListeLettres", "A");
//            jedis.rpush("ListeLettres", "B");
//            jedis.rpush("ListeLettres", "C");
//            jedis.rpush("ListeLettres", "D");
//            jedis.rpush("ListeLettres", "E");
            /*
             Affichage de la List stockée
             */
            long llElements = jedis.llen("ListeLettres");
            List<String> listeLettres = jedis.lrange("ListeLettres", 0, llElements - 1);

//            int liTaille = listeLettres.size();
            for (int i = 0; i < llElements; i++) {
                System.out.println(listeLettres.get(i));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("C'est fini");
    } /// main

}
