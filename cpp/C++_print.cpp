#include <iostream>
#include <fstream>

int main() {
    // Print to console
    std::cout << "Hello, World!" << std::endl;

    // Save to a file
    std::ofstream outputFile("output.txt");
    outputFile << "Hello, World!";
    outputFile.close();

    return 0;
}
