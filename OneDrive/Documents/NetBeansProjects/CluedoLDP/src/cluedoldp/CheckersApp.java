/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluedoldp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author senho
 */
public class CheckersApp extends Application {
    public static final int TILE_SIZE = 100;
    public static final int WIDTH = 11;
    public static final int HEIGHT = 13;

    private Tile[][] board = new Tile[WIDTH][HEIGHT];

    private Group tileGroup = new Group();
    private Group pieceGroup = new Group();

    private Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
        root.getChildren().addAll(tileGroup, pieceGroup);

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                Tile tile = new Tile();
                board[x][y] = tile;

                

                Piece piece = null;
Piece piece1 = null;
                if (y < 1 && x < 1) {
                    piece = makePiece(PieceType.RED, 5, 5);
                   
                    
                }
           if (y > 1 && x >1 ) {
                    piece = makePiece(PieceType.WHITE, 6, 5);
                }
                

                if (piece != null) {
                        tile.setPiece(piece);
                    pieceGroup.getChildren().add(piece);
                }
            }
        }

        return root;
    }

    

    private int toBoard(double pixel) {
        return (int)(pixel + TILE_SIZE / 2) / TILE_SIZE;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("Cluedo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Piece makePiece(PieceType type, int x, int y) {
        Piece piece = new Piece(type, x, y);

        piece.setOnMouseReleased(e -> {
         

           

        

            
        });

        return piece;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
