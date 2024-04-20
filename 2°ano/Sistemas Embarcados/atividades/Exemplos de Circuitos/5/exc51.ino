// C++ code
//
int valor;
void setup()
{
  pinMode(8, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(2, OUTPUT);

}

void loop()
{
  valor = analogRead(A0);
  if(valor < 250){
    digitalWrite(6, LOW);
    digitalWrite(4, LOW);
    digitalWrite(2, LOW);
    digitalWrite(8, LOW);
  }
  if(valor > 250 and valor < 500){ 
    digitalWrite(6, HIGH);
    digitalWrite(4, LOW);
    digitalWrite(2, LOW);
    digitalWrite(8, LOW);
  }
  if(valor > 500 and valor < 750){
    digitalWrite(6, HIGH);
    digitalWrite(4, HIGH);
    digitalWrite(2, LOW);
    digitalWrite(8, LOW);
  }
  if(valor > 750){
   	digitalWrite(6, HIGH);
    digitalWrite(4, HIGH);
    digitalWrite(2, HIGH);
    digitalWrite(8, HIGH);
  }
}
  