import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        List<Carta>lstCarta = new ArrayList<>();
        List<Mesa>lstMesas = new ArrayList<>();

        int opc, mesa,pedido, cantidad, usuario=1075660633, us, b;
        String contrsenia="3228147599",contra, a;
        double ingreso, cambio, dineroFinal, efectivo, diferecnia;
        boolean m=true, f=true;
        Caja cajaCierre = new Caja();

        lstMesas.add(new Mesa(1));
        lstMesas.add(new Mesa(2));
        lstMesas.add(new Mesa(3));
        lstMesas.add(new Mesa(4));
        lstMesas.add(new Mesa(5));
        lstMesas.add(new Mesa(6));
        lstMesas.add(new Mesa(7));
        lstMesas.add(new Mesa(8));

        lstCarta.add(new Carta("Combo 1",20000,0));
        lstCarta.add(new Carta("Combo 2",22000,0));
        lstCarta.add(new Carta("Combo 3",24000,0));
        lstCarta.add(new Carta("Combo 4",23000,0));
        lstCarta.add(new Carta("Combo 5",26000,0));
        lstCarta.add(new Carta("Combo 6",25000,0));
        lstCarta.add(new Carta("Combo 7",24000,0));
        lstCarta.add(new Carta("Combo 8",20000,0));
        lstCarta.add(new Carta("Combo 9",20000,0));
        lstCarta.add(new Carta("Hamburguesa Sencilla",12000,0));
        lstCarta.add(new Carta("Hamburguesa Especial",14000,0));
        lstCarta.add(new Carta("Hamburguesa Doble Carne",17000,0));
        lstCarta.add(new Carta("Hamburguesa Pollo",15000,0));
        lstCarta.add(new Carta("Hamburguesa Doble Pollo",19000,0));
        lstCarta.add(new Carta("Hamburguesa Mixta",18000,0));
        lstCarta.add(new Carta("Hamburguesa Salsipuedes",16500,0));
        lstCarta.add(new Carta("Perro Caliente",13000,0));
        lstCarta.add(new Carta("Choriperro",13000,0));
        lstCarta.add(new Carta("Choripapa",8000,0));
        lstCarta.add(new Carta("Salchipapa",10000,0));
        lstCarta.add(new Carta("Salchipapa Especial",18000,0));
        lstCarta.add(new Carta("Choriarepa",6000,0));
        lstCarta.add(new Carta("Papa Francesa",7000,0));
        lstCarta.add(new Carta("Porción",8000,0));
        lstCarta.add(new Carta("Personal",22000,0));
        lstCarta.add(new Carta("Mediana",37000,0));
        lstCarta.add(new Carta("XL",64000,0));
        lstCarta.add(new Carta("Arepa",20000,0));
        lstCarta.add(new Carta("Lasaña",21000,0));
        lstCarta.add(new Carta("Mazorcada Grande",28000,0));
        lstCarta.add(new Carta("Mazorcada Pequeña",23000,0));
        lstCarta.add(new Carta("Carne con Arepa",24000,0));
        lstCarta.add(new Carta("Combo Carne con Arepa",31000,0));
        lstCarta.add(new Carta("Combo Pechuga",34000,0));
        lstCarta.add(new Carta("Churrasco",37000,0));
        lstCarta.add(new Carta("Picada",40000,0));
        lstCarta.add(new Carta("Adición Pequeña",2000,0));
        lstCarta.add(new Carta("Adición Grande",5000,0));
        lstCarta.add(new Carta("Té",20000,0));
        lstCarta.add(new Carta("Agua",20000,0));
        lstCarta.add(new Carta("Jugo",20000,0));
        lstCarta.add(new Carta("Cerveza",20000,0));
        lstCarta.add(new Carta("Coronita",20000,0));
        lstCarta.add(new Carta("Gaseosa 400ml",20000,0));
        lstCarta.add(new Carta("Gaseosa 350ml",20000,0));
        lstCarta.add(new Carta("Gaseosa 1.5L",20000,0));
        lstCarta.add(new Carta("Jugo Pequeño",20000,0));



do{
        System.out.println(
                "====================\n        MENÚ        \n====================" +
                        "\nAgregar Mesa ->(1)" +
                        "\nVer Mesas ->(2)" +
                        "\nCierre Caja ->(3)");
        opc = dato.nextInt();
        switch (opc){
            case 1->{
                do {
                    System.out.println("Escribe el número de la mesa: ");
                    mesa = dato.nextInt();
                    if(mesa>8){
                        System.out.println("Porfavor ingresa una mesa valida");
                    }
                }while(mesa>8);
                    if(!lstMesas.get(mesa-1).isEstado()){
                        System.out.println("----------|>Esta mesa ya esta ocupada<|----------");
                    }else{b=1;
                        for(Carta c: lstCarta){
                            System.out.println(c+" ->("+b+")");
                            b++;
                        }
                        do {
                            System.out.println("Ingresa tu pedido: \n(Ingresa 0 para finalizar pedido)");
                            pedido = dato.nextInt();

                            if (pedido == 0) {
                                m = false;
                            } else if (pedido > lstCarta.size()) {
                                System.out.println("----------|>Ingresa un número valido<|----------");
                            } else {
                                System.out.println("Ingrese la cantidad:");
                                cantidad = dato.nextInt();
                                lstMesas.get(mesa-1).pedido(lstCarta.get(pedido-1).getProducto(),lstCarta.get(pedido-1).getPrecio(),cantidad);
                                lstMesas.get(mesa-1).setEstado(false);
                                System.out.println("Se agrego con exito...");
                            }
                        }while(m);
                        m=true;


                    }
            }
            case 2->{
                for(int i=1; i<=lstMesas.size(); i++){
                    System.out.println("----------\n  MESA "+i+"  \n----------");
                    if(lstMesas.get(i-1).isEstado()){
                        System.out.println("Estado: Libre");
                    }else{
                        System.out.println("Estado: Ocupado");
                        lstMesas.get(i-1).mostrarPedido();
                    }
                }
                do{
                    dato.nextLine();
                System.out.print("¿Deseas finalizar pedido de una mesa?" +
                        "\n(Escribe 0 para si o 1 para no): ");
                a=dato.nextLine();
                if(a.equalsIgnoreCase("0")){
                    do{
                        dato.nextLine();
                    System.out.print("Ingresa el número de la mesa:\n");
                    mesa=dato.nextInt();
                    if(mesa<=lstMesas.size()&&mesa>0){
                        if(lstMesas.get(mesa-1).isEstado()){
                            System.out.println("Esta mesa esta libre, no tiene pedido....");
                            m=false;
                        }else{
                            System.out.println("Total de la mesa "+mesa+" $"+lstMesas.get(mesa-1).getTotal());
                            do{
                                dato.nextLine();
                            System.out.print("Para finalizar compra digita 0 o para salir digita 1\n");
                            a=dato.nextLine();
                            if(a.equalsIgnoreCase("0")){
                                do{
                                    dato.nextLine();
                                System.out.print("Ingresa medio de pago:\n-Efectvo ->(1)\n-Nequi/Davi ->(2)\n");
                                a=dato.nextLine();
                                if(a.equalsIgnoreCase("1")){
                                    do{
                                    System.out.println("Ingresa con cuanto pago el cliente: ");
                                    ingreso = dato.nextDouble();
                                    if(ingreso>=lstMesas.get(mesa-1).getTotal()){
                                        cambio = ingreso-lstMesas.get(mesa-1).getTotal();
                                        System.out.println("Debes devolver: $"+cambio);
                                        cajaCierre.setMesa(lstMesas.get(mesa-1).getTotal());
                                        lstMesas.get(mesa-1).reiniciar();
                                        m=true;
                                    }else{
                                        System.out.println("Falto dinero....");
                                        m=false;
                                    }}while(!m);
                                }else if(a.equalsIgnoreCase("2")){
                                    cajaCierre.setMesa(lstMesas.get(mesa-1).getTotal());
                                    lstMesas.get(mesa-1).reiniciar();
                                    m=true;
                                }else{
                                    System.out.println("Ingrese una opción valida....");
                                    m=false;
                                }}while(!m);
                            }else if(a.equalsIgnoreCase("1")){
                                m=true;
                            }else{
                                System.out.println("Ingrese una opción valida....");
                                m=false;
                            }}while(!m);
                        }
                        m=true;
                    }else{
                        System.out.println("Ingrese un valor valido.....");
                        m=false;
                    }}while (!m);
                }else if(a.equalsIgnoreCase("1")){
                    m=true;
                }else{
                    System.out.println("Ingrese una opción valida......");
                    m=false;
                }}while(!m);

            }
            case 3->{
                do {
                    System.out.println("Ingrese Usario:");
                    us = dato.nextInt();
                    dato.nextLine();
                    System.out.println("Ingrese Contraseña:");
                    contra = dato.nextLine();
                    if(us==usuario&&contra.equalsIgnoreCase(contrsenia)){
                        System.out.println("Ingrese el dinero total final en la caja:");
                        dineroFinal=dato.nextDouble();
                        efectivo=cajaCierre.getMesa();
                        diferecnia=dineroFinal-efectivo;
                        System.out.println("====================" +
                                "\nVenta Nequi/Davi: $"+cajaCierre.getNequi()+
                        "\nVenta Local: $"+cajaCierre.getMesa()+
                                "\nVenta Total: $"+cajaCierre.getTotal()+
                                "\n--------------------"+
                                "\nDinero en Caja: $"+dineroFinal+
                                "\nDinero Real: $"+efectivo+
                                "\nDiferencia: $"+diferecnia+
                                "\n====================");
                        do{
                            dato.nextLine();
                        System.out.print("Deseas hacer el cierre final de la caja:\n(0 para si y 1 para no)\n");
                        a=dato.nextLine();
                        if(a.equalsIgnoreCase("0")){
                            System.out.println("Se cerro la caja con exito.....");
                            f=false;
                            m=true;
                        }else if(a.equalsIgnoreCase("1")){
                            m=true;
                        }else{
                            System.out.println("Ingrese un valor valido.......");
                            m=false;
                        }}while(!m);
                    }else{
                        System.out.println("***************Contraseña o Usuario incorrecto***************");
                        m=false;
                    }
                }while(!m);
            }
            default -> {
                System.out.println("Ingresa una opción valida");
            }
        }}while(m&&f);
    }

}