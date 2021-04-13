package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RagingWorgen_69957 : Card() {
    override val id = 69957
    override val name = "暴怒的狼人"
    override val description = "<b>激怒：</b>+1攻击力并具有<b>风怒</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "如果他现在还是很愤怒，那就等到他平静下来。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f97ec0974526c2fd26ad70be6f450140711cc57461e9e19e69a25766f62d8bf5.png"
}
