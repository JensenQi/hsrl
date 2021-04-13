package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonmawSkyStalker_57186 : Card() {
    override val id = 57186
    override val name = "龙喉巡天者"
    override val description = "<b>亡语：</b>召唤一个3/4的龙骑士。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "骑士乘龙游八极，斧光照空天自碧。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/329e1d147ca0bfcecec1f1cb742040297d61bff93434b880b39fc6156d6d645f.png"
}
