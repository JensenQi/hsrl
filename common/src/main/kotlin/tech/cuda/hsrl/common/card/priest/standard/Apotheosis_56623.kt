package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Apotheosis_56623 : Card() {
    override val id = 56623
    override val name = "神圣化身"
    override val description = "使一个随从获得+2/+3和<b>吸血</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "绝对至高的存在。还可以吸血。"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5fb2de69c57bbb389b8822d41a25d397f72744cddafc9efb1029b1effc7105d.png"
}
