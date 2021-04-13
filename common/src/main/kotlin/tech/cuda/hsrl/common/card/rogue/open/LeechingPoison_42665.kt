package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LeechingPoison_42665 : Card() {
    override val id = 42665
    override val name = "吸血药膏"
    override val description = "在本回合中，你的武器获得 <b>吸血</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Kotf
    override val background = "本品为纯天然制剂，未添加任何有毒有害物质。"
    override val artist = "Ben Thompson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3a4c2f4abb4d88dd11813046ece726be2c5c17e42f4cd27c6b7f5e441dd0f961.png"
}
