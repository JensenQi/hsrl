package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrazedWorshipper_38958 : Card() {
    override val id = 38958
    override val name = "疯狂的信徒"
    override val description = "<b>嘲讽</b>。每当该随从受到伤害，使你的克苏恩获得+1/+1<i>（无论它在哪里）。</i>"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "每个月捐钱最多的信徒会获得一次与上古之神共进午餐的机会。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/074b39db41be1293409181239b28f89f06542daa4bf9297fc13131b5fe5ab7d5.png"
}
