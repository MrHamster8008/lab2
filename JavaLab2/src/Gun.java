public class Gun {
    private int bullets;


    public Gun(){
        this.bullets = 3;
    }

    public Gun(int bullets){
        this.bullets = bullets;
    }

    public void shoot(){
        if (bullets > 0){
            System.out.println("БАХ");
            bullets--;
        }
        else{
            System.out.println("Клац");
        }
    }
}
