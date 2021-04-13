package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RisingWinds_56057 : Card() {
    override val id = 56057
    override val name = "乘风而起"
    override val description = "<b>双生法术</b> <b>抉择：</b>抽一张牌；或者召唤一只3/2的鹰。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "抽一张牌怎么了，它还是个孩子！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a669ed959d26dad9f9b399c81a9dd69904b2ec1e5b7ef3d2df868587e1dc68f7.png"
}
