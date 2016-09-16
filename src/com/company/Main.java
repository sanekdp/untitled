package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //region Данные для тестирования

        Question data[] =  {
            new Question() {
                {
                    question = "Примитивный тип пример:";
                    answers = new Answer[] {
                        new Answer(){{ number = 1; ask = "String"; result = false; note = "Примитивные типы данных: byte, short, int, long, char, float, douЫe и boolean."; }},
                        new Answer(){{ number = 2; ask = "int"; result = true; }},
                        new Answer(){{ number = 3; ask = "Object"; result = false; note = "Примитивные типы данных: byte, short, int, long, char, float, douЫe и boolean."; }},
                        new Answer(){{ number = 4; ask = "class"; result = false; note = "Примитивные типы данных: byte, short, int, long, char, float, douЫe и boolean."; }},
                    };
                }
            },
                new Question() {
                    {
                        question = "На сколько групп можно разделить примитивные типы ?";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "1"; result = false; note = "Примитивные типы можно разделить на 4 группы."; }},
                                new Answer(){{ number = 2; ask = "2"; result = false; note = "Примитивные типы можно разделить на 4 группы."; }},
                                new Answer(){{ number = 3; ask = "3"; result = false; note = "Примитивные типы можно разделить на 4 группы."; }},
                                new Answer(){{ number = 4; ask = "4"; result = true; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Какая группа не относится к примитивным типам ?";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "Целые числа"; result = false; note = "Примитивные типы можно разделить на :\nЦелые числа\nЧисла с плавающей точкой\nСимволы\nЛогические значения"; }},
                                new Answer(){{ number = 2; ask = "Классы"; result = true; }},
                                new Answer(){{ number = 3; ask = "Числа с плавающей точкой"; result = false; note = "Примитивные типы можно разделить на :\nЦелые числа\nЧисла с плавающей точкой\nСимволы\nЛогические значения"; }},
                                new Answer(){{ number = 4; ask = "Логические значения"; result = false; note = "Примитивные типы можно разделить на :\nЦелые числа\nЧисла с плавающей точкой\nСимволы\nЛогические значения"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Сколько типов в группе примитивных чисел \"Целые числа\" ?";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "1"; result = false; note = "В \"Целых чисдах\" определены четыре типа: byte, short, int и long"; }},
                                new Answer(){{ number = 2; ask = "2"; result = false; note = "В \"Целых чисдах\" определены четыре типа: byte, short, int и long"; }},
                                new Answer(){{ number = 3; ask = "3"; result = false; note = "В \"Целых чисдах\" определены четыре типа: byte, short, int и long"; }},
                                new Answer(){{ number = 4; ask = "4"; result = true; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Примитивный тип Символы пример :";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "\"Hello word\""; result = false; note = "Пример примитивного типа \"Символ\" --> 'c'"; }},
                                new Answer(){{ number = 2; ask = "\"1\""; result = false; note = "Пример примитивного типа \"Символ\" --> 'c'"; }},
                                new Answer(){{ number = 3; ask = "\"c\""; result = false; note = "Пример примитивного типа \"Символ\" --> 'c'"; }},
                                new Answer(){{ number = 4; ask = "'c'"; result = true; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Диапозон допустимых значений типа int";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "от -922337203654775808 до 9223372036854775807"; result = false; note = "Диапозон допустимых значений типа int от -2147483648 до 2147483647"; }},
                                new Answer(){{ number = 2; ask = "от -2147483648 до 2147483647"; result = true; }},
                                new Answer(){{ number = 3; ask = "от -32768 до 32767"; result = false; note = "Диапозон допустимых значений типа int от -2147483648 до 2147483647"; }},
                                new Answer(){{ number = 4; ask = "от - 128 до 127"; result = false; note = "Диапозон допустимых значений типа int от -2147483648 до 2147483647"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Не правильное значение типа char";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "'X'"; result = false; note = "Это правильное значение типа char"; }},
                                new Answer(){{ number = 2; ask = "88"; result = false; note = "Это правильное значение типа char это код символа в Unicode"; }},
                                new Answer(){{ number = 3; ask = "\\u141"; result = true; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Не правильное объявление переменной";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "int а, b, с;"; result = false; note = "Такое объявление правльное."; }},
                                new Answer(){{ number = 2; ask = "int d = 3, е, f = 5;"; result = false; note = "Такое объявление правльное."; }},
                                new Answer(){{ number = 3; ask = "int i = 1, char c = 12;"; result = true; }},
                                new Answer(){{ number = 4; ask = "int x = 3 * 12;"; result = false; note = "Такое объявление правльное."; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Правильно объявление массива";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "month_days[l] = 28;"; result = false; note = "Это присвоение значения элементу массива"; }},
                                new Answer(){{ number = 2; ask = "int month_days[];"; result = true; }},
                                new Answer(){{ number = 3; ask = "int month days[];"; result = false; note = "Переменная не может содержать пробел"; }},
                                new Answer(){{ number = 4; ask = "int month_days[] = new int[];"; result = false; note = "Не указан размер создаваемого массива"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "х = 42 ;\nу = х++;\n\ny = ???";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "41"; result = false; note = "Сначало \"y\" присваевается значение \"x\" потом \"x\" увеличивается на 1"; }},
                                new Answer(){{ number = 2; ask = "42"; result = true; }},
                                new Answer(){{ number = 3; ask = "43"; result = false; note = "Сначало \"y\" присваевается значение \"x\" потом \"x\" увеличивается на 1"; }},
                                new Answer(){{ number = 4; ask = "44"; result = false; note = "Сначало \"y\" присваевается значение \"x\" потом \"x\" увеличивается на 1"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Где не оператор цикла?";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "for"; result = false; note = "for это оператор цикла"; }},
                                new Answer(){{ number = 2; ask = "while"; result = false; note = "while это оператор цикла"; }},
                                new Answer(){{ number = 3; ask = "switch"; result = true; }},
                                new Answer(){{ number = 4; ask = "все выше циклы"; result = false; note = "оператор switch не является циклом"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "boolean b = false || (false == false); b = ???";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "true"; result = false; note = "b присвоится false все что после || анализироваться не будет"; }},
                                new Answer(){{ number = 2; ask = "false"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ощибка компиляции"; result = false; note = "Это допустимое объявление переменной в Java"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "boolean ratio = true == false ? true != false : false == true;\nratio = ???";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "true"; result = false; note = "true == false это ложь. Вычисляем значение что стоит после \":\" false == true равно false"; }},
                                new Answer(){{ number = 2; ask = "false"; result = true; }},
                                new Answer(){{ number = 3; ask = "Ощибка компиляции"; result = false; note = "Это допустимое объявление переменной в Java"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "int i = 0;\n" +
                                "        switch (i) {\n" +
                                "            case 0:\n" +
                                "                i+=2;\n" +
                                "            case 1:\n" +
                                "                i--;\n" +
                                "                break;\n" +
                                "            case 2:\n" +
                                "                i++;\n" +
                                "                break;\n" +
                                "        }\ni = ???";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "0"; result = false; note = "i = 0 вычисляем \"i+=2\" i = 2 \n" +
                                        "т.к. нет оператора break переходим к следующему case 1:\n"+"" +
                                        "вычисляем \"i--\" i = 1 \n" +
                                        "есть break выходим из switch"; }},
                                new Answer(){{ number = 2; ask = "1"; result = true; }},
                                new Answer(){{ number = 3; ask = "2"; result = false; note = "i = 0 вычисляем \"i+=2\" i = 2 \n" +
                                        "т.к. нет оператора break переходим к следующему case 1:\n"+"" +
                                        "вычисляем \"i--\" i = 1 \n" +
                                        "есть break выходим из switch"; }},
                                new Answer(){{ number = 4; ask = "3"; result = false; note = "i = 0 вычисляем \"i+=2\" i = 2 \n" +
                                        "т.к. нет оператора break переходим к следующему case 1:\n"+"" +
                                        "вычисляем \"i--\" i = 1 \n" +
                                        "есть break выходим из switch"; }},
                        };
                    }
                },
                new Question() {
                    {
                        question = "Где не допустимое объявление цикла";
                        answers = new Answer[] {
                                new Answer(){{ number = 1; ask = "while(true){}"; result = false; note = "Это правильное объявление"; }},
                                new Answer(){{ number = 2; ask = "for(int i = 0; i < 10; i++){}"; result = false;  note = "Это правильное объявление"; }},
                                new Answer(){{ number = 3; ask = "for(;;){}"; result = false;  note = "Это правильное объявление"; }},
                                new Answer(){{ number = 4; ask = "Все варианты объявления цикла верны"; result = true; }},
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