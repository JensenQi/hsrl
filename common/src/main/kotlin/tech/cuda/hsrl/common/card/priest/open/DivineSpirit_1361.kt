package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DivineSpirit_1361 : Card() {
    override val id = 1361
    override val name = "神圣之灵"
    override val description = "使一个随从的生命值翻倍。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy4
    override val background = "加倍的付出会得到加倍的收获！"
    override val artist = "Jim Pavelec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2e49fc5c4cd86904905bd943165fda25619df241014298a8d57c7bdc035a2183.png"
}
