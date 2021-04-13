package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodQueenLanathel_43064 : Card() {
    override val id = 43064
    override val name = "鲜血女王兰娜瑟尔"
    override val description = "<b>吸血</b> 在本局对战中，你每弃掉一张牌，便获得+1攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "还是年轻的鲜血公主时，她就学习了女士应该如何正确行屈膝礼，如何向皇室成员致意，以及如何噬咬他们。"
    override val artist = "Greg Staples"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c68249a9ea81aca5558c486e9936028016af9c9a110cd264b82ebf86a9d039ae.png"
}
