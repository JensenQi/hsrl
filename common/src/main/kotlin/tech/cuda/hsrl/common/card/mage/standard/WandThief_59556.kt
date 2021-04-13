package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WandThief_59556 : Card() {
    override val id = 59556
    override val name = "魔杖窃贼"
    override val description = "<b>连击：</b><b>发现</b>一张法师法术牌。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“想来点什么？”"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9caaed45ab500b17c3cce169bfa8c3a66c195bd21411cd301c8ffa29ffc9a3d8.png"
}
