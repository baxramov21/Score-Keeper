package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewBudgetOfBarca;
    private TextView textViewPlayersBarca;
    private TextView textViewSalariesBarca;
    private TextView textViewTimeBarca;

    private TextView textViewBudgetOfReal;
    private TextView textViewPlayersReal;
    private TextView textViewSalariesReal;
    private TextView textViewTimeReal;

    private int budgetReal = 1000;
    private int playersReal = 32;
    private int salariesReal = 640;
    private int timeReal = 12;

    private int budgetBarca = 1000;
    private int playersBarca = 32;
    private int salariesBarca = 640;
    private int timeBarca = 12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewBudgetOfBarca = findViewById(R.id.textViewBudgetBarca);
        textViewPlayersBarca = findViewById(R.id.textViewPlayersBarca);
        textViewSalariesBarca = findViewById(R.id.textViewamountOfSalaryBarca);
        textViewTimeBarca = findViewById(R.id.textViewMonthsBarca);

        textViewBudgetOfReal = findViewById(R.id.textViewBudgetRealM);
        textViewPlayersReal = findViewById(R.id.textViewPlayersRealM);
        textViewSalariesReal = findViewById(R.id.textViewamountOfSalaryRealM);
        textViewTimeReal = findViewById(R.id.textViewMonthsRealM);
    }

    public void buyRealM(View view) {
        buyNewPlayer(2);
        checkNumberOfPlayers(2);
        if (timeReal == 1) {
            Toast.makeText(this, "Real Madrid you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeReal == 0) {
            checkTimeAndPaySalaries(2);
        }

    }

    public void sellRealM(View view) {
        sellPlayer(2);
        checkNumberOfPlayers(2);
        if (timeReal == 1) {
            Toast.makeText(this, "Real Madrid you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeReal == 0) {
            checkTimeAndPaySalaries(2);
        }

    }

    public void loanInRealM(View view) {
        loanIn(2);
        checkNumberOfPlayers(2);
        if (timeReal == 1) {
            Toast.makeText(this, "Real Madrid you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeReal == 0) {
            checkTimeAndPaySalaries(2);
        }

    }

    public void loanOutRealM(View view) {
        leasePlayer(2);
        checkNumberOfPlayers(2);
        if (timeReal == 1) {
            Toast.makeText(this, "Real Madrid you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeReal == 0) {
            checkTimeAndPaySalaries(2);
        }

    }

    public void salariesRealM(View view) {
        paySalaries(2);
        checkNumberOfPlayers(2);
        if (timeReal == 1) {
            Toast.makeText(this, "Real Madrid you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeReal == 0) {
            checkTimeAndPaySalaries(2);
        }

    }


    public void buyBarca(View view) {
        buyNewPlayer(1);
        checkNumberOfPlayers(1);
        if (timeBarca == 1) {
            Toast.makeText(this, "Barcelona you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeBarca == 0) {
            checkTimeAndPaySalaries(1);
        }
    }

    public void sellBarca(View view) {
        sellPlayer(1);
        checkNumberOfPlayers(1);
        if (timeBarca == 1) {
            Toast.makeText(this, "Barcelona you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeBarca == 0) {
            checkTimeAndPaySalaries(1);
        }
    }

    public void loanInBarca(View view) {
        loanIn(1);
        if (timeBarca == 1) {
            Toast.makeText(this, "Barcelona you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeBarca == 0) {
            checkTimeAndPaySalaries(1);
        }
    }

    public void loanOutBarca(View view) {
        leasePlayer(1);
        checkNumberOfPlayers(1);
        if (timeBarca == 1) {
            Toast.makeText(this, "Real Madrid you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeBarca == 0) {
            checkTimeAndPaySalaries(1);
        }
    }

    public void salariesBarca(View view) {
        paySalaries(1);
        if (timeBarca == 1) {
            Toast.makeText(this, "Barcelona you have to pay salaries right now or you will lose the game", Toast.LENGTH_SHORT).show();

        } else if (timeBarca == 0) {
            checkTimeAndPaySalaries(1);
        }
    }

    public void reset(View view) {
        budgetReal = 1000;
        salariesReal = 640;
        playersReal = 32;
        timeReal = 12;

        budgetBarca = 1000;
        salariesBarca = 640;
        playersBarca = 32;
        timeBarca = 12;

        textViewBudgetOfReal.setText(getString(R.string.thousand));
        textViewSalariesReal.setText(getString(R.string._640));
        textViewPlayersReal.setText(getString(R.string._32));
        textViewTimeReal.setText(getString(R.string._12));

        textViewBudgetOfBarca.setText(getString(R.string.thousand));
        textViewSalariesBarca.setText(getString(R.string._640));
        textViewPlayersBarca.setText(getString(R.string._32));
        textViewTimeBarca.setText(getString(R.string._12));

        Toast.makeText(this, "Game has benn restarted", Toast.LENGTH_SHORT).show();
    }


    public void display(TextView textView, int id) {
        switch (id) {
            case 1:
                textView.setText(String.valueOf("$" + budgetBarca));
                break;

            case 2:
                textView.setText(String.valueOf(playersBarca));
                break;

            case 3:
                textView.setText(String.valueOf("$" + salariesBarca));
                break;

            case 4:
                textView.setText(String.valueOf(timeBarca));
                break;

            case 5:
                textView.setText(String.valueOf("$" + budgetReal));
                break;

            case 6:
                textView.setText(String.valueOf(playersReal));
                break;

            case 7:
                textView.setText(String.valueOf("$" + salariesReal));
                break;

            case 8:
                textView.setText(String.valueOf(timeReal));
                break;
        }
    }

    public void buyNewPlayer(int id) {
        if (id == 1) {
            budgetBarca = budgetBarca - 70;
            playersBarca = playersBarca + 1;
            salariesBarca = salariesBarca + 25;
            timeBarca = timeBarca - 1;

            display(textViewBudgetOfBarca, 1);
            display(textViewPlayersBarca, 2);
            display(textViewSalariesBarca, 3);
            display(textViewTimeBarca, 4);

        } else if (id == 2) {
            budgetReal = budgetReal - 70;
            playersReal = playersReal + 1;
            salariesReal = salariesReal + 25;
            timeReal = timeReal - 1;

            display(textViewBudgetOfReal, 5);
            display(textViewPlayersReal, 6);
            display(textViewSalariesReal, 7);
            display(textViewTimeReal, 8);
        }
    }

    public void sellPlayer(int id) {
        if (id == 1) {
            budgetBarca = budgetBarca + 55;
            playersBarca = playersBarca - 1;
            salariesBarca = salariesBarca - 20;
            timeBarca = timeBarca - 1;

            display(textViewBudgetOfBarca, 1);
            display(textViewPlayersBarca, 2);
            display(textViewSalariesBarca, 3);
            display(textViewTimeBarca, 4);

        } else if (id == 2) {
            budgetReal = budgetReal + 55;
            playersReal = playersReal - 1;
            salariesReal = salariesReal - 20;
            timeReal = timeReal - 1;

            display(textViewBudgetOfReal, 5);
            display(textViewPlayersReal, 6);
            display(textViewSalariesReal, 7);
            display(textViewTimeReal, 8);
        }
    }

    public void loanIn(int id) {
        if (id == 1) {
            budgetBarca = budgetBarca - 13;
            playersBarca = playersBarca + 1;
            salariesBarca = salariesBarca + 22;
            timeBarca = timeBarca - 1;

            display(textViewBudgetOfBarca, 1);
            display(textViewPlayersBarca, 2);
            display(textViewSalariesBarca, 3);
            display(textViewTimeBarca, 4);

        } else if (id == 2) {
            budgetReal = budgetReal - 13;
            playersReal = playersReal + 1;
            salariesReal = salariesReal + 22;
            timeReal = timeReal - 1;

            display(textViewBudgetOfReal, 5);
            display(textViewPlayersReal, 6);
            display(textViewSalariesReal, 7);
            display(textViewTimeReal, 8);
        }
    }

    public void leasePlayer(int id) {
        if (id == 1) {
            budgetBarca = budgetBarca + 8;
            playersBarca = playersBarca - 1;
            salariesBarca = salariesBarca - 20;
            timeBarca = timeBarca - 1;

            display(textViewBudgetOfBarca, 1);
            display(textViewPlayersBarca, 2);
            display(textViewSalariesBarca, 3);
            display(textViewTimeBarca, 4);
        } else if (id == 2) {
            budgetReal = budgetReal + 8;
            playersReal = playersReal - 1;
            salariesReal = salariesReal - 20;
            timeReal = timeReal - 1;

            display(textViewBudgetOfReal, 5);
            display(textViewPlayersReal, 6);
            display(textViewSalariesReal, 7);
            display(textViewTimeReal, 8);
        }
    }

    public void paySalaries(int id) {
        if (id == 1) {
            if (budgetBarca >= salariesBarca) {
                budgetBarca = budgetBarca - salariesBarca;
                timeBarca = 12;

                display(textViewBudgetOfBarca, 1);
                display(textViewPlayersBarca, 2);
                display(textViewSalariesBarca, 3);
                display(textViewTimeBarca, 4);


            } else if (budgetBarca < salariesBarca) {
                Toast.makeText(this, "You don't have enough money to pay salaries", Toast.LENGTH_SHORT).show();
            }
        } else if (id == 2) {
            if (budgetReal >= salariesReal) {
                budgetReal = budgetReal - salariesReal;
                timeReal = 12;

                display(textViewBudgetOfReal, 5);
                display(textViewPlayersReal, 6);
                display(textViewSalariesReal, 7);
                display(textViewTimeReal, 8);

            } else if (budgetReal < salariesReal) {
                Toast.makeText(this, "You don't have enough money to pay salaries", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void checkTimeAndPaySalaries(int id) {
        if (id == 1) {
            if (timeBarca == 0 && budgetBarca >= salariesBarca) {

                budgetBarca = budgetBarca - salariesBarca;
                display(textViewBudgetOfBarca,1);
                timeBarca = 12;
                textViewTimeBarca.setText(getString(R.string._12));

                Toast.makeText(this, "Barcelona's salaries were automatically paid", Toast.LENGTH_SHORT).show();



            } else if (timeBarca == 0 && budgetBarca < salariesBarca) {
                textViewBudgetOfBarca.setText(getString(R.string.thousand));
                textViewSalariesBarca.setText(getString(R.string._640));
                textViewPlayersBarca.setText(getString(R.string._32));
                textViewTimeBarca.setText(getString(R.string._12));

                textViewBudgetOfReal.setText(getString(R.string.thousand));
                textViewSalariesReal.setText(getString(R.string._640));
                textViewPlayersReal.setText(getString(R.string._32));
                textViewTimeReal.setText(getString(R.string._12));

                budgetBarca = 1000;
                salariesBarca = 640;
                playersBarca = 32;
                timeBarca = 12;

                budgetReal = 1000;
                salariesReal = 640;
                playersReal = 32;
                timeReal = 12;

                Toast.makeText(this, "Real Madrid win because Barcelona couldn't pay salaries", Toast.LENGTH_SHORT).show();

            }

        } else if (id == 2) {
            if (timeReal == 0 && budgetReal >= salariesReal) {

                budgetReal = budgetReal - salariesReal;
                display(textViewBudgetOfReal,5);
                timeReal = 12;
                textViewTimeReal.setText(getString(R.string._12));

                Toast.makeText(this, "Real Madrid's salaries were automatically paid", Toast.LENGTH_SHORT).show();


            } else if (timeReal == 0 && budgetReal < salariesReal) {

                budgetReal = 1000;
                salariesReal = 640;
                playersReal = 32;
                timeReal = 12;

                budgetBarca = 1000;
                salariesBarca = 640;
                playersBarca = 32;
                timeBarca = 12;

                textViewBudgetOfReal.setText(getString(R.string.thousand));
                textViewSalariesReal.setText(getString(R.string._640));
                textViewPlayersReal.setText(getString(R.string._32));
                textViewTimeReal.setText(getString(R.string._12));

                textViewBudgetOfBarca.setText(getString(R.string.thousand));
                textViewSalariesBarca.setText(getString(R.string._640));
                textViewPlayersBarca.setText(getString(R.string._32));
                textViewTimeBarca.setText(getString(R.string._12));

                Toast.makeText(this, " Barcelona win because Real Madrid couldn't pay salaries", Toast.LENGTH_SHORT).show();

            }
        }
    }

    public void checkNumberOfPlayers(int id) {
        if (id == 1) {
            if (playersBarca == 16) {
                Toast.makeText(this, "You can not have less than 16 players or you will lose the game. To continue playing we will recommend you not to sell or lease any player", Toast.LENGTH_SHORT).show();
            } else if (playersBarca < 16) {
                Toast.makeText(this, "Barcelona win because Real Madrid have not enough players to continue game", Toast.LENGTH_SHORT).show();
                budgetReal = 1000;
                salariesReal = 640;
                playersReal = 32;
                timeReal = 12;

                budgetBarca = 1000;
                salariesBarca = 640;
                playersBarca = 32;
                timeBarca = 12;

                textViewBudgetOfReal.setText(getString(R.string.thousand));
                textViewSalariesReal.setText(getString(R.string._640));
                textViewPlayersReal.setText(getString(R.string._32));
                textViewTimeReal.setText(getString(R.string._12));

                textViewBudgetOfBarca.setText(getString(R.string.thousand));
                textViewSalariesBarca.setText(getString(R.string._640));
                textViewPlayersBarca.setText(getString(R.string._32));
                textViewTimeBarca.setText(getString(R.string._12));
            }
        } else if (id == 2) {
            if (playersReal == 16) {
                Toast.makeText(this, "You can not have less than 16 players or you will lose the game. To continue playing we will recommend you not to sell or lease any player", Toast.LENGTH_SHORT).show();
            } else if (playersReal < 16) {
                Toast.makeText(this, " Real Madrid win because Barcelona have not enough players to continue game", Toast.LENGTH_SHORT).show();
                budgetReal = 1000;
                salariesReal = 640;
                playersReal = 32;
                timeReal = 12;

                budgetBarca = 1000;
                salariesBarca = 640;
                playersBarca = 32;
                timeBarca = 12;

                textViewBudgetOfReal.setText(getString(R.string.thousand));
                textViewSalariesReal.setText(getString(R.string._640));
                textViewPlayersReal.setText(getString(R.string._32));
                textViewTimeReal.setText(getString(R.string._12));

                textViewBudgetOfBarca.setText(getString(R.string.thousand));
                textViewSalariesBarca.setText(getString(R.string._640));
                textViewPlayersBarca.setText(getString(R.string._32));
                textViewTimeBarca.setText(getString(R.string._12));
            }
        }
    }
}