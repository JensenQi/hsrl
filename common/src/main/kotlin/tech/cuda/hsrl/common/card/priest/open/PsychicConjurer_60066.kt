package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PsychicConjurer_60066 : Card() {
    override val id = 60066
    override val name = "心灵咒术师"
    override val description = "<b>战吼：</b>复制你对手的牌库中的一张牌，并将其置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "“我看到了……小精灵？你为什么要带小精灵？！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79d9e97d9e738ea5548de2d077fa4d1e34519ee01003b5dd4cd3adad6ccffd50.png"
}
