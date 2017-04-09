/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2.projecto;

import edu.princeton.cs.algs4.RedBlackBST;
import edu.princeton.cs.algs4.SeparateChainingHashST;
import edu.ufp.inf.lp2.intro.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel Lopes
 */
public class MainApp {  
    //STs
    static SeparateChainingHashST<String, Aeroporto> aeroportos = new SeparateChainingHashST<>();
    static RedBlackBST<String, Aviao> avioes = new RedBlackBST<String, Aviao>();
    static RedBlackBST<Date, Voo> voos = new RedBlackBST<Date, Voo>(); 
    
    //STs para arquivar dados removidos
    static SeparateChainingHashST<String, Aeroporto> aeroportosRem = new SeparateChainingHashST<>();
    static RedBlackBST<String, Aviao> avioesRem = new RedBlackBST<String, Aviao>();
    static RedBlackBST<Date, Voo> voosRem = new RedBlackBST<Date, Voo>();
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        aeroportos = new SeparateChainingHashST<>();
        avioes = new RedBlackBST<>();
        aeroportosRem = new SeparateChainingHashST<>();
        avioesRem = new RedBlackBST<>();
        
        voos = new RedBlackBST<>();
        voosRem = new RedBlackBST<>();
        
        File fileAirports = new File("airports.txt");
        readAirports(fileAirports);
        File filePlanes = new File("airplanes.txt");
        readAirplanes(filePlanes);
        File rff = new File("flights.txt");
        readFlights(rff);
        readDeletedData();
        
        //Preencher lista de voos de cada aeroporto
        for(String key : aeroportos.keys()){
            for (Date key2 : voos.keys()){
                if(voos.get(key2).getAeroportoOrigem().getCodigo().compareTo(aeroportos.get(key).getCodigo())==0 || voos.get(key2).getAeroportoDestino().getCodigo().compareTo(aeroportos.get(key).getCodigo())==0){
                    aeroportos.get(aeroportos.get(key).getCodigo()).getVoosA().add(voos.get(key2));
                }
            }
        }
        
        //Preencher lista de voos de cada avião
        for(String key : avioes.keys()){
            for (Date key2 : voos.keys()){
                if(voos.get(key2).getAv().getId()==avioes.get(key).getId()){
                    avioes.get(key).getVoosA().add(voos.get(key2));
                }
            }
        }
        
        /*
        insertFlight(new Date(10,1,2017,15,45),aeroportos.get("OPO"),aeroportos.get("JFK"),avioes.get("1"),2000,12,10000,90,800);
        insertFlight(new Date(12,1,2016,16,50),aeroportos.get("JFK"),aeroportos.get("LIS"),avioes.get("2"),1500,30,8000,160,900);
        insertFlight(new Date(15,1,2017,13,50),aeroportos.get("MVD"),aeroportos.get("OPO"),avioes.get("4"),1300,30,8000,150,800);
        insertFlight(new Date(18,1,2015,12,50),aeroportos.get("OPO"),aeroportos.get("MVD"),avioes.get("32"),1000,20,8000,120,800);
        insertFlight(new Date(9,1,2014,10,0),aeroportos.get("LGW"),aeroportos.get("LIS"),avioes.get("3"),3500,30,8000,200,900);
        */      
        //printAirportsCountryContinent("Europe");
        //printAirplane("20");
        //printAirplanesInAirport("LIS");
        //printFlightsByAirport("LIS");
        //removeAirport("PEK");
        //removeFlight(new Date(10,1,2017,15,45));
        //removeFlight(new Date(18,1,2015,12,50));
        
        //calcFlightCost(new Date(10,1,2017,15,45));
        
        //editAirport("OPO");
        //editAirplane("1");
        //removeAirplane("12");
        //removeAirplane("4");
        //printAirplanes();
        //editFlight(new Date(10,1,2017,15,45));
        printFlights();
        /*
        for(Date d : voos.keys()){
            System.out.println(voos.get(d));
        }
        */
        /*
        for(Voo v : aeroportos.get("MVD").getVoosA()){
            System.out.println(v.getData().toString()+" - "+v.getAeroportoOrigem()+"->"+v.getAeroportoDestino());
        }
        
        for(Voo v : avioes.get("3").getVoosA()){
            System.out.println(v.getData().toString()+" - "+v.getAeroportoOrigem()+"->"+v.getAeroportoDestino());
        }
        */
        
        //printAirport("LIS");
        //printAirports();
        //printFlightsByAirplane("2");
        //printFlightsByPeriod(new Date(1,1,2010,0,0), new Date(2,3,2015,0,0));
        //flightWithMaxPassengers();
        //airportMaxPassengers();
        //maxTrafficAirport();
        
        //System.out.println(calcFlightCost(new Date(10,1,2017,15,45)));    
    /*    
        backupDeletedData();
        File fa = new File("Airports.txt");
        writeAirports(fa);
        File fp = new File("Airplanes.txt");
        writeAirplanes(fp);
        File ff = new File("flights.txt");
        writeFlights(ff);
    */
    }
    
    //Ler aeroportos a partir de um ficheiro
    public static void readAirports(File file) throws IOException{
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(";");
            Aeroporto a = new Aeroporto();
            a.setNome(tokens[0]);
            a.setCodigo(tokens[1]);
            a.setCidade(tokens[2]);
            a.setPais(tokens[3]);
            a.setContinente(tokens[4]);
            float f = Float.parseFloat(tokens[5]);
            a.setClassificacao(f);
            aeroportos.put(a.getCodigo(), a);
        }
    }
    
    //Escrever aeroportos para um ficheiro
    /**
     *
     * @param file
     * @throws IOException
     */
    public static void writeAirports(File file) throws IOException{
        FileWriter fr = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fr);
        pw.println("nome_aeroporto;código_aeroporto;cidade;país;continente;classificação;");
        for (String key : aeroportos.keys()) {
            pw.println(aeroportos.get(key).getNome()+";"+aeroportos.get(key).getCodigo()+";"+aeroportos.get(key).getCidade()+";"+aeroportos.get(key).getPais()+";"+aeroportos.get(key).getContinente()+";"+aeroportos.get(key).getClassificacao()+";");
        }
        pw.close();
        fr.close();
    }
    
    //Ler aviões a partir de um ficheiro
    public static void readAirplanes(File file) throws IOException{
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(";");
            Aviao av = new Aviao();
            av.setId(Integer.parseInt(tokens[0]));
            av.setModelo(tokens[1]);
            av.setNome(tokens[2]);
            av.setCompanhiaAerea(tokens[3]);
            av.setVel_cruzeiro(Integer.parseInt(tokens[4]));
            av.setAlt_cruzeiro(Integer.parseInt(tokens[5]));
            av.setDist_max(Integer.parseInt(tokens[6]));
            av.setCod_aeroporto(tokens[7]);
            av.setCap_passageiros(Integer.parseInt(tokens[8]));
            av.setCap_deposito(Integer.parseInt(tokens[9])); 
            //Insere o avião na ST
            avioes.put(tokens[0], av);
            //Coloca o avião no respectivo aeroporto
            aeroportos.get(tokens[7]).getAvioes().add(av);
        }
    }
    
    //Escrever aviões para um ficheiro
    public static void writeAirplanes(File file) throws IOException{
        FileWriter fr = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fr);
        pw.println("id_avião;modelo;nome;companhia_aérea;velocidade_cruzeiro;altitude_cruzeiro;distância_máxima;cod_aeroporto;capacidade_de_passageiros;capacidade_do_depósito;");
        for (String key : avioes.keys()) {
            pw.println(avioes.get(key).getId()+";"+avioes.get(key).getModelo()+";"+avioes.get(key).getNome()+";"+avioes.get(key).getCompanhiaAerea()+";"+avioes.get(key).getVel_cruzeiro()+";"+avioes.get(key).getAlt_cruzeiro()+";"+avioes.get(key).getDist_max()+";"+avioes.get(key).getCod_aeroporto()+";"+avioes.get(key).getCap_passageiros()+";"+avioes.get(key).getCap_deposito()+";");
        }
        pw.close();
        fr.close();
    }
    
    //Imprimir aeroporto com um determinado código
    public static void printAirport(String code){
        if(aeroportos.contains(code)){
            System.out.println(aeroportos.get(code).toString());
            System.out.println("Aviões presentes:");
            for(Aviao av : aeroportos.get(code).getAvioes()){
                System.out.println(av.getId()+" "+av.getCompanhiaAerea()+" "+av.getModelo()+" "+av.getNome());
            }
        }
    }
    
    //Imprimir avião com um determinado id
    public static void printAirplane(String id){
        if(avioes.contains(id)){
            System.out.println(avioes.get(id).toString());
        }
    }
    
    //Imprimir todos os aviões de um determinado aeroporto
    public static void printAirplanesInAirport(String airportCode){
        if(aeroportos.contains(airportCode)){
            System.out.println("Aviões no aeroporto "+aeroportos.get(airportCode).getNome()+" ("+airportCode+")");
            for (String key : avioes.keys()) {
                if(avioes.get(key).getCod_aeroporto().compareTo(airportCode)==0){
                    System.out.println(avioes.get(key).toString());
                }
            }
        }
    }
    
    //Imprimir aeroportos de um determinado país ou continente
    public static void printAirportsCountryContinent(String value){
        for (String key : aeroportos.keys()) {
            if(aeroportos.get(key).getPais().compareTo(value)==0 || aeroportos.get(key).getContinente().compareTo(value)==0){
                System.out.println(aeroportos.get(key).toString());
            }
        }
    }
    
    //Imprimir voos com origem/destino num determinado aeroporto
    public static void printFlightsByAirport(String code){
        if(aeroportos.contains(code)){
            ArrayList<Voo> ar = findFlightsByAirport(code);
            for(Voo v : ar){
                System.out.println(v.toString());
            }
        }
    }
    
    //Imprimir voos de um determinado avião
    public static void printFlightsByAirplane(String id){
        if(avioes.contains(id)){
            for(int i=0;i<avioes.get(id).getVoosA().size();i++){
                System.out.println(avioes.get(id).getVoosA().get(i));
            }
        }
    }
    
    //Imprimir voos num determinado período de tempo
    public static void printFlightsByPeriod(Date d1, Date d2){
        if(d1.beforeDate(d2)){
            for(Date key : voos.keys()){
                if(voos.get(key).getData().afterDate(d1) && voos.get(key).getData().beforeDate(d2)){
                    System.out.println(voos.get(key).toString());
                }
            }
        }
    }
    
    //Determinar voos com origem/destino num determinado aeroporto
    public static ArrayList<Voo> findFlightsByAirport(String code){
        ArrayList<Voo> ar = new ArrayList<>();
        if(aeroportos.contains(code)){
            for(int i=0;i<aeroportos.get(code).getVoosA().size();i++){
                ar.add(aeroportos.get(code).getVoosA().get(i));
            }
        }
        return ar;
    }
    
    //Imprimir aeroportos com mais tráfego
    public static void maxTrafficAirport(){
        int voosmax = 0;
        for (String key : aeroportos.keys()){
            if(aeroportos.get(key).getNvoos()>voosmax){
                voosmax=aeroportos.get(key).getNvoos();
            }
        }
        for(String key : aeroportos.keys()){
            if(aeroportos.get(key).getNvoos()==voosmax){
                System.out.println("Aeroporto com mais tráfego: "+aeroportos.get(key).getNome()+" com "+aeroportos.get(key).getNvoos()+" voos");
            }
        }
    }
    
    //Imprimir voos com maior número de passageiros
    public static void flightWithMaxPassengers(){
        int max = 0;
        for(Date key : voos.keys()){
            if(voos.get(key).getNumPassageiros()>max){
                max = voos.get(key).getNumPassageiros();
            }
        }
        for(Date key : voos.keys()){
            if(voos.get(key).getNumPassageiros()==max){
                System.out.println("Voo com maior número de passageiros: "+voos.get(key).toString());
            }
        }
        
    }
    
    //Imprimir aeroportos com mais passageiros
    public static void airportMaxPassengers(){
        int npass=0, max=0;
        for(String key : aeroportos.keys()){
            for(Date id : voos.keys()){
                if(voos.get(id).getAeroportoDestino().getCodigo().compareTo(aeroportos.get(key).getCodigo())==0 || voos.get(id).getAeroportoOrigem().getCodigo().compareTo(aeroportos.get(key).getCodigo())==0){
                    npass=npass+voos.get(id).getNumPassageiros();
                }
            }
            if(npass>max){
                max=npass;
            }
            npass=0;
        }
        for(String key : aeroportos.keys()){
            for(Date id : voos.keys()){
                if(voos.get(id).getAeroportoDestino().getCodigo().compareTo(aeroportos.get(key).getCodigo())==0 || voos.get(id).getAeroportoOrigem().getCodigo().compareTo(aeroportos.get(key).getCodigo())==0){
                    npass=npass+voos.get(id).getNumPassageiros();
                }
            }
            if(npass==max){
                System.out.println("Aeroporto com mais passageiros : "+aeroportos.get(key).getNome()+" com "+max+" passageiros");
            }
            npass=0;
        }
    }
    
    //Inserir voo
    public static void insertFlight(Date d,Aeroporto orig,Aeroporto dest,Aviao av,int dist,int vel_vento,int alt,int np,int vel){
        Voo v = new Voo(d,orig,dest,av,dist,vel_vento,alt,np,vel);
        if(voos.get(d)==null){
            voos.put(d, v);
        }
        //Altera a localização do avião para o aeroporto de destino
        avioes.get(Integer.toString(av.getId())).setCod_aeroporto(dest.getCodigo());
        //Adiciona o avião ao ArrayList de aviões do aeroporto
        aeroportos.get(dest.getCodigo()).addAviao(av);
        //Incrementa o número de voos a transitar nos aeroportos de origem e destino
        aeroportos.get(orig.getCodigo()).incrementVoos();
        aeroportos.get(dest.getCodigo()).incrementVoos();
    }
    
    //Eliminar voo com uma determinada data
    public static void removeFlight(Date d){
        if(voos.contains(d)){
            //Vai decrementar o nº de voos nos aeroportos do voo
            Aeroporto orig = voos.get(d).getAeroportoOrigem();
            Aeroporto dest = voos.get(d).getAeroportoDestino();
            aeroportos.get(orig.getCodigo()).decrementVoos();
            aeroportos.get(dest.getCodigo()).decrementVoos();
            //Arquiva os dados
            voosRem.put(d, voos.get(d));
            //Remove o voo
            voos.delete(d);
        }
        
    }
    
    //Editar o aeroporto com um determinado código
    public static void editAirport(String code){
        if(aeroportos.contains(code)){
            aeroportos.get(code).setCidade("Genève");
            aeroportos.get(code).setNome("Genève-Cointrin");
            aeroportos.get(code).setContinente("Europe");
            aeroportos.get(code).setPais("Suíça");
            aeroportos.get(code).setClassificacao(9.5f);
        }else{
            System.out.println("O aeroporto não existe");
        }
    }
    
    //Editar o avião com um determinado id
    public static void editAirplane(String id){
        if(avioes.contains(id)){
            avioes.get(id).setCompanhiaAerea("TAP");
            avioes.get(id).setModelo("Airbus A380");
            avioes.get(id).setVel_cruzeiro(910);
            avioes.get(id).setCap_passageiros(853);
            avioes.get(id).setDist_max(15700);
        }else{
            System.out.println("Avião não existe");
        }
    }
    
    //Editar voo com uma determinada data
    public static void editFlight(Date d){
        if(voos.contains(d)){
            //alterar e verificar capacidade de passageiros
            if(voos.get(d).getAv().getCap_passageiros()>=200){
                voos.get(d).setNumPassageiros(200);
            }else{
                System.out.println("Excesso de passageiros");
            }
            //alterar e verificar altitude positiva
            int altitude = 9000;
            if(altitude>0){
                voos.get(d).setAltitude(altitude);
            }
            //alterar aeroporto de destino para LIS
            String newcode = "LIS";
            if(aeroportos.get(newcode)!=null){
                voos.get(d).setAeroportoDestino(aeroportos.get(newcode));
            }
            //alterar velocidade do vento para 35
            voos.get(d).setVel_vento(35);
            //alterar distância para 300km
            voos.get(d).setDistancia(300);
        }else{
            System.out.println("O voo não existe");
        }
    }
    
    //Remover o avião com um determinado id
    public static void removeAirplane(String id){
        //Vai buscar a lista de aviões no aeroporto onde o avião se encontra e elimina-o da lista
        if(avioes.contains(id)){
            int idrem = 0;
            for(Aviao av : aeroportos.get(avioes.get(id).getCod_aeroporto()).getAvioes()){  
                if(av.getId()==Integer.parseInt(id)){
                    idrem=aeroportos.get(avioes.get(id).getCod_aeroporto()).getAvioes().indexOf(av);
                }
            }
            //Elimina o avião da lista do aeroporto onde este se encontra
            aeroportos.get(avioes.get(id).getCod_aeroporto()).getAvioes().remove(idrem);
            //Arquiva o avião
            avioesRem.put(id, avioes.get(id));
            
            //Percorre todos os voos e elimina aqueles que o avião efectuou
            for(Date key : voos.keys()){
                if(voos.get(key).getAv().getId()==Integer.parseInt(id)){
                    //Arquiva o voo
                    voosRem.put(key, voos.get(key));
                    //Elimina o voo
                    voos.delete(key);
                }
            }
            //Apaga o avião da ST de aviões
            avioes.delete(id); 
        }
    }
    
    //Remover aeroporto com um determinado código
    public static void removeAirport(String code){
        //Transfere os aviões presentes no aeroporto para outro por defeito
        //neste caso o aeroporto OPO que não pode ser eliminado
        if(code.compareTo("OPO")!=0 && aeroportos.contains(code)){
            for(Aviao av : aeroportos.get(code).getAvioes()){
                av.setCod_aeroporto("OPO");
                aeroportos.get("OPO").addAviao(av);
            }
        }
        //Procura o aeroporto em todos os voos e elimina-os da ST de voos
        for(Date key : voos.keys()){
            if(voos.get(key).getAeroportoDestino().getCodigo().compareTo(code)==0 || voos.get(key).getAeroportoOrigem().getCodigo().compareTo(code)==0){
                //Arquiva o voo
                voosRem.put(key, voos.get(key));
                //Elimina o voo
                voos.delete(key);
            }
        }
        //Arquiva aeroporto
        aeroportosRem.put(code, aeroportos.get(code));
        //Elimina o aeroporto da ST aeroportos
        aeroportos.delete(code);
    }
    
    //Imprimir todos os aeroportos
    public static void printAirports(){
        System.out.println("Existem "+aeroportos.size()+" aeroportos");
        for (String key : aeroportos.keys()) {
            System.out.println(aeroportos.get(key).toString());
        }
    }
    
    //Imprimir todos os aviões
    public static void printAirplanes(){
        System.out.println("Existem "+avioes.size()+" aviões inseridos");
        for (String key : avioes.keys()) {
            System.out.println(avioes.get(key).toString());
        }
    }
 
    //Imprimir todos os voos
    public static void printFlights(){
        for(Date key : voos.keys()){
            System.out.println(voos.get(key));
        }
    }
 
    //Calcula o custo de um voo
    public static int calcFlightCost(Date d){
        int n = 200, m = -200, cost = 0;
        int calt = 0, cvel = 0, cdist =0;
        if(voos.contains(d)){
            Voo v = voos.get(d);
            int dist = v.getDistancia();
            int alt = v.getAltitude();
            int velvento = v.getVel_vento();
            int vel = v.getVelocidade();

            int avaltcruz = v.getAv().getAlt_cruzeiro();
            int avvcruz = v.getAv().getVel_cruzeiro();
            /*
            System.out.println("Distância: "+dist+"Kms");
            System.out.println("Altitude do voo: "+alt+"m");
            System.out.println("Velocidade do vento: "+velvento+"Km/h");
            System.out.println("Velocidade do voo: "+vel+"Km/h");
            System.out.println("Velocidade de cruzeiro do avião: "+avvcruz+"Km/h");
            System.out.println("Altitude de cruzeiro do avião: "+avaltcruz+"m");
            */
            //custo da altitude
            calt = 0;
            if(alt>avaltcruz){
                calt = calt + ((avaltcruz-alt)/1000)*n;
            }else if(alt<avaltcruz){
                calt = calt + ((avaltcruz-alt)/1000)*m;
            }

            //efeito da velocidade do vento sobre a velocidade do avião
            if(velvento>0){
                vel = vel + velvento;
            }else if(velvento<0){
                vel = vel - velvento;
            }
            
            cvel=vel;
            if(vel>avvcruz){
                cvel = cvel + (avvcruz-vel);
            }else if(vel<avvcruz){
                cvel = cvel - (avvcruz-vel);
            } 

            cdist = dist;
            
            //System.out.println("Caltitude :"+calt);
            //System.out.println("Cvel :"+cvel);
            //System.out.println("Cdist :"+cdist);
            
            //custo = Cdist+Cvel+Calt
            cost = cdist+cvel+calt;
            System.out.println("Custo: "+cost);
        }
        return cost;
    }
    
    //Escrever voos para um ficheiro
    public static void writeFlights(File file) throws IOException{
        FileWriter fr = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fr);
        pw.println("dia;mes;ano;hora;minutos;tempo;aeroportoOrigem;aeroportodestino;aviao;distancia;velocidadevento;altitude;numpassageiros;velocidade;");
        for (Date key : voos.keys()) {
            pw.println(voos.get(key).getData().getDay()+";"+voos.get(key).getData().getMonth()+";"+voos.get(key).getData().getYear()+";"+voos.get(key).getData().getHour()+";"+voos.get(key).getData().getMin()+";"+voos.get(key).getTempo()+";"+voos.get(key).getAeroportoOrigem().getCodigo()+";"+voos.get(key).getAeroportoDestino().getCodigo()+";"+voos.get(key).getAv().getId()+";"+voos.get(key).getDistancia()+";"+voos.get(key).getVel_vento()+";"+voos.get(key).getAltitude()+";"+voos.get(key).getNumPassageiros()+";"+voos.get(key).getVelocidade()+";");            
        }
        pw.close();
        fr.close();
    }
    
    //Ler voos a partir de um ficheiro
    public static void readFlights(File file) throws IOException{
        Scanner scanner = new Scanner(file);
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(";");
            Date d = new Date(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]));
            insertFlight(d,aeroportos.get(tokens[6]),aeroportos.get(tokens[7]),avioes.get(tokens[8]),Integer.parseInt(tokens[9]),Integer.parseInt(tokens[10]),Integer.parseInt(tokens[11]),Integer.parseInt(tokens[12]),Integer.parseInt(tokens[13]));   
        }
    }
   
    //Arquiva os dados removidos em 3 ficheiros
    public static void backupDeletedData() throws IOException{
        File fa = new File("airports_old.txt");
        File fp = new File("airplanes_old.txt");
        File ff = new File("flights_old.txt");
        FileWriter fr = new FileWriter(ff);
        PrintWriter pw = new PrintWriter(fr);
        //Grava voos removidos
        pw.println("dia;mes;ano;hora;minutos;tempo;aeroportoOrigem;aeroportodestino;aviao;distancia;velocidadevento;altitude;numpassageiros;velocidade;");
        for (Date key : voosRem.keys()) {
            pw.println(voosRem.get(key).getData().getDay()+";"+voosRem.get(key).getData().getMonth()+";"+voosRem.get(key).getData().getYear()+";"+voosRem.get(key).getData().getHour()+";"+voosRem.get(key).getData().getMin()+";"+voosRem.get(key).getTempo()+";"+voosRem.get(key).getAeroportoOrigem().getCodigo()+";"+voosRem.get(key).getAeroportoDestino().getCodigo()+";"+voosRem.get(key).getAv().getId()+";"+voosRem.get(key).getDistancia()+";"+voosRem.get(key).getVel_vento()+";"+voosRem.get(key).getAltitude()+";"+voosRem.get(key).getNumPassageiros()+";"+voosRem.get(key).getVelocidade()+";");            
        }
        pw.close();
        fr.close();
        
        //Grava aviões removidos
        fr = new FileWriter(fp);
        pw = new PrintWriter(fr);
        pw.println("id_avião;modelo;nome;companhia_aérea;velocidade_cruzeiro;altitude_cruzeiro;distância_máxima;cod_aeroporto;capacidade_de_passageiros;capacidade_do_depósito;");
        for (String key : avioesRem.keys()) {
            pw.println(avioesRem.get(key).getId()+";"+avioesRem.get(key).getModelo()+";"+avioesRem.get(key).getNome()+";"+avioesRem.get(key).getCompanhiaAerea()+";"+avioesRem.get(key).getVel_cruzeiro()+";"+avioesRem.get(key).getAlt_cruzeiro()+";"+avioesRem.get(key).getDist_max()+";"+avioesRem.get(key).getCod_aeroporto()+";"+avioesRem.get(key).getCap_passageiros()+";"+avioesRem.get(key).getCap_deposito()+";");
        }
        pw.close();
        fr.close();
        
        //Grava aeroportos removidos
        fr = new FileWriter(fa);
        pw = new PrintWriter(fr);
        pw.println("nome_aeroporto;código_aeroporto;cidade;país;continente;classificação;");
        for (String key : aeroportosRem.keys()) {
            pw.println(aeroportosRem.get(key).getNome()+";"+aeroportosRem.get(key).getCodigo()+";"+aeroportosRem.get(key).getCidade()+";"+aeroportosRem.get(key).getPais()+";"+aeroportosRem.get(key).getContinente()+";"+aeroportosRem.get(key).getClassificacao()+";");
        }
        pw.close();
        fr.close();
    }
    
    //Carrega os dados removidos para as ST
    public static void readDeletedData() throws FileNotFoundException{
        File fileAirports = new File("airports_old.txt");
        File filePlanes = new File("airplanes_old.txt");
        File rff = new File("flights_old.txt");
        
        //Carrega aeroportos removidos
        Scanner scanner = new Scanner(fileAirports);
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(";");
            Aeroporto a = new Aeroporto();
            a.setNome(tokens[0]);
            a.setCodigo(tokens[1]);
            a.setCidade(tokens[2]);
            a.setPais(tokens[3]);
            a.setContinente(tokens[4]);
            float f = Float.parseFloat(tokens[5]);
            a.setClassificacao(f);
            aeroportosRem.put(a.getCodigo(), a);
        }
        
        //Carrega aviões removidos
        scanner = new Scanner(filePlanes);
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(";");
            Aviao av = new Aviao();
            av.setId(Integer.parseInt(tokens[0]));
            av.setModelo(tokens[1]);
            av.setNome(tokens[2]);
            av.setCompanhiaAerea(tokens[3]);
            av.setVel_cruzeiro(Integer.parseInt(tokens[4]));
            av.setAlt_cruzeiro(Integer.parseInt(tokens[5]));
            av.setDist_max(Integer.parseInt(tokens[6]));
            av.setCod_aeroporto(tokens[7]);
            av.setCap_passageiros(Integer.parseInt(tokens[8]));
            av.setCap_deposito(Integer.parseInt(tokens[9]));           
            avioesRem.put(tokens[0], av);
        }
        
        //Carrega voos removidos
        scanner = new Scanner(rff);
        scanner.nextLine();
        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(";");
            Voo v = new Voo();
            Date d = new Date(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]));
            v.setData(d);
            v.setTempo(Integer.parseInt(tokens[5]));
            if(aeroportos.get(tokens[6])!=null){
                v.setAeroportoOrigem(aeroportos.get(tokens[6]));
            }else{
                v.setAeroportoOrigem(aeroportosRem.get(tokens[6]));
            }
            if(aeroportos.get(tokens[7])!=null){
                v.setAeroportoDestino(aeroportos.get(tokens[7]));
            }else{
                v.setAeroportoDestino(aeroportosRem.get(tokens[7]));
            }
            if(avioes.get(tokens[8])!=null){
                v.setAv(avioes.get(tokens[8]));
            }else{
                v.setAv(avioesRem.get(tokens[8]));
            }
            v.setDistancia(Integer.parseInt(tokens[9]));
            v.setVel_vento(Integer.parseInt(tokens[10]));
            v.setAltitude(Integer.parseInt(tokens[11]));
            v.setNumPassageiros(Integer.parseInt(tokens[12]));
            v.setVelocidade(Integer.parseInt(tokens[13]));
            voosRem.put(d, v);
        }
    }
}