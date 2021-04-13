package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PharaohsBlessing_53827 : Card() {
    override val id = 53827
    override val name = "法老祝福"
    override val description = "使一个随从获得+4/+4，<b>圣盾</b>以及<b>嘲讽</b>。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "长寿小秘诀：在法老身边打喷嚏。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/861e8fbbd7bcc90f3703ce2d9c22e8132a40051b38d7c6abbc2845e48e4e2932.png"
}
