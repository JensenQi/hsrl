package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RagingWorgen_1155 : Card() {
    override val id = 1155
    override val name = "暴怒的狼人"
    override val description = "受伤时具有+1攻击力和<b>风怒</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "如果他现在还是很愤怒，那就等到他平静下来。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dabcf65968c0456941b0c8701d943e86e1dd6f23082274f1844a9a5e68a3cb17.png"
}
