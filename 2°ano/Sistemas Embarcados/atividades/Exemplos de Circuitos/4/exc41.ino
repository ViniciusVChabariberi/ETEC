// C++ code
//
int valor;
void setup()
{
  pinMode(6, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(2, OUTPUT);

}

void loop()
{
  valor = analogRead(A0);
  if(valor < 300){
    digitalWrite(6, HIGH);
    digitalWrite(4, LOW);
    digitalWrite(2, LOW);
  }
  if(valor > 300 and valor < 900){ 
    digitalWrite(6, LOW);
    digitalWrite(4, HIGH);
    digitalWrite(2, LOW);
  }
  if(valor > 900){
    digitalWrite(6, LOW);
    digitalWrite(4, LOW);
    digitalWrite(2, HIGH); 
  }
}
  