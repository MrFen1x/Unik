#include <cmath>
#include <iostream>
#include <fstream>
using namespace std;
struct Point {
  double x, y;
};
double triangleSqr(Point a, Point b, Point c) {
  return abs(0.5*((b.x-a.x)*(c.y-a.y)-(c.x-a.x)*(b.y-a.y)));
}
int main() {
  const double limit(10e-8);
  
  ifstream in("input.txt");
  ofstream out("output.txt");
  
  Point a, b, c, d, person;
  int N, k = 0;
  in >> N;
  
  for (int i = 0; i < N; i++) {
    in >> person.x >> person.y >> a.x >> a.y >> b.x >> b.y >> c.x >> c.y >> d.x >> d.y;
    
    double S = triangleSqr(a, b, c) + triangleSqr(b, c, d);
    double PersonS = triangleSqr(a, b, person) + triangleSqr(b, c, person) + 
      triangleSqr(c, d, person) + triangleSqr(d, a, person);
    
    if (PersonS - S <= limit)
      ++k;
  } 
  out << k;
}
