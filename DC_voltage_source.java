import java.awt.Color;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class DC_voltage_source { //класс, описывающий источник Ёƒ—
		double EMF;//Ёƒ— элемента
		int usage_time=0;//сколько раз обращались к тому или иному элементу
		boolean used;//используетс€ в цепи или нет
		boolean on;//работает/сломан
		int eff;//работоспособность элемента
		int power_line;///
		DC_voltage_source neighbors[];//массив, содержащий соседей элемента
		DC_voltage_source forward_agent; //forward agent in path
		DC_voltage_source previous_agent; //previous agent in path
		DC_voltage_source wrong_neighbors[]; 
		DC_voltage_source rnd_neighbors[]; 
		JTextField label;//графическое отображение элемента
		long start = System.currentTimeMillis(); 
		long timeWorkCode; 
		
		
		void rnd_neighbor(){
			int i=0, j=0, z=0, a=0;
			int neighbors_arr[]=new int[this.neighbors.length];
			int random_arr[]=new int[this.neighbors.length];
			for (i=0; i<this.neighbors.length; i++){
				neighbors_arr[i]=(int)(Math.random()*100);
			}
			for (i=0; i<this.neighbors.length; i++){
				random_arr[i]=neighbors_arr[i];
			}
			for (i = 0; i < neighbors_arr.length; i++){
		        for (j = 0; j < neighbors_arr.length-1; j++){
		            if (neighbors_arr[j] > neighbors_arr[j+1]){
		                z=neighbors_arr[j];
						neighbors_arr[j]=neighbors_arr[j+1];
						neighbors_arr[j+1]=z;
		            }
		        }
			}
			for (i = 0; i < neighbors_arr.length; i++){
		        for (j = 0; j < neighbors_arr.length; j++){
		            if (neighbors_arr[i]==random_arr[j]){
		            	this.rnd_neighbors[i]=this.neighbors[j];
		            }
		        }
			}
		}
		boolean path_finder(double U_zad) {
			double U_intermediate;
			DC_voltage_source forward;
			if (this.used==(true)) return(false);
			if(U_zad-this.EMF<0){                                 
				this.used=false;
				return(false);
			}
			this.rnd_neighbor();
			this.label.setBackground(Color.PINK);
			this.used=true;
			if (U_zad-this.EMF==0){
				if (this.power_line==(1)) return true;
				for (int i = 0; i < this.rnd_neighbors.length; i++){
					forward=this.rnd_neighbors[i];
					if (forward.to_power_line()==true)  return true;
				}
				this.used=false;
				this.label.setBackground(new Color(240,240,240));
				return false;
			}
			U_intermediate=U_zad-this.EMF;
			for(int i=0; i<this.rnd_neighbors.length; i++){
				forward=this.rnd_neighbors[i];
				this.forward_agent=forward;
				if (forward.path_finder(U_intermediate)==true) return true;
				else{
					this.forward_agent=null;
				}
			}
			this.used=false;
			this.label.setBackground(new Color(240,240,240));
			return (false);
		}
		public DC_voltage_source (double EMF, boolean on, int eff, int power_line){
			this.EMF=EMF;
			this.on=on;
			this.eff=eff;
			this.power_line=power_line;
			}		
		boolean to_power_line (){
			DC_voltage_source forward;
			this.rnd_neighbor();
			if (this.used==(true)) return(false);
			this.label.setBackground(Color.orange);
			this.used=true;
			if (this.power_line==1) return true;
			for(int i=0; i<this.rnd_neighbors.length; i++){
				forward=this.rnd_neighbors[i];
				this.forward_agent=forward;
				if (forward.to_power_line()==true) return true;
				else{
					this.forward_agent=null;
				}
			}
			this.used=false;
			this.label.setBackground(new Color(240,240,240));
			return false;
		}
}
			/*
			forward=this.control_transfer();
			if (forward==null) return(false);
			previous=this;
			this.forward_agent=forward;
			this=forward;
			this.previous_agent=previous;
			boolarg=path_finder(U_intermediate);
			if (boolarg){
				return(true);
			}
			else {
				this.previous_agent.wrong_neighbors[this.previous_agent.usage_time]=this;   //используемый объект становитс€ "плохим соседом" объекта,
				this.previous_agent.usage_time++;
				this.label.setBackground(new Color(240,240,240));
				this=this.previous_agent;
				this.forward_agent=null;
				boolarg=path_finder(U_intermediate);
				return(boolarg);
			}
			*/
		//
		/*DC_voltage_source enter_finder() {
			DC_voltage_source enter_obj = null;
			for(int i = 0; i < 7; i++){
				for(int j=0; j<7; j++){
					if (this[i][j].enter==2) {
						enter_obj=th[i][j];
						break;
					}
				}
				}
			return enter_obj;
		}
		
		DC_voltage_source[] finder(DC_voltage_source obj, double U_zad){
			double Up=0;
			int n=0;
			DC_voltage_source[]path=new DC_voltage_source[49];
			DC_voltage_source obj1 = obj;
			DC_voltage_source rnd_obj;
			boolean a;
			while (true) {
	            Up = Up + obj.EMF;
	            path[n] = obj;
	            if (Up == U_zad) {
	                break;
	            }
	            n++;
	            do {
	            	a=true;
	            	rnd_obj=control_transfer(obj);
	                for (int i = 0; i < n; i++) {
	                	if(rnd_obj==path[i]){
	                		a=false;
	                		break;
	                	}
	                }
	            }
	            while(!a);
	            obj=rnd_obj;
	            if (Up > U_zad) {
	                Up = 0;
	                obj = obj1;
	                for (int i = 0; i < n; i++) {
	                    path[i] = null;
	                }
	                n = 0;
	            }
	        }
			return path;
		}*/