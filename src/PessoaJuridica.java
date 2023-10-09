public class PessoaJuridica extends Pessoa{

    public String cnpj;
    public String razaoSocial;

    public float CalcularImposto(float rendimento){
        if (rendimento <= 3000){
            float result = (rendimento / 100) * 3;
            return result;
        } else if(rendimento > 3000 && rendimento <= 6000){
            float result = (rendimento / 100) * 5;
            return result;
        } else if(rendimento > 6000 && rendimento <= 10000){
            float result = (rendimento / 100) * 7;
            return result;
        } else{
            float result = (rendimento / 100) * 9;
            return result;
        }
    }
}
