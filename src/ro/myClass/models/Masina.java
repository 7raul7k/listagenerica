package ro.myClass.models;

public class Masina implements Comparable<Masina> {
    private String owner;
    private String marca;
    private int an;
    private String tipmotor;

    public Masina(String owner, String marca, int an, String tipmotor) {
        this.owner = owner;
        this.marca = marca;
        this.an = an;
        this.tipmotor = tipmotor;
    }
    public Masina(String text){
        String[] proprietes = text.split(",");
        this.owner = proprietes[0];
        this.marca = proprietes[1];
        this.an = Integer.parseInt(proprietes[2]);
        this.tipmotor = proprietes[3];
    }
    public String descriere(){
        String text= "";
        text += "Owner: " + owner;
        text += "\n Marca: " + marca;
        text += "\n An: " + + an;
        text += "\n Tip motor: " + tipmotor;
        text += "\n==============================\n";
        return text;
    }
    @Override
    public String toString(){
        return owner+","+marca+","+an+","+tipmotor;
    }
    @Override
    public boolean equals(Object obj){
        Masina masina = (Masina) obj;
        if(masina.owner.equals(this.owner)&&masina.marca.equals(this.marca)&&masina.an==this.an){
            return true;
        }
        return false;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getTipmotor() {
        return tipmotor;
    }

    public void setTipmotor(String tipmotor) {
        this.tipmotor = tipmotor;
    }

    @Override
    public int compareTo(Masina m) {
        if(m.an==this.an){
            return 0;
        }else if(m.an<this.an){
            return -1;
        }else {
            return 1;
        }

    }
}
