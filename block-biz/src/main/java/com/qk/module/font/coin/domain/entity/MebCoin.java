/*
 * Powered By [rapid-framework]
 *  copyright © 趋快科技(武汉)有限公司
 * Since 2017 - 2017
 */

package com.qk.module.font.coin.domain.entity;
import com.qk.core.ibatis.annotation.po.FieldName;
import com.qk.core.ibatis.annotation.po.TableName;
import com.qk.core.ibatis.beans.Po;
/**
 *   数据实体类
 * @author rapid-code
 * @version 1.0
 * @since 1.0
 * */
@TableName(name="meb_coin")
public class MebCoin  extends Po{  
      
	    /**  
	     *   
	     */ 
    	@FieldName(name="meb_id")
	    private Integer mebId;  
	    /**  
	     *   
	     */ 
    	@FieldName(name="game_coin")
	    private Integer gameCoin;  
	    /**  
	     *   
	     */ 
    	@FieldName(name="active_coin")
	    private Integer activeCoin;  
 
	
    	public void setMebId(Integer mebId) {  
	        this.mebId = mebId;  
	    }  
	      
	    public Integer getMebId() {  
	        return this.mebId;  
	    }  
	    public void setGameCoin(Integer gameCoin) {  
	        this.gameCoin = gameCoin;  
	    }  
	      
	    public Integer getGameCoin() {  
	        return this.gameCoin;  
	    }  
	    public void setActiveCoin(Integer activeCoin) {  
	        this.activeCoin = activeCoin;  
	    }  
	      
	    public Integer getActiveCoin() {  
	        return this.activeCoin;  
	    }  
 
}