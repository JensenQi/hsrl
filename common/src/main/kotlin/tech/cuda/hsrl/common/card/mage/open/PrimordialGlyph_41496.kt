package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimordialGlyph_41496 : Card() {
    override val id = 41496
    override val name = "远古雕文"
    override val description = "<b>发现</b>一张法术牌，使其法力值消耗减少（2）点。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "雕文上的符号翻译过来就是“抱歉”。"
    override val artist = "Matthew O'Connor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9d8f540b902fbbbbb4af83f5e3ee16b137606083bd05787e6e5b464cea4a27bb.png"
}
