package com.program;

import java.util.Scanner;

public class cAtm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Mamsukan Nama Anda : ");
        String nama = input.nextLine();

        System.out.print("Masukan Saldo Anda : ");
        int saldo = input.nextInt();

        short batasTransaksi = 5;

        while (batasTransaksi > 0){
            int saldoSekarang = saldo;

            System.out.print("MENU\n"
            + "1. Penarikan Tunai\n"
            + "2. Menabung\n"
            + "Pilih [1/2]: ");
            String menu = input.next();

            if (menu.equalsIgnoreCase("1")){
                System.out.println("Anda akan melakukan penarikan tunai\n"
                        +"aldo anda adalah rp. " + saldoSekarang);
                System.out.println("Masukan JUmlah penarikan : ");
                        int penarikan = input.nextInt();
                        if(saldo - penarikan <5000){
                            System.out.println("Siasa saldo harus minimal Rp.5000");

                        }else if(penarikan < 2000){
                            System.out.println("Penarikan minimal harus Rp.2000");

                        }else{
                            saldo = saldo - penarikan;
                            System.out.println("Saldo awal anda adalah Rp."
                                    + saldoSekarang +". Ada melakukan penarikan sebsar RP." + penarikan);
                        }

                System.out.println("Sisa salado anda adalah Rp." +saldo + ". Sisa TRansasksi anda masih "
                        + (batasTransaksi - 1) + "kali");



            }else if (menu.equalsIgnoreCase("2")){

                System.out.println("Anda akan melakukan penabungan tunai\n"
                        +"aldo anda adalah rp. " + saldoSekarang);
                System.out.println("Masukan JUmlah tabungan : ");
                int penambahan = input.nextInt();
                if(penambahan < 2000){
                    System.out.println("penabungan harus minimal 2000");

                }else{
                    saldo = saldo + penambahan;
                    System.out.println("Saldo awal anda adalah Rp."
                            + saldoSekarang +". Ada melakukan penabungan sebsar RP." + penambahan);
                }

                System.out.println("Jumlah salado anda adalah Rp." +saldo + ". Sisa TRansasksi anda masih "
                        + (batasTransaksi - 1) + "kali");

            }else {
                System.out.println("menu ayang anda pilih tidak ada");
            }

                //step
            System.out.println("apakah anda ingin melakukan transasksi lagi [yes/no] : ");
            String pilihan = input.next();
            if(pilihan.equalsIgnoreCase("yes")){
                System.out.println("sisa transaksi anda masih " + (batasTransaksi - 1));
                    batasTransaksi --;


            }else if (pilihan.equalsIgnoreCase("no")){
                System.out.println("Terimaksih Sudah melakukan transaksi");
                batasTransaksi = 0;

            }else {
                System.out.println("pilihan tidak da");
                batasTransaksi = 0;
            }





        }







































    }
}
