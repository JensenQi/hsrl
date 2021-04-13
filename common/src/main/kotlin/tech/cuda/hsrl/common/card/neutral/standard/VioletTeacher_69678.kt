package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletTeacher_69678 : Card() {
    override val id = 69678
    override val name = "紫罗兰教师"
    override val description = "每当你施放一个法术，召唤一个1/1的紫罗兰学徒。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "要是你不专心听讲，你就会被变成一只猪，然后你的名字就会被写在黑板上。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/88f69e1eed8762ef9f6e2819b0e736110b2fe4008b7aaedb9e039a3410485c1c.png"
}
