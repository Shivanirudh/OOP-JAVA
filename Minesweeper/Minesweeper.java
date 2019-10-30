import java.util.*;

class Cell{

	public char content;
	public int no_of_mines;
	public int top_left;
	public int top;
	public int top_right;
	public int left;
	public int right;
	public int bottom_left;
	public int bottom;
	public int bottom_right;
	
	public Cell(){
		content='\0';
		no_of_mines=0;
		top_left=1;
		top=1;
		top_right=1;
		left=1;
		right=1;
		bottom_left=1;
		bottom=1;
		bottom_right=1;
	}
}

class Grid{	
	public Cell grid[][];
	public int grid_size;
	
	public Grid(Cell grid[][],int size){
		this.grid=grid;
		grid_size=size;
	}
	
	public void createGrid(int grid_size){
		for(int row=0;row<grid_size;row++){
			for(int col=0;col<grid_size;col++){
			
				
				//First Row
				if(row==0){
					grid[row][col].top_left=0;
					grid[row][col].top=0;
					grid[row][col].top_right=0;
					
					//First Column
					if(col==0){
						grid[row][col].left=0;
						grid[row][col].bottom_left=0;
					}
					
					//Last Column
					if(col==grid_size-1){
						grid[row][col].right=0;
						grid[row][col].bottom_right=0;
					}
					
				}
				//Last Row
				else if(row==grid_size-1){
					grid[row][col].bottom_left=0;
					grid[row][col].bottom=0;
					grid[row][col].bottom_right=0;
					
					//First Column
					if(col==0){
						grid[row][col].left=0;
						grid[row][col].top_left=0;
					}
					
					//Last Column
					if(col==grid_size-1){
						grid[row][col].right=0;
						grid[row][col].top_right=0;
					}
					
				}
				else{
				
					//First Column
					if(col==0){
						grid[row][col].left=0;
						grid[row][col].top_left=0;
					}
					
					//Last Column
					if(col==grid_size-1){
						grid[row][col].right=0;
						grid[row][col].top_right=0;
					}
				}
			}
		}
	}

	public void populateGrid(int grid_size,int [][] mine_positions,int tot_mines){
		
		//Checking if current position has a mine
		for(int row=0;row<grid_size;row++){
			for(int col=0;col<grid_size;col++){
			
				for(int k=0;k<tot_mines;k++){
					if(row==mine_positions[k][0]&&col==mine_positions[k][1]){
						grid[row][col].content='M';
					}
				}
			}
		}
		
		int mine_ctr=0;
		//Populating all cells
		for(int row=0;row<grid_size;row++){
			for(int col=0;col<grid_size;col++){
				
				mine_ctr=0;
				//Checking number of mines surrounding each cell
				if(grid[row][col].content=='M'){
					grid[row][col].no_of_mines=0;
				}
				else{
					
					//Top left
					if(grid[row][col].top_left==1&&grid[row-1][col-1].content=='M')
						mine_ctr++;
					
					//Top 
					if(grid[row][col].top==1&&grid[row-1][col].content=='M')
						mine_ctr++;
					
					//Top right
					if(grid[row][col].top_right==1&&grid[row-1][col+1].content=='M')
						mine_ctr++;
					
					//Left
					if(grid[row][col].left==1&&grid[row][col-1].content=='M')
						mine_ctr++;
					
					//Right
					if(grid[row][col].right==1&&grid[row][col+1].content=='M')
						mine_ctr++;
					
					//Bottom left
					if(grid[row][col].bottom_left==1&&grid[row+1][col-1].content=='M')
						mine_ctr++;
						
					//Bottom
					if(grid[row][col].bottom==1&&grid[row+1][col].content=='M')
						mine_ctr++;	
					
					//Bottom right
					if(grid[row][col].bottom_right==1&&grid[row+1][col+1].content=='M')
						mine_ctr++;
				
				}
				
				grid[row][col].no_of_mines=mine_ctr;
			}
		}
	}
	
	public void displayGrid(int grid_size){
		
		//Column indices
		for(int col=1;col<=grid_size;col++)
			System.out.print("  "+col+" ");
		
		System.out.println();
		for(int col=1;col<=grid_size;col++)
			System.out.print("____");

		System.out.println();
		
		for(int row=0;row<grid_size;row++){
			for(int col=0;col<grid_size;col++){
				
				//Row index
				System.out.print(row+" |");
				
				//Content of cell
				if(grid[row][col].content=='M')
					System.out.print(grid[row][col].content+" |");
				else
					System.out.print(grid[row][col].no_of_mines+" |");
			}
			System.out.println();
			
			//Row Demarcation
			for(int col=1;col<=grid_size;col++)
				System.out.print("____");
			
			System.out.println();
		}
	}

	public void displayEmptyGrid(int grid_size){
		
		//Column indices
		for(int col=1;col<=grid_size;col++)
			System.out.print("  "+col+" ");
		
		System.out.println();
		for(int col=1;col<=grid_size;col++)
			System.out.print("____");

		System.out.println();
		
		for(int row=0;row<grid_size;row++){
			for(int col=0;col<grid_size;col++){
				
				//Row index
				System.out.print(row+" |");
				
				//Empty cell
				System.out.print("  |");
			}
			System.out.println();
			
			//Row Demarcation
			for(int col=1;col<=grid_size;col++)
				System.out.print("____");
			
			System.out.println();
		}
	}
	
	public void displayCurrentGrid(int grid_size,int no_of_attempts,int attempt_matrix[][]){
		
		//Column indices
		for(int col=1;col<=grid_size;col++)
			System.out.print("  "+col+" ");
		
		System.out.println();
		for(int col=1;col<=grid_size;col++)
			System.out.print("____");

		System.out.println();
		
		for(int row=0;row<grid_size;row++){
			for(int col=0;col<grid_size;col++){
				int flag=0;
				
				//Checking if attempt has been made to uncover that cell
				for(int k=0;k<no_of_attempts;k++){
					if(row==attempt_matrix[k][0]&&col==attempt_matrix[k][1])
						flag=1;
				}
				
				//Row index
				System.out.print(row+" |");
				
				//Content of cell
				if(flag==1){
					if(grid[row][col].content=='M')
						System.out.print(grid[row][col].content+" |");
					else
						System.out.print(grid[row][col].no_of_mines+" |");
				}
				else{
					System.out.print("  |");
				}
			}
			System.out.println();
			
			//Row Demarcation
			for(int col=1;col<=grid_size;col++)
				System.out.print("____");
			
			System.out.println();
		}
	}
}

public class Minesweeper{
	public static int myFloor(double x){
		int i;
		
		for(i=0;i<=x;i++);
		
		return i-1;
	}
	
	public static void clearScreen(){
		for(int i=0;i<10;i++)
			System.out.println();
	}
	
	public static void main(String args[]){
		int option=0;
		int grid_size;
		Cell structure[][]=new Cell[100][100];
		int tot_mines=0;
		int mine_positions[][]=new int[100][100];
		
		Scanner in=new Scanner(System.in);
		
		Random rand=new Random();
		
		do{
			System.out.print("\t WELCOME TO MINESWEEPER \n");
			System.out.print("\n \tPlease make your choice \n");
			System.out.print("\n \t[1]Start New Game\n \t[0]Exit ");
			System.out.print("\n \tYour choice: ");option=in.nextInt();
			
			if(option==1){
				System.out.print("\nEnter size of grid ");grid_size=in.nextInt();
				
				
				
				Grid grid=new Grid(structure,grid_size);
				
				//Total number of mines
				tot_mines=myFloor(0.15625*grid_size*grid_size);
				
				//Generating positions of mines 
				for(int i=0;i<tot_mines;i++){
					mine_positions[i][0]=rand.nextInt(grid_size);
					mine_positions[i][1]=rand.nextInt(grid_size);
					
					for(int j=0;j<i;j++){
						if(mine_positions[i][0]==mine_positions[j][0] && mine_positions[i][1]==mine_positions[j][1]){
							i--;
						}
					}
				}
				
				//Creation
				grid.createGrid(grid_size);
				
				//Population
				grid.populateGrid(grid_size,mine_positions,tot_mines);
				
				//Display Grid
				grid.displayGrid(grid_size);
				
			}
		}while(option!=0);
	}
				  
}
