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



public class Computer_vs_Player_without_pomlcka {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField txt;
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
    Button bila_btn;
    @FXML
    Button cerna_btn;
    @FXML
    Button stoper1;
    @FXML
    Label pravidla;

    @FXML
    Button starter;

    static int tt = 0;
    int ds = 4;
    int alfa = 0;
    int stoper = 0;
    int hh = 4;
    static int kk = 0;
    static int jj = 0;
    static int prechod;
    static int u = 0;
    static double dd = 0;


    static int pocet = 0;// how many cards have been taken


    static int down = 0;
    static int right = 0;
    static double c = 0.3;
    static int g = 0;
    static int poradi = 1;
    static int poradi2 = 12;


    static double[] karta;
    static double[] karta2;
    static double[] kartare;
    static double[] karta2re;
    static double[] cislare;
    static double[] cislarandom;
    static double[][] arr = new double[27][12];
    static double mezikrok = 0;


    static double btnk1[] = new double[12];
    static double btnk2[] = new double[12];
    static int poradnik1[] = new int[12];
    static int poradnik2[] = new int[12];
    static double disable2[] = new double[12];
    static double disable1[] = new double[12];
    int bln = 0;
    static int konec = 0;
    static int coda = 0;
    static int coda2 = -1;

    //integer ur??uj?? barvu karty
    static int color = 0;
    /**
     * Integer count ur??uje, zdali se hr???? uh??dl spr??vnou kartu
     */
    static int count = 0;
    //zi??uje jestli ve vyhled??v??n?? je v??echno v po????dku
    static int oo = 0;

    static int count2 = 0;
    //vyhled??n?? pozice karty hr????e 1
    static int vy1 = -1;
    //vyhled??n?? hondoty karty hr????e 1
    static double vy2 = 0;
    //vyhled??n?? pozice karty hr????e 2
    static int vy3 = -1;
    //vyhled??n?? hondoty karty hr????e 2
    static double vy4 = 0;
    //zvolen?? barva hr????e 1
    static int vy5 = 0;
    //zvolen?? barva hr????e 2
    static int vy6 = 0;
    //zi????uje jestli hr???? 2 v??hr??l
    static int q = 0;
    //zi????uje jestli hr???? 1 v??hr??l
    static int o = 0;
    //nov?? karta hr????e 1
    static double ran1 = 0;
    //nov?? karta hr????e 2
    static double ran2 = 0;

    static int break1 = 16;
    //ur??uje kolik je ??ern??ch v poli cislarandom
    static int cerna = 0;
    //ur??uje kolik je b??l??ch v poli cislarandom
    static int bila = 0;
    //zi??tuje jesti ??ern?? karty do??li
    static int konecna_cerna = 0;
    //zi??tuje jesti b??l?? karty do??li
    static int konecna_bila = 0;
    //static int move = 0;
    //zi??uje jestli do??li karty
    static int final_color = 0;
    static int ran1_count;
    static int ran2_count;
    static int position1_count;
    static int position2_count;

    static int cerna_dosla = 0;
    static int bila_dosla = 0;
    static double barva = 0;
    static double novabarva = 0;
    static double barva2 = 0;
    static double novabarva2 = 0;
    static double celkoveporadi = 0;
    //po????t?? ??adu u h??d??n??
    static int count_rada = 1;
    //po????t?? jestli je ??ada pr??zdn??
    static int count_rada_break = 0;
    static int ran1_countc = 0;
    static String zz = "";

    //ActionEvent na????taj??c?? za????te??n?? hru
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
        if (Math.floor(karta2[0]) == karta2[0] - 0.5) {
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
        if (Math.floor(karta2[1]) == karta2[1] - 0.5) {
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
        if (Math.floor(karta2[2]) == karta2[2] - 0.5) {
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
        if (Math.floor(karta2[3]) == karta2[3] - 0.5) {
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


        if (Math.floor(karta[0]) == karta[0] - 0.5) {
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
        if (Math.floor(karta[1]) == karta[1] - 0.5) {
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
        if (Math.floor(karta[2]) == karta[2] - 0.5) {
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
        if (Math.floor(karta[3]) == karta[3] - 0.5) {
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
        btn1.setText(String.valueOf((int) karta[0]));
        btn3.setText(String.valueOf((int) karta[1]));
        btn5.setText(String.valueOf((int) karta[2]));
        btn7.setText(String.valueOf((int) karta[3]));
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

    public void bila(ActionEvent event) throws IOException {
        //ur??ov??n?? hodnoty karty
        if (stoper == 0) {

            vy5 = 0;
            player1_colorpicking();

        }
        //bila dosla
        if (konecna_bila > 0 || break1 >= 48) {
            konecna_bila++;
            bila_btn.setDisable(true);
        }
        //karty dosli
        if (konecna_bila > 0 && konecna_cerna > 0) {
            final_color++;
        }
        //bran?? si karet
        if (stoper == 1 || konecna_bila > 0) {
        } else {
            bila_btn.setVisible(false);
            if (ds == 4) {
                btn9.setVisible(true);
                btn9.setLayoutX(1500);
                btn9.setLayoutY(430);
                btn9.setTextFill(Color.BLACK);
                btn9.setStyle("-fx-background-color:#EBEFE6");

                btn9.setText(String.valueOf((int) dd));

                ds++;
                stoper++;

            } else if (ds == 6) {
                btn11.setVisible(true);
                btn11.setLayoutX(1500);
                btn11.setLayoutY(430);
                btn11.setTextFill(Color.BLACK);
                btn11.setStyle("-fx-background-color:#EBEFE6");

                btn11.setText(String.valueOf((int) dd));

                ds++;
                stoper++;

            } else if (ds == 8) {
                btn13.setVisible(true);
                btn13.setLayoutX(1500);
                btn13.setLayoutY(430);
                btn13.setTextFill(Color.BLACK);
                btn13.setStyle("-fx-background-color:#EBEFE6");

                btn13.setText(String.valueOf((int) dd));

                ds++;
                stoper++;

            } else if (ds == 10) {
                btn15.setVisible(true);
                btn15.setLayoutX(1500);
                btn15.setLayoutY(430);
                btn15.setTextFill(Color.BLACK);
                btn15.setStyle("-fx-background-color:#EBEFE6");

                btn15.setText(String.valueOf((int) dd));

                ds++;
                stoper++;

            } else if (ds == 12) {
                btn17.setVisible(true);
                btn17.setLayoutX(1500);
                btn17.setLayoutY(430);
                btn17.setTextFill(Color.BLACK);
                btn17.setStyle("-fx-background-color:#EBEFE6");

                btn17.setText(String.valueOf((int) dd));

                ds++;
                stoper++;

            } else if (ds == 14) {
                btn19.setVisible(true);
                btn19.setLayoutX(1500);
                btn19.setLayoutY(430);
                btn19.setTextFill(Color.BLACK);
                btn19.setStyle("-fx-background-color:#EBEFE6");

                btn19.setText(String.valueOf((int) dd));

                ds++;
                stoper++;

            } else if (ds == 16) {
                btn21.setVisible(true);
                btn21.setLayoutX(1500);
                btn21.setLayoutY(430);
                btn21.setTextFill(Color.BLACK);
                btn21.setStyle("-fx-background-color:#EBEFE6");

                btn21.setText(String.valueOf((int) dd));

                ds++;
                stoper++;

            } else if (ds == 18) {
                btn23.setVisible(true);
                btn23.setLayoutX(1500);
                btn23.setLayoutY(430);
                btn23.setTextFill(Color.BLACK);
                btn23.setStyle("-fx-background-color:#EBEFE6");

                btn23.setText(String.valueOf((int) dd));

                ds++;
                stoper++;


            }
            bln++;
        }

    }

    public void cerna(ActionEvent event) throws IOException {
        //ur??ov??n?? hodnoty karty
        if (stoper == 0) {
            vy5 = 1;
            player1_colorpicking();

        }
        //??ern?? karty do??li
        if (konecna_cerna > 0 || break1 >= 48) {
            konecna_cerna++;
            cerna_btn.setDisable(true);
        }
        //karty do??li
        if (konecna_bila > 0 && konecna_cerna > 0) {
            final_color++;
        }
        //bran?? si karet
        if (stoper == 1 || konecna_cerna > 0) {
        } else {
            cerna_btn.setVisible(false);
            if (ds == 4) {
                btn9.setVisible(true);
                btn9.setLayoutX(1665);
                btn9.setLayoutY(430);
                btn9.setTextFill(Color.WHITE);
                btn9.setStyle("-fx-background-color:#474747");
                btn9.setText(String.valueOf((int) dd));
                ds++;
                stoper++;

            } else if (ds == 6) {
                btn11.setVisible(true);
                btn11.setLayoutX(1665);
                btn11.setLayoutY(430);
                btn11.setTextFill(Color.WHITE);
                btn11.setStyle("-fx-background-color:#474747");
                btn11.setText(String.valueOf((int) dd));
                ds++;
                stoper++;

            } else if (ds == 8) {
                btn13.setVisible(true);
                btn13.setLayoutX(1665);
                btn13.setLayoutY(430);
                btn13.setTextFill(Color.WHITE);
                btn13.setStyle("-fx-background-color:#474747");
                btn13.setText(String.valueOf((int) dd));
                ds++;
                stoper++;

            } else if (ds == 10) {
                btn15.setVisible(true);
                btn15.setLayoutX(1665);
                btn15.setLayoutY(430);
                btn15.setTextFill(Color.WHITE);
                btn15.setStyle("-fx-background-color:#474747");
                btn15.setText(String.valueOf((int) dd));
                ds++;
                stoper++;

            } else if (ds == 12) {
                btn17.setVisible(true);
                btn17.setLayoutX(1665);
                btn17.setLayoutY(430);
                btn17.setTextFill(Color.WHITE);
                btn17.setStyle("-fx-background-color:#474747");
                btn17.setText(String.valueOf((int) dd));
                ds++;
                stoper++;

            } else if (ds == 14) {
                btn19.setVisible(true);
                btn19.setLayoutX(1665);
                btn19.setLayoutY(430);
                btn19.setTextFill(Color.WHITE);
                btn19.setStyle("-fx-background-color:#474747");
                btn19.setText(String.valueOf((int) dd));
                ds++;
                stoper++;

            } else if (ds == 16) {
                btn21.setVisible(true);
                btn21.setLayoutX(1665);
                btn21.setLayoutY(430);
                btn21.setTextFill(Color.WHITE);
                btn21.setStyle("-fx-background-color:#474747");
                btn21.setText(String.valueOf((int) dd));
                ds++;
                stoper++;

            } else if (ds == 18) {
                btn23.setVisible(true);
                btn23.setLayoutX(1665);
                btn23.setLayoutY(430);
                btn23.setTextFill(Color.WHITE);
                btn23.setStyle("-fx-background-color:#474747");
                btn23.setText(String.valueOf((int) dd));
                ds++;
                stoper++;


            }
            bln++;
        }

    }

    /**
     * H??d??n?? karet hr????e a po????ta??e
     * spou??t?? celou sekvenci po????ta??e
     */
    public void stoper(ActionEvent event) throws IOException {
        String text = txt.getText();
        oo = 0;
        //h??d??n??
        if ((text != "" && ds == 21) || (text != "" && bln != 0)) {
            oo++;
        }
        //if (move == 0) {
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
        vy2 = Double.parseDouble(text);
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

            if (Math.floor(vy2) == vy2 - 0.5) {
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
                text1.setText("Player1: " + ww + " " + (int) vy2 + " is Correct");
            } else {
                text1.setText("Player1: " + ww + " " + (int) vy2 + " is Incorrect");
            }
            if (count == 1) {
                txt.clear();
                //kon????c?? sekvence
                if (o > 0) {
                    o = 0;
                } else {

                    Parent root = FXMLLoader.load(getClass().getResource("player1-enter.fxml"));
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }

                //uhodnut?? karty
                if (prechod == btnk2[0]) {


                    btn2.setText(String.valueOf((int) Math.abs(vy2)));
                    btn2.setDisable(true);
                    disable2[0] = vy2;
                } else if (prechod == btnk2[1]) {


                    btn4.setText(String.valueOf((int) Math.abs(vy2)));
                    btn4.setDisable(true);
                    disable2[1] = vy2;
                } else if (prechod == btnk2[2]) {


                    btn6.setText(String.valueOf((int) Math.abs(vy2)));
                    btn6.setDisable(true);
                    disable2[2] = vy2;
                } else if (prechod == btnk2[3]) {


                    btn8.setText(String.valueOf((int) Math.abs(vy2)));
                    btn8.setDisable(true);
                    disable2[3] = vy2;
                } else if (prechod == btnk2[4]) {


                    btn10.setText(String.valueOf((int) Math.abs(vy2)));
                    btn10.setDisable(true);
                    disable2[4] = vy2;
                } else if (prechod == btnk2[5]) {


                    btn12.setText(String.valueOf((int) Math.abs(vy2)));
                    btn12.setDisable(true);
                    disable2[5] = vy2;
                } else if (prechod == btnk2[6]) {


                    btn14.setText(String.valueOf((int) Math.abs(vy2)));
                    btn14.setDisable(true);
                    disable2[6] = vy2;
                } else if (prechod == btnk2[7]) {


                    btn16.setText(String.valueOf((int) Math.abs(vy2)));
                    btn16.setDisable(true);
                    disable2[7] = vy2;
                } else if (prechod == btnk2[8]) {


                    btn18.setText(String.valueOf((int) Math.abs(vy2)));
                    btn18.setDisable(true);
                    disable2[8] = vy2;
                } else if (prechod == btnk2[9]) {


                    btn20.setText(String.valueOf((int) Math.abs(vy2)));
                    btn20.setDisable(true);
                    disable2[9] = vy2;
                } else if (prechod == btnk2[10]) {


                    btn22.setText(String.valueOf((int) Math.abs(vy2)));
                    btn22.setDisable(true);
                    disable2[10] = vy2;
                } else if (prechod == btnk2[11]) {

                    btn24.setText(String.valueOf((int) Math.abs(vy2)));
                    btn24.setDisable(true);
                    disable2[11] = vy2;
                }
            } else {

                //neuhodnut??  karty
                player1_correcting();
                //za??azen?? ????sla a vznik po??adn??ku
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


                    //sekvence p??estav??n?? ????sel
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

                    //pozice nov??ho ????sla
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
                        kk++;
                    }
                    position1_count = 0;

                }
                oo = 0;
                bln = 0;
                stoper = 0;
                bila_btn.setVisible(true);
                cerna_btn.setVisible(true);

                //start hry po????ta??e
                player2_colorpicking();

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


                if (stoper == 1 ) {
                } else if (ds == 5) {
                    btn10.setVisible(true);
                    btn10.setLayoutX(20 + (hh) * 130);
                    btn10.setLayoutY(500);
                    if (Math.floor(dd) == dd - 0.5) {
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
                    if (Math.floor(dd) == dd - 0.5) {
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

                    if (Math.floor(dd) == dd - 0.5) {
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

                    if (Math.floor(dd) == dd - 0.5) {
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

                    if (Math.floor(dd) == dd - 0.5) {
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

                    if (Math.floor(dd) == dd - 0.5) {
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

                    if (Math.floor(dd) == dd - 0.5) {
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

                    if (Math.floor(dd) == dd - 0.5) {
                        btn24.setStyle("-fx-background-color:#474747");
                        btn24.setTextFill(Color.WHITE);
                    } else {
                        btn24.setStyle("-fx-background-color:#EBEFE6");
                        btn24.setTextFill(Color.BLACK);
                    }
                    btn24.setText("N");
                    ds++;
                    stoper++;


                }
                bln++;
                do {
                    //h??d??n?? ????sla
                    player2_position();

                    if (Math.floor(vy4) == vy4 - 0.5) {
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
                    if (count2 == 1) {
                        text1.setText("Player2: " + ww + " " + (int) vy4 + " is Correct");
                    } else {
                        text1.setText("Player2: " + ww + " " + (int) vy4 + " is Incorrect");
                    }
                    if (konec == 1) {

                        Parent root = FXMLLoader.load(getClass().getResource("computer-enter.fxml"));
                        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();

                    }
                    if (count2 == 1) {
                        //uhodnut??


                        //uhodnut?? odkryt??
                        if (prechod == btnk1[0]) {
                            u = 0;

                            btn1.setText(String.valueOf((int) Math.abs(vy4)));
                            btn1.setDisable(true);
                            disable1[0] = vy4;
                        } else if (prechod == btnk1[1]) {
                            u = 1;
                            btn3.setText(String.valueOf((int) Math.abs(vy4)));
                            btn3.setDisable(true);
                            disable1[1] = vy4;
                        } else if (prechod == btnk1[2]) {
                            u = 2;
                            btn5.setText(String.valueOf((int) Math.abs(vy4)));

                            btn5.setDisable(true);
                            disable1[2] = vy4;
                        } else if (prechod == btnk1[3]) {
                            u = 3;
                            btn7.setText(String.valueOf((int) Math.abs(vy4)));

                            btn7.setDisable(true);
                            disable1[3] = vy4;
                        } else if (prechod == btnk1[4]) {
                            u = 4;
                            btn9.setText(String.valueOf((int) Math.abs(vy4)));

                            btn9.setDisable(true);
                            disable1[4] = vy4;
                        } else if (prechod == btnk1[5]) {
                            u = 5;
                            btn11.setText(String.valueOf((int) Math.abs(vy4)));

                            btn11.setDisable(true);
                            disable1[5] = vy4;
                        } else if (prechod == btnk1[6]) {
                            u = 6;
                            btn13.setText(String.valueOf((int) Math.abs(vy4)));

                            btn13.setDisable(true);
                            disable1[6] = vy4;
                        } else if (prechod == btnk1[7]) {
                            u = 7;
                            btn15.setText(String.valueOf((int) Math.abs(vy4)));

                            btn15.setDisable(true);
                            disable1[7] = vy4;
                        } else if (prechod == btnk1[8]) {
                            u = 8;
                            btn17.setText(String.valueOf((int) Math.abs(vy4)));

                            btn17.setDisable(true);
                            disable1[8] = vy4;
                        } else if (prechod == btnk1[9]) {
                            u = 9;
                            btn19.setText(String.valueOf((int) Math.abs(vy4)));

                            btn19.setDisable(true);
                            disable1[9] = vy4;
                        } else if (prechod == btnk1[10]) {
                            u = 10;
                            btn21.setText(String.valueOf((int) Math.abs(vy4)));

                            btn21.setDisable(true);
                            disable1[10] = vy4;
                        } else if (prechod == btnk1[11]) {
                            u = 11;
                            btn23.setText(String.valueOf((int) Math.abs(vy4)));

                            btn23.setDisable(true);
                            disable1[11] = vy4;
                        }

                    } else {
                        //neuhodnut??
                        player2_correcting();


                        if (konecna_bila > 0 || break1 >= 48) {
                            bila_btn.setDisable(true);
                        }
                        if (konecna_cerna > 0 || break1 >= 48) {
                            cerna_btn.setDisable(true);
                        }

                        //po??adn??k 2 vznik
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

                            //p??estav??n??
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
                            if (btnk2[4] >= position2_count && ds > 6 ) {
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

                            //p??estavba nov??ho ????sla
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
                                jj++;
                            }
                            position2_count = 0;


                        }
                    }
                    //vr??cen?? po neuhodnut??
                } while (count2 == 1);
                //vy??i??t??n??
                oo = 0;
                bln = 0;
                stoper = 0;
                txt.clear();
            }
            oo = 0;
        }
    }

    //nadefinov??n?? p??ed startem
    public static void before_start_computer_without_pomlcka() {

        karta = new double[4];


        karta2 = new double[4];


        kartare = new double[18];


        karta2re = new double[18];


        cislare = new double[50];


        cislarandom = new double[24];



        Random generator = new Random();

        double cisla2[] = {0.3, 0.5, 1.3, 1.5, 2.3, 2.5, 3.3, 3.5, 4.3, 4.5, 5.3, 5.5, 6.3, 6.5, 7.3, 7.5, 8.3, 8.5, 9.3, 9.5, 10.3, 10.5, 11.3, 11.5};


        //definice h??dac??ho programu
        for (down = 0; down < 24; down++) {//definition
            for (right = 0; right < 12; right++) {
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



        for (int o = 0; o < 24; o++) {
            // nov?? n??hodn?? pole
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
        //prvn?? 4 karty hr????e
        for (int b = 0; b < 4; b++) {

            karta[b] = cislarandom[pocet];
            cislarandom[pocet] = cislarandom[pocet] * -1;
            pocet++;
        }


        //prvn?? ??ty??i karty po????ta??e
        for (int b = 0; b < 4; b++) {

            karta2[b] = cislarandom[pocet];
            cislarandom[pocet] = cislarandom[pocet] * -1;
            pocet++;
        }


        //se??azen??
        double temp = 0;

        //player 2 cards
        //po????ta??
        for (int i = 0; i < karta2.length; i++) {

            for (int j = 1; j < karta2.length - i; j++) {
                if (karta2[j - 1] < karta2[j]) {
                    temp = karta2[j - 1];
                    karta2[j - 1] = karta2[j];
                    karta2[j] = temp;

                }
            }
        }

        //hr????
        for (int i = 0; i < karta.length; i++) {//player 1 cards

            for (int j = 0; j < karta.length - 1; j++) {
                if (karta[j] > karta[j + 1]) {
                    double x;
                    x = karta[j];
                    karta[j] = karta[j + 1];
                    karta[j + 1] = x;

                }
            }
        }
        //vy??azen?? karet stejn?? jin?? barvy
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
    //hr???? si bere karty
    public static void player1_colorpicking() {

        cerna = 0;
        bila = 0;


        if (break1 < 48) {

            break1++;

            if (vy5 == 1) {
                for (int e = 8; e < cislarandom.length; e++) {
                    if (Math.floor(cislarandom[e]) == cislarandom[e] - 0.5 && cislarandom[e] > 0) {
                        ran1 = cislarandom[e];
                        cislarandom[e] = cislarandom[e] * -1;

                        break;
                    } else {
                        cerna++;
                    }
                }
            } else {
                for (int e = 8; e < cislarandom.length; e++) {
                    if (Math.floor(cislarandom[e]) != cislarandom[e] - 0.5 && cislarandom[e] > 0) {
                        ran1 = cislarandom[e];
                        cislarandom[e] = cislarandom[e] * -1;
                        break;
                    } else {
                        bila++;
                    }
                }
            }
        }

        if (cerna >= 16) {
            break1--;
            konecna_cerna++;
        } else {
            cerna = 0;
        }
        if (bila >= 16) {
            break1--;
            konecna_bila++;
        } else {
            bila = 0;
        }
        dd = ran1;


    }

    public static void player1_position() {
        count = 0;


        if (Math.floor(karta2[vy1]) == karta2[vy1] - 0.5) {
            vy2 = vy2 + 0.5;
        } else {
            vy2 = vy2 + 0.3;
        }


        if (karta2[vy1] == vy2) {//corecting 1
            karta2[vy1] = karta2[vy1] * -1;
            count++;
        } else {
        }

        for (int p = 0; p < karta2.length; p++) {
            if (karta2[p] > 0) {
                o++;
            } else {

            }
        }

        vy1 = -1;
    }

    public static void player1_correcting() {

        if (break1 < 48) {

            for (int p = 0; p < karta.length; p++) {//adding new number1
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

    public static void player2_colorpicking() {
        do {
            do {
                cerna = 0;
                bila = 0;


                if (break1 < 48) {

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

            if (break1 < 48) {

                break1++;
                if (vy6 == 1) {
                    for (int e = 8; e < cislarandom.length; e++) {
                        if (Math.floor(cislarandom[e]) == cislarandom[e] - 0.5 && cislarandom[e] > 0) {
                            ran2 = cislarandom[e];
                            cislarandom[e] = cislarandom[e] * -1;
                            break;
                        } else {
                            cerna++;
                        }
                    }
                } else {
                    for (int e = 8; e < cislarandom.length; e++) {
                        if (Math.floor(cislarandom[e]) != cislarandom[e] - 0.5 && cislarandom[e] > 0) {
                            ran2 = cislarandom[e];
                            cislarandom[e] = cislarandom[e] * -1;
                            break;
                        } else {
                            bila++;
                        }
                    }
                }
            }

            if (cerna >= 16) {
                break1--;
                konecna_cerna++;

            } else {
                cerna = 0;
            }
            if (bila >= 16) {
                break1--;
                konecna_bila++;

            } else {
                bila = 0;
            }

        } while (cerna >= 16 || bila >= 16);
        dd = ran2;
    }

    public static void player2_position() {

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
                for (int w = 0; w < karta2.length; w++) {//vyrayeni karet
                    for (int l = 0; l < karta.length; l++) {
                        for (int p = 0; p < 24; p++) {
                            if (Math.abs(karta2[w]) == arr[p][l]) {
                                arr[p][l] = 0;
                            }
                        }
                    }
                }


                arr[24][karta.length - 1] = ran1_countc;//position
                arr[25][karta.length - 1] = ran1;
                for (int w = 0; w < karta.length - 1; w++) {
                    if (arr[24][w] >= ran1_countc) {
                        arr[24][w]++;
                    }
                }

                if (((arr[25][karta.length - 1] * 10) - 5) / 10 == Math.floor(arr[25][karta.length - 1])) {
                    arr[26][karta.length - 1] = 0.5;
                    for (int l = 0; l < 24; l++) {
                        if (((arr[l][karta.length - 1] * 10) - 3) / 10 == Math.floor(arr[l][karta.length - 1])) {
                            arr[l][karta.length - 1] = 0;
                        }
                    }
                } else {
                    arr[26][karta.length - 1] = 0.3;
                    for (int l = 0; l < 24; l++) {
                        if (((arr[l][karta.length - 1] * 10) - 5) / 10 == Math.floor(arr[l][karta.length - 1])) {
                            arr[l][karta.length - 1] = 0;
                        }
                    }
                }


                for (int u = 0; u < karta.length; u++) {//poradi vpred
                    for (int t = 0; t < karta.length; t++) {
                        if (arr[24][t] == poradi) {
                            if (poradi == 1) {
                                barva = arr[26][t];
                                poradi++;

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

                for (int u = 0; u < karta.length; u++) {//poradi vzad
                    for (int t = 0; t < karta.length; t++) {
                        if (arr[24][t] == poradi2) {
                            if (poradi2 == karta.length) {
                                barva2 = arr[26][t];
                                poradi2--;
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
            count_rada_break = 0;
            for (int u = 0; u < karta.length; u++) {
                if (arr[24][u] == count_rada) {
                    for (int l = 0; l < 24; l++) {//guesting
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
                    if( count_rada_break == 24){
                        mezikrok = arr[25][u];
                    }
                }
            }
            if (count_rada_break == 24) {
                count_rada++;
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

        if (q > 0) { //ending protocol
            q = 0;
        } else {
            konec++;

        }


    }

    public static void player2_correcting() {
        if (break1 < 48) {
            for (int p = 0; p < karta2.length; p++) {//adding new number2
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