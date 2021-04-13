package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnvenomWeapon_41834 : Card() {
    override val id = 41834
    override val name = "浸毒武器"
    override val description = "使你的武器获得<b>剧毒</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Ungoro
    override val background = "毒液取自安戈洛的当地植物，威力惊人。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1b642d4938520c418e8da43447952313548e87970dfafbd6f25c309316906eec.png"
}
