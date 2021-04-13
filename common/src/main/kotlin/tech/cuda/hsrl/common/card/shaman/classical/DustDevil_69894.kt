package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DustDevil_69894 : Card() {
    override val id = 69894
    override val name = "尘魔"
    override val description = "<b>风怒</b>，<b>过载：</b>（2）"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "西部荒野满是尘魔。还有秃鹰。还有失控的傀儡。还有海盗。为什么谁都喜欢住在这地方？"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/db301fdec3ebb1e074e2bff8be515d5942cfefa30211793f7fe9f470bc443709.png"
}
