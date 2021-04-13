package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Puddlestomper_2032 : Card() {
    override val id = 2032
    override val name = "淤泥践踏者"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "他非常崇拜伟大的鱼人先知摩戈尔！（哪个鱼人不是呢？）"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2619f593750a111ee968ce3bc1df361f179d652532e77eda1992104c172e9cc8.png"
}
