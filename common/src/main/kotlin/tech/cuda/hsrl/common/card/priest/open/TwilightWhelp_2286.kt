package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightWhelp_2286 : Card() {
    override val id = 2286
    override val name = "暮光雏龙"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便获得+2生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Brm
    override val background = "当听见要和一群吸血鬼一起拍电视剧时，这些雏龙们都非常高兴，尽管最后它们的戏份都被删减了。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3573b6c8cd21c5cc6a4528b1d6a2299e116c76d9fa1be022f9da01a44d5cde85.png"
}
