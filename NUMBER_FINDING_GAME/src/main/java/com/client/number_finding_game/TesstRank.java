package com.client.number_finding_game;

import com.BUS.DetailMatchBUS;
import com.DTO.Ranking;

public class TesstRank {

    public static void main(String[] args) throws Exception {

        DetailMatchBUS bus = new DetailMatchBUS();
        Ranking ranking = new Ranking();

        ranking.getJsonRankTable(bus.initJsonRankTable());
        ranking.display();

    }


}
