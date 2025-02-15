data class Event(
    val title: String,
    val description: String? = null,
    val dayPart: DayPart,
    val duration: Int
)
enum class DayPart
{
    MORNING, AFTERNOON, EVENING
}
fun main()
{
    val firstEvent = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        dayPart = DayPart.EVENING,
        duration = 15
     )

    println(firstEvent)
}