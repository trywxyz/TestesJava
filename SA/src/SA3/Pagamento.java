package SA3;


	public class Pagamento extends Venda{
		
		int tpag;
		int pag;

		private int tipoPagamento;
		
		public int selecionarTipoPagamento; {
			
		}
		
		public int realizarPagamento;{
			
		}

		public Pagamento() {
			super();
		}

		public Pagamento(int tipoPagamento) {
			super();
			this.tipoPagamento = tipoPagamento;
		}

		public int getTipoPagamento() {
			return tipoPagamento;
		}

		public void setTipoPagamento(int tipoPagamento) {
			this.tipoPagamento = tipoPagamento;
		}
		
	}
	
	

