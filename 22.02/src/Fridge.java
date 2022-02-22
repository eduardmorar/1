public class Fridge {
    String producator;
    int volum;
    int numarDeUsi;
    int inaltime;
    int latime;
    int adancime;
    String culoare;
    private double vol;

    public  Fridge(String prod,int volum,String culoare){
        producator = prod;
        this.volum=volum;
        this.culoare = culoare;
    }
    public  Fridge(String prod,int volum,int nrusi,String culoare) {
        producator = prod;
        numarDeUsi = nrusi;
        this.volum = volum;
        this.culoare = culoare;
    }
    public  Fridge(String prod,int inaltime,int latime,int adancime,String culoare) {
        producator = prod;
        this.inaltime = inaltime;
        this.latime = latime;
        this.adancime = adancime;
        this.culoare = culoare;
        vol = inaltime*latime*adancime/1000.0;

    }
    public double GetVol(){
        return vol;
    }


    public static void main(String[] args) {
        Fridge samsung = new Fridge("samsung",30,"gri");
        Fridge ada = new Fridge("1", 195,60,100,"alb");
    }
}
