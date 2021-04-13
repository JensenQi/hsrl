package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrossroadsGossiper_63019 : Card() {
    override val id = 63019
    override val name = "十字路口大嘴巴"
    override val description = "在一个友方<b>奥秘</b>被揭示后，获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "张大嘴巴一时爽，挨大嘴巴一直爽。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22f3bb68c48573f90c4ed77d2ad9a5aa0fcf8fdd75a2c4f423cbd5b277854fbe.png"
}
