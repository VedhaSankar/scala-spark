package scala_spark

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession

object scala_spark {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[*]").setAppName("Simple Application")
//    val sc = new SparkContext(conf)
    val path = "/home/vedha/code/fries/scala-spark/sample.csv" // Should be some file on your system

    val spark: SparkSession = SparkSession.builder().master("local").getOrCreate()
    println("bro work man")
//    val df = spark.read.format("csv").option("header", "true")
    val textfield = spark.read.text("/home/vedha/code/fries/scala-spark/readme.md")
    textfield.show()
//    val df = spark.read.options(Map("delimiter"->",", "header"->"true")).csv(path)
    println("did ju read")
//    df.csv(path = path)
}
}