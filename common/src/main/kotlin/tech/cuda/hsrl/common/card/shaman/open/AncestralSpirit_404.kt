package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncestralSpirit_404 : Card() {
    override val id = 404
    override val name = "先祖之魂"
    override val description = "使一个随从获得“<b>亡语</b>：再次召唤该随从。”"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy3
    override val background = "只是伤到些皮毛而已。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ad074436349abd8b16b60936bb33ce35ad35a9f449c61d5710922048c640eb19.png"
}
