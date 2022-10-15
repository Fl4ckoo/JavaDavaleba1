public class Fraction {


    private int mricxveli;
    private int mnishvneli;

    Fraction(int mricxveli, int mnishvneli) {
        this.mricxveli = mricxveli;
        this.mnishvneli = mnishvneli;
    }

    public int getMricxveli() {
        return this.mricxveli;
    }

    public int getMnishvneli() {
        return this.mnishvneli;
    }

    public void gamravleba(int n) {
        if (n != 0) {
            this.mricxveli = this.mricxveli * n;
            this.mnishvneli = this.mnishvneli * n;
        }
    }
    public void mimateba(int mricxveli2 , int mnishvneli2) {
        int saertoMnishvneli = this.mnishvneli * mnishvneli2;
        int ans = (saertoMnishvneli/this.mnishvneli * this.mricxveli) + (saertoMnishvneli/mnishvneli2 * mricxveli2);
        System.out.println(this.mricxveli + "/" + this.mnishvneli + " + " + mricxveli2 + "/" + mnishvneli2
                + " = " + ans + "/" + saertoMnishvneli);
    }

    public void shekveca(int shemkveci){


        for (int i = this.mricxveli; i >= 1; i--){

            if(this.mricxveli % i == 0 && this.mnishvneli % i == 0){
                shemkveci = i;
                break;
            }


        }
        if(shemkveci != 0){
            this.mricxveli = this.mricxveli / shemkveci;
            this.mnishvneli = this.mnishvneli / shemkveci;
        }

        System.out.println(this.mricxveli  + "/" + this.mnishvneli);

    }

    public String toString() {
        return this.mricxveli + "/" + this.mnishvneli;
    }

    public void printFraction() {
        System.out.println(this.mricxveli + "/" + this.mnishvneli);
    }

}



