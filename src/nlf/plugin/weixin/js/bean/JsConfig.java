package nlf.plugin.weixin.js.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * js配置
 * 
 * @author 6tail
 *
 */
public class JsConfig{
  private boolean debug;
  private String appId;
  private String noncestr;
  private String ticket;
  private int timestamp;
  private String url;
  private List<String> jsApiList = new ArrayList<String>();

  public boolean isDebug(){
    return debug;
  }

  public void setDebug(boolean debug){
    this.debug = debug;
  }

  public String getAppId(){
    return appId;
  }

  public void setAppId(String appId){
    this.appId = appId;
  }

  public String getNoncestr(){
    return noncestr;
  }

  public void setNoncestr(String noncestr){
    this.noncestr = noncestr;
  }

  public String getTicket(){
    return ticket;
  }

  public void setTicket(String ticket){
    this.ticket = ticket;
  }

  public int getTimestamp(){
    return timestamp;
  }

  public void setTimestamp(int timestamp){
    this.timestamp = timestamp;
  }

  public String getUrl(){
    return url;
  }

  public void setUrl(String url){
    this.url = url;
  }

  public List<String> getJsApiList(){
    return jsApiList;
  }

  public void setJsApiList(List<String> jsApiList){
    this.jsApiList = jsApiList;
  }

  public void addJsApi(String jsApi){
    jsApiList.add(jsApi);
  }
}