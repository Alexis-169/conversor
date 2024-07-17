public class Principal {
    public static void main(String[] args) {
        Conversor convertidor = new Conversor();

        convertidor.dolar_pesoargentino = 922.24;
        convertidor.pesoargentino_dolar = 0.0011;
        convertidor.dolar_corona = 546630;
        convertidor.corona_dolar = 0.18;
        convertidor.dolar_pesocolombiano= 3936.95 ;
        convertidor.pesocolombino_Dolar= 0.00025;
        convertidor.opcionExit= true;
        convertidor.Opciones=7;

        convertidor.muestraFicha();

        convertidor.opcion();


    }
}
