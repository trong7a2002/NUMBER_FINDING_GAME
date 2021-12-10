package com.server.number_finding_game;

import com.BUS.DetailMatchBUS;
import com.DTO.UserAccountDTO;

/**
 * Information data storage
 * @author HiamKaito
 */
public class Memory {
    public static NewClient client = new NewClient();

    public static UserAccountDTO userAccountDTO = new UserAccountDTO();

//    ======================================================================
//    ======================================================================

    //    About Client to CLien
    public static String messenger = " ";
    /**
     * true if there is a messenger come from the other client
     * <br>It mean in your turn is false
     */
    static boolean playerMessenger = true;

    static String statusMessenger = " ";
    static String playerConnectName = "";
    static boolean playerConnect = false;
}
