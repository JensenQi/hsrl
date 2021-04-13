package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletWarden_52296 : Card() {
    override val id = 52296
    override val name = "紫罗兰典狱官"
    override val description = "<b>嘲讽</b> <b>法术伤害+1</b>"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "他的盾是紫色的，他的魔法是紫色的，就连他的一片痴心，也是紫色的。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8eff7f6a492bb2de0c882dbbcd6cb0ad8936d57149ce67924a91e71c109610a4.png"
}
