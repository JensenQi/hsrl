package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CthunsChosen_38863 : Card() {
    override val id = 38863
    override val name = "克苏恩的侍从"
    override val description = "<b>圣盾</b>，<b>战吼：</b>使你的克苏恩获得+2/+2<i>（无论它在哪里）。</i>"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "克苏恩曾许以她永生不灭。那她到底会不会死呢？打一顿就知道了。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a320245a3f5e71900d8c70bb633e4d29477ea42f6c97e2eb922707497373fb46.png"
}
