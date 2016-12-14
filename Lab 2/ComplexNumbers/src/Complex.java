
	public final class Complex {

		private double real, imag;

	    public Complex(double real, double imag) {
	        this.real = real;
	        this.imag=imag;
	    }

	    public Complex() {
	        real = 0;
	        imag = 0;
	    }
	    
	    public Complex complexAdd(Complex num){
	    	
	        Complex c3 = this;             
	        double real = c3.real + num.real;
	        double imag = c3.imag + num.imag;
	        return new Complex(real, imag);
	    	
	    }
	    
	    public Complex complexSubtract(Complex num){
	    	Complex c4 = this;
	        double real = c4.real - num.real;
	        double imag = c4.imag - num.imag;
	        return new Complex(real, imag);
	    }

	    public String toString() {
	        if (imag == 0) return real + "";
	        if (real == 0) return imag + "i";
	        if (imag <  0) return real + " - " + (-imag) + "i";
	        return real + " + " + imag + "i";
	    }
	    }

	
