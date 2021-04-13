package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthenRingFarseer_69754 : Card() {
    override val id = 69754
    override val name = "大地之环先知"
    override val description = "<b>战吼：</b> 恢复 3点生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他确实能看得很远，他才不像那些肮脏的海盗们需要用望远镜。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/59b8dd7da1a7c9599879314eb4d04e36e3bab5adf1b3ca0db627e4137d6a5276.png"
}
