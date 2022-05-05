package com.example.scene1;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Scanner;



public class Computer_vs_Player {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField txt;
    @FXML
    TextField txt2;
    @FXML
    Pane gg;
    @FXML
    Label player;
    @FXML
    Button start;
    @FXML
    Label text1;
    @FXML
    Label text2;
    @FXML
    Label text3;
    @FXML
    Label text4;
    @FXML
    Label text5;
    @FXML
    Button btn1;
    @FXML
    Button btn2;
    @FXML
    Button btn3;
    @FXML
    Button btn4;
    @FXML
    Button btn5;
    @FXML
    Button btn6;
    @FXML
    Button btn7;
    @FXML
    Button btn8;
    @FXML
    Button btn9;
    @FXML
    Button btn10;
    @FXML
    Button btn11;
    @FXML
    Button btn12;
    @FXML
    Button btn13;
    @FXML
    Button btn14;
    @FXML
    Button btn15;
    @FXML
    Button btn16;
    @FXML
    Button btn17;
    @FXML
    Button btn18;
    @FXML
    Button btn19;
    @FXML
    Button btn20;
    @FXML
    Button btn21;
    @FXML
    Button btn22;
    @FXML
    Button btn23;
    @FXML
    Button btn24;
    @FXML
    Button btn25;
    @FXML
    Button btn26;
    @FXML
    Button bila_btn;
    @FXML
    Button cerna_btn;
    @FXML
    Button stoper1;
    @FXML
    Button starter;
    @FXML
    Button vybrat;
    @FXML
    Label pravidla;
    @FXML
    Label vb;


    static int tt = 0;
    int ds = 4;
    int stoper = 0;
    int hh = 4;
    //pomocné proměné k
    static int kk = 0;
    static int jj = 0;
    static int prechod;
    static double dd = 0;
    static double rr = 0;
    static double odchod = 0;


    static int pocet = 0;// how many cards have been taken
    static double cisla = 0;
    static double plus = 0;
    static double cisla_pozadu = 0;
    static double plus2 = 0;


    static int down = 0;
    static int right = 0;
    static double c = 0.3;
    static int g = 0;
    static int poradi = 1;
    static int poradi2 = 12;
    static int ox = 0;


    static double[] karta;
    static double[] karta2;
    static double[] kartare;
    static double[] karta2re;
    static double[] cislare;
    static double[] cislarandom;
    static double[][] arr = new double[30][13];
    static double mezikrok = 0;
    static double bb = 0;
    static int konec = 0;


    static double btnk1[] = new double[13];
    static double btnk2[] = new double[13];
    static int poradnik1[] = new int[13];
    static int poradnik2[] = new int[13];
    static double disable2[] = new double[13];
    static double disable1[] = new double[13];
    //pomocné array k mezikroku
    static double mezi1[] = new double[13];
    static double mezi2[] = new double[13];
    //proměná zištující zakliknutí bílé nebo černé karty
    int bln = 0;
    static int coda = 0;
    static int coda2 = -1;

    //integer určují barvu karty
    static int color = 0;
    /**
     * Integer count určuje, zdali se hráč uhádl správnou kartu
     */
    static int count = 0;
    //zišuje jestli ve vyhledávání je všechno v pořádku
    static int oo = 0;

    static int count2 = 0;
    //vyhledání pozice karty hráče 1
    static int vy1 = -1;
    //vyhledání hondoty karty hráče 1
    static double vy2 = 0;
    //vyhledání pozice karty hráče 2
    static int vy3 = -1;
    //vyhledání hondoty karty hráče 2
    static double vy4 = 0;
    //zvolená barva hráče 1
    static int vy5 = 0;
    //zvolená barva hráče 2
    static int vy6 = 0;
    //zišťuje jestli hráč 2 výhrál
    static int q = 0;
    //zišťuje jestli hráč 1 výhrál
    static int o = 0;
    //nová karta hráče 1
    static double ran1 = 0;
    //nová karta hráče 2
    static double ran2 = 0;

    static int break1 = 16;
    //určuje kolik je černých v poli cislarandom
    static int cerna = 0;
    //určuje kolik je bílých v poli cislarandom
    static int bila = 0;
    //zištuje jesti černé karty došli
    static int konecna_cerna = 0;
    //zištuje jesti bílé karty došli
    static int konecna_bila = 0;
    //static int move = 0;
    //zišuje jestli došli karty
    static int final_color = 0;

    //proměné k pořadníku
    static int ran1_count;
    static int ran2_count;
    static int position1_count;
    static int position2_count;

    static int cerna_dosla = 0;
    static int bila_dosla = 0;
    //pomocné porměné k vyřazení pozice karty
    static double barva = 0;
    static double novabarva = 0;
    static double barva2 = 0;
    static double novabarva2 = 0;


    static double celkoveporadi = 0;
    //počítá řadu u hádání
    static int count_rada = 1;
    //počítá jestli je řada prázdná
    static int count_rada_break = 0;
    //pořadí v pořadníku
    static int ran1_countc = 0;
    static String ll = "";
    //pomocný int pro novou kartu počítače
    static String zz = "";
    //pomocný int pomlčky
    static int poml = 0;
    //pomocný int pomlčky
    static int krok = 0;

    //ActionEvent načítající začáteční hru
    public void start(ActionEvent event) throws IOException {
        starter.setVisible(false);
        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
        btn5.setVisible(true);
        btn6.setVisible(true);
        btn7.setVisible(true);
        btn8.setVisible(true);
        stoper1.setVisible(true);
        cerna_btn.setVisible(true);
        bila_btn.setVisible(true);
        txt.setVisible(true);
        player.setVisible(true);
        pravidla.setVisible(true);

        if (Math.floor(karta2[0]) == karta2[0] - 0.5 || Math.floor(karta2[0]) == ((karta2[0] * 10) - 4) / 10) {
            btn2.setStyle("-fx-background-color:#474747");
            color++;
        } else {
            btn2.setStyle("-fx-background-color:#EBEFE6");
        }
        if (color == 1) {
            btn2.setTextFill(Color.WHITE);
        } else {
            btn2.setTextFill(Color.BLACK);
        }
        color = 0;
        if (Math.floor(karta2[1]) == karta2[1] - 0.5 || Math.floor(karta2[1]) == ((karta2[1] * 10) - 4) / 10) {
            btn4.setStyle("-fx-background-color:#474747");
            color++;
        } else {
            btn4.setStyle("-fx-background-color:#EBEFE6");
        }
        if (color == 1) {
            btn4.setTextFill(Color.WHITE);
        } else {
            btn4.setTextFill(Color.BLACK);
        }
        color = 0;
        if (Math.floor(karta2[2]) == karta2[2] - 0.5 || Math.floor(karta2[2]) == ((karta2[2] * 10) - 4) / 10) {
            btn6.setStyle("-fx-background-color:#474747");
            color++;
        } else {
            btn6.setStyle("-fx-background-color:#EBEFE6");
        }
        if (color == 1) {
            btn6.setTextFill(Color.WHITE);
        } else {
            btn6.setTextFill(Color.BLACK);
        }
        color = 0;
        if (Math.floor(karta2[3]) == karta2[3] - 0.5 || Math.floor(karta2[3]) == ((karta2[3] * 10) - 4) / 10) {
            btn8.setStyle("-fx-background-color:#474747");
            color++;
        } else {
            btn8.setStyle("-fx-background-color:#EBEFE6");
        }
        if (color == 1) {
            btn8.setTextFill(Color.WHITE);
        } else {
            btn8.setTextFill(Color.BLACK);
        }
        color = 0;


        if (Math.floor(karta[0]) == karta[0] - 0.5 || Math.floor(karta[0]) == ((karta[0] * 10) - 4) / 10) {
            btn1.setStyle("-fx-background-color:#474747");
            color++;
        } else {
            btn1.setStyle("-fx-background-color:#EBEFE6");
        }
        if (color == 1) {
            btn1.setTextFill(Color.WHITE);
        } else {
            btn1.setTextFill(Color.BLACK);
        }
        color = 0;
        if (Math.floor(karta[1]) == karta[1] - 0.5 || Math.floor(karta[1]) == ((karta[1] * 10) - 4) / 10) {
            btn3.setStyle("-fx-background-color:#474747");
            color++;
        } else {
            btn3.setStyle("-fx-background-color:#EBEFE6");
        }
        if (color == 1) {
            btn3.setTextFill(Color.WHITE);
        } else {
            btn3.setTextFill(Color.BLACK);
        }
        color = 0;
        if (Math.floor(karta[2]) == karta[2] - 0.5 || Math.floor(karta[2]) == ((karta[2] * 10) - 4) / 10) {
            btn5.setStyle("-fx-background-color:#474747");
            color++;
        } else {
            btn5.setStyle("-fx-background-color:#EBEFE6");
        }
        if (color == 1) {
            btn5.setTextFill(Color.WHITE);
        } else {
            btn5.setTextFill(Color.BLACK);
        }
        color = 0;
        if (Math.floor(karta[3]) == karta[3] - 0.5 || Math.floor(karta[3]) == ((karta[3] * 10) - 4) / 10) {
            btn7.setStyle("-fx-background-color:#474747");
            color++;
        } else {
            btn7.setStyle("-fx-background-color:#EBEFE6");
        }
        if (color == 1) {
            btn7.setTextFill(Color.WHITE);
        } else {
            btn7.setTextFill(Color.BLACK);
        }
        color = 0;
        if (Math.floor(karta[0]) == ((karta[0] * 10) - 4) / 10 || Math.floor(karta[0]) == ((karta[0] * 10) - 2) / 10) {
            btn1.setText("-");
        } else {
            btn1.setText(String.valueOf((int) Math.floor(karta[0])));
        }

        if (Math.floor(karta[1]) == ((karta[1] * 10) - 4) / 10 || Math.floor(karta[1]) == ((karta[1] * 10) - 2) / 10) {
            btn3.setText("-");
        } else {
            btn3.setText(String.valueOf((int) Math.floor(karta[1])));
        }

        if (Math.floor(karta[2]) == ((karta[2] * 10) - 4) / 10 || Math.floor(karta[2]) == ((karta[2] * 10) - 2) / 10) {
            btn5.setText("-");
        } else {
            btn5.setText(String.valueOf((int) Math.floor(karta[2])));
        }

        if (Math.floor(karta[3]) == ((karta[3] * 10) - 4) / 10 || Math.floor(karta[3]) == ((karta[3] * 10) - 2) / 10) {
            btn7.setText("-");
        } else {
            btn7.setText(String.valueOf((int) Math.floor(karta[3])));
        }
    }
   // výběr pomlčky
    public void vyber(ActionEvent event) throws IOException {
        try {
            String pp = txt2.getText();
            krok = Integer.parseInt(pp);
        }catch(Exception e) {
            krok = -1;
        }
        if(krok> 11 || krok <0){

        }else{
            poml = 0;
            txt2.clear();
            txt2.setVisible(false);
            vybrat.setVisible(false);
            vb.setVisible(false);
        }
    }

    //ActioEventy pro karty
    public void btn1ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[0];
    }

    public void btn2ac(ActionEvent event) throws IOException, InterruptedException {
        vy1 = poradnik2[0];
    }

    public void btn3ac(ActionEvent event) throws IOException, InterruptedException {
        vy3 = poradnik1[1];
    }

    public void btn4ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[1];
    }

    public void btn5ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[2];
    }

    public void btn6ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[2];
    }

    public void btn7ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[3];
    }

    public void btn8ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[3];
    }

    public void btn9ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[4];
    }

    public void btn10ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[4];
    }

    public void btn11ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[5];
    }

    public void btn12ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[5];
    }

    public void btn13ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[6];
    }

    public void btn14ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[6];
    }

    public void btn15ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[7];
    }

    public void btn16ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[7];
    }

    public void btn17ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[8];
    }

    public void btn18ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[8];
    }

    public void btn19ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[9];
    }

    public void btn20ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[9];
    }

    public void btn21ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[10];
    }

    public void btn22ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[10];
    }

    public void btn23ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[11];
    }

    public void btn24ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[11];
    }
    public void btn25ac(ActionEvent event) throws IOException {
        vy3 = poradnik1[12];
    }

    public void btn26ac(ActionEvent event) throws IOException {
        vy1 = poradnik2[12];
    }

    public void bila(ActionEvent event) throws IOException {
        //určování hodnoty karty
        if (stoper == 0) {
            vy5 = 0;
            player1_colorpicking();
        }
        //bila dosla
        if (konecna_bila > 0 || break1 >= 52) {
            konecna_bila++;
            bila_btn.setDisable(true);
        }
        //karty dosli
        if (konecna_bila > 0 && konecna_cerna > 0) {
            final_color++;
        }
        //braní si karet
        if (stoper == 1 || konecna_bila > 0) {
        } else {
            bila_btn.setVisible(false);
            if (ds == 4) {
                btn9.setVisible(true);
                btn9.setLayoutX(1500);
                btn9.setLayoutY(430);
                btn9.setTextFill(Color.BLACK);
                btn9.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd)== ((dd*10)-2)/10) {
                    btn9.setText("-");
                    poml++;
                } else {
                    btn9.setText(String.valueOf((int) dd));
                }

                ds++;
                stoper++;
            } else if (ds == 6) {
                btn11.setVisible(true);
                btn11.setLayoutX(1500);
                btn11.setLayoutY(430);
                btn11.setTextFill(Color.BLACK);
                btn11.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd)== ((dd*10)-2)/10) {
                    btn11.setText("-");
                    poml++;
                } else {
                    btn11.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 8) {
                btn13.setVisible(true);
                btn13.setLayoutX(1500);
                btn13.setLayoutY(430);
                btn13.setTextFill(Color.BLACK);
                btn13.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd) == ((dd*10)-2)/10) {
                    btn13.setText("-");
                    poml++;
                } else {
                    btn13.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 10) {
                btn15.setVisible(true);
                btn15.setLayoutX(1500);
                btn15.setLayoutY(430);
                btn15.setTextFill(Color.BLACK);
                btn15.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd)== ((dd*10)-2)/10) {
                    btn15.setText("-");
                    poml++;
                } else {
                    btn15.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 12) {
                btn17.setVisible(true);
                btn17.setLayoutX(1500);
                btn17.setLayoutY(430);
                btn17.setTextFill(Color.BLACK);
                btn17.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd)== ((dd*10)-2)/10) {
                    btn17.setText("-");
                    poml++;
                } else {
                    btn17.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 14) {
                btn19.setVisible(true);
                btn19.setLayoutX(1500);
                btn19.setLayoutY(430);
                btn19.setTextFill(Color.BLACK);
                btn19.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd)== ((dd*10)-2)/10) {
                    btn19.setText("-");
                    poml++;
                } else {
                    btn19.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 16) {
                btn21.setVisible(true);
                btn21.setLayoutX(1500);
                btn21.setLayoutY(430);
                btn21.setTextFill(Color.BLACK);
                btn21.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd)== ((dd*10)-2)/10) {
                    btn21.setText("-");
                    poml++;
                } else {
                    btn21.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 18) {
                btn23.setVisible(true);
                btn23.setLayoutX(1500);
                btn23.setLayoutY(430);
                btn23.setTextFill(Color.BLACK);
                btn23.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd)== ((dd*10)-2)/10) {
                    btn23.setText("-");
                    poml++;
                } else {
                    btn23.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 20) {
                btn25.setVisible(true);
                btn25.setLayoutX(1500);
                btn25.setLayoutY(430);
                btn25.setTextFill(Color.BLACK);
                btn25.setStyle("-fx-background-color:#EBEFE6");
                if (Math.floor(dd)== ((dd*10)-2)/10) {
                    btn25.setText("-");
                    poml++;
                } else {
                    btn25.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            }
            if(poml == 1){
                txt2.setVisible(true);
                vybrat.setVisible(true);
                vb.setVisible(true);
            }
            bln++;
        }
    }

    public void cerna(ActionEvent event) throws IOException {
        //určování hodnoty karty
        if (stoper == 0) {
            vy5 = 1;
            player1_colorpicking();
        }
        //černé karty došli
        if (konecna_cerna > 0 || break1 >= 52) {
            konecna_cerna++;
            cerna_btn.setDisable(true);
        }
        //karty došli
        if (konecna_bila > 0 && konecna_cerna > 0) {
            final_color++;
        }
        //braní si karet
        if (stoper == 1 || konecna_cerna > 0) {
        } else {
            cerna_btn.setVisible(false);
            if (ds == 4) {
                btn9.setVisible(true);
                btn9.setLayoutX(1665);
                btn9.setLayoutY(430);
                btn9.setTextFill(Color.WHITE);
                btn9.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn9.setText("-");
                    poml++;
                } else {
                    btn9.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 6) {
                btn11.setVisible(true);
                btn11.setLayoutX(1665);
                btn11.setLayoutY(430);
                btn11.setTextFill(Color.WHITE);
                btn11.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn11.setText("-");
                    poml++;
                } else {
                    btn11.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 8) {
                btn13.setVisible(true);
                btn13.setLayoutX(1665);
                btn13.setLayoutY(430);
                btn13.setTextFill(Color.WHITE);
                btn13.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn13.setText("-");
                    poml++;
                } else {
                    btn13.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 10) {
                btn15.setVisible(true);
                btn15.setLayoutX(1665);
                btn15.setLayoutY(430);
                btn15.setTextFill(Color.WHITE);
                btn15.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn15.setText("-");
                    poml++;
                } else {
                    btn15.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 12) {
                btn17.setVisible(true);
                btn17.setLayoutX(1665);
                btn17.setLayoutY(430);
                btn17.setTextFill(Color.WHITE);
                btn17.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn17.setText("-");
                    poml++;
                } else {
                    btn17.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 14) {
                btn19.setVisible(true);
                btn19.setLayoutX(1665);
                btn19.setLayoutY(430);
                btn19.setTextFill(Color.WHITE);
                btn19.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn19.setText("-");
                    poml++;
                } else {
                    btn19.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 16) {
                btn21.setVisible(true);
                btn21.setLayoutX(1665);
                btn21.setLayoutY(430);
                btn21.setTextFill(Color.WHITE);
                btn21.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn21.setText("-");
                    poml++;
                } else {
                    btn21.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            } else if (ds == 18) {
                btn23.setVisible(true);
                btn23.setLayoutX(1665);
                btn23.setLayoutY(430);
                btn23.setTextFill(Color.WHITE);
                btn23.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn23.setText("-");
                    poml++;
                } else {
                    btn23.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;

            } else if (ds == 20) {
                btn25.setVisible(true);
                btn25.setLayoutX(1665);
                btn25.setLayoutY(430);
                btn25.setTextFill(Color.WHITE);
                btn25.setStyle("-fx-background-color:#474747");
                if (Math.floor(dd)== ((dd*10)-4)/10) {
                    btn25.setText("-");
                    poml++;
                } else {
                    btn25.setText(String.valueOf((int) dd));
                }
                ds++;
                stoper++;
            }
            if(poml == 1){
                txt2.setVisible(true);
                vybrat.setVisible(true);
                vb.setVisible(true);
            }
            bln++;
        }
    }

    /**
     * Hádání karet hráče a počítače
     * spouští celou sekvenci počítače
     */
    public void stoper(ActionEvent event) throws IOException, InterruptedException {
        String text = txt.getText();
        oo = 0;
        //hádání
        if ((text != "" && ds == 22) || (text != "" && bln != 0)) {
            oo++;
        }
        vy2 = -1;
        vy4 = -1;
        ll = "";
        if (poml == 1){
            oo--;
        }

        if (bln == 0 && ds < 21) {
            text5.setText(text4.getText());
            text4.setText(text3.getText());
            text3.setText(text2.getText());
            text2.setText(text1.getText());
            text1.setText("Player1: Take a card");
            oo--;
        }
        if (vy1 < 0) {
            text5.setText(text4.getText());
            text4.setText(text3.getText());
            text3.setText(text2.getText());
            text2.setText(text1.getText());
            text1.setText("Player1: Select card first");
            oo--;
        }
        try {
            vy2 = Double.parseDouble(text);
        }catch(Exception e) {
            ll = text;
        }
        if(ll.equals("")){

        }else if(!ll.equals("-")){
            oo--;
        }else{
            vy2 = 0.5;
        }
        if (vy2 > 11 || vy2 < 0) {
            text5.setText(text4.getText());
            text4.setText(text3.getText());
            text3.setText(text2.getText());
            text2.setText(text1.getText());
            text1.setText("Player1: Wrong number ");
            oo--;
        }

        if (oo <= 0) {

        } else {
            prechod = vy1;
            player1_position();
            if (Math.floor(vy2) == vy2 - 0.5 || Math.floor(vy2)== ((vy2*10)-4)/10) {
                color++;
            }
            String ww;
            if (color == 1) {
                ww = "Cerna";
            } else {
                ww = "Bila";
            }
            color = 0;
            text5.setText(text4.getText());
            text4.setText(text3.getText());
            text3.setText(text2.getText());
            text2.setText(text1.getText());
            if (count == 1) {
                if ((Math.floor(vy2)== ((vy2*10)-2)/10) || (Math.floor(vy2)== ((vy2*10)-4)/10)) {
                    text1.setText("Player1: " + ww + " - is Correct");
                }else{
                    text1.setText("Player1: " + ww + " " + (int) vy2 + " is Correct");
                }
            } else {
                if ((Math.floor(vy2) == ((vy2 * 10) - 2) / 10) || (Math.floor(vy2) == ((vy2 * 10) - 4) / 10)) {
                    text1.setText("Player1: " + ww + " - is Correct");
                } else {
                    text1.setText("Player1: " + ww + " " + (int) vy2 + " is Incorrect");
                }
            }
            if (count == 1) {
                txt.clear();
                //končící sekvence
                if (o > 0) {
                    o = 0;
                } else {
                    Parent root = FXMLLoader.load(getClass().getResource("player1-enter.fxml"));
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                if (prechod == btnk2[0]) {
                    if (ll.equals("-")) {
                        btn2.setText("-");
                    } else {
                        btn2.setText(String.valueOf((int) vy2));
                    }
                    btn2.setDisable(true);
                    disable2[0] = vy2;
                } else if (prechod == btnk2[1]) {
                    if (ll.equals("-")) {
                        btn4.setText("-");
                    } else {
                        btn4.setText(String.valueOf((int) vy2));
                    }
                    btn4.setDisable(true);
                    disable2[1] = vy2;
                } else if (prechod == btnk2[2]) {
                    if (ll.equals("-")) {
                        btn6.setText("-");
                    } else {
                        btn6.setText(String.valueOf((int) vy2));
                    }
                    btn6.setDisable(true);
                    disable2[2] = vy2;
                } else if (prechod == btnk2[3]) {
                    if (ll.equals("-")) {
                        btn8.setText("-");
                    } else {
                        btn8.setText(String.valueOf((int) vy2));
                    }
                    btn8.setDisable(true);
                    disable2[3] = vy2;
                } else if (prechod == btnk2[4]) {
                    if (ll.equals("-")) {
                        btn10.setText("-");
                    } else {
                        btn10.setText(String.valueOf((int) vy2));
                    }
                    btn10.setDisable(true);
                    disable2[4] = vy2;
                } else if (prechod == btnk2[5]) {
                    if (ll.equals("-")) {
                        btn12.setText("-");
                    } else {
                        btn12.setText(String.valueOf((int) vy2));
                    }
                    btn12.setDisable(true);
                    disable2[5] = vy2;
                } else if (prechod == btnk2[6]) {
                    if (ll.equals("-")) {
                        btn14.setText("-");
                    } else {
                        btn14.setText(String.valueOf((int) vy2));
                    }
                    btn14.setDisable(true);
                    disable2[6] = vy2;
                } else if (prechod == btnk2[7]) {
                    if (ll.equals("-")) {
                        btn16.setText("-");
                    } else {
                        btn16.setText(String.valueOf((int) vy2));
                    }
                    btn16.setDisable(true);
                    disable2[7] = vy2;
                } else if (prechod == btnk2[8]) {
                    if (ll.equals("-")) {
                        btn18.setText("-");
                    } else {
                        btn18.setText(String.valueOf((int) vy2));
                    }
                    btn18.setDisable(true);
                    disable2[8] = vy2;
                } else if (prechod == btnk2[9]) {
                    if (ll.equals("-")) {
                        btn20.setText("-");
                    } else {
                        btn20.setText(String.valueOf((int) vy2));
                    }
                    btn20.setDisable(true);
                    disable2[9] = vy2;
                } else if (prechod == btnk2[10]) {
                    if (ll.equals("-")) {
                        btn22.setText("-");
                    } else {
                        btn22.setText(String.valueOf((int) vy2));
                    }
                    btn22.setDisable(true);
                    disable2[10] = vy2;
                } else if (prechod == btnk2[11]) {
                    if (ll.equals("-")) {
                        btn24.setText("-");
                    } else {
                        btn24.setText(String.valueOf((int) vy2));
                    }
                    btn24.setDisable(true);
                    disable2[11] = vy2;
                } else if (prechod == btnk2[12]) {
                    if (ll.equals("-")) {
                        btn26.setText("-");
                    } else {
                        btn26.setText(String.valueOf((int) vy2));
                    }
                    btn26.setDisable(true);
                    disable2[12] = vy2;
                }
            } else {
                //neuhodnutí  karty
                player1_correcting();
                //zařazení čísla a vznik pořadníku
                if ( kk == 0) {
                    ran1_count = 0;
                    for (int t = 0; t < karta.length; t++) {
                        if (karta[t] == ran1) {
                            ran1_count++;
                            break;
                        } else {
                            ran1_count++;
                        }
                    }
                    ran1_count--;
                    poradnik1[karta.length - 1] = ran1_count;
                    for (int w = 0; w < karta.length - 1; w++) {
                        if (poradnik1[w] >= ran1_count) {
                            poradnik1[w]++;
                        }
                    }

                    //sekvence přestavění čísel
                    position1_count = ran1_count;
                    btnk1[karta.length - 1] = position1_count;
                    if (btnk1[0] >= position1_count) {
                        tt = (int) btn1.getLayoutX();
                        btn1.setLayoutX(tt + 130);
                        btnk1[0]++;
                    }
                    if (btnk1[1] >= position1_count) {
                        tt = (int) btn3.getLayoutX();
                        btn3.setLayoutX(tt + 130);
                        btnk1[1]++;
                    }
                    if (btnk1[2] >= position1_count) {
                        tt = (int) btn5.getLayoutX();
                        btn5.setLayoutX(tt + 130);
                        btnk1[2]++;
                    }
                    if (btnk1[3] >= position1_count) {
                        tt = (int) btn7.getLayoutX();
                        btn7.setLayoutX(tt + 130);
                        btnk1[3]++;
                    }
                    if (btnk1[4] >= position1_count && ds > 5 ) {
                        tt = (int) btn9.getLayoutX();
                        btn9.setLayoutX(tt + 130);
                        btnk1[4]++;
                    }
                    if (btnk1[5] >= position1_count && ds > 7) {
                        tt = (int) btn11.getLayoutX();
                        btn11.setLayoutX(tt + 130);
                        btnk1[5]++;
                    }
                    if (btnk1[6] >= position1_count && ds > 9) {
                        tt = (int) btn13.getLayoutX();
                        btn13.setLayoutX(tt + 130);
                        btnk1[6]++;
                    }
                    if (btnk1[7] >= position1_count && ds > 11) {
                        tt = (int) btn15.getLayoutX();
                        btn15.setLayoutX(tt + 130);
                        btnk1[7]++;
                    }
                    if (btnk1[8] >= position1_count && ds > 13) {
                        tt = (int) btn17.getLayoutX();
                        btn17.setLayoutX(tt + 130);
                        btnk1[8]++;
                    }
                    if (btnk1[9] >= position1_count && ds > 15) {
                        tt = (int) btn19.getLayoutX();
                        btn19.setLayoutX(tt + 130);
                        btnk1[9]++;
                    }
                    if (btnk1[10] >= position1_count && ds > 17) {
                        tt = (int) btn21.getLayoutX();
                        btn21.setLayoutX(tt + 130);
                        btnk1[10]++;
                    }
                    if (btnk1[11] >= position1_count && ds > 19) {
                        tt = (int) btn23.getLayoutX();
                        btn23.setLayoutX(tt + 130);
                        btnk1[11]++;
                    }
                    //pozice nového čísla
                    if (karta.length == 5) {
                        btn9.setLayoutX(20 + position1_count * 130);
                        btn9.setLayoutY(820);
                    } else if (karta.length == 6) {
                        btn11.setLayoutX(20 + position1_count * 130);
                        btn11.setLayoutY(820);
                    } else if (karta.length == 7) {
                        btn13.setLayoutX(20 + position1_count * 130);
                        btn13.setLayoutY(820);
                    } else if (karta.length == 8) {
                        btn15.setLayoutX(20 + position1_count * 130);
                        btn15.setLayoutY(820);
                    } else if (karta.length == 9) {
                        btn17.setLayoutX(20 + position1_count * 130);
                        btn17.setLayoutY(820);
                    } else if (karta.length == 10) {
                        btn19.setLayoutX(20 + position1_count * 130);
                        btn19.setLayoutY(820);
                    } else if (karta.length == 11) {
                        btn21.setLayoutX(20 + position1_count * 130);
                        btn21.setLayoutY(820);
                    } else if (karta.length == 12) {
                        btn23.setLayoutX(20 + position1_count * 130);
                        btn23.setLayoutY(820);
                    } else if (karta.length == 13) {
                        btn25.setLayoutX(20 + position1_count * 130);
                        btn25.setLayoutY(820);
                        kk++;
                    }
                    position1_count = 0;

                }
                oo = 0;
                bln = 0;
                stoper = 0;
                bila_btn.setVisible(true);
                cerna_btn.setVisible(true);

                //start hry počítače
                player2_colorpicking_computer();

                //nova karta
                zz = btn10.getText();
                if(zz.equals("N")){
                    btn10.setText("");
                }
                zz = btn12.getText();
                if(zz.equals("N")){
                    btn12.setText("");
                }
                zz = btn14.getText();
                if(zz.equals("N")){
                    btn14.setText("");
                }
                zz = btn16.getText();
                if(zz.equals("N")){
                    btn16.setText("");
                }
                zz = btn18.getText();
                if(zz.equals("N")){
                    btn18.setText("");
                }
                zz = btn20.getText();
                if(zz.equals("N")){
                    btn20.setText("");
                }
                zz = btn22.getText();
                if(zz.equals("N")){
                    btn22.setText("");
                }
                zz = btn24.getText();
                if(zz.equals("N")){
                    btn24.setText("");
                }
                zz = btn26.getText();
                if(zz.equals("N")){
                    btn26.setText("");
                }
                //braní si čísla
                if (stoper == 1 ) {

                } else if (ds == 5) {
                    btn10.setVisible(true);
                    btn10.setLayoutX(20 + (hh) * 130);
                    btn10.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn10.setStyle("-fx-background-color:#474747");
                        btn10.setTextFill(Color.WHITE);
                    } else {
                        btn10.setStyle("-fx-background-color:#EBEFE6");
                        btn10.setTextFill(Color.BLACK);
                    }
                    btn10.setText("N");
                    ds++;
                    stoper++;

                } else if (ds == 7) {
                    btn12.setVisible(true);
                    btn12.setLayoutX(20 + (hh) * 130);
                    btn12.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn12.setStyle("-fx-background-color:#474747");
                        btn12.setTextFill(Color.WHITE);
                    } else {
                        btn12.setStyle("-fx-background-color:#EBEFE6");
                        btn12.setTextFill(Color.BLACK);
                    }
                    btn12.setText("N");
                    ds++;
                    stoper++;
                } else if (ds == 9) {
                    btn14.setVisible(true);
                    btn14.setLayoutX(20 + (hh) * 130);
                    btn14.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn14.setStyle("-fx-background-color:#474747");
                        btn14.setTextFill(Color.WHITE);
                    } else {
                        btn14.setStyle("-fx-background-color:#EBEFE6");
                        btn14.setTextFill(Color.BLACK);
                    }
                    btn14.setText("N");
                    ds++;
                    stoper++;
                } else if (ds == 11) {
                    btn16.setVisible(true);
                    btn16.setLayoutX(20 + (hh) * 130);
                    btn16.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn16.setStyle("-fx-background-color:#474747");
                        btn16.setTextFill(Color.WHITE);
                    } else {
                        btn16.setStyle("-fx-background-color:#EBEFE6");
                        btn16.setTextFill(Color.BLACK);
                    }
                    btn16.setText("N");
                    ds++;
                    stoper++;
                } else if (ds == 13) {
                    btn18.setVisible(true);
                    btn18.setLayoutX(20 + (hh) * 130);
                    btn18.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn18.setStyle("-fx-background-color:#474747");
                        btn18.setTextFill(Color.WHITE);
                    } else {
                        btn18.setStyle("-fx-background-color:#EBEFE6");
                        btn18.setTextFill(Color.BLACK);
                    }
                    btn18.setText("N");
                    ds++;
                    stoper++;
                } else if (ds == 15) {
                    btn20.setVisible(true);
                    btn20.setLayoutX(20 + (hh) * 130);
                    btn20.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn20.setStyle("-fx-background-color:#474747");
                        btn20.setTextFill(Color.WHITE);
                    } else {
                        btn20.setStyle("-fx-background-color:#EBEFE6");
                        btn20.setTextFill(Color.BLACK);
                    }
                    btn20.setText("N");
                    ds++;
                    stoper++;
                } else if (ds == 17) {
                    btn22.setVisible(true);
                    btn22.setLayoutX(20 + (hh) * 130);
                    btn22.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn22.setStyle("-fx-background-color:#474747");
                        btn22.setTextFill(Color.WHITE);
                    } else {
                        btn22.setStyle("-fx-background-color:#EBEFE6");
                        btn22.setTextFill(Color.BLACK);
                    }
                    btn22.setText("N");
                    ds++;
                    stoper++;
                } else if (ds == 19) {
                    btn24.setVisible(true);
                    btn24.setLayoutX(20 + (hh) * 130);
                    btn24.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn24.setStyle("-fx-background-color:#474747");
                        btn24.setTextFill(Color.WHITE);
                    } else {
                        btn24.setStyle("-fx-background-color:#EBEFE6");
                        btn24.setTextFill(Color.BLACK);
                    }
                    btn24.setText("N");
                    ds++;
                    stoper++;


                }else if (ds == 21) {
                    btn26.setVisible(true);
                    btn26.setLayoutX(20 + (hh) * 130);
                    btn26.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5 || Math.floor(dd) == ((dd*10)-4)/10) {
                        btn26.setStyle("-fx-background-color:#474747");
                        btn26.setTextFill(Color.WHITE);
                    } else {
                        btn26.setStyle("-fx-background-color:#EBEFE6");
                        btn26.setTextFill(Color.BLACK);
                    }
                    btn26.setText("N");
                    ds++;
                    stoper++;


                }
                bln++;
                do {
                    //hádání čísla
                    player2_position_computer();
                    if (konec == 1 ){
                        Parent root = FXMLLoader.load(getClass().getResource("computer-enter.fxml"));
                        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }

                    if (Math.floor(vy4) == vy4 - 0.5 || (Math.floor(vy4)== ((vy4*10)-4)/10)) {
                        color++;
                    }

                    if (color == 1) {
                        ww = "Cerna";
                    } else {
                        ww = "Bila";
                    }
                    color = 0;
                    text5.setText(text4.getText());
                    text4.setText(text3.getText());
                    text3.setText(text2.getText());
                    text2.setText(text1.getText());
                    //chat
                    if (count2 == 1) {
                        if ((Math.floor(vy4)== ((vy4*10)-2)/10) || (Math.floor(vy4)== ((vy4*10)-4)/10)) {
                            text1.setText("Player2: " + ww + " - is Correct");
                        }else{
                            text1.setText("Player2: " + ww + " " + (int) vy4 + " is Correct");
                        }
                    } else {
                        if ((Math.floor(vy4)== ((vy4*10)-2)/10) || (Math.floor(vy4)== ((vy4*10)-4)/10)) {
                            text1.setText("Player2: " + ww + " - is Incorrect");
                        }else{
                            text1.setText("Player2: " + ww + " " + (int) vy4 + " is Incorrect");
                        }
                    }
                    //uhodnuti
                    if (count2 == 1) {

                        //uhodnutí odkrytí
                        if (prechod == btnk1[0]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn1.setText("-");
                            }else {
                                btn1.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn1.setDisable(true);
                            disable1[0] = vy4;
                        } else if (prechod == btnk1[1]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn3.setText("-");
                            }else {
                                btn3.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn3.setDisable(true);
                            disable1[1] = vy4;
                        } else if (prechod == btnk1[2]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn5.setText("-");
                            }else {
                                btn5.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn5.setDisable(true);
                            disable1[2] = vy4;
                        } else if (prechod == btnk1[3]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn7.setText("-");
                            }else {
                                btn7.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn7.setDisable(true);
                            disable1[3] = vy4;
                        } else if (prechod == btnk1[4]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn9.setText("-");
                            }else {
                                btn9.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn9.setDisable(true);
                            disable1[4] = vy4;
                        } else if (prechod == btnk1[5]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn11.setText("-");
                            }else {
                                btn11.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn11.setDisable(true);
                            disable1[5] = vy4;
                        } else if (prechod == btnk1[6]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn13.setText("-");
                            }else {
                                btn13.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn13.setDisable(true);
                            disable1[6] = vy4;
                        } else if (prechod == btnk1[7]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn15.setText("-");
                            }else {
                                btn15.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn15.setDisable(true);
                            disable1[7] = vy4;
                        } else if (prechod == btnk1[8]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn17.setText("-");
                            }else {
                                btn17.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn17.setDisable(true);
                            disable1[8] = vy4;
                        } else if (prechod == btnk1[9]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn19.setText("-");
                            }else {
                                btn19.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn19.setDisable(true);
                            disable1[9] = vy4;
                        } else if (prechod == btnk1[10]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn21.setText("-");
                            }else {
                                btn21.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn21.setDisable(true);
                            disable1[10] = vy4;
                        } else if (prechod == btnk1[11]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn23.setText("-");
                            }else {
                                btn23.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn23.setDisable(true);
                            disable1[11] = vy4;
                        }else if (prechod == btnk1[12]) {
                            if (Math.floor(vy4) == (((vy4*10)-2)/10)  || (Math.floor(vy4)== ((vy4*10)-4)/10)){
                                btn25.setText("-");
                            }else {
                                btn25.setText(String.valueOf((int) Math.abs(vy4)));
                            }
                            btn25.setDisable(true);
                            disable1[12] = vy4;
                        }

                    } else {
                        //neuhodnutí
                        player2_correcting_computer();
                        if (konecna_bila > 0 || break1 >= 52) {
                            bila_btn.setDisable(true);
                        }
                        if (konecna_cerna > 0 || break1 >= 52) {
                            cerna_btn.setDisable(true);
                        }

                        //pořadník 2 vznik
                        if (jj == 0) {
                            ran2_count = 0;
                            for (int t = 0; t < karta2.length; t++) {
                                if (karta2[t] == ran2) {
                                    ran2_count++;
                                    break;
                                } else {
                                    ran2_count++;
                                }
                            }
                            ran2_count--;
                            poradnik2[karta2.length - 1] = ran2_count;
                            for (int w = 0; w < karta2.length - 1; w++) {
                                if (poradnik2[w] >= ran2_count) {
                                    poradnik2[w]++;
                                }
                            }

                            //přestavění
                            position2_count = ran2_count;
                            btnk2[karta2.length - 1] = position2_count;
                            if (btnk2[0] >= position2_count) {
                                tt = (int) btn2.getLayoutX();
                                btn2.setLayoutX(tt + 130);
                                btnk2[0]++;
                            }
                            if (btnk2[1] >= position2_count) {
                                tt = (int) btn4.getLayoutX();
                                btn4.setLayoutX(tt + 130);
                                btnk2[1]++;
                            }
                            if (btnk2[2] >= position2_count) {
                                tt = (int) btn6.getLayoutX();
                                btn6.setLayoutX(tt + 130);
                                btnk2[2]++;
                            }
                            if (btnk2[3] >= position2_count) {
                                tt = (int) btn8.getLayoutX();
                                btn8.setLayoutX(tt + 130);
                                btnk2[3]++;
                            }
                            if (btnk2[4] >= position2_count && ds > 6) {
                                tt = (int) btn10.getLayoutX();
                                btn10.setLayoutX(tt + 130);
                                btnk2[4]++;
                            }
                            if (btnk2[5] >= position2_count && ds > 8) {
                                tt = (int) btn12.getLayoutX();
                                btn12.setLayoutX(tt + 130);
                                btnk2[5]++;
                            }
                            if (btnk2[6] >= position2_count && ds > 10) {
                                tt = (int) btn14.getLayoutX();
                                btn14.setLayoutX(tt + 130);
                                btnk2[6]++;
                            }
                            if (btnk2[7] >= position2_count && ds > 12) {
                                tt = (int) btn16.getLayoutX();
                                btn16.setLayoutX(tt + 130);
                                btnk2[7]++;
                            }
                            if (btnk2[8] >= position2_count && ds > 14) {
                                tt = (int) btn18.getLayoutX();
                                btn18.setLayoutX(tt + 130);
                                btnk2[8]++;
                            }
                            if (btnk2[9] >= position2_count && ds > 16) {
                                tt = (int) btn20.getLayoutX();
                                btn20.setLayoutX(tt + 130);
                                btnk2[9]++;
                            }
                            if (btnk2[10] >= position2_count && ds > 18) {
                                tt = (int) btn22.getLayoutX();
                                btn22.setLayoutX(tt + 130);
                                btnk2[10]++;
                            }
                            if (btnk2[11] >= position2_count && ds > 20) {
                                tt = (int) btn24.getLayoutX();
                                btn24.setLayoutX(tt + 130);
                                btnk2[11]++;
                            }

                            //přestavba nového čísla
                            if (karta2.length == 5) {
                                btn10.setLayoutX(20 + position2_count * 130);
                                btn10.setLayoutY(40);
                            } else if (karta2.length == 6) {
                                btn12.setLayoutX(20 + position2_count * 130);
                                btn12.setLayoutY(40);
                            } else if (karta2.length == 7) {
                                btn14.setLayoutX(20 + position2_count * 130);
                                btn14.setLayoutY(40);
                            } else if (karta2.length == 8) {
                                btn16.setLayoutX(20 + position2_count * 130);
                                btn16.setLayoutY(40);
                            } else if (karta2.length == 9) {
                                btn18.setLayoutX(20 + position2_count * 130);
                                btn18.setLayoutY(40);
                            } else if (karta2.length == 10) {
                                btn20.setLayoutX(20 + position2_count * 130);
                                btn20.setLayoutY(40);
                            } else if (karta2.length == 11) {
                                btn22.setLayoutX(20 + position2_count * 130);
                                btn22.setLayoutY(40);
                            } else if (karta2.length == 12) {
                                btn24.setLayoutX(20 + position2_count * 130);
                                btn24.setLayoutY(40);
                            } else if (karta2.length == 13) {
                                btn26.setLayoutX(20 + position2_count * 130);
                                btn26.setLayoutY(40);
                                jj++;
                            }
                            position2_count = 0;

                        }
                    }
                    //vrácení po uhodnutí
                } while (count2 == 1);
                //vyčištění
                oo = 0;
                bln = 0;
                stoper = 0;
                txt.clear();
            }
            oo = 0;
        }
    }

    //nadefinování před startem
    public static void before_start_Computer() {
        karta = new double[4];

        karta2 = new double[4];

        kartare = new double[18];
        ;
        karta2re = new double[18];

        cislare = new double[50];

        cislarandom = new double[26];

        Random generator = new Random();

        double cisla2[] = {0.3, 0.5, 1.3, 1.5, 2.3, 2.5, 3.3, 3.5, 4.3, 4.5, 5.3, 5.5, 6.3, 6.5, 7.3, 7.5, 8.3, 8.5, 9.3, 9.5, 10.3, 10.5, 11.3, 11.5, 12.3, 12.5};

        for (down = 0; down < 24; down++) {//definition
            for (right = 0; right < 13; right++) {
                arr[down][right] = c;

            }
            for (right = 0; right < karta.length; right++) {
                arr[24][right] = right + 1;
            }
            if (g == 0) {
                c = c + 0.2;
                g++;
            } else {
                g = 0;
                c = c + 0.8;
            }
        }
        for (int i = 0; i < 13; i++ ) {
            arr[29][i] = 1;
            arr[28][i] = 1;
            arr[27][i] = 1;
        }


        //náhodné rozdání karet
        for (int o = 0; o < 26; o++) {
            // nové náhodné pole
            int randomNumber2 = generator.nextInt(cisla2.length);
            coda2++;
            cislarandom[coda2] = cisla2[randomNumber2];
            cisla2[randomNumber2] = cisla2[randomNumber2] * -1;

            for (int y = 0; y < cisla2.length; y++) {
                cislare[y] = cisla2[y];
            }

            cisla2 = new double[cisla2.length - 1];
            for (int y = 0; y < cisla2.length; y++) {

                if (cislare[y] >= 0) {
                    cisla2[y] = cislare[y + coda];
                } else {
                    coda++;
                    cisla2[y] = cislare[y + coda];

                }
            }
            coda = 0;
        }
        //první 4 karty hráče
        for (int b = 0; b < 4; b++) {// first 4 number karta

            karta[b] = cislarandom[pocet];
            cislarandom[pocet] = cislarandom[pocet] * -1;
            pocet++;
        }
        //první čtyři karty počítače
        for (int b = 0; b < 4; b++) {// first 4 number karta2

            karta2[b] = cislarandom[pocet];
            cislarandom[pocet] = cislarandom[pocet] * -1;
            pocet++;
        }


        for (int i = 0; i < 4 ; i++) {
            //pomlčky přiřazení
            if(karta[i]==12.5){
                Random ra = new Random();
                int rand_int1 = ra.nextInt(12);
                karta[i] = rand_int1 + 0.4;
            }
            if(karta[i]==12.3){
                Random ra = new Random();
                int rand_int1 = ra.nextInt(12);
                karta[i] = rand_int1 + 0.2;
            }
            if(karta2[i]==12.5){
                Random ra = new Random();
                int rand_int1 = ra.nextInt(12);
                karta2[i] = rand_int1 + 0.4;
            }
            if(karta2[i]==12.3){
                Random ra = new Random();
                int rand_int1 = ra.nextInt(12);
                karta2[i] = rand_int1 + 0.2;
            }
        }
        //seřazení
        double temp = 0;

        //player 2 cards - computer
        for (int i = 0; i < karta2.length; i++) {

            for (int j = 1; j < karta2.length - i; j++) {
                if (karta2[j - 1] < karta2[j]) {
                    temp = karta2[j - 1];
                    karta2[j - 1] = karta2[j];
                    karta2[j] = temp;

                }
            }
        }


        //player 1 cards
        for (int i = 0; i < karta.length; i++) {

            for (int j = 0; j < karta.length - 1; j++) {
                if (karta[j] > karta[j + 1]) {
                    double x;
                    x = karta[j];
                    karta[j] = karta[j + 1];
                    karta[j + 1] = x;

                }
            }
        }
        //vyřazení karet stejné jiné barvy
        for (int x = 0; x < 4; x++) {
            arr[25][x] = karta[x];
            if (((arr[25][x] * 10) - 5) / 10 == Math.floor(arr[25][x])) {
                arr[26][x] = 0.5;
                for (int l = 0; l < 24; l++) {
                    if (((arr[l][x] * 10) - 3) / 10 == Math.floor(arr[l][x])) {
                        arr[l][x] = 0;
                    }
                }
            } else {
                arr[26][x] = 0.3;
                for (int l = 0; l < 24; l++) {
                    if (((arr[l][x] * 10) - 5) / 10 == Math.floor(arr[l][x])) {
                        arr[l][x] = 0;
                    }
                }
            }

        }
        for (int i = 0; i < 4; i++) {
            btnk1[i] = i;
            btnk2[i] = i;
            poradnik1[i] = i;
            poradnik2[i] = i;
        }
    }
    //hráč si bere karty
    public static void player1_colorpicking() {

        cerna = 0;
        bila = 0;
        if (break1 < 52) {
            break1++;
            //brání černé a bílé barvy
            if (vy5 == 1) {
                for (int e = 8; e < cislarandom.length; e++) {
                    if ((Math.floor(cislarandom[e]) == cislarandom[e] - 0.5 && cislarandom[e] > 0) || (Math.floor(cislarandom[e])== ((cislarandom[e]*10)-4)/10 && cislarandom[e] > 0)) {
                        ran1 = cislarandom[e];
                        cislarandom[e] = cislarandom[e] * -1;

                        break;
                    } else {
                        cerna++;
                    }
                }
            } else {
                for (int e = 8; e < cislarandom.length; e++) {
                    if (Math.floor(cislarandom[e]) != cislarandom[e] - 0.5 && cislarandom[e] > 0 || (Math.floor(cislarandom[e])== ((cislarandom[e]*10)-2)/10 && cislarandom[e] > 0)) {
                        ran1 = cislarandom[e];
                        cislarandom[e] = cislarandom[e] * -1;
                        break;
                    } else {
                        bila++;
                    }
                }
            }
        }
        if (cerna >= 18) {
            break1--;
            konecna_cerna++;
        } else {
            cerna = 0;
        }
        if (bila >= 18) {
            break1--;
            konecna_bila++;
        } else {
            bila = 0;
        }
        if(ran1==12.3){
            Random ra = new Random();
            int rand_int2 = ra.nextInt(12);
            ran1 = rand_int2 + 0.2;

        }
        if(ran1==12.5){
            Random ra = new Random();
            int rand_int2 = ra.nextInt(12);
            ran1 = rand_int2 + 0.4;

        }
        dd = ran1;

    }
    //hádání hráče 1
    public static void player1_position() {
        count = 0;

        if(!ll.equals("-")) {
            if (Math.floor(karta2[vy1]) == karta2[vy1] - 0.5) {
                vy2 = vy2 + 0.5;
            } else {
                vy2 = vy2 + 0.3;
            }

            //corecting 1
            if (karta2[vy1] == vy2) {
                karta2[vy1] = karta2[vy1] * -1;
                count++;
            } else {
            }
        }else{
            if (Math.floor(karta2[vy1])== ((karta2[vy1]*10)-4)/10 || Math.floor(karta2[vy1])== ((karta2[vy1]*10)-2)/10 ){
                karta2[vy1]= karta2[vy1]*-1;
                count++;
            }
            vy2 = Math.abs(karta2[vy1]);
        }

        for (int p = 0; p < karta2.length; p++) {
            if (karta2[p] > 0) {
                o++;
            } else {

            }
        }

        vy1 = -1;
    }
    //srovnání karet hráče 1
    public static void player1_correcting() {
        if (break1 < 52) {
            if(Math.floor(ran1)==((ran1*10)-4)/10){
                ran1 = krok + 0.4;
            }
            if(Math.floor(ran1)==((ran1*10)-2)/10){
                ran1 = krok + 0.2;
            }
            //přidání nového čísla
            for (int p = 0; p < karta.length; p++) {
                kartare[p] = karta[p];
            }
            karta = new double[karta.length + 1];
            karta[karta.length - 1] = ran1;
            for (int p = 0; p < karta.length - 1; p++) {
                karta[p] = kartare[p];
            }
            break1++;
        } else {
            ran1 = 0;
        }
        //srovnání karet
        double temp2 = 0;

        for (int i = 0; i < karta2.length; i++) {

            for (int j = 1; j < karta2.length - i; j++) {
                if (Math.abs(karta2[j - 1]) < Math.abs(karta2[j])) {
                    temp2 = karta2[j - 1];
                    karta2[j - 1] = karta2[j];
                    karta2[j] = temp2;

                }
            }

        }
        for (int i = 0; i < karta.length; i++) {

            for (int j = 0; j < karta.length - 1; j++) {
                if (Math.abs(karta[j]) > Math.abs(karta[j + 1])) {
                    double v;
                    v = karta[j];
                    karta[j] = karta[j + 1];
                    karta[j + 1] = v;

                }
            }
        }
    }
    //braní si karet počítače
    public static void player2_colorpicking_computer() {
        do {
            do {
                cerna = 0;
                bila = 0;

                //rozhrání brání
                if (break1 < 52) {
                    Random rand = new Random();
                    vy6 = rand.nextInt(2);
                    if (konecna_cerna > 0) {
                        cerna_dosla = 1;
                    }
                    if (konecna_bila > 0) {
                        bila_dosla = 1;
                    }
                    int min = 0 + bila_dosla;
                    int max = 2 - cerna_dosla;
                    int nah = rand.nextInt(max - min) + min;
                    vy6 = nah;
                } else {
                }
            } while (vy6 > 1 || vy6 < 0);
            //brání bílé nebo černé karty
            if (break1 < 52) {
                break1++;
                if (vy6 == 1) {
                    for (int e = 8; e < cislarandom.length; e++) {
                        if (Math.floor(cislarandom[e]) == cislarandom[e] - 0.5 && cislarandom[e] > 0 || (Math.floor(cislarandom[e])== ((cislarandom[e]*10)-4)/10 && cislarandom[e] > 0)) {
                            ran2 = cislarandom[e];
                            cislarandom[e] = cislarandom[e] * -1;
                            break;
                        } else {
                            cerna++;
                        }
                    }
                } else {
                    for (int e = 8; e < cislarandom.length; e++) {
                        if (Math.floor(cislarandom[e]) != cislarandom[e] - 0.5 && cislarandom[e] > 0 || (Math.floor(cislarandom[e])== ((cislarandom[e]*10)-2)/10 && cislarandom[e] > 0)) {
                            ran2 = cislarandom[e];
                            cislarandom[e] = cislarandom[e] * -1;
                            break;
                        } else {
                            bila++;
                        }
                    }
                }
            }
            if (cerna >= 18) {
                break1--;
                konecna_cerna++;

            } else {
                cerna = 0;
            }
            if (bila >= 18) {
                break1--;
                konecna_bila++;

            } else {
                bila = 0;
            }
            // pomlčka náhodné číslo
            if(ran2==12.3){
                Random ra = new Random();
                int rand_int2 = ra.nextInt(12);
                ran2 = rand_int2 + 0.2;

            }
            if(ran2==12.5){
                Random ra = new Random();
                int rand_int2 = ra.nextInt(12);
                ran2 = rand_int2 + 0.4;

            }

        } while (cerna >= 18 || bila >= 18);
        dd = ran2;
    }
    //hádání počítače
    public static void player2_position_computer() {
        if (count2 == 0) {//new
            ran1_countc = 0;
            for (int t = 0; t < karta.length; t++) {
                if (karta[t] == ran1) {
                    ran1_countc++;
                    break;
                } else {
                    ran1_countc++;
                }
            }


            if (ran1 == 0) {

            } else {
                //vyřazeni karet
                for (int w = 0; w < karta2.length; w++) {
                    for (int l = 0; l < karta.length; l++) {
                        for (int p = 0; p < 24; p++) {
                            if (Math.abs(karta2[w]) == arr[p][l]) {
                                arr[p][l] = 0;
                            }
                        }
                    }
                }

                //pořadník
                arr[24][karta.length - 1] = ran1_countc;
                arr[25][karta.length - 1] = ran1;
                for (int w = 0; w < karta.length - 1; w++) {
                    if (arr[24][w] >= ran1_countc) {
                        arr[24][w]++;
                    }
                }

                if (((arr[25][karta.length - 1] * 10) - 5) / 10 == Math.floor(arr[25][karta.length - 1]) || ((arr[25][karta.length - 1] * 10) - 4) / 10 == Math.floor(arr[25][karta.length - 1])) {
                    arr[26][karta.length - 1] = 0.5;
                    for (int l = 0; l < 24; l++) {
                        if (((arr[l][karta.length - 1] * 10) - 3) / 10 == Math.floor(arr[l][karta.length - 1])) {
                            arr[l][karta.length - 1] = 0;
                        }
                    }
                } else {
                    arr[26][karta.length - 1] = 0.3;
                    for (int l = 0; l < 24; l++) {
                        if (((arr[l][karta.length - 1] * 10) - 5) / 10 == Math.floor(arr[l][karta.length - 1]) ) {
                            arr[l][karta.length - 1] = 0;
                        }
                    }
                }

               //poradi vpred
                for (int u = 0; u < karta.length; u++) {
                    for (int t = 0; t < karta.length; t++) {
                        if (arr[24][t] == poradi) {
                            if (poradi == 1) {
                                barva = arr[26][t];
                                poradi++;
                                mezi1[0] = 0;
                                break;
                            } else {
                                novabarva = arr[26][t];
                                if (novabarva == 0.5 && barva == 0.3) {
                                    celkoveporadi = celkoveporadi + novabarva - 0.1;
                                    for (int l = 0; l < 24; l++) {
                                        if (arr[l][t] < celkoveporadi) {
                                            arr[l][t] = 0;
                                        }
                                    }
                                    mezi1[poradi-1] = celkoveporadi;
                                    celkoveporadi = celkoveporadi - novabarva + 0.1;
                                    barva = novabarva;
                                    poradi++;
                                } else {
                                    celkoveporadi++;
                                    celkoveporadi = celkoveporadi + novabarva - 0.1;
                                    for (int l = 0; l < 24; l++) {
                                        if (arr[l][t] < celkoveporadi) {
                                            arr[l][t] = 0;
                                        }
                                    }
                                    mezi1[poradi-1] = celkoveporadi;
                                    celkoveporadi = celkoveporadi - novabarva + 0.1;
                                    barva = novabarva;
                                    poradi++;
                                }
                            }
                        } else {

                        }
                    }
                }
                poradi = 1;
                celkoveporadi = 11;


                poradi2 = karta.length;
                //vyrazeni vzad
                for (int u = 0; u < karta.length; u++) {
                    for (int t = 0; t < karta.length; t++) {
                        if (arr[24][t] == poradi2) {
                            if (poradi2 == karta.length) {
                                barva2 = arr[26][t];
                                poradi2--;
                                mezi2[0] = 11;
                                break;
                            } else {
                                novabarva2 = arr[26][t];
                                if (novabarva2 == 0.3 && barva2 == 0.5) {
                                    celkoveporadi = celkoveporadi + novabarva2 + 0.1;
                                    for (int l = 0; l < 24; l++) {
                                        if (arr[l][t] > celkoveporadi) {
                                            arr[l][t] = 0;
                                        }
                                    }
                                    mezi2[poradi-1] = celkoveporadi;
                                    celkoveporadi = celkoveporadi - novabarva2 - 0.1;
                                    barva2 = novabarva2;
                                    poradi2--;
                                } else {
                                    celkoveporadi--;
                                    celkoveporadi = celkoveporadi + novabarva2 + 0.1;
                                    for (int l = 0; l < 24; l++) {
                                        if (arr[l][t] > celkoveporadi) {
                                            arr[l][t] = 0;
                                        }
                                    }
                                    mezi2[poradi-1] = celkoveporadi;
                                    celkoveporadi = celkoveporadi - novabarva2 - 0.1;
                                    barva2 = novabarva2;
                                    poradi2--;
                                }
                            }
                        } else {

                        }
                    }
                }
                celkoveporadi = 0;
            }
        }

        count2 = 0;
        do {
            //hádání počítače
            count_rada_break = 0;
            for (int u = 0; u < karta.length; u++) {
                if (arr[24][u] == count_rada) {
                    for (int l = 0; l < 24; l++) {
                        if (arr[l][u] == 0) {
                            count_rada_break++;
                        }else if(arr[l][u] <= mezikrok ){
                            arr[l][u]=0;
                            count_rada_break++;
                        } else {
                            vy4 = arr[l][u];
                            arr[l][u] = 0;
                            if (vy4 == karta[count_rada - 1]) {
                                karta[count_rada - 1] = karta[count_rada - 1] * -1;//correcting2
                                for (int r = 0; r < 24; r++) {
                                    for (int c = 0; c < 13; c++) {
                                        if(arr[r][c] == Math.abs(karta[count_rada - 1])) {
                                            arr[r][c] = 0;
                                        }
                                    }
                                }
                                arr[29][u]=0;
                                count2++;
                                for (int d = 0; d < 24; d++) {
                                    arr[d][u] = 0;
                                }
                                for (int r = 0; r < karta.length; r++) {
                                    if (arr[24][r] < count_rada) {
                                        for (int h = 0; h < 24; h++) {
                                            if (arr[h][r] >= vy4) {
                                                arr[h][r] = 0;
                                            }
                                        }
                                    } else {
                                        for (int h = 0; h < 24; h++) {
                                            if (arr[h][r] <= vy4) {
                                                arr[h][r] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            break;

                        }

                    }
                    if( count_rada_break == 24 ){
                        if(ox == 1){
                            arr[29][u] = 0;
                            ox=0;
                        }else {
                            rr = arr[29][u];
                            arr[29][u] = 0;
                            bb = arr[26][u];
                        }
                        mezikrok = arr[25][u];
                    }
                }
            }
            if (count_rada_break == 24) {
                if(rr == 0) {

                    count_rada++;
                }else{
                    vy4 = karta[count_rada-1];
                    if(((vy4 * 10) - 2) / 10 == Math.floor(vy4) || ((vy4 * 10) - 4) / 10 == Math.floor(vy4)){
                        karta[count_rada-1] = karta[count_rada-1]* -1;
                        if(((vy4 * 10) - 2) / 10 == Math.floor(vy4)){
                            for (int x = 0; x < 13; x++){
                                arr[28][x] = 0;
                            }
                            for(int i = 0; i < karta.length; i++){
                                if (arr[24][i] == count_rada + 1){
                                    odchod = arr[26][i];
                                }
                            }
                            if(bb == 0.5 && odchod ==0.5){

                            }

                        }
                        if(((vy4 * 10) - 4) / 10 == Math.floor(vy4)){
                            for (int x = 0; x < 13; x++){
                                arr[27][x] = 0;
                            }
                            for(int i = 0; i < karta.length; i++){
                                if (arr[24][i] == count_rada + 1){
                                    odchod = arr[26][i];
                                }
                            }
                        }
                        ox = 1;
                        rr=0;
                        count2++;
                        count_rada_break++;
                    }
                }
            }
        } while (count_rada_break == 24);
        prechod = count_rada - 1;
        mezikrok = 0;


        count_rada = 1;

        for (int p = 0; p < karta.length; p++) {
            if (karta[p] > 0) {
                q++;
            } else {
            }
        }
          //ending protocol
        if (q > 0) {
            q = 0;
        } else {
            konec++;
        }

    }
    //srovnání karet
    public static void player2_correcting_computer() {
        if (break1 < 52) {
            //adding new number2
            for (int p = 0; p < karta2.length; p++) {
                karta2re[p] = karta2[p];
            }
            karta2 = new double[karta2.length + 1];
            karta2[karta2.length - 1] = ran2;
            for (int p = 0; p < karta2.length - 1; p++) {
                karta2[p] = karta2re[p];
            }
            break1++;
        } else {
            ran2 = 0;
        }

        double temp3 = 0;

        for (int i = 0; i < karta2.length; i++) {

            for (int j = 1; j < karta2.length - i; j++) {
                if (Math.abs(karta2[j - 1]) < Math.abs(karta2[j])) {
                    temp3 = karta2[j - 1];
                    karta2[j - 1] = karta2[j];
                    karta2[j] = temp3;

                }
            }

        }
        for (int i = 0; i < karta.length; i++) {

            for (int j = 0; j < karta.length - 1; j++) {
                if (Math.abs(karta[j]) > Math.abs(karta[j + 1])) {
                    double v;
                    v = karta[j];
                    karta[j] = karta[j + 1];
                    karta[j + 1] = v;

                }
            }
        }
    }
}
