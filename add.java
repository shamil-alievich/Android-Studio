//переход между страничками в Android Studio двух окн MainActivity and notPassActivity

  netPass.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
  Intent netPass = new Intent(MainActivity.this, notPassActivity.class); 
  MainActivity.this.startActivity(netPass); 
} 
});

//Добавление кнопки назад в Activity
if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        } //отдельная функция созд и доб
@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
        
