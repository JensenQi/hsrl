package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkBargain_2632 : Card() {
    override val id = 2632
    override val name = "黑暗交易"
    override val description = "随机消灭两个敌方随从，随机弃两张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "这是一个典型的“双输”案例。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/75eb0d217b079ffa8d79700239cc23952add215cbebfe5476d414f6254749444.png"
}
