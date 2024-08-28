package eva1_3_automovil;
public class EVA1_3_Automovil {
    public static void main(String[] args) {
        //Datos relevantes (Declaracion de las variables)
        String marcaCr,modeloCr;
        int yearCr;
        double precioCr;
        //Datos (Tele)
        String marcaTv,modeloTv,resolucionTv,conexionesTv,tecnologiaTv;
        double precioTv;
        int sizeTv;
        
        //Asignar valores (Television)
        marcaTv = "Sony";
        modeloTv = "55LA8600";
        resolucionTv = "1920x1080 px";
        conexionesTv = "Puertos HDMI, Cable óptico, LAN, Puerto USB, Cable coaxial";
        tecnologiaTv = "LED";
        precioTv = 2795;
        sizeTv = 70;
        
        System.out.println(marcaTv);
        System.out.println(modeloTv);
        System.out.println(resolucionTv);
        System.out.println(conexionesTv);
        System.out.println(tecnologiaTv);
        System.out.println(precioTv);
        System.out.println(sizeTv);
        
        
        //Asignar valores
        marcaCr = "Ford";
        modeloCr = "Mustang";
        yearCr = 2022;
        precioCr = 9999900.99;
        
        System.out.println("\n" + marcaCr + "\n" + modeloCr + "\n" + yearCr + "\n" + precioCr);
    }
    
}
