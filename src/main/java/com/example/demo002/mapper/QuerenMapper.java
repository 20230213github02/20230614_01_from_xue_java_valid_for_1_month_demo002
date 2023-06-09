package com.example.demo002.mapper;

import com.example.demo002.entity.Queren;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuerenMapper {
    @Insert("INSERT INTO queren (" +
            "id,now, aPLShinseisyaName, aPLAddressYubinNo3, aPLAddressYubinNo4, " +
            "aPLAddressTodofuken, aPLAddressShikuchoson, aPLAddressBanchi, " +
            "aPLAddressTodofukenKana, aPLAddressShikuchosonKana, aPLAddressBanchiKana, " +
            "aPLAddressManshon, aPLDaihyoshaYakushoku, aPLDaihyoshaName, aPLHojinNo, " +
            "aPLTantoshaName, aPLCSTEL, aPLCSFAX, aPLCSTantoshaMail, aPLCSKakuninyoMail" +
            ") VALUES (" +
            "#{id},#{now}, #{aPLShinseisyaName}, #{aPLAddressYubinNo3}, #{aPLAddressYubinNo4}, " +
            "#{aPLAddressTodofuken}, #{aPLAddressShikuchoson}, #{aPLAddressBanchi}, " +
            "#{aPLAddressTodofukenKana}, #{aPLAddressShikuchosonKana}, #{aPLAddressBanchiKana}, " +
            "#{aPLAddressManshon}, #{aPLDaihyoshaYakushoku}, #{aPLDaihyoshaName}, #{aPLHojinNo}, " +
            "#{aPLTantoshaName}, #{aPLCSTEL}, #{aPLCSFAX}, #{aPLCSTantoshaMail}, #{aPLCSKakuninyoMail}" +
            ")")
    void insert(Queren queren);
}