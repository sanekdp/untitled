package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        //region Данные для тестирования

        Question data[] =  {
            new Question() {
                {
                    question = "Вопрос1";
                    answers = new Answer[] {
                        new Answer(){{ number = 1; ask = "Ответ1"; result = false; note = "Патаму что ответ2"; }},
                        new Answer(){{ number = 2; ask = "Ответ2"; result = true; }},
                        new Answer(){{ number = 3; ask = "Ответ3"; result = false; note = "Патаму что ответ2"; }},
                        new Answer(){{ number = 4; ask = "Ответ4"; result = false; note = "Патаму что ответ2"; }},
                    };
                }
            },
                new Question() {
                    {
                        question = "Вопрос2";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос3";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос4";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос5";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос6";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос7";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос8";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос9";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос10";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос11";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос12";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос13";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос14";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Вопрос15";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Ответ5"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 2; ask = "Ответ6"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ответ7"; result = false; note = "Патаму что ответ2"; }},
                                new Answer(){{ number = 4; ask = "Ответ8"; result = false; note = "Патаму что ответ2"; }},
                        };
                    }
                }
        };

        //endregion


        Scanner scanner = new Scanner(System.in);
        int countRightAnswer = 0;

        for(Question q : data)
        {
            System.out.println(q.question);
            Answer[] answers =  q.answers;
            for (Answer a : answers)
                System.out.println(a.number + ". " + a.ask);
            System.out.println("Ваш ответ: ");
            boolean checkInput;
            int result = 0;
            do{
                try {
                    result = Integer.parseInt(scanner.nextLine());
                    checkInput = result > 0 && result <= answers.length;
                    if (!checkInput)
                        System.out.println("Выбирите один из предложеных вариантов: ");
                } catch (NumberFormatException e) {
                    System.out.println("Выбирите один из предложеных вариантов: ");
                    checkInput = false;
                }
            }
            while (!checkInput);
            if (answers[result - 1].result) {
                System.out.println("Правильно!!!\n");
                countRightAnswer++;
            }
            else
                System.out.println("Не правильон --> " + answers[result - 1].note + "\n");
        }

        System.out.println("Правильных ответов " + countRightAnswer + " из " + data.length + " (" + (float)countRightAnswer*100/data.length + "%)");
    }

    static class Question {
        public String question;
        public Answer[] answers;
    }

    static class Answer {
        public int number;
        public String ask;
        public boolean result;
        public String note;
    }
}