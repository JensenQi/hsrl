package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DrywhiskerArmorer_46031 : Card() {
    override val id = 46031
    override val name = "枯须铸甲师"
    override val description = "<b>战吼：</b> 每有一个敌方随从，便获得2点护甲值。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "狗头人可以把任何东西当作盔甲：水壶，平底锅，垃圾罐……甚至其他的狗头人。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e446cd31d4a568a936913248dfd010ae88fda275d0c93e0462e4ffc631aedad.png"
}
