package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PsychicConjurer_69566 : Card() {
    override val id = 69566
    override val name = "心灵咒术师"
    override val description = "<b>战吼：</b>复制你对手的牌库中的一张牌，并将其置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "“我看到了……小精灵？你为什么要带小精灵？！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1097b5b37d35418755ad49f7d9cee15d114bdb6d30eabf279418667589960a41.png"
}
