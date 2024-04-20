// C++ code
//
int valor;
void setup()
{
  pinMode(6, OUTPUT);
  Serial.begin(9600);
}

void loop()
{
  valor = analogRead(A0);
  Serial.print("Valor = ");
  if(valor>500){
    digitalWrite(6, HIGH);
  } else {
   	digitalWrite(6, LOW); 
  }
	Serial.println(valor);
  	delay(250);
}