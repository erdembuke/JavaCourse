package Gun33._01_Inheritance;
//parent/base/super
public class Personel {
    private String ad;
    private String soyad;
    private int yas;
    private double maas;
    private String departman;
    private String sicilNo;
    private String telNo;
    private String tcNo;

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public void bordroYazdir(){
        System.out.println("Bordro yazdirildi.");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                ", departman='" + departman + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                ", telNo='" + telNo + '\'' +
                ", tcNo='" + tcNo + '\'' +
                '}';
    }
}
