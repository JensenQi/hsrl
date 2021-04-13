package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SchoolSpirits_58796 : Card() {
    override val id = 58796
    override val name = "校园精魂"
    override val description = "对所有随从造成 2点伤害。将两张灵魂残片洗入你的 牌库。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“……密……封……线……内……不……要……答……题……”"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e6197536c927a13e5252c44d3784fc4191a10df9513df37a99d736285ea83396.png"
}
