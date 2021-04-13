package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfTheClaw_69872 : Card() {
    override val id = 69872
    override val name = "利爪德鲁伊"
    override val description = "<b>抉择：</b><b>冲锋</b>；或者获得+2生命值并具有<b>嘲讽</b>。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "是猎豹还是熊？！是猎豹还是熊？！真是艰难的抉择！"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0c18f91135826f43b4fe592d476d2107af199b63a648acdc58c1538ded365944.png"
}
