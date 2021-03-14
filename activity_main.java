package com.example.notificationapp;
    import androidx.appcompat.app.AppCompatActivity;
    private Resources mResources;  
    private RelativeLayout mRelativeLayout;  
    private Button mButton;  
    @Override  
    protected void onCreate(Bundle savedInstanceState) 
    {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        mContext = getApplicationContext();  
        mResources = getResources();  
        mRelativeLayout = (RelativeLayout) findViewById(R.id.rl);  
        mButton = (Button) findViewById(R.id.b1);  
        mButton.setOnClickListener(new View.OnClickListener() 
	{  
            @Override  
            public void onClick(View view) 
	    {  
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);    
			builder.setMessage("Dialogue Example");    
		builder.setPositiveButton("Yes", new DialogInterface.OnClickListener()     
		{    
   			 @Override public void onClick(DialogInterface dialogInterface, int i) {}    
		});    
		builder.setNegativeButton("No", new DialogInterface.OnClickListener()    
		{    
  			 @Override public void onClick(DialogInterface dialogInterface, int i) {}    
		});    
		builder.show();   
            }  
		showToastButton.setOnClickListener(new View.OnClickListener()    
		{    
    			@Override public void onClick(View view)    
   			 {    
       				 Toast.makeText(MainActivity.this, "Toast Example", Toast.LENGTH_SHORT).show();    
   			 }    
		});   
	});  
    }  
}  
