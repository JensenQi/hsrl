package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DruidOfTheClaw_69595 : Card() {
    override val id = 69595
    override val name = "利爪德鲁伊"
    override val description = "<b>抉择：</b>将该随从变形成为5/4并具有<b>突袭</b>；或者将该随从变形成为5/6并具有<b>嘲讽</b>。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Core
    override val background = "是猎豹还是熊？！是猎豹还是熊？！真是艰难的抉择！"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f63182efd2ca0851d2734c6a6966778681aa00c27db18dab4adcc1624415590b.png"
}
