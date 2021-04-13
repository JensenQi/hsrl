package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MozakiMasterDuelist_58770 : Card() {
    override val id = 58770
    override val name = "决斗大师莫扎奇"
    override val description = "在你施放一个法术后，获得<b>法术伤害+1</b>。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "对待学生就像对待旗鼓相当的对手，所谓的决斗其实是单方面的碾压。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c865f65d1db9ba83b4b5763907416c41bffef870670cb2cbcd03701db8013efb.png"
}
