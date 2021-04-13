package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvilHeckler_2752 : Card() {
    override val id = 2752
    override val name = "邪灵拷问者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "他有各种手段和方法来拷问出你心里潜藏的秘密。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c2158d9329d202577d078ae4228b0a8f4099ba03601413c3ea858bece9b8378f.png"
}
