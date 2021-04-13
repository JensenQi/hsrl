package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowedSpirit_62497 : Card() {
    override val id = 62497
    override val name = "暗影之灵"
    override val description = "<b>亡语：</b>对敌方英雄造成3点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Core
    override val background = "它们也不全是嘎嘎怪叫的鬼。"
    override val artist = "BOSi Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33a48c345b9e7e07b36c5d4ba240b6ab3e4fda7d53984d044671e6b7aba44310.png"
}
