
public class Ex06 {

	private float cq;
	private float bs;
	private float bo;
	private float hm;
	private float chs; 
	private float ref; 

	public float getCq() {
		return cq;
	}
	public void setCq(float cq1) {
		this.cq = (float) (cq1 * 1.20) ;
	}
	public float getBs() {
		return bs;
	}
	public void setBs(float bs1) {
		this.bs = (float) (bs1 * 1.30);
	}
	public float getBo() {
		return bo;
	}
	public void setBo(float bo1) {
		this.bo = (float) (bo1 * 1.50);
	}
	public float getHm() {
		return hm;
	}
	public void setHm(float hm1) {
		this.hm = (float) (hm1 * 1.20);
	}
	public float getChs() {
		return chs;
	}
	public void setChs(float chs1) {
		this.chs = (float) (chs1 * 1.30);
	}
	public float getRef() {
		return ref;
	}
	public void setRef(float ref1) {
		this.ref = (float) (ref1 * 1.00);
	}
	public float total() {
		float total = cq + bs + bo + hm + chs + ref;
		return total;
		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCachorro Quente R$ ");
		builder.append(cq);
		builder.append("\nBauru Simples R$ ");
		builder.append(bs);
		builder.append("\nBauru com ovo R$ ");
		builder.append(bo);
		builder.append("\nHambúrguer R$ ");
		builder.append(hm);
		builder.append("\nCheeseburguer R$ ");
		builder.append(chs);
		builder.append("\nRefrigerante R$ ");
		builder.append(ref);
		builder.append("\nTotal a pagar: ");
		builder.append(total());
		return builder.toString();
	}
}
