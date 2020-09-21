package questao02;

public class MyPoint {
	private int x = 0;
	private int y = 0;
	
	public MyPoint() {
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	
	public double distance(int x, int y) {
        int resultx = this.x - x;
        int resulty = this.y - y;
        return Math.sqrt(Math.pow(resultx, 2) + Math.pow(resulty, 2));
    }

    public double distance(MyPoint another) {
        int resultx = this.x - another.getX();
        int resulty = this.y - another.getY();
        return Math.sqrt(Math.pow(resultx, 2) + Math.pow(resulty, 2));
    }


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyPoint other = (MyPoint) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	

}
