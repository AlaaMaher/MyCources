package com.jetpackcompose.mycourses

import androidx.annotation.DrawableRes

data class Courses(
    val rating: Float,
    val title: String,
    @DrawableRes val thumbnail: Int,
    val body: String
)

val course1 = Courses(
    4.5f,
    "The Complete Android 13 Developer Course",
    R.drawable.course1,
    "Become a Python Programmer and learn one of employer's most requested skills of 2023!\n" +
            "\n" +
            "This is the most comprehensive, yet straight-forward, course for the Python programming language on Udemy! Whether you have never programmed before, already know basic syntax, or want to learn about the advanced features of Python, this course is for you! In this course we will teach you Python 3.\n" +
            "\n" +
            "With over 100 lectures and more than 21 hours of video this comprehensive course leaves no stone unturned! This course includes quizzes, tests, coding exercises and homework assignments as well as 3 major projects to create a Python project portfolio!\n" +
            "\n" +
            "Learn how to use Python for real-world tasks, such as working with PDF Files, sending emails, reading Excel files, Scraping websites for informations, working with image files, and much more!\n" +
            "\n" +
            "This course will teach you Python in a practical manner, with every lecture comes a full coding screencast and a corresponding code notebook! Learn in whatever manner is best for you!\n" +
            "\n" +
            "We will start by helping you get Python installed on your computer, regardless of your operating system, whether its Linux, MacOS, or Windows, we've got you covered.\n" +
            "\n" +
            "We cover a wide variety of topics, including:\n" +
            "\n" +
            "    Command Line Basics\n" +
            "\n" +
            "    Installing Python\n" +
            "\n" +
            "    Running Python Code\n" +
            "\n" +
            "    Strings\n" +
            "\n" +
            "    Lists \n" +
            "\n" +
            "    Dictionaries\n" +
            "\n" +
            "    Tuples\n" +
            "\n" +
            "    Sets\n" +
            "\n" +
            "    Number Data Types\n" +
            "\n" +
            "    Print Formatting\n" +
            "\n" +
            "    Functions\n" +
            "\n" +
            "    Scope\n" +
            "\n" +
            "    args/kwargs\n" +
            "\n" +
            "    Built-in Functions\n" +
            "\n" +
            "    Debugging and Error Handling\n" +
            "\n" +
            "    Modules\n" +
            "\n" +
            "    External Modules\n" +
            "\n" +
            "    Object Oriented Programming\n" +
            "\n" +
            "    Inheritance\n" +
            "\n" +
            "    Polymorphism\n" +
            "\n" +
            "    File I/O\n" +
            "\n" +
            "    Advanced Methods\n" +
            "\n" +
            "    Unit Tests\n" +
            "\n" +
            "    and much more!\n" +
            "\n" +
            "You will get lifetime access to over 100 lectures plus corresponding Notebooks for the lectures!\n" +
            "\n" +
            "This course comes with a 30 day money back guarantee! If you are not satisfied in any way, you'll get your money back. Plus you will keep access to the Notebooks as a thank you for trying out the course!\n" +
            "\n" +
            "So what are you waiting for? Learn Python in a way that will advance your career and increase your knowledge, all in a fun and practical way!\n" +
            "Who this course is for:\n" +
            "\n" +
            "    Beginners who have never programmed before.\n" +
            "    Programmers switching languages to Python.\n" +
            "    Intermediate Python programmers who want to level up their skills!"
)


val course2 = Courses(
    4.5f,
    "The Complete Android 13 Developer Course",
    R.drawable.course2,
    "Become a Python Programmer and learn one of employer's most requested skills of 2023!\n" +
            "\n" +
            "This is the most comprehensive, yet straight-forward, course for the Python programming language on Udemy! Whether you have never programmed before, already know basic syntax, or want to learn about the advanced features of Python, this course is for you! In this course we will teach you Python 3.\n" +
            "\n" +
            "With over 100 lectures and more than 21 hours of video this comprehensive course leaves no stone unturned! This course includes quizzes, tests, coding exercises and homework assignments as well as 3 major projects to create a Python project portfolio!\n" +
            "\n" +
            "Learn how to use Python for real-world tasks, such as working with PDF Files, sending emails, reading Excel files, Scraping websites for informations, working with image files, and much more!\n" +
            "\n" +
            "This course will teach you Python in a practical manner, with every lecture comes a full coding screencast and a corresponding code notebook! Learn in whatever manner is best for you!\n" +
            "\n" +
            "We will start by helping you get Python installed on your computer, regardless of your operating system, whether its Linux, MacOS, or Windows, we've got you covered.\n" +
            "\n" +
            "We cover a wide variety of topics, including:\n" +
            "\n" +
            "    Command Line Basics\n" +
            "\n" +
            "    Installing Python\n" +
            "\n" +
            "    Running Python Code\n" +
            "\n" +
            "    Strings\n" +
            "\n" +
            "    Lists \n" +
            "\n" +
            "    Dictionaries\n" +
            "\n" +
            "    Tuples\n" +
            "\n" +
            "    Sets\n" +
            "\n" +
            "    Number Data Types\n" +
            "\n" +
            "    Print Formatting\n" +
            "\n" +
            "    Functions\n" +
            "\n" +
            "    Scope\n" +
            "\n" +
            "    args/kwargs\n" +
            "\n" +
            "    Built-in Functions\n" +
            "\n" +
            "    Debugging and Error Handling\n" +
            "\n" +
            "    Modules\n" +
            "\n" +
            "    External Modules\n" +
            "\n" +
            "    Object Oriented Programming\n" +
            "\n" +
            "    Inheritance\n" +
            "\n" +
            "    Polymorphism\n" +
            "\n" +
            "    File I/O\n" +
            "\n" +
            "    Advanced Methods\n" +
            "\n" +
            "    Unit Tests\n" +
            "\n" +
            "    and much more!\n" +
            "\n" +
            "You will get lifetime access to over 100 lectures plus corresponding Notebooks for the lectures!\n" +
            "\n" +
            "This course comes with a 30 day money back guarantee! If you are not satisfied in any way, you'll get your money back. Plus you will keep access to the Notebooks as a thank you for trying out the course!\n" +
            "\n" +
            "So what are you waiting for? Learn Python in a way that will advance your career and increase your knowledge, all in a fun and practical way!\n" +
            "Who this course is for:\n" +
            "\n" +
            "    Beginners who have never programmed before.\n" +
            "    Programmers switching languages to Python.\n" +
            "    Intermediate Python programmers who want to level up their skills!"
)

val course3 = Courses(
    4.5f,
    "The Complete Android 13 Developer Course",
    R.drawable.course3,
    "Become a Python Programmer and learn one of employer's most requested skills of 2023!\n" +
            "\n" +
            "This is the most comprehensive, yet straight-forward, course for the Python programming language on Udemy! Whether you have never programmed before, already know basic syntax, or want to learn about the advanced features of Python, this course is for you! In this course we will teach you Python 3.\n" +
            "\n" +
            "With over 100 lectures and more than 21 hours of video this comprehensive course leaves no stone unturned! This course includes quizzes, tests, coding exercises and homework assignments as well as 3 major projects to create a Python project portfolio!\n" +
            "\n" +
            "Learn how to use Python for real-world tasks, such as working with PDF Files, sending emails, reading Excel files, Scraping websites for informations, working with image files, and much more!\n" +
            "\n" +
            "This course will teach you Python in a practical manner, with every lecture comes a full coding screencast and a corresponding code notebook! Learn in whatever manner is best for you!\n" +
            "\n" +
            "We will start by helping you get Python installed on your computer, regardless of your operating system, whether its Linux, MacOS, or Windows, we've got you covered.\n" +
            "\n" +
            "We cover a wide variety of topics, including:\n" +
            "\n" +
            "    Command Line Basics\n" +
            "\n" +
            "    Installing Python\n" +
            "\n" +
            "    Running Python Code\n" +
            "\n" +
            "    Strings\n" +
            "\n" +
            "    Lists \n" +
            "\n" +
            "    Dictionaries\n" +
            "\n" +
            "    Tuples\n" +
            "\n" +
            "    Sets\n" +
            "\n" +
            "    Number Data Types\n" +
            "\n" +
            "    Print Formatting\n" +
            "\n" +
            "    Functions\n" +
            "\n" +
            "    Scope\n" +
            "\n" +
            "    args/kwargs\n" +
            "\n" +
            "    Built-in Functions\n" +
            "\n" +
            "    Debugging and Error Handling\n" +
            "\n" +
            "    Modules\n" +
            "\n" +
            "    External Modules\n" +
            "\n" +
            "    Object Oriented Programming\n" +
            "\n" +
            "    Inheritance\n" +
            "\n" +
            "    Polymorphism\n" +
            "\n" +
            "    File I/O\n" +
            "\n" +
            "    Advanced Methods\n" +
            "\n" +
            "    Unit Tests\n" +
            "\n" +
            "    and much more!\n" +
            "\n" +
            "You will get lifetime access to over 100 lectures plus corresponding Notebooks for the lectures!\n" +
            "\n" +
            "This course comes with a 30 day money back guarantee! If you are not satisfied in any way, you'll get your money back. Plus you will keep access to the Notebooks as a thank you for trying out the course!\n" +
            "\n" +
            "So what are you waiting for? Learn Python in a way that will advance your career and increase your knowledge, all in a fun and practical way!\n" +
            "Who this course is for:\n" +
            "\n" +
            "    Beginners who have never programmed before.\n" +
            "    Programmers switching languages to Python.\n" +
            "    Intermediate Python programmers who want to level up their skills!"
)

val course4 = Courses(
    4.5f,
    "The Complete Android 13 Developer Course",
    R.drawable.course4,
    "Become a Python Programmer and learn one of employer's most requested skills of 2023!\n" +
            "\n" +
            "This is the most comprehensive, yet straight-forward, course for the Python programming language on Udemy! Whether you have never programmed before, already know basic syntax, or want to learn about the advanced features of Python, this course is for you! In this course we will teach you Python 3.\n" +
            "\n" +
            "With over 100 lectures and more than 21 hours of video this comprehensive course leaves no stone unturned! This course includes quizzes, tests, coding exercises and homework assignments as well as 3 major projects to create a Python project portfolio!\n" +
            "\n" +
            "Learn how to use Python for real-world tasks, such as working with PDF Files, sending emails, reading Excel files, Scraping websites for informations, working with image files, and much more!\n" +
            "\n" +
            "This course will teach you Python in a practical manner, with every lecture comes a full coding screencast and a corresponding code notebook! Learn in whatever manner is best for you!\n" +
            "\n" +
            "We will start by helping you get Python installed on your computer, regardless of your operating system, whether its Linux, MacOS, or Windows, we've got you covered.\n" +
            "\n" +
            "We cover a wide variety of topics, including:\n" +
            "\n" +
            "    Command Line Basics\n" +
            "\n" +
            "    Installing Python\n" +
            "\n" +
            "    Running Python Code\n" +
            "\n" +
            "    Strings\n" +
            "\n" +
            "    Lists \n" +
            "\n" +
            "    Dictionaries\n" +
            "\n" +
            "    Tuples\n" +
            "\n" +
            "    Sets\n" +
            "\n" +
            "    Number Data Types\n" +
            "\n" +
            "    Print Formatting\n" +
            "\n" +
            "    Functions\n" +
            "\n" +
            "    Scope\n" +
            "\n" +
            "    args/kwargs\n" +
            "\n" +
            "    Built-in Functions\n" +
            "\n" +
            "    Debugging and Error Handling\n" +
            "\n" +
            "    Modules\n" +
            "\n" +
            "    External Modules\n" +
            "\n" +
            "    Object Oriented Programming\n" +
            "\n" +
            "    Inheritance\n" +
            "\n" +
            "    Polymorphism\n" +
            "\n" +
            "    File I/O\n" +
            "\n" +
            "    Advanced Methods\n" +
            "\n" +
            "    Unit Tests\n" +
            "\n" +
            "    and much more!\n" +
            "\n" +
            "You will get lifetime access to over 100 lectures plus corresponding Notebooks for the lectures!\n" +
            "\n" +
            "This course comes with a 30 day money back guarantee! If you are not satisfied in any way, you'll get your money back. Plus you will keep access to the Notebooks as a thank you for trying out the course!\n" +
            "\n" +
            "So what are you waiting for? Learn Python in a way that will advance your career and increase your knowledge, all in a fun and practical way!\n" +
            "Who this course is for:\n" +
            "\n" +
            "    Beginners who have never programmed before.\n" +
            "    Programmers switching languages to Python.\n" +
            "    Intermediate Python programmers who want to level up their skills!"
)

val course5 = Courses(
    4.5f,
    "The Complete Android 13 Developer Course",
    R.drawable.course1,
    "Become a Python Programmer and learn one of employer's most requested skills of 2023!\n" +
            "\n" +
            "This is the most comprehensive, yet straight-forward, course for the Python programming language on Udemy! Whether you have never programmed before, already know basic syntax, or want to learn about the advanced features of Python, this course is for you! In this course we will teach you Python 3.\n" +
            "\n" +
            "With over 100 lectures and more than 21 hours of video this comprehensive course leaves no stone unturned! This course includes quizzes, tests, coding exercises and homework assignments as well as 3 major projects to create a Python project portfolio!\n" +
            "\n" +
            "Learn how to use Python for real-world tasks, such as working with PDF Files, sending emails, reading Excel files, Scraping websites for informations, working with image files, and much more!\n" +
            "\n" +
            "This course will teach you Python in a practical manner, with every lecture comes a full coding screencast and a corresponding code notebook! Learn in whatever manner is best for you!\n" +
            "\n" +
            "We will start by helping you get Python installed on your computer, regardless of your operating system, whether its Linux, MacOS, or Windows, we've got you covered.\n" +
            "\n" +
            "We cover a wide variety of topics, including:\n" +
            "\n" +
            "    Command Line Basics\n" +
            "\n" +
            "    Installing Python\n" +
            "\n" +
            "    Running Python Code\n" +
            "\n" +
            "    Strings\n" +
            "\n" +
            "    Lists \n" +
            "\n" +
            "    Dictionaries\n" +
            "\n" +
            "    Tuples\n" +
            "\n" +
            "    Sets\n" +
            "\n" +
            "    Number Data Types\n" +
            "\n" +
            "    Print Formatting\n" +
            "\n" +
            "    Functions\n" +
            "\n" +
            "    Scope\n" +
            "\n" +
            "    args/kwargs\n" +
            "\n" +
            "    Built-in Functions\n" +
            "\n" +
            "    Debugging and Error Handling\n" +
            "\n" +
            "    Modules\n" +
            "\n" +
            "    External Modules\n" +
            "\n" +
            "    Object Oriented Programming\n" +
            "\n" +
            "    Inheritance\n" +
            "\n" +
            "    Polymorphism\n" +
            "\n" +
            "    File I/O\n" +
            "\n" +
            "    Advanced Methods\n" +
            "\n" +
            "    Unit Tests\n" +
            "\n" +
            "    and much more!\n" +
            "\n" +
            "You will get lifetime access to over 100 lectures plus corresponding Notebooks for the lectures!\n" +
            "\n" +
            "This course comes with a 30 day money back guarantee! If you are not satisfied in any way, you'll get your money back. Plus you will keep access to the Notebooks as a thank you for trying out the course!\n" +
            "\n" +
            "So what are you waiting for? Learn Python in a way that will advance your career and increase your knowledge, all in a fun and practical way!\n" +
            "Who this course is for:\n" +
            "\n" +
            "    Beginners who have never programmed before.\n" +
            "    Programmers switching languages to Python.\n" +
            "    Intermediate Python programmers who want to level up their skills!"
)


val course6 = Courses(
    4.5f,
    "The Complete Android 13 Developer Course",
    R.drawable.course2,
    "Become a Python Programmer and learn one of employer's most requested skills of 2023!\n" +
            "\n" +
            "This is the most comprehensive, yet straight-forward, course for the Python programming language on Udemy! Whether you have never programmed before, already know basic syntax, or want to learn about the advanced features of Python, this course is for you! In this course we will teach you Python 3.\n" +
            "\n" +
            "With over 100 lectures and more than 21 hours of video this comprehensive course leaves no stone unturned! This course includes quizzes, tests, coding exercises and homework assignments as well as 3 major projects to create a Python project portfolio!\n" +
            "\n" +
            "Learn how to use Python for real-world tasks, such as working with PDF Files, sending emails, reading Excel files, Scraping websites for informations, working with image files, and much more!\n" +
            "\n" +
            "This course will teach you Python in a practical manner, with every lecture comes a full coding screencast and a corresponding code notebook! Learn in whatever manner is best for you!\n" +
            "\n" +
            "We will start by helping you get Python installed on your computer, regardless of your operating system, whether its Linux, MacOS, or Windows, we've got you covered.\n" +
            "\n" +
            "We cover a wide variety of topics, including:\n" +
            "\n" +
            "    Command Line Basics\n" +
            "\n" +
            "    Installing Python\n" +
            "\n" +
            "    Running Python Code\n" +
            "\n" +
            "    Strings\n" +
            "\n" +
            "    Lists \n" +
            "\n" +
            "    Dictionaries\n" +
            "\n" +
            "    Tuples\n" +
            "\n" +
            "    Sets\n" +
            "\n" +
            "    Number Data Types\n" +
            "\n" +
            "    Print Formatting\n" +
            "\n" +
            "    Functions\n" +
            "\n" +
            "    Scope\n" +
            "\n" +
            "    args/kwargs\n" +
            "\n" +
            "    Built-in Functions\n" +
            "\n" +
            "    Debugging and Error Handling\n" +
            "\n" +
            "    Modules\n" +
            "\n" +
            "    External Modules\n" +
            "\n" +
            "    Object Oriented Programming\n" +
            "\n" +
            "    Inheritance\n" +
            "\n" +
            "    Polymorphism\n" +
            "\n" +
            "    File I/O\n" +
            "\n" +
            "    Advanced Methods\n" +
            "\n" +
            "    Unit Tests\n" +
            "\n" +
            "    and much more!\n" +
            "\n" +
            "You will get lifetime access to over 100 lectures plus corresponding Notebooks for the lectures!\n" +
            "\n" +
            "This course comes with a 30 day money back guarantee! If you are not satisfied in any way, you'll get your money back. Plus you will keep access to the Notebooks as a thank you for trying out the course!\n" +
            "\n" +
            "So what are you waiting for? Learn Python in a way that will advance your career and increase your knowledge, all in a fun and practical way!\n" +
            "Who this course is for:\n" +
            "\n" +
            "    Beginners who have never programmed before.\n" +
            "    Programmers switching languages to Python.\n" +
            "    Intermediate Python programmers who want to level up their skills!"
)


val course7 = Courses(
    4.5f,
    "The Complete Android 13 Developer Course",
    R.drawable.course3,
    "Become a Python Programmer and learn one of employer's most requested skills of 2023!\n" +
            "\n" +
            "This is the most comprehensive, yet straight-forward, course for the Python programming language on Udemy! Whether you have never programmed before, already know basic syntax, or want to learn about the advanced features of Python, this course is for you! In this course we will teach you Python 3.\n" +
            "\n" +
            "With over 100 lectures and more than 21 hours of video this comprehensive course leaves no stone unturned! This course includes quizzes, tests, coding exercises and homework assignments as well as 3 major projects to create a Python project portfolio!\n" +
            "\n" +
            "Learn how to use Python for real-world tasks, such as working with PDF Files, sending emails, reading Excel files, Scraping websites for informations, working with image files, and much more!\n" +
            "\n" +
            "This course will teach you Python in a practical manner, with every lecture comes a full coding screencast and a corresponding code notebook! Learn in whatever manner is best for you!\n" +
            "\n" +
            "We will start by helping you get Python installed on your computer, regardless of your operating system, whether its Linux, MacOS, or Windows, we've got you covered.\n" +
            "\n" +
            "We cover a wide variety of topics, including:\n" +
            "\n" +
            "    Command Line Basics\n" +
            "\n" +
            "    Installing Python\n" +
            "\n" +
            "    Running Python Code\n" +
            "\n" +
            "    Strings\n" +
            "\n" +
            "    Lists \n" +
            "\n" +
            "    Dictionaries\n" +
            "\n" +
            "    Tuples\n" +
            "\n" +
            "    Sets\n" +
            "\n" +
            "    Number Data Types\n" +
            "\n" +
            "    Print Formatting\n" +
            "\n" +
            "    Functions\n" +
            "\n" +
            "    Scope\n" +
            "\n" +
            "    args/kwargs\n" +
            "\n" +
            "    Built-in Functions\n" +
            "\n" +
            "    Debugging and Error Handling\n" +
            "\n" +
            "    Modules\n" +
            "\n" +
            "    External Modules\n" +
            "\n" +
            "    Object Oriented Programming\n" +
            "\n" +
            "    Inheritance\n" +
            "\n" +
            "    Polymorphism\n" +
            "\n" +
            "    File I/O\n" +
            "\n" +
            "    Advanced Methods\n" +
            "\n" +
            "    Unit Tests\n" +
            "\n" +
            "    and much more!\n" +
            "\n" +
            "You will get lifetime access to over 100 lectures plus corresponding Notebooks for the lectures!\n" +
            "\n" +
            "This course comes with a 30 day money back guarantee! If you are not satisfied in any way, you'll get your money back. Plus you will keep access to the Notebooks as a thank you for trying out the course!\n" +
            "\n" +
            "So what are you waiting for? Learn Python in a way that will advance your career and increase your knowledge, all in a fun and practical way!\n" +
            "Who this course is for:\n" +
            "\n" +
            "    Beginners who have never programmed before.\n" +
            "    Programmers switching languages to Python.\n" +
            "    Intermediate Python programmers who want to level up their skills!"
)


val course8 = Courses(
    4.5f,
    "The Complete Android 13 Developer Course",
    R.drawable.course4,
    "Become a Python Programmer and learn one of employer's most requested skills of 2023!\n" +
            "\n" +
            "This is the most comprehensive, yet straight-forward, course for the Python programming language on Udemy! Whether you have never programmed before, already know basic syntax, or want to learn about the advanced features of Python, this course is for you! In this course we will teach you Python 3.\n" +
            "\n" +
            "With over 100 lectures and more than 21 hours of video this comprehensive course leaves no stone unturned! This course includes quizzes, tests, coding exercises and homework assignments as well as 3 major projects to create a Python project portfolio!\n" +
            "\n" +
            "Learn how to use Python for real-world tasks, such as working with PDF Files, sending emails, reading Excel files, Scraping websites for informations, working with image files, and much more!\n" +
            "\n" +
            "This course will teach you Python in a practical manner, with every lecture comes a full coding screencast and a corresponding code notebook! Learn in whatever manner is best for you!\n" +
            "\n" +
            "We will start by helping you get Python installed on your computer, regardless of your operating system, whether its Linux, MacOS, or Windows, we've got you covered.\n" +
            "\n" +
            "We cover a wide variety of topics, including:\n" +
            "\n" +
            "    Command Line Basics\n" +
            "\n" +
            "    Installing Python\n" +
            "\n" +
            "    Running Python Code\n" +
            "\n" +
            "    Strings\n" +
            "\n" +
            "    Lists \n" +
            "\n" +
            "    Dictionaries\n" +
            "\n" +
            "    Tuples\n" +
            "\n" +
            "    Sets\n" +
            "\n" +
            "    Number Data Types\n" +
            "\n" +
            "    Print Formatting\n" +
            "\n" +
            "    Functions\n" +
            "\n" +
            "    Scope\n" +
            "\n" +
            "    args/kwargs\n" +
            "\n" +
            "    Built-in Functions\n" +
            "\n" +
            "    Debugging and Error Handling\n" +
            "\n" +
            "    Modules\n" +
            "\n" +
            "    External Modules\n" +
            "\n" +
            "    Object Oriented Programming\n" +
            "\n" +
            "    Inheritance\n" +
            "\n" +
            "    Polymorphism\n" +
            "\n" +
            "    File I/O\n" +
            "\n" +
            "    Advanced Methods\n" +
            "\n" +
            "    Unit Tests\n" +
            "\n" +
            "    and much more!\n" +
            "\n" +
            "You will get lifetime access to over 100 lectures plus corresponding Notebooks for the lectures!\n" +
            "\n" +
            "This course comes with a 30 day money back guarantee! If you are not satisfied in any way, you'll get your money back. Plus you will keep access to the Notebooks as a thank you for trying out the course!\n" +
            "\n" +
            "So what are you waiting for? Learn Python in a way that will advance your career and increase your knowledge, all in a fun and practical way!\n" +
            "Who this course is for:\n" +
            "\n" +
            "    Beginners who have never programmed before.\n" +
            "    Programmers switching languages to Python.\n" +
            "    Intermediate Python programmers who want to level up their skills!"
)

val allCourses = listOf(
    course1,
    course2,
    course3,
    course4,
    course5,
    course6,
    course7,
    course8
)