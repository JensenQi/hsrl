package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Darkbomb_2093 : Card() {
    override val id = 2093
    override val name = "暗色炸弹"
    override val description = "造成 3点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Gvg
    override val background = "如果你想要构筑一套简单粗暴的套牌，这张牌就是很好的选择。"
    override val artist = "Jeff Haynie"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/268d31c40e9f6701da3efbe8cb964c2bde11f441b64563c334062075eed4f641.png"
}
