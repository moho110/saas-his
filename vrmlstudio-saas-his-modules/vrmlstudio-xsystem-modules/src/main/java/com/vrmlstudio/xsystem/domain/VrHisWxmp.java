package com.vrmlstudio.xsystem.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.vrmlstudio.common.annotation.Excel;
import com.vrmlstudio.common.core.domain.BaseEntity;

/**
 * 微信公众平台信息对象 vr_his_wxmp
 * 
 * @author vrmlstudio
 * @date 2022-06-01
 */
public class VrHisWxmp extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Integer id;

    /** 所属用户 */
    @Excel(name = "所属用户")
    private Integer userid;

    /** 公众平台appid */
    @Excel(name = "公众平台appid")
    private String appid;

    /** 公众平台appsecret */
    @Excel(name = "公众平台appsecret")
    private String appsecret;

    /** 微信后台填写的TOKEN,自动回复 */
    @Excel(name = "微信后台填写的TOKEN,自动回复")
    private String token;

    /** 微信后台填写的EncodingAESKey，自动回复 */
    @Excel(name = "微信后台填写的EncodingAESKey，自动回复")
    private String encodingaeskey;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String accessToken;

    /** 过期时间，php时间戳 */
    @Excel(name = "过期时间，php时间戳")
    private Integer accessTokenExpires;

    /** jsapi_ticket */
    @Excel(name = "jsapi_ticket")
    private String jsapiTicket;

    /** jsapi_ticket过期时间 */
    @Excel(name = "jsapi_ticket过期时间")
    private Integer jsapiTicketExpires;

    /** 微信支付企业帐号 */
    @Excel(name = "微信支付企业帐号")
    private String mchid;

    /** 微信支付key */
    @Excel(name = "微信支付key")
    private String mchkey;

    /** 微信企业付款证书部分路径 */
    @Excel(name = "微信企业付款证书部分路径")
    private String sslCertPath;

    /** 支付宝app_id */
    @Excel(name = "支付宝app_id")
    private String appId;

    /** 支付宝商户私钥，您的原始格式RSA私钥 */
    @Excel(name = "支付宝商户私钥，您的原始格式RSA私钥")
    private String merchantPrivateKey;

    /** 支付宝公钥 */
    @Excel(name = "支付宝公钥")
    private String alipayPublicKey;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setUserid(Integer userid) 
    {
        this.userid = userid;
    }

    public Integer getUserid() 
    {
        return userid;
    }
    public void setAppid(String appid) 
    {
        this.appid = appid;
    }

    public String getAppid() 
    {
        return appid;
    }
    public void setAppsecret(String appsecret) 
    {
        this.appsecret = appsecret;
    }

    public String getAppsecret() 
    {
        return appsecret;
    }
    public void setToken(String token) 
    {
        this.token = token;
    }

    public String getToken() 
    {
        return token;
    }
    public void setEncodingaeskey(String encodingaeskey) 
    {
        this.encodingaeskey = encodingaeskey;
    }

    public String getEncodingaeskey() 
    {
        return encodingaeskey;
    }
    public void setAccessToken(String accessToken) 
    {
        this.accessToken = accessToken;
    }

    public String getAccessToken() 
    {
        return accessToken;
    }
    public void setAccessTokenExpires(Integer accessTokenExpires) 
    {
        this.accessTokenExpires = accessTokenExpires;
    }

    public Integer getAccessTokenExpires() 
    {
        return accessTokenExpires;
    }
    public void setJsapiTicket(String jsapiTicket) 
    {
        this.jsapiTicket = jsapiTicket;
    }

    public String getJsapiTicket() 
    {
        return jsapiTicket;
    }
    public void setJsapiTicketExpires(Integer jsapiTicketExpires) 
    {
        this.jsapiTicketExpires = jsapiTicketExpires;
    }

    public Integer getJsapiTicketExpires() 
    {
        return jsapiTicketExpires;
    }
    public void setMchid(String mchid) 
    {
        this.mchid = mchid;
    }

    public String getMchid() 
    {
        return mchid;
    }
    public void setMchkey(String mchkey) 
    {
        this.mchkey = mchkey;
    }

    public String getMchkey() 
    {
        return mchkey;
    }
    public void setSslCertPath(String sslCertPath) 
    {
        this.sslCertPath = sslCertPath;
    }

    public String getSslCertPath() 
    {
        return sslCertPath;
    }
    public void setAppId(String appId) 
    {
        this.appId = appId;
    }

    public String getAppId() 
    {
        return appId;
    }
    public void setMerchantPrivateKey(String merchantPrivateKey) 
    {
        this.merchantPrivateKey = merchantPrivateKey;
    }

    public String getMerchantPrivateKey() 
    {
        return merchantPrivateKey;
    }
    public void setAlipayPublicKey(String alipayPublicKey) 
    {
        this.alipayPublicKey = alipayPublicKey;
    }

    public String getAlipayPublicKey() 
    {
        return alipayPublicKey;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userid", getUserid())
            .append("appid", getAppid())
            .append("appsecret", getAppsecret())
            .append("token", getToken())
            .append("encodingaeskey", getEncodingaeskey())
            .append("accessToken", getAccessToken())
            .append("accessTokenExpires", getAccessTokenExpires())
            .append("jsapiTicket", getJsapiTicket())
            .append("jsapiTicketExpires", getJsapiTicketExpires())
            .append("mchid", getMchid())
            .append("mchkey", getMchkey())
            .append("sslCertPath", getSslCertPath())
            .append("appId", getAppId())
            .append("merchantPrivateKey", getMerchantPrivateKey())
            .append("alipayPublicKey", getAlipayPublicKey())
            .toString();
    }
}
