package Sel10Screenshot;

public class XpathAxise {

public static void main(String[] args) {
//. If one element is unique,you identify the next following sibling.
//. Example: //input [@id='calFromDate']//following-sibling::img
	
//. If you want any following tag and want to use index, use below example
//. //input[@id='calFromDate']/following ::label[3]	or [4] e.t.c
	
//. Using preceding-sibling: --> If you want identify the proceeding tag by the current element/tag them 
//. use following syntax example: //input[@id='calFromDate']/preceding-sibling::label

//. Preceding::label
//. //input[@id='calToDate']/preceding::label[2] 
	
//. If you want to identify your ancestor tag from a child or one use below example
//. //input [@id='calToDate']/ancestor::from


}
}
