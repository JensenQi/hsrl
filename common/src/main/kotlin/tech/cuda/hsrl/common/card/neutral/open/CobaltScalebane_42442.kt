package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CobaltScalebane_42442 : Card() {
    override val id = 42442
    override val name = "深蓝刃鳞龙人"
    override val description = "在你的回合结束时，随机使另一个友方随从获得+3攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "你有剑！他有剑！大家都有剑！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a7c09ee106fc7b911d7d952ab2b170180f7006f009497ce271a902ccbffc29a.png"
}
