package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletTeacher_1029 : Card() {
    override val id = 1029
    override val name = "紫罗兰教师"
    override val description = "每当你施放一个法术，召唤一个1/1的紫罗兰学徒。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "要是你不专心听讲，你就会被变成一只猪，然后你的名字就会被写在黑板上。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a2dfb4a34ce341ab2ab7788faf73c975b6e23ca9cef5819e0245e54cfdc72b87.png"
}
