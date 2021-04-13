package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulboundAshtongue_57187 : Card() {
    override val id = 57187
    override val name = "魂缚灰舌"
    override val description = "每当该随从受到伤害，对你的英雄造成等量的伤害。"
    override var cost: Int? = 1
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "他说这是“灵魂的牵缚”，但我觉得这就是他在作。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a557186246cf91f140e3d6bad49cbf1b36682c0ca7a919e70c759c0b4b7ffc41.png"
}
