package pojo;

public class Reservation {
    private int reserveNum; // 预约轮次
    private String name; // 名字
    private String ID; // 身份证
    private String tel; // 手机
    private int number; // 预约口罩数
    private int status; // 0未开始 1未中签2中签
    private int winningNum; // 预约成功记录编号

    
    public Reservation(int reserveNum,String name,String ID,String tel,int number,int status,int winningNum) {
        this.reserveNum=reserveNum;
        this.name=name;
        this.ID=ID;
        this.tel=tel;
        this.number=number;
        this.status=status;
        this.winningNum=winningNum;
    }
    
    
    public Reservation(int reserveNum, String name, String ID, String tel, int number) {
        this.reserveNum = reserveNum;
        this.name = name;
        this.ID = ID;
        this.tel = tel;
        this.number = number;
        status=0;
        winningNum=0;
    }
    
    public Reservation() {
    	
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public void setID(String ID) {
        this.ID=ID;
    }
    
    public void setTel(String tel) {
        this.tel=tel;
    }
    
    public void setNumber(int number) {
        this.number=number;
    }
    
    public void setStatus(int status) {
        this.status=status;
    }
    
    public void setWinnningNum(int winningNum) {
        this.winningNum=winningNum;
    }

    public int getReserveNum() {
        return reserveNum;
    }

    public void setReserveNum(int reserveNum) {
        this.reserveNum = reserveNum;
    }

    public int getWinningNum() {
        return winningNum;
    }

    public void setWinningNum(int winningNum) {
        this.winningNum = winningNum;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getTel() {
        return tel;
    }

    public int getNumber() {
        return number;
    }

    public int getStatus() {
        return status;
    }
}
