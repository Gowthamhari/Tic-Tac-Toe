package com.example.android.tic_tac_toe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button A1, A2, A3, B1, B2, B3, C1, C2, C3, newGame;

    int turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A1 = (Button) findViewById(R.id.A1);
        A2 = (Button) findViewById(R.id.A2);
        A3 = (Button) findViewById(R.id.A3);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        C1 = (Button) findViewById(R.id.C1);
        C2 = (Button) findViewById(R.id.C2);
        C3 = (Button) findViewById(R.id.C3);
        newGame = (Button) findViewById(R.id.new_game);

        turn = 1;

        newGame.setOnClickListener(new View.OnClickListener() {
            boolean end = true;

            @Override
            public void onClick(View view) {

                if (end) {
                    turn = 1;
                    A1.setEnabled(true);
                    A1.setText("");
                    A1.setBackgroundColor(Color.parseColor("#0df9f5"));
                    A2.setEnabled(true);
                    A2.setText("");
                    A2.setBackgroundColor(Color.parseColor("#0df9f5"));
                    A3.setEnabled(true);
                    A3.setText("");
                    A3.setBackgroundColor(Color.parseColor("#0df9f5"));
                    B1.setEnabled(true);
                    B1.setText("");
                    B1.setBackgroundColor(Color.parseColor("#0df9f5"));
                    B2.setEnabled(true);
                    B2.setText("");
                    B2.setBackgroundColor(Color.parseColor("#0df9f5"));
                    B3.setEnabled(true);
                    B3.setText("");
                    B3.setBackgroundColor(Color.parseColor("#0df9f5"));
                    C1.setEnabled(true);
                    C1.setText("");
                    C1.setBackgroundColor(Color.parseColor("#0df9f5"));
                    C2.setEnabled(true);
                    C2.setText("");
                    C2.setBackgroundColor(Color.parseColor("#0df9f5"));
                    C3.setEnabled(true);
                    C3.setText("");
                    C3.setBackgroundColor(Color.parseColor("#0df9f5"));


                }

            }
        });

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (A1.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        A1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        A1.setText("O");
                    }
                }
                endGame();
            }
        });

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (A2.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        A2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        A2.setText("O");
                    }
                }
                endGame();
            }
        });

        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (A3.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        A3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        A3.setText("O");
                    }
                }
                endGame();
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (B1.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        B1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        B1.setText("O");
                    }
                }
                endGame();
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (B2.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        B2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        B2.setText("O");
                    }
                }
                endGame();
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (B3.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        B3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        B3.setText("O");
                    }
                }
                endGame();
            }
        });

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (C1.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        C1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        C1.setText("O");
                    }
                }
                endGame();
            }
        });

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (C2.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        C2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        C2.setText("O");
                    }
                }
                endGame();
            }
        });

        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (C3.getText().toString().equals("")) {

                    if (turn == 1) {
                        turn = 2;
                        C3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        C3.setText("O");
                    }
                }
                endGame();
            }

        });
    }


    public void endGame(){

        String a,b,c,d,e,f,g,h,i;
        boolean end = false;

        a = A1.getText().toString();
        b = A2.getText().toString();
        c = A3.getText().toString();

        d = B1.getText().toString();
        e = B2.getText().toString();
        f = B3.getText().toString();

        g = C1.getText().toString();
        h = C2.getText().toString();
        i = C3.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is X", Toast.LENGTH_LONG).show();
            A1.setBackgroundColor(Color.YELLOW);
            A2.setBackgroundColor(Color.YELLOW);
            A3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is X", Toast.LENGTH_LONG).show();
            B1.setBackgroundColor(Color.YELLOW);
            B2.setBackgroundColor(Color.YELLOW);
            B3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is X", Toast.LENGTH_LONG).show();
            C1.setBackgroundColor(Color.YELLOW);
            C2.setBackgroundColor(Color.YELLOW);
            C3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is X", Toast.LENGTH_LONG).show();
            A1.setBackgroundColor(Color.YELLOW);
            B1.setBackgroundColor(Color.YELLOW);
            C1.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (b.equals("X") && e.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is X", Toast.LENGTH_LONG).show();
            A2.setBackgroundColor(Color.YELLOW);
            B2.setBackgroundColor(Color.YELLOW);
            C2.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is X", Toast.LENGTH_LONG).show();
            A3.setBackgroundColor(Color.YELLOW);
            B3.setBackgroundColor(Color.YELLOW);
            C3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is X", Toast.LENGTH_LONG).show();
            A1.setBackgroundColor(Color.YELLOW);
            B2.setBackgroundColor(Color.YELLOW);
            C3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (c.equals("X") && e.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this,"Winner is X", Toast.LENGTH_LONG).show();
            A3.setBackgroundColor(Color.YELLOW);
            B2.setBackgroundColor(Color.YELLOW);
            C1.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        // conditional statements for "O"


        if (a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is O", Toast.LENGTH_LONG).show();
            A1.setBackgroundColor(Color.YELLOW);
            A2.setBackgroundColor(Color.YELLOW);
            A3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is O", Toast.LENGTH_LONG).show();
            B1.setBackgroundColor(Color.YELLOW);
            B2.setBackgroundColor(Color.YELLOW);
            B3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is O", Toast.LENGTH_LONG).show();
            C1.setBackgroundColor(Color.YELLOW);
            C2.setBackgroundColor(Color.YELLOW);
            C3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is O", Toast.LENGTH_LONG).show();
            A1.setBackgroundColor(Color.YELLOW);
            B1.setBackgroundColor(Color.YELLOW);
            C1.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (b.equals("O") && e.equals("O") && h.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is O", Toast.LENGTH_LONG).show();
            A2.setBackgroundColor(Color.YELLOW);
            B2.setBackgroundColor(Color.YELLOW);
            C2.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is O", Toast.LENGTH_LONG).show();
            A3.setBackgroundColor(Color.YELLOW);
            B3.setBackgroundColor(Color.YELLOW);
            C3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is O", Toast.LENGTH_LONG).show();
            A1.setBackgroundColor(Color.YELLOW);
            B2.setBackgroundColor(Color.YELLOW);
            C3.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (c.equals("O") && e.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this,"Winner is O", Toast.LENGTH_LONG).show();
            A3.setBackgroundColor(Color.YELLOW);
            B2.setBackgroundColor(Color.YELLOW);
            C1.setBackgroundColor(Color.YELLOW);
            end = true;
        }

        if (end) {
            A1.setEnabled(false);
            A2.setEnabled(false);
            A3.setEnabled(false);
            B1.setEnabled(false);
            B2.setEnabled(false);
            B3.setEnabled(false);
            C1.setEnabled(false);
            C2.setEnabled(false);
            C3.setEnabled(false);

        }    

    }


}
