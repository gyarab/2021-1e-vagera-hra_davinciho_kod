package com.example.scene1;

import javafx.beans.property.StringProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.OverrunStyle;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Scanner;

public class Player_vs_Player_without_pomlcka {
    private static Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    TextField txt;
    @FXML
    Pane gg;
    @FXML
    Button start;
    @FXML
    AnchorPane tr;
    @FXML
    Label player1;
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
    Button enter1;
    @FXML
    Button starter;
    @FXML
    Label pravidla;

    static int tt = 0;
    int ds = 4;
    int stoper = 0;
    int side = 0;
    int hh = 4;
    int ed = 0;
    static int kk = 0;
    static int jj = 0;
    static int prechod;
    static String s;
    static int u = 0;
    static int color = 0;
    static double dd = 0;


    static double[] karta;
    static double[] karta2;
    static double[] kartare;
    static double[] karta2re;
    static double[] cislare;
    static double[] cislarandom;


    static double btnk1[] = new double[12];
    static double btnk2[] = new double[12];
    static int poradnik1[] = new int[12];
    static int poradnik2[] = new int[12];
    static double disable2[] = new double[12];
    static double disable1[] = new double[12];
    int bln = 0;
    int pp = 0;

    static int count = 0;
    static int oo = 0;
    static int count2 = 0;
    static int vy1 = -1;
    static double vy2 = 0;
    static int vy3 = -1;
    static double vy4 = 0;
    static int vy5 = 0;
    static int vy6 = 0;
    static int q = 0;
    static int o = 0;
    static double ran1 = 0;
    static double ran2 = 0;
    static int break1 = 16;
    static int cerna = 0;
    static int bila = 0;
    static int konecna_cerna = 0;
    static int konecna_bila = 0;
    static int move = 0;
    static int final_color = 0;
    static int ran1_count;
    static int ran2_count;
    static int position1_count;
    static int position2_count;


    public void start(ActionEvent event) throws IOException, InvocationTargetException {
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
        player1.setVisible(true);
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

        btn1.setText(String.valueOf((int) Math.floor(karta[0])));
        btn3.setText(String.valueOf((int) Math.floor(karta[1])));
        btn5.setText(String.valueOf((int) Math.floor(karta[2])));
        btn7.setText(String.valueOf((int) Math.floor(karta[3])));



    }

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
        if (stoper == 0) {
            if (move == 0) {
                vy5 = 0;
                player1_colorpicking();
            } else {
                vy6 = 0;
                player2_colorpicking();
            }
        }
        if (konecna_bila > 0 || break1 >= 48) {
            konecna_bila++;
            bila_btn.setDisable(true);
        }
        if (konecna_bila > 0 && konecna_cerna > 0) {
            final_color++;
        }
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
                pp++;
            } else if (ds == 5) {
                btn10.setVisible(true);
                btn10.setLayoutX(1500);
                btn10.setLayoutY(430);
                btn10.setTextFill(Color.BLACK);
                btn10.setStyle("-fx-background-color:#EBEFE6");

                btn10.setText(String.valueOf((int) dd));

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
            } else if (ds == 7) {
                btn12.setVisible(true);
                btn12.setLayoutX(1500);
                btn12.setLayoutY(430);
                btn12.setTextFill(Color.BLACK);
                btn12.setStyle("-fx-background-color:#EBEFE6");

                btn12.setText(String.valueOf((int) dd));

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
            } else if (ds == 9) {
                btn14.setVisible(true);
                btn14.setLayoutX(1500);
                btn14.setLayoutY(430);
                btn14.setTextFill(Color.BLACK);
                btn14.setStyle("-fx-background-color:#EBEFE6");

                btn14.setText(String.valueOf((int) dd));

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
            } else if (ds == 11) {
                btn16.setVisible(true);
                btn16.setLayoutX(1500);
                btn16.setLayoutY(430);
                btn16.setTextFill(Color.BLACK);
                btn16.setStyle("-fx-background-color:#EBEFE6");

                btn16.setText(String.valueOf((int) dd));

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
            } else if (ds == 13) {
                btn18.setVisible(true);
                btn18.setLayoutX(1500);
                btn18.setLayoutY(430);
                btn18.setTextFill(Color.BLACK);
                btn18.setStyle("-fx-background-color:#EBEFE6");

                btn18.setText(String.valueOf((int) dd));

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
            } else if (ds == 15) {
                btn20.setVisible(true);
                btn20.setLayoutX(1500);
                btn20.setLayoutY(430);
                btn20.setTextFill(Color.BLACK);
                btn20.setStyle("-fx-background-color:#EBEFE6");

                btn20.setText(String.valueOf((int) dd));

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
            } else if (ds == 17) {
                btn22.setVisible(true);
                btn22.setLayoutX(1500);
                btn22.setLayoutY(430);
                btn22.setTextFill(Color.BLACK);
                btn22.setStyle("-fx-background-color:#EBEFE6");

                btn22.setText(String.valueOf((int) dd));

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
            } else if (ds == 19) {
                btn24.setVisible(true);
                btn24.setLayoutX(1500);
                btn24.setLayoutY(430);
                btn24.setStyle("-fx-background-color:#EBEFE6");
                btn24.setTextFill(Color.BLACK);
                btn24.setText(String.valueOf((int) dd));

                ds++;
                stoper++;


            }
            bln++;
        }

    }

    public void cerna(ActionEvent event) throws IOException {
        if (stoper == 0) {
            if (move == 0) {
                vy5 = 1;
                player1_colorpicking();
            } else {
                vy6 = 1;
                player2_colorpicking();
            }
        }
        if (konecna_cerna > 0 || break1 >= 48) {
            konecna_cerna++;
            cerna_btn.setDisable(true);
        }
        if (konecna_bila > 0 && konecna_cerna > 0) {
            final_color++;
        }
        if (stoper == 1 || konecna_cerna > 0) {
        } else {
            if (konecna_cerna > 0) {
            } else {
                cerna_btn.setVisible(false);
            }
            if (ds == 4) {
                btn9.setVisible(true);
                btn9.setLayoutX(1665);
                btn9.setLayoutY(430);
                btn9.setTextFill(Color.WHITE);
                btn9.setStyle("-fx-background-color:#474747");
                btn9.setText(String.valueOf((int) dd));
                ds++;
                stoper++;
            } else if (ds == 5) {
                btn10.setVisible(true);
                btn10.setLayoutX(1665);
                btn10.setLayoutY(430);
                btn10.setTextFill(Color.WHITE);
                btn10.setStyle("-fx-background-color:#474747");
                btn10.setText(String.valueOf((int) dd));
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
            } else if (ds == 7) {
                btn12.setVisible(true);
                btn12.setLayoutX(1665);
                btn12.setLayoutY(430);
                btn12.setTextFill(Color.WHITE);
                btn12.setStyle("-fx-background-color:#474747");
                btn12.setText(String.valueOf((int) dd));
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
            } else if (ds == 9) {
                btn14.setVisible(true);
                btn14.setLayoutX(1665);
                btn14.setLayoutY(430);
                btn14.setTextFill(Color.WHITE);
                btn14.setStyle("-fx-background-color:#474747");
                btn14.setText(String.valueOf((int) dd));
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
            } else if (ds == 11) {
                btn16.setVisible(true);
                btn16.setLayoutX(1665);
                btn16.setLayoutY(430);
                btn16.setTextFill(Color.WHITE);
                btn16.setStyle("-fx-background-color:#474747");
                btn16.setText(String.valueOf((int) dd));
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
            } else if (ds == 13) {
                btn18.setVisible(true);
                btn18.setLayoutX(1665);
                btn18.setLayoutY(430);
                btn18.setTextFill(Color.WHITE);
                btn18.setStyle("-fx-background-color:#474747");
                btn18.setText(String.valueOf((int) dd));
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
            } else if (ds == 15) {
                btn20.setVisible(true);
                btn20.setLayoutX(1665);
                btn20.setLayoutY(430);
                btn20.setTextFill(Color.WHITE);
                btn20.setStyle("-fx-background-color:#474747");
                btn20.setText(String.valueOf((int) dd));
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
            } else if (ds == 17) {
                btn22.setVisible(true);
                btn22.setLayoutX(1665);
                btn22.setLayoutY(430);
                btn22.setTextFill(Color.WHITE);
                btn22.setStyle("-fx-background-color:#474747");
                btn22.setText(String.valueOf((int) dd));
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
            } else if (ds == 19) {
                btn24.setVisible(true);
                btn24.setLayoutX(1665);
                btn24.setLayoutY(430);
                btn24.setTextFill(Color.WHITE);
                btn24.setStyle("-fx-background-color:#474747");
                btn24.setText(String.valueOf((int) dd));
                ds++;
                stoper++;


            }
            bln++;
        }
    }

    public void stoper(ActionEvent event) throws IOException, InterruptedException {
        String text = txt.getText();

        if ((text != "" && ds == 21) || (text != "" && bln != 0)) {//konecna
            oo++;
        }

        if (move == 0) {
            if (bln == 0 && ds < 21) {
                text5.setText(text4.getText());
                text4.setText(text3.getText());
                text3.setText(text2.getText());
                text2.setText(text1.getText());
                text1.setText("Player1: Take a card");
                oo--;
            }
            if (vy1 < 0) {
                oo--;
                text5.setText(text4.getText());
                text4.setText(text3.getText());
                text3.setText(text2.getText());
                text2.setText(text1.getText());
                text1.setText("Player1: Select card first");
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

        }
        if (move == 1) {
            if (bln == 0 && ds < 21) {
                text5.setText(text4.getText());
                text4.setText(text3.getText());
                text3.setText(text2.getText());
                text2.setText(text1.getText());
                text1.setText("Player2: Take a card");
                oo--;
            }
            if (vy3 < 0) {
                text5.setText(text4.getText());
                text4.setText(text3.getText());
                text3.setText(text2.getText());
                text2.setText(text1.getText());
                text1.setText("Player2: Select card first");
                oo--;
            }
            vy4 = Double.parseDouble(text);
            if (vy4 > 11 || vy4 < 0) {
                text5.setText(text4.getText());
                text4.setText(text3.getText());
                text3.setText(text2.getText());
                text2.setText(text1.getText());
                text1.setText("Player2: Wrong number");
                oo--;
            }
        }


        if (oo <= 0) {

        } else {
            if (move == 0) {
                prechod = vy1;
                player1_position();

            } else {
                prechod = vy3;
                player2_position();

            }
            if (count == 1 || count2 == 1) {


                txt.clear();
                if (move == 0) {
                    if (o > 0) {
                        o = 0;
                    } else {
                        Parent root = FXMLLoader.load(getClass().getResource("player1-enter.fxml"));
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
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
                    text1.setText("Player1: " + ww + " " + (int) vy2 + " is Correct");

                    if (prechod == btnk2[0]) {
                        btn2.setText(String.valueOf((int) vy2));
                        btn2.setDisable(true);
                        disable2[0] = vy2;
                    } else if (prechod == btnk2[1]) {
                        btn4.setText(String.valueOf((int) vy2));
                        btn4.setDisable(true);
                        disable2[1] = vy2;
                    } else if (prechod == btnk2[2]) {
                        btn6.setText(String.valueOf((int) vy2));
                        btn6.setDisable(true);
                        disable2[2] = vy2;
                    } else if (prechod == btnk2[3]) {
                        btn8.setText(String.valueOf((int) vy2));
                        btn8.setDisable(true);
                        disable2[3] = vy2;
                    } else if (prechod == btnk2[4]) {
                        btn10.setText(String.valueOf((int) vy2));
                        btn10.setDisable(true);
                        disable2[4] = vy2;
                    } else if (prechod == btnk2[5]) {
                        btn12.setText(String.valueOf((int) vy2));
                        btn12.setDisable(true);
                        disable2[5] = vy2;
                    } else if (prechod == btnk2[6]) {
                        btn14.setText(String.valueOf((int) vy2));
                        btn14.setDisable(true);
                        disable2[6] = vy2;
                    } else if (prechod == btnk2[7]) {
                        btn16.setText(String.valueOf((int) vy2));
                        btn16.setDisable(true);
                        disable2[7] = vy2;
                    } else if (prechod == btnk2[8]) {
                        btn18.setText(String.valueOf((int) vy2));
                        btn18.setDisable(true);
                        disable2[8] = vy2;
                    } else if (prechod == btnk2[9]) {
                        btn20.setText(String.valueOf((int) vy2));
                        btn20.setDisable(true);
                        disable2[9] = vy2;
                    } else if (prechod == btnk2[10]) {
                        btn22.setText(String.valueOf((int) vy2));
                        btn22.setDisable(true);
                        disable2[10] = vy2;
                    } else if (prechod == btnk2[11]) {
                        btn24.setText(String.valueOf((int) vy2));
                        btn24.setDisable(true);
                        disable2[11] = vy2;
                    }
                }
                if (move == 1) {
                    if (q > 0) {
                        q = 0;
                    } else {
                        Parent root = FXMLLoader.load(getClass().getResource("player2-enter.fxml"));
                        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        scene = new Scene(root);
                        stage.setScene(scene);
                        stage.show();
                    }
                    if (Math.floor(vy4) == vy4 - 0.5) {
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
                    text1.setText("Player2: " + ww + " " + (int) vy4 + " is Correct");
                    if (prechod == btnk1[0]) {
                        btn1.setText(String.valueOf((int) vy4));
                        btn1.setDisable(true);
                        disable1[0] = vy4;
                    } else if (prechod == btnk1[1]) {
                        btn3.setText(String.valueOf((int) vy4));
                        btn3.setDisable(true);
                        disable1[1] = vy4;
                    } else if (prechod == btnk1[2]) {
                        btn5.setText(String.valueOf((int) vy4));
                        btn5.setDisable(true);
                        disable1[2] = vy4;
                    } else if (prechod == btnk1[3]) {
                        btn7.setText(String.valueOf((int) vy4));
                        btn7.setDisable(true);
                        disable1[3] = vy4;
                    } else if (prechod == btnk1[4]) {
                        btn9.setText(String.valueOf((int) vy4));
                        btn9.setDisable(true);
                        disable1[4] = vy4;
                    } else if (prechod == btnk1[5]) {
                        btn11.setText(String.valueOf((int) vy4));
                        btn11.setDisable(true);
                        disable1[5] = vy4;
                    } else if (prechod == btnk1[6]) {
                        btn13.setText(String.valueOf((int) vy4));
                        btn13.setDisable(true);
                        disable1[6] = vy4;
                    } else if (prechod == btnk1[7]) {
                        btn15.setText(String.valueOf((int) vy4));
                        btn15.setDisable(true);
                        disable1[7] = vy4;
                    } else if (prechod == btnk1[8]) {
                        btn17.setText(String.valueOf((int) vy4));
                        btn17.setDisable(true);
                        disable1[8] = vy4;
                    } else if (prechod == btnk1[9]) {
                        btn19.setText(String.valueOf((int) vy4));
                        btn19.setDisable(true);
                        disable1[9] = vy4;
                    } else if (prechod == btnk1[10]) {
                        btn21.setText(String.valueOf((int) vy4));
                        btn21.setDisable(true);
                        disable1[10] = vy4;
                    } else if (prechod == btnk1[11]) {
                        btn23.setText(String.valueOf((int) vy4));
                        btn23.setDisable(true);
                        disable1[11] = vy4;
                    }
                }
            } else {

                text5.setText(text4.getText());
                text4.setText(text3.getText());
                text3.setText(text2.getText());
                text2.setText(text1.getText());
                String player;
                String ww;
                if (move == 0) {
                    player = "Player1: ";
                    enter1.setText("Press to start Player2 move");
                    if (Math.floor(vy2) == vy2 - 0.5) {
                        color++;
                    }
                    if (color == 1) {
                        ww = "Cerna";
                    } else {
                        ww = "Bila";
                    }
                    text1.setText(player + ww + " " + (int) vy2 + " is Incorrect");

                } else {
                    player = "Player2: ";
                    enter1.setText("Press to start Player1 move");
                    if (Math.floor(vy4) == vy4 - 0.5) {
                        color++;
                    }
                    if (color == 1) {
                        ww = "Cerna";
                    } else {
                        ww = "Bila";
                    }
                    text1.setText(player + ww + " " + (int) vy4 + " is Incorrect");
                }
                color = 0;

                stoper = 0;
                gg.setVisible(true);
                enter1.setVisible(true);
                btn1.setVisible(false);
                btn2.setVisible(false);
                btn3.setVisible(false);
                btn4.setVisible(false);
                btn5.setVisible(false);
                btn6.setVisible(false);
                btn7.setVisible(false);
                btn8.setVisible(false);
                btn9.setVisible(false);
                btn10.setVisible(false);
                btn11.setVisible(false);
                btn12.setVisible(false);
                btn13.setVisible(false);
                btn14.setVisible(false);
                btn15.setVisible(false);
                btn16.setVisible(false);
                btn17.setVisible(false);
                btn18.setVisible(false);
                btn19.setVisible(false);
                btn20.setVisible(false);
                btn21.setVisible(false);
                btn22.setVisible(false);
                btn23.setVisible(false);
                btn24.setVisible(false);
                bila_btn.setVisible(false);
                cerna_btn.setVisible(false);
                stoper1.setVisible(false);
                txt.setVisible(false);
                text1.setVisible(false);
                text2.setVisible(false);
                text3.setVisible(false);
                text4.setVisible(false);
                text5.setVisible(false);
                player1.setVisible(false);
                pravidla.setVisible(false);
                bln = 0;
            }

        }
        oo = 0;

    }

    public void enter(ActionEvent event) throws IOException {
        gg.setVisible(false);
        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
        btn5.setVisible(true);
        btn6.setVisible(true);
        btn7.setVisible(true);
        btn8.setVisible(true);
        btn9.setVisible(true);
        btn10.setVisible(true);
        btn11.setVisible(true);
        btn12.setVisible(true);
        btn13.setVisible(true);
        btn14.setVisible(true);
        btn15.setVisible(true);
        btn16.setVisible(true);
        btn17.setVisible(true);
        btn18.setVisible(true);
        btn19.setVisible(true);
        btn20.setVisible(true);
        btn21.setVisible(true);
        btn22.setVisible(true);
        btn23.setVisible(true);
        btn24.setVisible(true);
        bila_btn.setVisible(true);
        cerna_btn.setVisible(true);
        stoper1.setVisible(true);
        enter1.setVisible(false);
        txt.clear();
        txt.setVisible(true);
        text1.setVisible(true);
        text2.setVisible(true);
        text3.setVisible(true);
        text4.setVisible(true);
        text5.setVisible(true);
        player1.setVisible(true);
        pravidla.setVisible(true);
        if (move == 0) {
            player1.setText("Player2");
            player1_correcting();
            if (move == 0 && kk == 0) {
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

                if (karta.length == 5) {
                    btn9.setLayoutX(20 + position1_count * 130);
                } else if (karta.length == 6) {
                    btn11.setLayoutX(20 + position1_count * 130);
                } else if (karta.length == 7) {
                    btn13.setLayoutX(20 + position1_count * 130);
                } else if (karta.length == 8) {
                    btn15.setLayoutX(20 + position1_count * 130);
                } else if (karta.length == 9) {
                    btn17.setLayoutX(20 + position1_count * 130);
                } else if (karta.length == 10) {
                    btn19.setLayoutX(20 + position1_count * 130);
                } else if (karta.length == 11) {
                    btn21.setLayoutX(20 + position1_count * 130);
                } else if (karta.length == 12) {
                    btn23.setLayoutX(20 + position1_count * 130);
                    kk++;
                }
                position1_count = 0;
            }
            btn2.setDisable(false);
            btn4.setDisable(false);
            btn6.setDisable(false);
            btn8.setDisable(false);
            btn10.setDisable(false);
            btn12.setDisable(false);
            btn14.setDisable(false);
            btn16.setDisable(false);
            btn18.setDisable(false);
            btn20.setDisable(false);
            btn22.setDisable(false);
            btn24.setDisable(false);

            btn1.setDisable(false);
            btn3.setDisable(false);
            btn5.setDisable(false);
            btn7.setDisable(false);
            btn9.setDisable(false);
            btn11.setDisable(false);
            btn13.setDisable(false);
            btn15.setDisable(false);
            btn17.setDisable(false);
            btn19.setDisable(false);
            btn21.setDisable(false);
            btn23.setDisable(false);


            if (disable1[0] >= 0.1) {
                btn1.setDisable(true);
            }
            if (disable1[1] >= 0.1) {
                btn3.setDisable(true);
            }
            if (disable1[2] >= 0.1) {
                btn5.setDisable(true);
            }
            if (disable1[3] >= 0.1) {
                btn7.setDisable(true);
            }
            if (disable1[4] >= 0.1) {
                btn9.setDisable(true);
            }
            if (disable1[5] >= 0.1) {
                btn11.setDisable(true);
            }
            if (disable1[6] >= 0.1) {
                btn13.setDisable(true);
            }
            if (disable1[7] >= 0.1) {
                btn15.setDisable(true);
            }
            if (disable1[8] >= 0.1) {
                btn17.setDisable(true);
            }
            if (disable1[9] >= 0.1) {
                btn19.setDisable(true);
            }
            if (disable1[10] >= 0.1) {
                btn21.setDisable(true);
            }
            if (disable1[11] >= 0.1) {
                btn23.setDisable(true);
            }
            for (int i = 0; i < karta.length; i++) {
                if (btnk1[0] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn1.setStyle("-fx-background-color:#474747");
                        btn1.setTextFill(Color.WHITE);
                    } else {
                        btn1.setStyle("-fx-background-color:#EBEFE6");
                        btn1.setTextFill(Color.BLACK);
                    }
                    btn1.setText("");
                } else if (btnk1[1] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn3.setStyle("-fx-background-color:#474747");
                        btn3.setTextFill(Color.WHITE);
                    } else {
                        btn3.setStyle("-fx-background-color:#EBEFE6");
                        btn3.setTextFill(Color.BLACK);
                    }
                    btn3.setText("");
                } else if (btnk1[2] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn5.setStyle("-fx-background-color:#474747");
                        btn5.setTextFill(Color.WHITE);
                    } else {
                        btn5.setStyle("-fx-background-color:#EBEFE6");
                        btn5.setTextFill(Color.BLACK);
                    }
                    btn5.setText("");
                } else if (btnk1[3] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn7.setStyle("-fx-background-color:#474747");
                        btn7.setTextFill(Color.WHITE);
                    } else {
                        btn7.setStyle("-fx-background-color:#EBEFE6");
                        btn7.setTextFill(Color.BLACK);
                    }
                    btn7.setText("");
                } else if (btnk1[4] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn9.setStyle("-fx-background-color:#474747");
                        btn9.setTextFill(Color.WHITE);
                    } else {
                        btn9.setStyle("-fx-background-color:#EBEFE6");
                        btn9.setTextFill(Color.BLACK);
                    }
                    btn9.setText("");
                } else if (btnk1[5] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn11.setStyle("-fx-background-color:#474747");
                        btn11.setTextFill(Color.WHITE);
                    } else {
                        btn11.setStyle("-fx-background-color:#EBEFE6");
                        btn11.setTextFill(Color.BLACK);
                    }
                    btn11.setText("");
                } else if (btnk1[6] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn13.setStyle("-fx-background-color:#474747");
                        btn13.setTextFill(Color.WHITE);
                    } else {
                        btn13.setStyle("-fx-background-color:#EBEFE6");
                        btn13.setTextFill(Color.BLACK);
                    }
                    btn13.setText("");
                } else if (btnk1[7] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn15.setStyle("-fx-background-color:#474747");
                        btn15.setTextFill(Color.WHITE);
                    } else {
                        btn15.setStyle("-fx-background-color:#EBEFE6");
                        btn15.setTextFill(Color.BLACK);
                    }
                    btn15.setText("");
                } else if (btnk1[8] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn17.setStyle("-fx-background-color:#474747");
                        btn17.setTextFill(Color.WHITE);
                    } else {
                        btn17.setStyle("-fx-background-color:#EBEFE6");
                        btn17.setTextFill(Color.BLACK);
                    }
                    btn17.setText("");
                } else if (btnk1[9] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn19.setStyle("-fx-background-color:#474747");
                        btn19.setTextFill(Color.WHITE);
                    } else {
                        btn19.setStyle("-fx-background-color:#EBEFE6");
                        btn19.setTextFill(Color.BLACK);
                    }
                    btn19.setText("");
                } else if (btnk1[10] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn21.setStyle("-fx-background-color:#474747");
                        btn21.setTextFill(Color.WHITE);
                    } else {
                        btn21.setStyle("-fx-background-color:#EBEFE6");
                        btn21.setTextFill(Color.BLACK);
                    }
                    btn21.setText("");
                } else if (btnk1[11] == i) {
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn23.setStyle("-fx-background-color:#474747");
                        btn23.setTextFill(Color.WHITE);
                    } else {
                        btn23.setStyle("-fx-background-color:#EBEFE6");
                        btn23.setTextFill(Color.BLACK);
                    }
                    btn23.setText("");
                }
            }

            if (karta.length == 5) {
                btn9.setText("N");
                btn9.setTextFill(Color.DARKSEAGREEN);
            } else if (karta.length == 6) {
                btn11.setText("N");
                btn11.setTextFill(Color.DARKSEAGREEN);
            } else if (karta.length == 7) {
                btn13.setText("N");
                btn13.setTextFill(Color.DARKSEAGREEN);
            } else if (karta.length == 8) {
                btn15.setText("N");
                btn15.setTextFill(Color.DARKSEAGREEN);
            } else if (karta.length == 9) {
                btn17.setText("N");
                btn17.setTextFill(Color.DARKSEAGREEN);
            } else if (karta.length == 10) {
                btn19.setText("N");
                btn19.setTextFill(Color.DARKSEAGREEN);
            } else if (karta.length == 11) {
                btn21.setText("N");
                btn21.setTextFill(Color.DARKSEAGREEN);
            } else if (karta.length == 12 && kk <= 1) {
                btn23.setText("N");
                btn23.setTextFill(Color.DARKSEAGREEN);
                kk++;
            }

            //second
            for (int i = 0; i < karta2.length; i++) {
                if (btnk2[0] == i) {
                    if (karta2[i] < 0) {
                        btn2.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn2.setStyle("-fx-background-color:#474747");
                        btn2.setTextFill(Color.WHITE);
                    } else {
                        btn2.setStyle("-fx-background-color:#EBEFE6");
                        btn2.setTextFill(Color.BLACK);
                    }
                    btn2.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[1] == i) {
                    if (karta2[i] < 0) {
                        btn4.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn4.setStyle("-fx-background-color:#474747");
                        btn4.setTextFill(Color.WHITE);
                    } else {
                        btn4.setStyle("-fx-background-color:#EBEFE6");
                        btn4.setTextFill(Color.BLACK);
                    }
                    btn4.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[2] == i) {
                    if (karta2[i] < 0) {
                        btn6.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn6.setStyle("-fx-background-color:#474747");
                        btn6.setTextFill(Color.WHITE);
                    } else {
                        btn6.setStyle("-fx-background-color:#EBEFE6");
                        btn6.setTextFill(Color.BLACK);
                    }
                    btn6.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[3] == i) {
                    if (karta2[i] < 0) {
                        btn8.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn8.setStyle("-fx-background-color:#474747");
                        btn8.setTextFill(Color.WHITE);
                    } else {
                        btn8.setStyle("-fx-background-color:#EBEFE6");
                        btn8.setTextFill(Color.BLACK);
                    }
                    btn8.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[4] == i) {
                    if (karta2[i] < 0) {
                        btn10.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn10.setStyle("-fx-background-color:#474747");
                        btn10.setTextFill(Color.WHITE);
                    } else {
                        btn10.setStyle("-fx-background-color:#EBEFE6");
                        btn10.setTextFill(Color.BLACK);
                    }
                    btn10.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[5] == i) {
                    if (karta2[i] < 0) {
                        btn12.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn12.setStyle("-fx-background-color:#474747");
                        btn12.setTextFill(Color.WHITE);
                    } else {
                        btn12.setStyle("-fx-background-color:#EBEFE6");
                        btn12.setTextFill(Color.BLACK);
                    }
                    btn12.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[6] == i) {
                    if (karta2[i] < 0) {
                        btn14.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn14.setStyle("-fx-background-color:#474747");
                        btn14.setTextFill(Color.WHITE);
                    } else {
                        btn14.setStyle("-fx-background-color:#EBEFE6");
                        btn14.setTextFill(Color.BLACK);
                    }
                    btn14.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[7] == i) {
                    if (karta2[i] < 0) {
                        btn16.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn16.setStyle("-fx-background-color:#474747");
                        btn16.setTextFill(Color.WHITE);
                    } else {
                        btn16.setStyle("-fx-background-color:#EBEFE6");
                        btn16.setTextFill(Color.BLACK);
                    }
                    btn16.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[8] == i) {
                    if (karta2[i] < 0) {
                        btn18.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn18.setStyle("-fx-background-color:#474747");
                        btn18.setTextFill(Color.WHITE);
                    } else {
                        btn18.setStyle("-fx-background-color:#EBEFE6");
                        btn18.setTextFill(Color.BLACK);
                    }
                    btn18.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[9] == i) {
                    if (karta2[i] < 0) {
                        btn20.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn20.setStyle("-fx-background-color:#474747");
                        btn20.setTextFill(Color.WHITE);
                    } else {
                        btn20.setStyle("-fx-background-color:#EBEFE6");
                        btn20.setTextFill(Color.BLACK);
                    }
                    btn20.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[10] == i) {
                    if (karta2[i] < 0) {
                        btn22.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn22.setStyle("-fx-background-color:#474747");
                        btn22.setTextFill(Color.WHITE);
                    } else {
                        btn22.setStyle("-fx-background-color:#EBEFE6");
                        btn22.setTextFill(Color.BLACK);
                    }
                    btn22.setText(String.valueOf((int) Math.abs(karta2[i])));
                } else if (btnk2[11] == i) {
                    if (karta2[i] < 0) {
                        btn24.setDisable(true);
                    }
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn24.setStyle("-fx-background-color:#474747");
                        btn24.setTextFill(Color.WHITE);
                    } else {
                        btn24.setStyle("-fx-background-color:#EBEFE6");
                        btn24.setTextFill(Color.BLACK);
                    }
                    btn24.setText(String.valueOf((int) Math.abs(karta2[i])));
                }

            }
            if (disable1[0] >= 0.1) {
                btn1.setText(String.valueOf((int) disable1[0]));
            }
            if (disable1[1] >= 0.1) {
                btn3.setText(String.valueOf((int) disable1[1]));
            }
            if (disable1[2] >= 0.1) {
                btn5.setText(String.valueOf((int) disable1[2]));
            }
            if (disable1[3] >= 0.1) {
                btn7.setText(String.valueOf((int) disable1[3]));
            }
            if (disable1[4] >= 0.1) {
                btn9.setText(String.valueOf((int) disable1[4]));
            }
            if (disable1[5] >= 0.1) {
                btn11.setText(String.valueOf((int) disable1[5]));
            }
            if (disable1[6] >= 0.1) {
                btn13.setText(String.valueOf((int) disable1[6]));
            }
            if (disable1[7] >= 0.1) {
                btn15.setText(String.valueOf((int) disable1[7]));
            }
            if (disable1[8] >= 0.1) {
                btn17.setText(String.valueOf((int) disable1[8]));
            }
            if (disable1[9] >= 0.1) {
                btn19.setText(String.valueOf((int) disable1[9]));
            }
            if (disable1[10] >= 0.1) {
                btn21.setText(String.valueOf((int) disable1[10]));
            }
            if (disable1[11] >= 0.1) {
                btn23.setText(String.valueOf((int) disable1[11]));
            }
            move++;
        } else {
            player1.setText("Player1");
            player2_correcting();

            if (move == 1 && jj == 0) {
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

                if (karta2.length == 5) {
                    btn10.setLayoutX(20 + position2_count * 130);
                } else if (karta2.length == 6) {
                    btn12.setLayoutX(20 + position2_count * 130);
                } else if (karta2.length == 7) {
                    btn14.setLayoutX(20 + position2_count * 130);
                } else if (karta2.length == 8) {
                    btn16.setLayoutX(20 + position2_count * 130);
                } else if (karta2.length == 9) {
                    btn18.setLayoutX(20 + position2_count * 130);
                } else if (karta2.length == 10) {
                    btn20.setLayoutX(20 + position2_count * 130);
                } else if (karta2.length == 11) {
                    btn22.setLayoutX(20 + position2_count * 130);
                } else if (karta2.length == 12) {
                    btn24.setLayoutX(20 + position2_count * 130);
                    jj++;
                }
                position2_count = 0;

            }

            btn1.setDisable(false);
            btn3.setDisable(false);
            btn5.setDisable(false);
            btn7.setDisable(false);
            btn9.setDisable(false);
            btn11.setDisable(false);
            btn13.setDisable(false);
            btn15.setDisable(false);
            btn17.setDisable(false);
            btn19.setDisable(false);
            btn21.setDisable(false);
            btn23.setDisable(false);

            btn2.setDisable(false);
            btn4.setDisable(false);
            btn6.setDisable(false);
            btn8.setDisable(false);
            btn10.setDisable(false);
            btn12.setDisable(false);
            btn14.setDisable(false);
            btn16.setDisable(false);
            btn18.setDisable(false);
            btn20.setDisable(false);
            btn22.setDisable(false);
            btn24.setDisable(false);



            if (disable2[0] >= 0.1) {
                btn2.setDisable(true);
            }
            if (disable2[1] >= 0.1) {
                btn4.setDisable(true);
            }
            if (disable2[2] >= 0.1) {
                btn6.setDisable(true);
            }
            if (disable2[3] >= 0.1) {
                btn8.setDisable(true);
            }
            if (disable2[4] >= 0.1) {
                btn10.setDisable(true);
            }
            if (disable2[5] >= 0.1) {
                btn12.setDisable(true);
            }
            if (disable2[6] >= 0.1) {
                btn14.setDisable(true);
            }
            if (disable2[7] >= 0.1) {
                btn16.setDisable(true);
            }
            if (disable2[8] >= 0.1) {
                btn18.setDisable(true);
            }
            if (disable2[9] >= 0.1) {
                btn20.setDisable(true);
            }
            if (disable2[10] >= 0.1) {
                btn22.setDisable(true);
            }
            if (disable2[11] >= 0.1) {
                btn24.setDisable(true);
            }
            for (int i = 0; i < karta2.length; i++) {
                if (btnk2[0] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn2.setStyle("-fx-background-color:#474747");
                        btn2.setTextFill(Color.WHITE);
                    } else {
                        btn2.setStyle("-fx-background-color:#EBEFE6");
                        btn2.setTextFill(Color.BLACK);
                    }
                    btn2.setText("");
                } else if (btnk2[1] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn4.setStyle("-fx-background-color:#474747");
                        btn4.setTextFill(Color.WHITE);
                    } else {
                        btn4.setStyle("-fx-background-color:#EBEFE6");
                        btn4.setTextFill(Color.BLACK);
                    }
                    btn4.setText("");
                } else if (btnk2[2] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn6.setStyle("-fx-background-color:#474747");
                        btn6.setTextFill(Color.WHITE);
                    } else {
                        btn6.setStyle("-fx-background-color:#EBEFE6");
                        btn6.setTextFill(Color.BLACK);
                    }
                    btn6.setText("");
                } else if (btnk2[3] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn8.setStyle("-fx-background-color:#474747");
                        btn8.setTextFill(Color.WHITE);
                    } else {
                        btn8.setStyle("-fx-background-color:#EBEFE6");
                        btn8.setTextFill(Color.BLACK);
                    }
                    btn8.setText("");
                } else if (btnk2[4] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn10.setStyle("-fx-background-color:#474747");
                        btn10.setTextFill(Color.WHITE);
                    } else {
                        btn10.setStyle("-fx-background-color:#EBEFE6");
                        btn10.setTextFill(Color.BLACK);
                    }
                    btn10.setText("");
                } else if (btnk2[5] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn12.setStyle("-fx-background-color:#474747");
                        btn12.setTextFill(Color.WHITE);
                    } else {
                        btn12.setStyle("-fx-background-color:#EBEFE6");
                        btn12.setTextFill(Color.BLACK);
                    }
                    btn12.setText("");
                } else if (btnk2[6] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn14.setStyle("-fx-background-color:#474747");
                        btn14.setTextFill(Color.WHITE);
                    } else {
                        btn14.setStyle("-fx-background-color:#EBEFE6");
                        btn14.setTextFill(Color.BLACK);
                    }
                    btn14.setText("");
                } else if (btnk2[7] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn16.setStyle("-fx-background-color:#474747");
                        btn16.setTextFill(Color.WHITE);
                    } else {
                        btn16.setStyle("-fx-background-color:#EBEFE6");
                        btn16.setTextFill(Color.BLACK);
                    }
                    btn16.setText("");
                } else if (btnk2[8] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn18.setStyle("-fx-background-color:#474747");
                        btn18.setTextFill(Color.WHITE);
                    } else {
                        btn18.setStyle("-fx-background-color:#EBEFE6");
                        btn18.setTextFill(Color.BLACK);
                    }
                    btn18.setText("");
                } else if (btnk2[9] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn20.setStyle("-fx-background-color:#474747");
                        btn20.setTextFill(Color.WHITE);
                    } else {
                        btn20.setStyle("-fx-background-color:#EBEFE6");
                        btn20.setTextFill(Color.BLACK);
                    }
                    btn20.setText("");
                } else if (btnk2[10] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn22.setStyle("-fx-background-color:#474747");
                        btn22.setTextFill(Color.WHITE);
                    } else {
                        btn22.setStyle("-fx-background-color:#EBEFE6");
                        btn22.setTextFill(Color.BLACK);
                    }
                    btn22.setText("");
                } else if (btnk2[11] == i) {
                    if (Math.floor(karta2[i]) == karta2[i] - 0.5) {
                        btn24.setStyle("-fx-background-color:#474747");
                        btn24.setTextFill(Color.WHITE);
                    } else {
                        btn24.setStyle("-fx-background-color:#EBEFE6");
                        btn24.setTextFill(Color.BLACK);
                    }
                    btn24.setText("");
                }
            }
            if (karta2.length == 5) {
                btn10.setText("N");
                btn10.setTextFill(Color.DARKSEAGREEN);
            } else if (karta2.length == 6) {
                btn12.setText("N");
                btn12.setTextFill(Color.DARKSEAGREEN);
            } else if (karta2.length == 7) {
                btn14.setText("N");
                btn14.setTextFill(Color.DARKSEAGREEN);
            } else if (karta2.length == 8) {
                btn16.setText("N");
                btn16.setTextFill(Color.DARKSEAGREEN);
            } else if (karta2.length == 9) {
                btn18.setText("N");
                btn18.setTextFill(Color.DARKSEAGREEN);
            } else if (karta2.length == 10) {
                btn20.setText("N");
                btn20.setTextFill(Color.DARKSEAGREEN);
            } else if (karta2.length == 11) {
                btn22.setText("N");
                btn22.setTextFill(Color.DARKSEAGREEN);
            } else if (karta2.length == 12 && jj <= 1) {
                btn24.setText("N");
                btn24.setTextFill(Color.DARKSEAGREEN);
                jj++;
            }
            //second
            for (int i = 0; i < karta.length; i++) {
                if (btnk1[0] == i) {
                    if (karta[i] < 0) {
                        btn1.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn1.setStyle("-fx-background-color:#474747");
                        btn1.setTextFill(Color.WHITE);
                    } else {
                        btn1.setStyle("-fx-background-color:#EBEFE6");
                        btn1.setTextFill(Color.BLACK);
                    }
                    btn1.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[1] == i) {
                    if (karta[i] < 0) {
                        btn3.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn3.setStyle("-fx-background-color:#474747");
                        btn3.setTextFill(Color.WHITE);
                    } else {
                        btn3.setStyle("-fx-background-color:#EBEFE6");
                        btn3.setTextFill(Color.BLACK);
                    }
                    btn3.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[2] == i) {
                    if (karta[i] < 0) {
                        btn5.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn5.setStyle("-fx-background-color:#474747");
                        btn5.setTextFill(Color.WHITE);
                    } else {
                        btn5.setStyle("-fx-background-color:#EBEFE6");
                        btn5.setTextFill(Color.BLACK);
                    }
                    btn5.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[3] == i) {
                    if (karta[i] < 0) {
                        btn7.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn7.setStyle("-fx-background-color:#474747");
                        btn7.setTextFill(Color.WHITE);
                    } else {
                        btn7.setStyle("-fx-background-color:#EBEFE6");
                        btn7.setTextFill(Color.BLACK);
                    }
                    btn7.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[4] == i) {
                    if (karta[i] < 0) {
                        btn9.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn9.setStyle("-fx-background-color:#474747");
                        btn9.setTextFill(Color.WHITE);
                    } else {
                        btn9.setStyle("-fx-background-color:#EBEFE6");
                        btn9.setTextFill(Color.BLACK);
                    }
                    btn9.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[5] == i) {
                    if (karta[i] < 0) {
                        btn11.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn11.setStyle("-fx-background-color:#474747");
                        btn11.setTextFill(Color.WHITE);
                    } else {
                        btn11.setStyle("-fx-background-color:#EBEFE6");
                        btn11.setTextFill(Color.BLACK);
                    }
                    btn11.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[6] == i) {
                    if (karta[i] < 0) {
                        btn13.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn13.setStyle("-fx-background-color:#474747");
                        btn13.setTextFill(Color.WHITE);
                    } else {
                        btn13.setStyle("-fx-background-color:#EBEFE6");
                        btn13.setTextFill(Color.BLACK);
                    }
                    btn13.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[7] == i) {
                    if (karta[i] < 0) {
                        btn15.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn15.setStyle("-fx-background-color:#474747");
                        btn15.setTextFill(Color.WHITE);
                    } else {
                        btn15.setStyle("-fx-background-color:#EBEFE6");
                        btn15.setTextFill(Color.BLACK);
                    }
                    btn15.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[8] == i) {
                    if (karta[i] < 0) {
                        btn17.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn17.setStyle("-fx-background-color:#474747");
                        btn17.setTextFill(Color.WHITE);
                    } else {
                        btn17.setStyle("-fx-background-color:#EBEFE6");
                        btn17.setTextFill(Color.BLACK);
                    }
                    btn17.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[9] == i) {
                    if (karta[i] < 0) {
                        btn19.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn19.setStyle("-fx-background-color:#474747");
                        btn19.setTextFill(Color.WHITE);
                    } else {
                        btn19.setStyle("-fx-background-color:#EBEFE6");
                        btn19.setTextFill(Color.BLACK);
                    }
                    btn19.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[10] == i) {
                    if (karta[i] < 0) {
                        btn21.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn21.setStyle("-fx-background-color:#474747");
                        btn21.setTextFill(Color.WHITE);
                    } else {
                        btn21.setStyle("-fx-background-color:#EBEFE6");
                        btn21.setTextFill(Color.BLACK);
                    }
                    btn21.setText(String.valueOf((int) Math.abs(karta[i])));
                } else if (btnk1[11] == i) {
                    if (karta[i] < 0) {
                        btn23.setDisable(true);
                    }
                    if (Math.floor(karta[i]) == karta[i] - 0.5) {
                        btn23.setStyle("-fx-background-color:#474747");
                        btn23.setTextFill(Color.WHITE);
                    } else {
                        btn23.setStyle("-fx-background-color:#EBEFE6");
                        btn23.setTextFill(Color.BLACK);
                    }
                    btn23.setText(String.valueOf((int) Math.abs(karta[i])));
                }
            }

            if (disable2[0] >= 0.1) {
                btn2.setText(String.valueOf((int) disable2[0]));
            }
            if (disable2[1] >= 0.1) {
                btn4.setText(String.valueOf((int) disable2[1]));
            }
            if (disable2[2] >= 0.1) {
                btn6.setText(String.valueOf((int) disable2[2]));
            }
            if (disable2[3] >= 0.1) {
                btn8.setText(String.valueOf((int) disable2[3]));
            }
            if (disable2[4] >= 0.1) {
                btn10.setText(String.valueOf((int) disable2[4]));
            }
            if (disable2[5] >= 0.1) {
                btn12.setText(String.valueOf((int) disable2[5]));
            }
            if (disable2[6] >= 0.1) {
                btn14.setText(String.valueOf((int) disable2[6]));
            }
            if (disable2[7] >= 0.1) {
                btn16.setText(String.valueOf((int) disable2[7]));
            }
            if (disable2[8] >= 0.1) {
                btn18.setText(String.valueOf((int) disable2[8]));
            }
            if (disable2[9] >= 0.1) {
                btn20.setText(String.valueOf((int) disable2[9]));
            }
            if (disable2[10] >= 0.1) {
                btn22.setText(String.valueOf((int) disable2[10]));
            }
            if (disable2[11] >= 0.1) {
                btn24.setText(String.valueOf((int) disable2[11]));
            }

            move = 0;
        }
        // down buttons
        if (ds == 5) {
            //down Y cordinates
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            //up Y cordinates
            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);

        } else if (ds == 6) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);

        } else if (ds == 7) {
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            btn11.setLayoutY(40);

            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);
            btn10.setLayoutY(820);

        } else if (ds == 8) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);
            btn11.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);
            btn12.setLayoutY(40);


        } else if (ds == 9) {
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            btn11.setLayoutY(40);
            btn13.setLayoutY(40);

            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);
            btn10.setLayoutY(820);
            btn12.setLayoutY(820);

        } else if (ds == 10) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);
            btn11.setLayoutY(820);
            btn13.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);
            btn12.setLayoutY(40);
            btn14.setLayoutY(40);


        } else if (ds == 11) {
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            btn11.setLayoutY(40);
            btn13.setLayoutY(40);
            btn15.setLayoutY(40);

            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);
            btn10.setLayoutY(820);
            btn12.setLayoutY(820);
            btn14.setLayoutY(820);


        } else if (ds == 12) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);
            btn11.setLayoutY(820);
            btn13.setLayoutY(820);
            btn15.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);
            btn12.setLayoutY(40);
            btn14.setLayoutY(40);
            btn16.setLayoutY(40);


        } else if (ds == 13) {
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            btn11.setLayoutY(40);
            btn13.setLayoutY(40);
            btn15.setLayoutY(40);
            btn17.setLayoutY(40);

            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);
            btn10.setLayoutY(820);
            btn12.setLayoutY(820);
            btn14.setLayoutY(820);
            btn16.setLayoutY(820);


        } else if (ds == 14) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);
            btn11.setLayoutY(820);
            btn13.setLayoutY(820);
            btn15.setLayoutY(820);
            btn17.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);
            btn12.setLayoutY(40);
            btn14.setLayoutY(40);
            btn16.setLayoutY(40);
            btn18.setLayoutY(40);



        } else if (ds == 15) {
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            btn11.setLayoutY(40);
            btn13.setLayoutY(40);
            btn15.setLayoutY(40);
            btn17.setLayoutY(40);
            btn19.setLayoutY(40);

            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);
            btn10.setLayoutY(820);
            btn12.setLayoutY(820);
            btn14.setLayoutY(820);
            btn16.setLayoutY(820);
            btn18.setLayoutY(820);

        } else if (ds == 16) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);
            btn11.setLayoutY(820);
            btn13.setLayoutY(820);
            btn15.setLayoutY(820);
            btn17.setLayoutY(820);
            btn19.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);
            btn12.setLayoutY(40);
            btn14.setLayoutY(40);
            btn16.setLayoutY(40);
            btn18.setLayoutY(40);
            btn20.setLayoutY(40);

        } else if (ds == 17) {
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            btn11.setLayoutY(40);
            btn13.setLayoutY(40);
            btn15.setLayoutY(40);
            btn17.setLayoutY(40);
            btn19.setLayoutY(40);
            btn21.setLayoutY(40);

            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);
            btn10.setLayoutY(820);
            btn12.setLayoutY(820);
            btn14.setLayoutY(820);
            btn16.setLayoutY(820);
            btn18.setLayoutY(820);
            btn20.setLayoutY(820);


        } else if (ds == 18) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);
            btn11.setLayoutY(820);
            btn13.setLayoutY(820);
            btn15.setLayoutY(820);
            btn17.setLayoutY(820);
            btn19.setLayoutY(820);
            btn21.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);
            btn12.setLayoutY(40);
            btn14.setLayoutY(40);
            btn16.setLayoutY(40);
            btn18.setLayoutY(40);
            btn20.setLayoutY(40);
            btn22.setLayoutY(40);

        } else if (ds == 19) {
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            btn11.setLayoutY(40);
            btn13.setLayoutY(40);
            btn15.setLayoutY(40);
            btn17.setLayoutY(40);
            btn19.setLayoutY(40);
            btn21.setLayoutY(40);
            btn23.setLayoutY(40);

            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);
            btn10.setLayoutY(820);
            btn12.setLayoutY(820);
            btn14.setLayoutY(820);
            btn16.setLayoutY(820);
            btn18.setLayoutY(820);
            btn20.setLayoutY(820);
            btn22.setLayoutY(820);


        } else if (ds == 20) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);
            btn11.setLayoutY(820);
            btn13.setLayoutY(820);
            btn15.setLayoutY(820);
            btn17.setLayoutY(820);
            btn19.setLayoutY(820);
            btn21.setLayoutY(820);
            btn23.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);
            btn12.setLayoutY(40);
            btn14.setLayoutY(40);
            btn16.setLayoutY(40);
            btn18.setLayoutY(40);
            btn20.setLayoutY(40);
            btn22.setLayoutY(40);
            btn24.setLayoutY(40);


        }
        if (ed == 1) {
            btn1.setLayoutY(40);
            btn3.setLayoutY(40);
            btn5.setLayoutY(40);
            btn7.setLayoutY(40);
            btn9.setLayoutY(40);
            btn11.setLayoutY(40);
            btn13.setLayoutY(40);
            btn15.setLayoutY(40);
            btn17.setLayoutY(40);
            btn19.setLayoutY(40);
            btn21.setLayoutY(40);
            btn23.setLayoutY(40);

            btn2.setLayoutY(820);
            btn4.setLayoutY(820);
            btn6.setLayoutY(820);
            btn8.setLayoutY(820);
            btn10.setLayoutY(820);
            btn12.setLayoutY(820);
            btn14.setLayoutY(820);
            btn16.setLayoutY(820);
            btn18.setLayoutY(820);
            btn20.setLayoutY(820);
            btn22.setLayoutY(820);
            btn24.setLayoutY(820);

            ed++;
        } else if (ed == 2) {
            btn1.setLayoutY(820);
            btn3.setLayoutY(820);
            btn5.setLayoutY(820);
            btn7.setLayoutY(820);
            btn9.setLayoutY(820);
            btn11.setLayoutY(820);
            btn13.setLayoutY(820);
            btn15.setLayoutY(820);
            btn17.setLayoutY(820);
            btn19.setLayoutY(820);
            btn21.setLayoutY(820);
            btn23.setLayoutY(820);

            btn2.setLayoutY(40);
            btn4.setLayoutY(40);
            btn6.setLayoutY(40);
            btn8.setLayoutY(40);
            btn10.setLayoutY(40);
            btn12.setLayoutY(40);
            btn14.setLayoutY(40);
            btn16.setLayoutY(40);
            btn18.setLayoutY(40);
            btn20.setLayoutY(40);
            btn22.setLayoutY(40);
            btn24.setLayoutY(40);

            ed = 1;

        }
        if (ds == 20) {
            ed++;
            ds++;
        }

        if (side == 0) {
            side++;

        } else {
            side = 0;
            if (ds != 21) {
                hh++;
            }
        }
    }

    public static void before_start_without_pomlcka() throws IOException {

        karta = new double[4];


        karta2 = new double[4];

        kartare = new double[18];

        karta2re = new double[18];

        cislare = new double[50];

        cislarandom = new double[24];

        int pocet = 0;

        Random generator = new Random();

        double cisla2[] = {0.3, 0.5, 1.3, 1.5, 2.3, 2.5, 3.3, 3.5, 4.3, 4.5, 5.3, 5.5, 6.3, 6.5, 7.3, 7.5, 8.3, 8.5, 9.3, 9.5, 10.3, 10.5, 11.3, 11.5};


        int coda = 0;
        int coda2 = -1;
        for (int o = 0; o < 24; o++) {

            int randomNumber2 = generator.nextInt(cisla2.length);//new random array
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
        for (int b = 0; b < 4; b++) {

            karta[b] = cislarandom[pocet];
            cislarandom[pocet] = cislarandom[pocet] * -1;
            pocet++;
        }


        for (int b = 0; b < 4; b++) {

            karta2[b] = cislarandom[pocet];
            cislarandom[pocet] = cislarandom[pocet] * -1;
            pocet++;
        }



        double temp = 0;
        //player 2 cards

        for (int i = 0; i < karta2.length; i++) {

            for (int j = 1; j < karta2.length - i; j++) {
                if (karta2[j - 1] < karta2[j]) {
                    temp = karta2[j - 1];
                    karta2[j - 1] = karta2[j];
                    karta2[j] = temp;

                }
            }
        }


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

        for (int i = 0; i < 4; i++) {
            btnk1[i] = i;
            btnk2[i] = i;
            poradnik1[i] = i;
            poradnik2[i] = i;
        }


    }

    public static void player1_colorpicking() {

        konecna_cerna = 0;
        konecna_bila = 0;
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

        for (int i = 0; i < karta.length; i++) {

            for (int j = 1; j < karta.length - i; j++) {
                if (Math.abs(karta[j - 1]) < Math.abs(karta[j])) {
                    temp2 = karta[j - 1];
                    karta[j - 1] = karta[j];
                    karta[j] = temp2;

                }
            }

        }
        for (int i = 0; i < karta2.length; i++) {

            for (int j = 0; j < karta2.length - 1; j++) {
                if (Math.abs(karta2[j]) > Math.abs(karta2[j + 1])) {
                    double v;
                    v = karta2[j];
                    karta2[j] = karta2[j + 1];
                    karta2[j + 1] = v;

                }
            }
        }

    }

    public static void player2_colorpicking() {

        konecna_cerna = 0;
        konecna_bila = 0;
        cerna = 0;
        bila = 0;


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
        dd = ran2;

    }

    public static void player2_position() {

        count2 = 0;


        if (Math.floor(karta[vy3]) == karta[vy3] - 0.5) {
            vy4 = vy4 + 0.5;
        } else {
            vy4 = vy4 + 0.3;
        }

        if (karta[vy3] == vy4) {

            karta[vy3] = karta[vy3] * -1;//correcting2
            count2++;
        } else {

        }
        for (int p = 0; p < karta.length; p++) {
            if (karta[p] > 0) {
                q++;
            } else {
            }
        }


        vy3 = -1;
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

        for (int i = 0; i < karta2.length; i++) {//bublesort

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
