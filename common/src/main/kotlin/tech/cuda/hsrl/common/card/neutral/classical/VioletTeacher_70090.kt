package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletTeacher_70090 : Card() {
    override val id = 70090
    override val name = "紫罗兰教师"
    override val description = "每当你施放一个法术，召唤一个1/1的紫罗兰学徒。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "要是你不专心听讲，你就会被变成一只猪，然后你的名字就会被写在黑板上。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d0b40fe8acf0a3f2db278d6336b62352dd0c3b2197b923cc5d69e5491020c4a3.png"
}
