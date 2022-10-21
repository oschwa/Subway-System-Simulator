package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;


public class Main extends Application {
	
	static Stage stage;
	private static Image title = new Image("file:Subway Simulator.gif");;
	private static Image map = new Image("file:Tokyo_subway_metro_map.png");
	
	//Used for making titlecard
	private static String getResource(String url) {
		return Main.class.getResource(url).toExternalForm();
	}
	
	//Creates titlecard
	private static ImageView showTitle() {
		ImageView image = new ImageView();
		image.setImage(title);
		image.setX(145);
		image.setY(-150);
		
		return image;
	}
	
	private void menuJingle() {
		
	}
	private static Button[] makeStartingMenuButtons() {
		
		
		Button start = new Button("Start");
		Stage primaryStage = new Stage();
		//Action Event handled here for start button
		start.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				//scene switch occurs here.
				start.setOnAction(e -> getStage().setScene(makeMapMenu()));
			}
			
		});
		
		//Action Event handled here for exit button
		Button exit = new Button("Exit");
		
		exit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				//exit occurs here
				
			}
			
		});
		
		Button[] startingMenuButtons = new Button[] 
				{start, exit};
		
		return startingMenuButtons;
	}
	//Method for making first scene.
	private static AnchorPane makeStartingMenu() {
		//These are needed for determining button
		//position in the menu
		double buttonX = 350;
		double buttonY = 500;
		
		
		AnchorPane menuRoot = new AnchorPane();
		
		//Title image here
		ImageView image = new ImageView();
		image.setImage(title);
		
		//Buttons are managed here
		Button[] buttons = makeStartingMenuButtons();
		for (int i = 0; i < buttons.length; i++) {
			
			
			menuRoot.getChildren().add(buttons[i]);
			buttons[i].setLayoutX(buttonX);
			buttons[i].setLayoutY(buttonY);
			buttonY += 50;
		}
		
		menuRoot.setBackground(null);
		
	
		menuRoot.getChildren().add(showTitle());
		
		return menuRoot;
	}
	
	// Map and User Input Scene
	
	// Makes Map Appear
	private static ImageView showMap()
	{
		ImageView image = new ImageView();
		image.setImage(map);
		
		
				
		return image;
	}
	
	// Button Grid (Its Huge)
	private static Button[] buttonGrid()
	{
		// Buttons
		Button Km, Ik, Kg, Nn, Ks, O, A, U, Ku, U3, Hs, Kk, Tb, Ii, SOA, Ak, HB, Mo, Sy, Ns,
			S, T, To, S1, S2, Ss, Ich, Ji, Yo, Kd, K, Ni, Yy, Ao, Ot, Nh, Mi, Ka, Ki, Mn, Ts,
			Mj, Sh, E, Me, Os, Sk, Ro, Aj, Na, Ta, Kas, Da, Sb, YH, G, HG;
		
		// Kotake-mukaihara *
		Km = new Button();
		AnchorPane.setTopAnchor(Km, 121.0);
		AnchorPane.setRightAnchor(Km, 980.0);
		AnchorPane.setLeftAnchor(Km, 200.0);
		AnchorPane.setBottomAnchor(Km, 540.0);
		Km.setOpacity(0);
		
		// Ikebukuro
		Ik = new Button();
		AnchorPane.setTopAnchor(Ik, 185.0);
		AnchorPane.setRightAnchor(Ik, 900.0);
		AnchorPane.setLeftAnchor(Ik, 265.0);
		AnchorPane.setBottomAnchor(Ik, 465.0);
		Ik.setOpacity(0);
		
		// Komagome
		Kg = new Button();
		AnchorPane.setTopAnchor(Kg, 110.0);
		AnchorPane.setRightAnchor(Kg, 635.0);
		AnchorPane.setLeftAnchor(Kg, 545.0);
		AnchorPane.setBottomAnchor(Kg, 545.0);
		Kg.setOpacity(0);
		
		// Nishi-nippori
		Nn = new Button();
		AnchorPane.setTopAnchor(Nn, 77.0);
		AnchorPane.setRightAnchor(Nn, 535.0);
		AnchorPane.setLeftAnchor(Nn, 645.0);
		AnchorPane.setBottomAnchor(Nn, 575.0);
		Nn.setOpacity(0);
		
		// Kita-senju
		Ks = new Button();
		AnchorPane.setTopAnchor(Ks, 47.0);
		AnchorPane.setRightAnchor(Ks, 325.0);
		AnchorPane.setLeftAnchor(Ks, 850.0);
		AnchorPane.setBottomAnchor(Ks, 610.0);
		Ks.setOpacity(0);
		
		// Oshiage
		O = new Button();
		AnchorPane.setTopAnchor(O, 130.0);
		AnchorPane.setRightAnchor(O, 250.0);
		AnchorPane.setLeftAnchor(O, 925.0);
		AnchorPane.setBottomAnchor(O, 520.0);
		O.setOpacity(0);
		
		// Asakusa
		A = new Button();
		AnchorPane.setTopAnchor(A, 170.0);
		AnchorPane.setRightAnchor(A, 290.0);
		AnchorPane.setLeftAnchor(A, 865.0);
		AnchorPane.setBottomAnchor(A, 480.0);
		A.setOpacity(0);
		
		// Ueno
		U = new Button();
		AnchorPane.setTopAnchor(U, 170.0);
		AnchorPane.setRightAnchor(U, 429.0);
		AnchorPane.setLeftAnchor(U, 738.0);
		AnchorPane.setBottomAnchor(U, 485.0);
		U.setOpacity(0);
		
		// Kuramae
		Ku = new Button();
		AnchorPane.setTopAnchor(Ku, 210.0);
		AnchorPane.setRightAnchor(Ku, 345.0);
		AnchorPane.setLeftAnchor(Ku, 835.0);
		AnchorPane.setBottomAnchor(Ku, 440.0);
		Ku.setOpacity(0);
		
		// Ueno3
		U3 = new Button();
		AnchorPane.setTopAnchor(U3, 213.0);
		AnchorPane.setRightAnchor(U3, 429.0);
		AnchorPane.setLeftAnchor(U3, 738.0);
		AnchorPane.setBottomAnchor(U3, 440.0);
		U3.setOpacity(0);
		
		// Hongo-sanchome
		Hs = new Button();
		AnchorPane.setTopAnchor(Hs, 200.0);
		AnchorPane.setRightAnchor(Hs, 570.0);
		AnchorPane.setLeftAnchor(Hs, 610.0);
		AnchorPane.setBottomAnchor(Hs, 415.0);
		Hs.setOpacity(0);
		
		// Kasuga / Korakuen
		Kk = new Button();
		AnchorPane.setTopAnchor(Kk, 223.0);
		AnchorPane.setRightAnchor(Kk, 630.0);
		AnchorPane.setLeftAnchor(Kk, 538.0);
		AnchorPane.setBottomAnchor(Kk, 425.0);
		Kk.setOpacity(0);
		
		// Takadanobaba
		Tb = new Button();
		AnchorPane.setTopAnchor(Tb, 265.0);
		AnchorPane.setRightAnchor(Tb, 915.0);
		AnchorPane.setLeftAnchor(Tb, 265.0);
		AnchorPane.setBottomAnchor(Tb, 389.0);
		Tb.setOpacity(0);
		
		// Iidabashi
		Ii = new Button();
		AnchorPane.setTopAnchor(Ii, 297.0);
		AnchorPane.setRightAnchor(Ii, 660.0);
		AnchorPane.setLeftAnchor(Ii, 483.0);
		AnchorPane.setBottomAnchor(Ii, 355.0);
		Ii.setOpacity(0);
		
		// Shin/Oga/Awaj
		SOA = new Button();
		AnchorPane.setTopAnchor(SOA, 323.0);
		AnchorPane.setRightAnchor(SOA, 510.0);
		AnchorPane.setLeftAnchor(SOA, 640.0);
		AnchorPane.setBottomAnchor(SOA, 330.0);
		SOA.setOpacity(0);
		
		// Akihabara
		Ak = new Button();
		AnchorPane.setTopAnchor(Ak, 273.0);
		AnchorPane.setRightAnchor(Ak, 430.0);
		AnchorPane.setLeftAnchor(Ak, 750.0);
		AnchorPane.setBottomAnchor(Ak, 377.0);
		Ak.setOpacity(0);
		
		// Higashi/Bakuro
		HB = new Button();
		AnchorPane.setTopAnchor(HB, 323.0);
		AnchorPane.setRightAnchor(HB, 348.0);
		AnchorPane.setLeftAnchor(HB, 833.0);
		AnchorPane.setBottomAnchor(HB, 330.0);
		HB.setOpacity(0);
		
		// Morishita
		Mo = new Button();
		AnchorPane.setTopAnchor(Mo, 323.0);
		AnchorPane.setRightAnchor(Mo, 250.0);
		AnchorPane.setLeftAnchor(Mo, 930.0);
		AnchorPane.setBottomAnchor(Mo, 330.0);
		Mo.setOpacity(0);
		
		// Sumiyoshi
		Sy = new Button();
		AnchorPane.setTopAnchor(Sy, 323.0);
		AnchorPane.setRightAnchor(Sy, 200.0);
		AnchorPane.setLeftAnchor(Sy, 980.0);
		AnchorPane.setBottomAnchor(Sy, 330.0);
		Sy.setOpacity(0);
		
		// Nakano-sakaue
		Ns = new Button();
		AnchorPane.setTopAnchor(Ns, 297.0);
		AnchorPane.setRightAnchor(Ns, 660.0);
		AnchorPane.setLeftAnchor(Ns, 483.0);
		AnchorPane.setBottomAnchor(Ns, 355.0);
		Ns.setOpacity(0);
		
		// Sugamo
		S = new Button();
		AnchorPane.setTopAnchor(S, 110.0);
		AnchorPane.setRightAnchor(S, 735.0);
		AnchorPane.setLeftAnchor(S, 445.0);
		AnchorPane.setBottomAnchor(S, 545.0);
		S.setOpacity(0);
		
		
		// Tochomae
		T = new Button();
		AnchorPane.setTopAnchor(T, 387.0);
		AnchorPane.setRightAnchor(T, 765.0);
		AnchorPane.setLeftAnchor(T, 413.0);
		AnchorPane.setBottomAnchor(T, 265.0);
		T.setOpacity(0);
		
		// Tokyo
		To = new Button();
		AnchorPane.setTopAnchor(To, 467.0);
		AnchorPane.setRightAnchor(To, 435.0);
		AnchorPane.setLeftAnchor(To, 745.0);
		AnchorPane.setBottomAnchor(To, 190.0);
		To.setOpacity(0);
		
		// Shinjuku 1
		S1 = new Button();
		AnchorPane.setTopAnchor(S1, 367.0);
		AnchorPane.setRightAnchor(S1, 920.0);
		AnchorPane.setLeftAnchor(S1, 253.0);
		AnchorPane.setBottomAnchor(S1, 285.0);
		S1.setOpacity(0);
		
		// Shinjuku 2
		S2 = new Button();
		AnchorPane.setTopAnchor(S2, 414.0);
		AnchorPane.setRightAnchor(S2, 920.0);
		AnchorPane.setLeftAnchor(S2, 253.0);
		AnchorPane.setBottomAnchor(S2, 243.0);
		S2.setOpacity(0);
		
		// Shinjuku-sanchome
		Ss = new Button();
		AnchorPane.setTopAnchor(Ss, 404.0);
		AnchorPane.setRightAnchor(Ss, 770.0);
		AnchorPane.setLeftAnchor(Ss, 253.0);
		AnchorPane.setBottomAnchor(Ss, 283.0);
		Ss.setOpacity(10);
		
		// Ichigaya
		Ich = new Button();
		AnchorPane.setTopAnchor(Ich, 347.0);
		AnchorPane.setRightAnchor(Ich, 710.0);
		AnchorPane.setLeftAnchor(Ich, 473.0);
		AnchorPane.setBottomAnchor(Ich, 305.0);
		Ich.setOpacity(0);
		
		// Jimbocho
		Ji = new Button();
		AnchorPane.setTopAnchor(Ji, 327.0);
		AnchorPane.setRightAnchor(Ji, 590.0);
		AnchorPane.setLeftAnchor(Ji, 590.0);
		AnchorPane.setBottomAnchor(Ji, 325.0);
		Ji.setOpacity(0);
		
		// Yotsuya
		Yo = new Button();
		AnchorPane.setTopAnchor(Yo, 387.0);
		AnchorPane.setRightAnchor(Yo, 740.0);
		AnchorPane.setLeftAnchor(Yo, 433.0);
		AnchorPane.setBottomAnchor(Yo, 265.0);
		Yo.setOpacity(0);
		
		// Kudanshita
		Kd = new Button();
		AnchorPane.setTopAnchor(Kd, 385.0);
		AnchorPane.setRightAnchor(Kd, 605.0);
		AnchorPane.setLeftAnchor(Kd, 550.0);
		AnchorPane.setBottomAnchor(Kd, 275.0);
		Kd.setOpacity(0);
		
		// Kanda
		K = new Button();
		AnchorPane.setTopAnchor(K, 360.0);
		AnchorPane.setRightAnchor(K, 435.0);
		AnchorPane.setLeftAnchor(K, 743.0);
		AnchorPane.setBottomAnchor(K, 295.0);
		K.setOpacity(0);
		
		// Ningyocho
		Ni = new Button();
		AnchorPane.setTopAnchor(Ni, 360.0);
		AnchorPane.setRightAnchor(Ni, 350.0);
		AnchorPane.setLeftAnchor(Ni, 833.0);
		AnchorPane.setBottomAnchor(Ni, 295.0);
		Ni.setOpacity(0);
		
		// Yoyogi
		Yy = new Button();
		AnchorPane.setTopAnchor(Yy, 450.0);
		AnchorPane.setRightAnchor(Yy, 920.0);
		AnchorPane.setLeftAnchor(Yy, 263.0);
		AnchorPane.setBottomAnchor(Yy, 205.0);
		Yy.setOpacity(0);
		
		// Aoayama-itchome
		Ao = new Button();
		AnchorPane.setTopAnchor(Ao, 460.0);
		AnchorPane.setRightAnchor(Ao, 760.0);
		AnchorPane.setLeftAnchor(Ao, 423.0);
		AnchorPane.setBottomAnchor(Ao, 185.0);
		Ao.setOpacity(0);
		
		// Otemachi
		Ot = new Button();
		AnchorPane.setTopAnchor(Ot, 415.0);
		AnchorPane.setRightAnchor(Ot, 510.0);
		AnchorPane.setLeftAnchor(Ot, 633.0);
		AnchorPane.setBottomAnchor(Ot, 233.0);
		Ot.setOpacity(0);
		
		// Nihombashi
		Nh = new Button();
		AnchorPane.setTopAnchor(Nh, 420.0);
		AnchorPane.setRightAnchor(Nh, 350.0);
		AnchorPane.setLeftAnchor(Nh, 813.0);
		AnchorPane.setBottomAnchor(Nh, 230.0);
		Nh.setOpacity(0);
		
		// Mitsukoshimae
		Mi = new Button();
		AnchorPane.setTopAnchor(Mi, 387.0);
		AnchorPane.setRightAnchor(Mi, 400.0);
		AnchorPane.setLeftAnchor(Mi, 773.0);
		AnchorPane.setBottomAnchor(Mi, 265.0);
		Mi.setOpacity(0);
		
		// Kayabacho
		Ka = new Button();
		AnchorPane.setTopAnchor(Ka, 421.0);
		AnchorPane.setRightAnchor(Ka, 310.0);
		AnchorPane.setLeftAnchor(Ka, 863.0);
		AnchorPane.setBottomAnchor(Ka, 229.0);
		Ka.setOpacity(0);
		
		// Kiyosumi-shirahawa
		Ki = new Button();
		AnchorPane.setTopAnchor(Ki, 387.0);
		AnchorPane.setRightAnchor(Ki, 250.0);
		AnchorPane.setLeftAnchor(Ki, 923.0);
		AnchorPane.setBottomAnchor(Ki, 265.0);
		Ki.setOpacity(0);
		
		// Monzen-nakacho
		Mn = new Button();
		AnchorPane.setTopAnchor(Mn, 425.0);
		AnchorPane.setRightAnchor(Mn, 250.0);
		AnchorPane.setLeftAnchor(Mn, 923.0);
		AnchorPane.setBottomAnchor(Mn, 230.0);
		Mn.setOpacity(0);
		
		// Tsukishima
		Ts = new Button();
		AnchorPane.setTopAnchor(Ts, 505.0);
		AnchorPane.setRightAnchor(Ts, 250.0);
		AnchorPane.setLeftAnchor(Ts, 923.0);
		AnchorPane.setBottomAnchor(Ts, 150.0);
		Ts.setOpacity(0);
		
		// Meiji-jingumae
		Mj = new Button();
		AnchorPane.setTopAnchor(Mj, 487.0);
		AnchorPane.setRightAnchor(Mj, 910.0);
		AnchorPane.setLeftAnchor(Mj, 263.0);
		AnchorPane.setBottomAnchor(Mj, 165.0);
		Mj.setOpacity(0);
		
		// Shibuya
		Sh = new Button();
		AnchorPane.setTopAnchor(Sh, 527.0);
		AnchorPane.setRightAnchor(Sh, 915.0);
		AnchorPane.setLeftAnchor(Sh, 268.0);
		AnchorPane.setBottomAnchor(Sh, 125.0);
		Sh.setOpacity(0);
		
		// Ebisu
		E = new Button();
		AnchorPane.setTopAnchor(E, 587.0);
		AnchorPane.setRightAnchor(E, 915.0);
		AnchorPane.setLeftAnchor(E, 268.0);
		AnchorPane.setBottomAnchor(E, 65.0);
		E.setOpacity(0);
		
		// Meguro
		Me = new Button();
		AnchorPane.setTopAnchor(Me, 627.0);
		AnchorPane.setRightAnchor(Me, 915.0);
		AnchorPane.setLeftAnchor(Me, 268.0);
		AnchorPane.setBottomAnchor(Me, 20.0);
		Me.setOpacity(0);
		
		// Omote-sando
		Os = new Button();
		AnchorPane.setTopAnchor(Os, 527.0);
		AnchorPane.setRightAnchor(Os, 820.0);
		AnchorPane.setLeftAnchor(Os, 353.0);
		AnchorPane.setBottomAnchor(Os, 125.0);
		Os.setOpacity(0);
		
		// Shirokanedai
		Sk = new Button();
		AnchorPane.setTopAnchor(Sk, 627.0);
		AnchorPane.setRightAnchor(Sk, 850.0);
		AnchorPane.setLeftAnchor(Sk, 333.0);
		AnchorPane.setBottomAnchor(Sk, 20.0);
		Sk.setOpacity(0);
		
		// Roppongi
		Ro = new Button();
		AnchorPane.setTopAnchor(Ro, 587.0);
		AnchorPane.setRightAnchor(Ro, 745.0);
		AnchorPane.setLeftAnchor(Ro, 433.0);
		AnchorPane.setBottomAnchor(Ro, 65.0);
		Ro.setOpacity(0);
		
		// Azabu-juban
		Aj = new Button();
		AnchorPane.setTopAnchor(Aj, 615.0);
		AnchorPane.setRightAnchor(Aj, 710.0);
		AnchorPane.setLeftAnchor(Aj, 463.0);
		AnchorPane.setBottomAnchor(Aj, 30.0);
		Aj.setOpacity(0);
		
		// Nagatcho
		Na = new Button();
		AnchorPane.setTopAnchor(Na, 437.0);
		AnchorPane.setRightAnchor(Na, 672.0);
		AnchorPane.setLeftAnchor(Na, 516.0);
		AnchorPane.setBottomAnchor(Na, 165.0);
		Na.setOpacity(0);
		
		// Tameike-sanno
		Ta = new Button();
		AnchorPane.setTopAnchor(Ta, 527.0);
		AnchorPane.setRightAnchor(Ta, 612.0);
		AnchorPane.setLeftAnchor(Ta, 536.0);
		AnchorPane.setBottomAnchor(Ta, 120.0);
		Ta.setOpacity(0);
		
		// Kasumigaseki
		Kas = new Button();
		AnchorPane.setTopAnchor(Kas, 557.0);
		AnchorPane.setRightAnchor(Kas, 572.0);
		AnchorPane.setLeftAnchor(Kas, 596.0);
		AnchorPane.setBottomAnchor(Kas, 90.0);
		Kas.setOpacity(0);
		
		// Daimon
		Da = new Button();
		AnchorPane.setTopAnchor(Da, 647.0);
		AnchorPane.setRightAnchor(Da, 507.0);
		AnchorPane.setLeftAnchor(Da, 676.0);
		AnchorPane.setBottomAnchor(Da, 5.0);
		Da.setOpacity(0);
		
		// Shimbashi
		Sb = new Button();
		AnchorPane.setTopAnchor(Sb, 607.0);
		AnchorPane.setRightAnchor(Sb, 437.0);
		AnchorPane.setLeftAnchor(Sb, 746.0);
		AnchorPane.setBottomAnchor(Sb, 45.0);
		Sb.setOpacity(0);
		
		// Yurakucho / Hibiya
		YH = new Button();
		AnchorPane.setTopAnchor(YH, 507.0);
		AnchorPane.setRightAnchor(YH, 437.0);
		AnchorPane.setLeftAnchor(YH, 693.0);
		AnchorPane.setBottomAnchor(YH, 115.0);
		YH.setOpacity(0);
		
		// Ginza
		G = new Button();
		AnchorPane.setTopAnchor(G, 537.0);
		AnchorPane.setRightAnchor(G, 380.0);
		AnchorPane.setLeftAnchor(G, 783.0);
		AnchorPane.setBottomAnchor(G, 115.0);
		G.setOpacity(0);
		
		// Higashi-Ginza
		HG = new Button();
		AnchorPane.setTopAnchor(HG, 537.0);
		AnchorPane.setRightAnchor(HG, 350.0);
		AnchorPane.setLeftAnchor(HG, 833.0);
		AnchorPane.setBottomAnchor(HG, 115.0);
		HG.setOpacity(0);
		
		
		
		
		Button[] b = {Km, Ik, Kg, Nn, Ks, O, A, U, Ku, U3, Hs, Kk, Tb, Ii, SOA, Ak, HB, Mo, Sy, Ns,
				S, T, To, S1, S2, Ss, Ich, Ji, Yo, Kd, K, Ni, Yy, Ao, Ot, Nh, Mi, Ka, Ki, Mn, Ts,
				Mj, Sh, E, Me, Os, Sk, Ro, Aj, Na, Ta, Kas, Da, Sb, YH, G, HG};
		
		return b;
	}
	
	// Makes Map Appear with Button Grid
	private static Scene makeMapMenu()
	{
		AnchorPane mapContainer = new AnchorPane();
		
		mapContainer.getChildren().add(showMap());
		
		Button[] b = buttonGrid();
		for(int i = 0; i < b.length; i++)
		{
			mapContainer.getChildren().add(b[i]);
		}
				
		Scene mapScene = new Scene(mapContainer,1200,796);
		mapScene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		
		return mapScene;
	}
	
	// Set Stage
	private static void setStage(Stage s)
	{
		 stage = s;
	}
	
	// Get Stage
	private static Stage getStage()
	{
		return stage;
	}
	
	@Override
	
	public void start(Stage primaryStage) {
		try {
			
			AnchorPane menuRoot = makeStartingMenu();
			
			
			
			
			
			Scene scene = new Scene(menuRoot,800,800);
			scene.setFill(Color.WHITE);
			
			menuJingle();
			setStage(primaryStage);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Subway Simulator");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
